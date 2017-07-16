package visibility.unrecognizedvoices.jobs.representatives.jsons;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

/**
 * Created by benjaminpurdy on 6/4/17.
 */
public class Role {

	public Role() { }

	private int congress;
	private String chamber;
	private String title;
	private String state;
	private String party;
	private String leadershipRole;
	private String fecCanidateId;
	private int seniority;
	private int district;
	private String ocdId;
	private Date startDate;
	private Date endDate;
	private String office;
	private String phone;
	private String fax;
	private String contactForm;
	private int billsSponsored;
	private int billsCosponsored;
	private double missedVotesPct;
	private double votesWithPartyPct;
	ArrayList<Committee> committees;


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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getLeadershipRole() {
		return leadershipRole;
	}

	@JsonProperty("leadership_role")
	public void setLeadershipRole(String leadershipRole) {
		this.leadershipRole = leadershipRole;
	}

	public String getFecCanidateId() {
		return fecCanidateId;
	}

	@JsonProperty("fec_candidate_id")
	public void setFecCanidateId(String fecCanidateId) {
		this.fecCanidateId = fecCanidateId;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public int getDistrict() {
		return district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public String getOcdId() {
		return ocdId;
	}

	@JsonProperty("ocd_id")
	public void setOcdId(String ocdId) {
		this.ocdId = ocdId;
	}

	public Date getStartDate() {
		return startDate;
	}

	@JsonProperty("start_date")
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	@JsonProperty("end_date")
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getContactForm() {
		return contactForm;
	}

	@JsonProperty("contact_form")
	public void setContactForm(String contactForm) {
		this.contactForm = contactForm;
	}

	public int getBillsSponsored() {
		return billsSponsored;
	}

	@JsonProperty("bills_sponsored")
	public void setBillsSponsored(int billsSponsored) {
		this.billsSponsored = billsSponsored;
	}

	public int getBillsCosponsored() {
		return billsCosponsored;
	}

	@JsonProperty("bills_cosponsored")
	public void setBillsCosponsored(int billsCosponsored) {
		this.billsCosponsored = billsCosponsored;
	}

	public double getMissedVotesPct() {
		return missedVotesPct;
	}

	@JsonProperty("missed_votes_pct")
	public void setMissedVotesPct(double missedVotesPct) {
		this.missedVotesPct = missedVotesPct;
	}

	public double getVotesWithPartyPct() {
		return votesWithPartyPct;
	}

	@JsonProperty("votes_with_party_pct")
	public void setVotesWithPartyPct(double votesWithPartyPct) {
		this.votesWithPartyPct = votesWithPartyPct;
	}

	public ArrayList<Committee> getCommittees() {
		return committees;
	}

	public void setCommittees(ArrayList<Committee> committees) {
		this.committees = committees;
	}

	@Override
	public String toString() {
		return "Role{" + "congress=" + congress + ", chamber='" + chamber + '\'' + ", title='" + title + '\'' + ", state='" + state + '\'' + ", party='" + party + '\'' + ", leadershipRole='" + leadershipRole + '\'' + ", fecCanidateId='" + fecCanidateId + '\'' + ", seniority=" + seniority + ", district=" + district + ", ocdId='" + ocdId + '\'' + ", startDate=" + startDate + ", endDate=" + endDate + ", office='" + office + '\'' + ", phone='" + phone + '\'' + ", fax='" + fax + '\'' + ", contactForm='" + contactForm + '\'' + ", billsSponsored=" + billsSponsored + ", billsCosponsored=" + billsCosponsored + ", missedVotesPct=" + missedVotesPct + ", votesWithPartyPct=" + votesWithPartyPct + ", committees=" + committees + '}';
	}
}
