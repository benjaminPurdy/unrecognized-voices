package visibility.unrecognizedvoices.jobs.representatives.jsons;

import java.util.ArrayList;

/**
 * Created by benjaminpurdy on 6/4/17.
 */
public class RepsMappedJson {

	public RepsMappedJson() { }

	private String status;
	private String copyright;
	private ArrayList<RepsResults> results;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public java.util.ArrayList<RepsResults> getResults() {
		return results;
	}

	public void setResults(java.util.ArrayList<RepsResults> results) {
		this.results = results;
	}

	public boolean isSuccessful() {
		if (this.status.equalsIgnoreCase("OK"))
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "MappedJson{" + "status='" + status + '\'' + ", copyright='" + copyright + '\'' + ", results=" + results + '}';
	}
}
