package visibility.unrecognizedvoices.jobs.bills;

import com.fasterxml.jackson.databind.*;
import de.spinscale.dropwizard.jobs.Job;
import de.spinscale.dropwizard.jobs.annotations.Every;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import visibility.unrecognizedvoices.api.ApiHelper;
import visibility.unrecognizedvoices.db.services.*;
import visibility.unrecognizedvoices.jobs.bills.jsons.*;
import visibility.unrecognizedvoices.jobs.representatives.jsons.*;

import java.net.*;

/**
 * Created by benjaminpurdy on 5/21/17.
 */
@Every("1d")
public class FetchBillsSenate extends Job {
	ApiHelper apiHelper = new ApiHelper();
	String apiPath = apiHelper.propublicaBaseURL + "/congress/" + apiHelper.currentPropublicaVersion + "/" + apiHelper.currentPropublicaChamber + "/senate/bills/";
	final BillService billService;
	private static final String[] types = new String[] {"introduced","updated","passed","major"};

	public FetchBillsSenate(BillService billService) throws MalformedURLException {
		this.billService = billService;
	}

	@Override
	public void doJob(JobExecutionContext context) throws JobExecutionException {
		if (billService == null) return;

		ObjectMapper mapper = apiHelper.getMapper();

		URL apiURL;
		String apiFullPath = "";
		for (String type : types) {
			System.out.println("Entering Fetch Bills Senate: [" + type + "]");
			try {
				apiFullPath = apiPath + type + ".json";
				apiURL = new URL(apiFullPath);
				String json = apiHelper.get(apiURL);
				BillsSenateMappedJson mappedJson = mapper.readValue(json, BillsSenateMappedJson.class);
				if (!mappedJson.isSuccessful()) {
					System.out.println("ERROR: Representatives Senate not successfully fetched.");
					return;
				}
				if (mappedJson.getResults().size() != 1) {
					System.out.println("ERROR: Representatives Senate results size not correct.");
					return;
				}
				BillsResults results = mappedJson.getResults().get(0);
				for (Bill bill : results.getBills()) {
					billService.findOrCreate(bill);
				}
			} catch (java.io.IOException e) {
				System.out.println("ERROR: Could not map return JSON correctly.");
				e.printStackTrace();
				return;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ERROR: Could not fetch information form url [" + apiFullPath + "].");
				return;
			}
		}
	}
}
