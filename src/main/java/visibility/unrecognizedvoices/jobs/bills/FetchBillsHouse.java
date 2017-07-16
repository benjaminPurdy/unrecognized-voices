package visibility.unrecognizedvoices.jobs.bills;

import de.spinscale.dropwizard.jobs.Job;
import de.spinscale.dropwizard.jobs.annotations.Every;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import visibility.unrecognizedvoices.api.ApiHelper;
import visibility.unrecognizedvoices.db.services.*;

import java.net.URL;

/**
 * Created by benjaminpurdy on 5/21/17.
 */
@Every("1d")
public class FetchBillsHouse extends Job {
    ApiHelper apiHelper = new ApiHelper();
    private final BillService billService;

    public FetchBillsHouse(BillService billService) {
        this.billService = billService;
    }

    @Override
    public void doJob(JobExecutionContext context) throws JobExecutionException {
        try {
            System.out.println("Entering Fetch Bills House");
        } catch (Exception e) {
            System.out.println("Something bad happened");
        }
    }
}
