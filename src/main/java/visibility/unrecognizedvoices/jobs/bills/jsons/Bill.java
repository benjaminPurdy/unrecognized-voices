package visibility.unrecognizedvoices.jobs.bills.jsons;

import com.fasterxml.jackson.annotation.*;

import java.util.*;

/**
 * Created by benjaminpurdy on 6/4/17.
 */
public class Bill {

	public Bill() { }

	private String id;
	private String type;
	private String number;
	private String uri;
	private String title;
	private String sponsorId;
	private String sponsorUri;
	private String sponsorName;
	private String sponsorState;
	private String sponsorParty;
	private String gpoPdfUri;
	private String congressDotGovUrl;
	private String govTrackUrl;
	private Date introducedDate;
	private boolean active;
	private Date housePassage;
	private Date senatePassage;
	private Date enacted;
	private boolean vetoed;
	private int cosponsors;
	private String committees;
	private String[] committeeCodes;
	private String[] subcommitteeCodes;
	private String primarySubject;
	private String summary;
	private String summaryShort;
	private Date latestMajorActionDate;
	private String latestMajorAction;
	private ArrayList<Action> actions;

	public visibility.unrecognizedvoices.core.Bill map() {
		visibility.unrecognizedvoices.core.Bill bill = new visibility.unrecognizedvoices.core.Bill();
		bill.setTracker(this.id);
		bill.setType(this.type);
		bill.setUrl(this.uri);
		bill.setTitle(this.title);
		bill.setSponsorId(this.sponsorId);
		bill.setSponsorUri(this.sponsorUri);
		bill.setGpoPdfUri(this.gpoPdfUri);
		bill.setCongressDotGovUrl(this.congressDotGovUrl);
		bill.setGovTrackUrl(this.govTrackUrl);
		bill.setIntroducedDate(this.introducedDate.toString());
		bill.setVetoed(this.vetoed);
		bill.setCosponsor(this.cosponsors);
		bill.setPrimarySubject(this.primarySubject);
		bill.setSummary(this.summary);
		bill.setSummaryShort(this.summaryShort);
		List<visibility.unrecognizedvoices.core.Action> actions = new ArrayList<>();
//		for (Action action : this.actions) {
//			actions.add(action.mapToAction());
//		}
		bill.setActions(actions);

		return bill;
	}

	@JsonProperty("bill_id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("bill_type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getUri() {
		return uri;
	}

	@JsonProperty("bill_uri")
	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSponsorId() {
		return sponsorId;
	}

	@JsonProperty("sponsor_id")
	public void setSponsorId(String sponsorId) {
		this.sponsorId = sponsorId;
	}

	public String getSponsorUri() {
		return sponsorUri;
	}

	@JsonProperty("sponsor_uri")
	public void setSponsorUri(String sponsorUri) {
		this.sponsorUri = sponsorUri;
	}

	public String getGpoPdfUri() {
		return gpoPdfUri;
	}

	@JsonProperty("gpo_pdf_uri")
	public void setGpoPdfUri(String gpoPdfUri) {
		this.gpoPdfUri = gpoPdfUri;
	}

	public String getCongressDotGovUrl() {
		return congressDotGovUrl;
	}

	@JsonProperty("congressdotgov_url")
	public void setCongressDotGovUrl(String congressDotGovUrl) {
		this.congressDotGovUrl = congressDotGovUrl;
	}

	public String getGovTrackUrl() {
		return govTrackUrl;
	}

	@JsonProperty("govtrack_url")
	public void setGovTrackUrl(String govTrackUrl) {
		this.govTrackUrl = govTrackUrl;
	}

	public Date getIntroducedDate() {
		return introducedDate;
	}

	@JsonProperty("introduced_date")
	public void setIntroducedDate(Date introducedDate) {
		this.introducedDate = introducedDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getHousePassage() {
		return housePassage;
	}

	@JsonProperty("house_passage")
	public void setHousePassage(Date housePassage) {
		this.housePassage = housePassage;
	}

	public Date getSenatePassage() {
		return senatePassage;
	}

	@JsonProperty("senate_passage")
	public void setSenatePassage(Date senatePassage) {
		this.senatePassage = senatePassage;
	}

	public Date isEnacted() {
		return enacted;
	}

	public void setEnacted(Date enacted) {
		this.enacted = enacted;
	}

	public boolean isVetoed() {
		return vetoed;
	}

	public void setVetoed(boolean vetoed) {
		this.vetoed = vetoed;
	}

	public int getCosponsors() {
		return cosponsors;
	}

	public void setCosponsors(int cosponsors) {
		this.cosponsors = cosponsors;
	}

	public String getCommittees() {
		return committees;
	}

	public void setCommittees(String committees) {
		this.committees = committees;
	}

	public String[] getCommitteeCodes() {
		return committeeCodes;
	}

	@JsonProperty("committee_codes")
	public void setCommitteeCodes(String[] committeeCodes) {
		this.committeeCodes = committeeCodes;
	}

	public String getPrimarySubject() {
		return primarySubject;
	}

	@JsonProperty("primary_subject")
	public void setPrimarySubject(String primarySubject) {
		this.primarySubject = primarySubject;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSummaryShort() {
		return summaryShort;
	}

	@JsonProperty("summary_short")
	public void setSummaryShort(String summaryShort) {
		this.summaryShort = summaryShort;
	}

	public Date getLatestMajorActionDate() {
		return latestMajorActionDate;
	}

	@JsonProperty("latest_major_action_date")
	public void setLatestMajorActionDate(Date latestMajorActionDate) {
		this.latestMajorActionDate = latestMajorActionDate;
	}

	public String getLatestMajorAction() {
		return latestMajorAction;
	}

	@JsonProperty("latest_major_action")
	public void setLatestMajorAction(String lastestMajorAction) {
		this.latestMajorAction = lastestMajorAction;
	}
	public ArrayList<Action> getActions() {
		return actions;
	}

	public void setActions(ArrayList<Action> actions) {
		this.actions = actions;
	}

	public String getSponsorState() {
		return sponsorState;
	}

	@JsonProperty("sponsor_state")
	public void setSponsorState(String sponsorState) {
		this.sponsorState = sponsorState;
	}

	public String getSponsorName() {
		return sponsorName;
	}

	@JsonProperty("sponsor_name")
	public void setSponsorName(String sponsorName) {
		this.sponsorName = sponsorName;
	}

	public String getSponsorParty() {
		return sponsorParty;
	}

	@JsonProperty("sponsor_party")
	public void setSponsorParty(String sponsorParty) {
		this.sponsorParty = sponsorParty;
	}

	public String[] getSubcommitteeCodes() {
		return subcommitteeCodes;
	}

	@JsonProperty("subcommittee_codes")
	public void setSubcommitteeCodes(String[] subcommitteeCodes) {
		this.subcommitteeCodes = subcommitteeCodes;
	}

	@Override
	public String toString() {
		return "Bill{" + "id='" + id + '\'' + ", type='" + type + '\'' + ", number='" + number + '\'' + ", uri='" + uri + '\'' + ", title='" + title + '\'' + ", sponsorId='" + sponsorId + '\'' + ", sponsorUri='" + sponsorUri + '\'' + ", gpoPdfUri='" + gpoPdfUri + '\'' + ", congressDotGovUrl='" + congressDotGovUrl + '\'' + ", govTrackUrl='" + govTrackUrl + '\'' + ", introducedDate=" + introducedDate + ", active=" + active + ", housePassage=" + housePassage + ", senatePassage=" + senatePassage + ", enacted=" + enacted + ", vetoed=" + vetoed + ", cosponsors=" + cosponsors + ", committees='" + committees + '\'' + ", primarySubject='" + primarySubject + '\'' + ", summary='" + summary + '\'' + ", summaryShort='" + summaryShort + '\'' + ", latestMajorActionDate=" + latestMajorActionDate + ", latestMajorAction='" + latestMajorAction + '\'' + ", actions=" + actions + '}';
	}
}
