package visibility.unrecognizedvoices.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import org.apache.commons.io.IOUtils;

import static com.google.common.net.HttpHeaders.USER_AGENT;

/**
 * Created by benjaminpurdy on 5/21/17.
 */
public class ApiHelper {
	private final String PRO_PUBLICA_API_KEY = "oRXhdjzpvG2etsSqwMswE9QWtkkmbOMt52bbmlTG";
	private final boolean useTestData = true;

	public final String currentPropublicaVersion = "v1";
	public final String currentPropublicaChamber = "115";
	public final String propublicaBaseURL = "https://api.propublica.org";

	private ObjectMapper mapper;

	public ApiHelper() {
		this.mapper = new ObjectMapper();
		mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
	}

	public ObjectMapper getMapper() {
		return this.mapper;
	}

	public String get(URL url) throws Exception {
    if (useTestData) {
    	final String senateRepGetRequest = propublicaBaseURL + "/congress/" + currentPropublicaVersion + "/" + currentPropublicaChamber + "/senate/members.json";
	    final String houseRepGetRequest = propublicaBaseURL + "/congress/" + currentPropublicaVersion + "/" + currentPropublicaChamber + "/house/members.json";
	    final String houseBillIntroducedGetRequest = propublicaBaseURL + "/congress/" + currentPropublicaVersion + "/" + currentPropublicaChamber + "/house/bills/introduced.json";
	    final String houseBillMajorGetRequest = propublicaBaseURL + "/congress/" + currentPropublicaVersion + "/" + currentPropublicaChamber + "/house/bills/major.json";
	    final String houseBillPassedGetRequest = propublicaBaseURL + "/congress/" + currentPropublicaVersion + "/" + currentPropublicaChamber + "/house/bills/passed.json";
	    final String houseBillUpdatedGetRequest = propublicaBaseURL + "/congress/" + currentPropublicaVersion + "/" + currentPropublicaChamber + "/house/bills/updated.json";
	    final String senateBillIntroducedGetRequest = propublicaBaseURL + "/congress/" + currentPropublicaVersion + "/" + currentPropublicaChamber + "/senate/bills/introduced.json";
	    final String senateBillMajorGetRequest = propublicaBaseURL + "/congress/" + currentPropublicaVersion + "/" + currentPropublicaChamber + "/senate/bills/major.json";
	    final String senateBillPassedGetRequest = propublicaBaseURL + "/congress/" + currentPropublicaVersion + "/" + currentPropublicaChamber + "/senate/bills/passed.json";
	    final String senateBillUpdatedGetRequest = propublicaBaseURL + "/congress/" + currentPropublicaVersion + "/" + currentPropublicaChamber + "/senate/bills/updated.json";

	    ClassLoader classLoader = getClass().getClassLoader();
	    try {
		    switch (url.toString()) {
			    case senateRepGetRequest:
				    return IOUtils.toString(classLoader.getResource("fakeData/members/senate/all.json"));
			    case houseRepGetRequest:
				    return IOUtils.toString(classLoader.getResource("fakeData/members/house/all.json"));
				  case houseBillIntroducedGetRequest:
					  return IOUtils.toString(classLoader.getResource("fakeData/bills/house/introduced.json"));
			    case houseBillMajorGetRequest:
				    return IOUtils.toString(classLoader.getResource("fakeData/bills/house/major.json"));
			    case houseBillPassedGetRequest:
				    return IOUtils.toString(classLoader.getResource("fakeData/bills/house/passed.json"));
			    case houseBillUpdatedGetRequest:
				    return IOUtils.toString(classLoader.getResource("fakeData/bills/house/updated.json"));
			    case senateBillIntroducedGetRequest:
				    return IOUtils.toString(classLoader.getResource("fakeData/bills/senate/introduced.json"));
			    case senateBillMajorGetRequest:
				    return IOUtils.toString(classLoader.getResource("fakeData/bills/senate/major.json"));
			    case senateBillPassedGetRequest:
				    return IOUtils.toString(classLoader.getResource("fakeData/bills/senate/passed.json"));
			    case senateBillUpdatedGetRequest:
				    return IOUtils.toString(classLoader.getResource("fakeData/bills/senate/updated.json"));
			    default:
						System.out.println("Invalid url passed in");
			    	return null;
//			    	String json = get(url, true);
//				    System.out.println(json);
//				    return json;
		    }
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
    }
		return get(url, true);
	}

	private String get(URL url, boolean includeAuthToken) throws Exception {
		HttpURLConnection con = (HttpURLConnection) url.openConnection();

		// By default it is GET request
		con.setRequestMethod("GET");

		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("X-API-Key", PRO_PUBLICA_API_KEY);

		int responseCode = con.getResponseCode();
		System.out.println("Sending get request : " + url);
		System.out.println("Response code : " + responseCode);

		// Reading response from input Stream
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String output;
		StringBuffer response = new StringBuffer();

		while ((output = in.readLine()) != null) {
			response.append(output);
		}
		in.close();

		return response.toString();
	}
}
