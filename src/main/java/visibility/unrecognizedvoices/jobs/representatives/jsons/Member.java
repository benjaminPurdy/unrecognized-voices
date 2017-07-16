package visibility.unrecognizedvoices.jobs.representatives.jsons;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

/**
 * Created by benjaminpurdy on 6/4/17.
 */
public class Member {

	public Member() { }

	private String id;
	private String apiUri;
	private String firstName;
	private String middleName;
	private String lastName;
	private String dateOfBirth;
	private String party;
	private String leadershipRole;
	private String twitterAccount;
	private String facebookAccount;
	private String youtubeAccount;
	private int govTrackId;
	private int cspanId;
	private int voteSmartId;
	private int icpsrId;
	private String crpId;
	private String googleEntityId;
	private String url;
	private String rssUrl;
	private String contactForm;
	private String domain;
	private String inOffice;
	private String dwNominate;
	private String idealPoint;
	private int seniority;
	private String nextElection;
	private int totalVotes;
	private int missedVotes;
	private int totalPresent;
	private String ocdId;
	private String office;
	private String phone;
	private String fax;
	private String state;
	private int senateClass;
	private int district;
	private int geoId;
	private String stateRank;
	private String lisId;
	private double missedVotesPct;
	private double votesWithPartyPct;
	private ArrayList<Role> roles;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApiUri() {
		return apiUri;
	}

	@JsonProperty("api_uri")
	public void setApiUri(String apiUri) {
		this.apiUri = apiUri;
	}

	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("first_name")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	@JsonProperty("middle_name")
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	@JsonProperty("last_name")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	@JsonProperty("date_of_birth")
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getTwitterAccount() {
		return twitterAccount;
	}

	@JsonProperty("twitter_account")
	public void setTwitterAccount(String twitterAccount) {
		this.twitterAccount = twitterAccount;
	}

	public String getFacebookAccount() {
		return facebookAccount;
	}

	@JsonProperty("facebook_account")
	public void setFacebookAccount(String facebookAccount) {
		this.facebookAccount = facebookAccount;
	}

	public String getYoutubeAccount() {
		return youtubeAccount;
	}

	@JsonProperty("youtube_account")
	public void setYoutubeAccount(String youtubeAccount) {
		this.youtubeAccount = youtubeAccount;
	}

	public int getGovTrackId() {
		return govTrackId;
	}

	@JsonProperty("govtrack_id")
	public void setGovTrackId(int govTrackId) {
		this.govTrackId = govTrackId;
	}

	public int getCspanId() {
		return cspanId;
	}

	@JsonProperty("cspan_id")
	public void setCspanId(int cspanId) {
		this.cspanId = cspanId;
	}

	public int getVoteSmartId() {
		return voteSmartId;
	}

	@JsonProperty("votesmart_id")
	public void setVoteSmartId(int voteSmartId) {
		this.voteSmartId = voteSmartId;
	}

	public int getIcpsrId() {
		return icpsrId;
	}

	@JsonProperty("icpsr_id")
	public void setIcpsrId(int icpsrId) {
		this.icpsrId = icpsrId;
	}

	public String getCrpId() {
		return crpId;
	}

	@JsonProperty("crp_id")
	public void setCrpId(String crpId) {
		this.crpId = crpId;
	}

	public String getGoogleEntityId() {
		return googleEntityId;
	}

	@JsonProperty("google_entity_id")
	public void setGoogleEntityId(String googleEntityId) {
		this.googleEntityId = googleEntityId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRssUrl() {
		return rssUrl;
	}

	@JsonProperty("rss_url")
	public void setRssUrl(String rssUrl) {
		this.rssUrl = rssUrl;
	}

	public String getContactForm() {
		return contactForm;
	}

	@JsonProperty("contact_form")
	public void setContactForm(String contactForm) {
		this.contactForm = contactForm;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getInOffice() {
		return inOffice;
	}

	@JsonProperty("in_office")
	public void setInOffice(String inOffice) {
		this.inOffice = inOffice;
	}

	public String getDwNominate() {
		return dwNominate;
	}

	@JsonProperty("dw_nominate")
	public void setDwNominate(String dwNominate) {
		this.dwNominate = dwNominate;
	}

	public String getIdealPoint() {
		return idealPoint;
	}

	@JsonProperty("ideal_point")
	public void setIdealPoint(String idealPoint) {
		this.idealPoint = idealPoint;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	@JsonProperty("next_election")
	public String getNextElection() {
		return nextElection;
	}

	public void setNextElection(String nextElection) {
		this.nextElection = nextElection;
	}

	@JsonProperty("total_votes")
	public int getTotalVotes() {
		return totalVotes;
	}

	public void setTotalVotes(int totalVotes) {
		this.totalVotes = totalVotes;
	}

	@JsonProperty("missed_votes")
	public int getMissedVotes() {
		return missedVotes;
	}

	public void setMissedVotes(int missedVotes) {
		this.missedVotes = missedVotes;
	}

	@JsonProperty("total_present")
	public int getTotalPresent() {
		return totalPresent;
	}

	public void setTotalPresent(int totalPresent) {
		this.totalPresent = totalPresent;
	}

	@JsonProperty("ocd_id")
	public String getOcdId() {
		return ocdId;
	}

	public void setOcdId(String ocdId) {
		this.ocdId = ocdId;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getSenateClass() {
		return senateClass;
	}

	@JsonProperty("senate_class")
	public void setSenateClass(int senateClass) {
		this.senateClass = senateClass;
	}

	public int getDistrict() {
		return this.district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public int getGeoId() {
		return this.geoId;
	}

	@JsonProperty("geoid")
	public void setGeoId(int geoId) {
		this.geoId = geoId;
	}

	public String getStateRank() {
		return stateRank;
	}

	@JsonProperty("state_rank")
	public void setStateRank(String stateRank) {
		this.stateRank = stateRank;
	}

	public String getLisId() {
		return lisId;
	}

	@JsonProperty("lis_id")
	public void setLisId(String lisId) {
		this.lisId = lisId;
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

	public ArrayList<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(ArrayList<Role> roles) {
		this.roles = roles;
	}

}
