package visibility.unrecognizedvoices;

import de.spinscale.dropwizard.jobs.JobsBundle;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.quartz.*;
import org.skife.jdbi.v2.DBI;
import visibility.unrecognizedvoices.core.*;
import visibility.unrecognizedvoices.db.daos.*;
import visibility.unrecognizedvoices.db.services.*;
import visibility.unrecognizedvoices.health.TemplateHealthCheck;
import visibility.unrecognizedvoices.jobs.bills.*;
import visibility.unrecognizedvoices.jobs.representatives.*;
import visibility.unrecognizedvoices.resources.BillsResources;
import visibility.unrecognizedvoices.resources.RepresentativesResources;

import java.net.MalformedURLException;
import java.util.function.*;

public class UnrecognizedVoicesApplication extends Application<UnrecognizedVoicesConfiguration> {


	public static void main(final String[] args) throws Exception {
		new UnrecognizedVoicesApplication().run(args);
	}

	@Override
	public String getName() {
		return "UnrecognizedVoices";
	}

	@Override
	public void initialize(final Bootstrap<UnrecognizedVoicesConfiguration> bootstrap) {
//		try {
//      bootstrap.addBundle(new JobsBundle(new FetchRepsHouse()));
//			bootstrap.addBundle(new JobsBundle(new FetchRepsSenate(null)));
//      bootstrap.addBundle(new JobsBundle(new FetchBillsHouse()));
//      bootstrap.addBundle(new JobsBundle(new FetchBillsSenate()));
//		} catch (MalformedURLException exception) {
//			System.out.println("One or more of the jobs contains a malformed URL");
//		}
	}

	@Override
	public void run(final UnrecognizedVoicesConfiguration configuration, final Environment environment) {
		
		/*
		 * JDBI
		 */
		final DBIFactory factory = new DBIFactory();
		final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "postgresql");

		/*
		 * DAOs
		 */
		final BillDao billDao = jdbi.onDemand(BillDao.class);
		final RepresentativeDao representativeDao = jdbi.onDemand(RepresentativeDao.class);



		/*
		 * Services
		 */
		final BillService billService = new BillService(billDao);
		final RepresentativeService representativeService = new RepresentativeService(representativeDao);

//		try {
//			FetchRepsSenate fetchRepsSenate = new FetchRepsSenate(representativeService);
//			fetchRepsSenate.doJob(null);
//
//			FetchRepsHouse fetchRepsHouse = new FetchRepsHouse(representativeService);
//			fetchRepsHouse.doJob(null);
//
//			FetchBillsSenate fetchBillsSenate = new FetchBillsSenate(billService);
//			fetchBillsSenate.doJob(null);
//
//			FetchBillsHouse fetchBillsHouse = new FetchBillsHouse(billService);
//			fetchBillsHouse.doJob(null);
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		} catch (JobExecutionException e) {
//			e.printStackTrace();
//		}

		/*
		 * Resources
		 */
		final RepresentativesResources representativesResources = new RepresentativesResources(representativeService);
		final BillsResources billsResources = new BillsResources(billService);
		final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());


		environment.healthChecks().register("template", healthCheck);
		environment.jersey().register(billsResources);
		environment.jersey().register(representativesResources);
	}

}
