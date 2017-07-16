package visibility.unrecognizedvoices.jobs.representatives.jsons;

import java.util.ArrayList;
/**
 * Created by benjaminpurdy on 6/4/17.
 */
public class RepsResults {
	private int congress;
	private String chamber;
	private int num_results;
	private int offset;
	private ArrayList<Member> members;

	public int getCongress() {
		return congress;
	}

	public void setCongress(int congress) {
		this.congress = congress;
	}

	public String getChamber() {
		return chamber;
	}

	public void setChamber(String chamber) {
		this.chamber = chamber;
	}

	public int getNum_results() {
		return num_results;
	}

	public void setNum_results(int num_results) {
		this.num_results = num_results;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public java.util.ArrayList<Member> getMembers() {
		return members;
	}

	public void setMembers(java.util.ArrayList<Member> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "Results{" + "congress=" + congress + ", chamber='" + chamber + '\'' + ", num_results=" + num_results + ", offset=" + offset + ", members=" + members + '}';
	}
}
