package visibility.unrecognizedvoices.jobs.bills.jsons;

import visibility.unrecognizedvoices.jobs.representatives.jsons.*;

import java.util.*;

/**
 * Created by benjaminpurdy on 6/4/17.
 */
public class BillsSenateMappedJson {

	public BillsSenateMappedJson() { }

	private String status;
	private String copyright;
	private ArrayList<BillsResults> results;

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

	public ArrayList<BillsResults> getResults() {
		return results;
	}

	public void setResults(ArrayList<BillsResults> results) {
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
