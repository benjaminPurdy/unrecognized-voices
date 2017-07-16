package visibility.unrecognizedvoices.jobs.representatives;

import de.spinscale.dropwizard.jobs.Job;
import de.spinscale.dropwizard.jobs.annotations.Every;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import visibility.unrecognizedvoices.api.ApiHelper;
import visibility.unrecognizedvoices.db.services.*;
import visibility.unrecognizedvoices.jobs.representatives.jsons.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by benjaminpurdy on 5/21/17.
 */
@Every("1d")
public class FetchRepsSenate extends Job {
	ApiHelper apiHelper = new ApiHelper();
	URL apiURL = new URL(apiHelper.propublicaBaseURL + "/congress/" + apiHelper.currentPropublicaVersion + "/" + apiHelper.currentPropublicaChamber + "/senate/members.json");
	final RepresentativeService representativeService;

	public FetchRepsSenate(RepresentativeService representativeService) throws MalformedURLException {
		this.representativeService = representativeService;
	}

	@Override
	public void doJob(JobExecutionContext context) throws JobExecutionException {
		if(representativeService == null) return;

		System.out.println("Entering Fetch Reps Senate");

		ObjectMapper mapper = apiHelper.getMapper();
		try {
			String json = apiHelper.get(apiURL);
			RepsMappedJson mappedJson = mapper.readValue(json, RepsMappedJson.class);
			if (!mappedJson.isSuccessful()) {
				System.out.println("ERROR: Representatives Senate not successfully fetched.");
				return;
			}
			if (mappedJson.getResults().size() != 1) {
				System.out.println("ERROR: Representatives Senate results size not correct.");
				return;
			}
			RepsResults results = mappedJson.getResults().get(0);
			for (Member member : results.getMembers()) {
				representativeService.findOrCreateSenateRep(member);
			}
		} catch (java.io.IOException e) {
			System.out.println("ERROR: Could not map return JSON correctly.");
			e.printStackTrace();
			return;
		} catch (Exception e) {
			System.out.println("ERROR: Could not fetch information form url [" + apiURL + "].");
			return;
		}
	}
}
