package visibility.unrecognizedvoices.core;

import com.fasterxml.jackson.annotation.*;
import org.joda.time.*;

import java.sql.Date;
import java.util.*;

/**
 * Created by benjaminpurdy on 12/14/16.
 */
public class Bill {

	@JsonProperty
	private int id;
	@JsonProperty
	private int congressSession;
	@JsonProperty
	private String tracker;
	@JsonProperty
	private String type;
	@JsonProperty
	private String url;
	@JsonProperty
	private String title;
	@JsonProperty
	private String sponsorId;
	@JsonProperty
	private String sponsorUri;
	@JsonProperty
	private String gpoPdfUri;
	@JsonProperty
	private String congressDotGovUrl;
	@JsonProperty
	private String govTrackUrl;
	@JsonProperty
	private String introducedDate;
	@JsonProperty
	private boolean active;
	@JsonProperty
	private boolean housePassage;
	@JsonProperty
	private boolean senatePassage;
	@JsonProperty
	private boolean enacted;
	@JsonProperty
	private boolean vetoed;
	@JsonProperty
	private int cosponsor;
	@JsonProperty
	private List<Committee> committees;
	@JsonProperty
	private String primarySubject;
	@JsonProperty
	private String summary;
	@JsonProperty
	private String summaryShort;
	@JsonProperty
	private Date lastMajorActionDate;
	@JsonProperty
	private String lastMajorAction;
	@JsonProperty
	private List<Action> actions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTracker() {
		return tracker;
	}

	public void setTracker(String tracker) {
		this.tracker = tracker;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public void setSponsorId(String sponsorId) {
		this.sponsorId = sponsorId;
	}

	public String getSponsorUri() {
		return sponsorUri;
	}

	public void setSponsorUri(String sponsorUri) {
		this.sponsorUri = sponsorUri;
	}

	public String getGpoPdfUri() {
		return gpoPdfUri;
	}

	public void setGpoPdfUri(String gpoPdfUri) {
		this.gpoPdfUri = gpoPdfUri;
	}

	public String getCongressDotGovUrl() {
		return congressDotGovUrl;
	}

	public void setCongressDotGovUrl(String congressDotGovUrl) {
		this.congressDotGovUrl = congressDotGovUrl;
	}

	public String getIntroducedDate() {
		return introducedDate;
	}

	public void setIntroducedDate(String introducedDate) {
		this.introducedDate = introducedDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean getHousePassage() {
		return housePassage;
	}

	public void setHousePassage(boolean housePassage) {
		this.housePassage = housePassage;
	}

	public boolean getSenatePassage() {
		return senatePassage;
	}

	public void setSenatePassage(boolean senatePassage) {
		this.senatePassage = senatePassage;
	}

	public boolean isEnacted() {
		return enacted;
	}

	public void setEnacted(boolean enacted) {
		this.enacted = enacted;
	}

	public boolean isVetoed() {
		return vetoed;
	}

	public void setVetoed(boolean vetoed) {
		this.vetoed = vetoed;
	}

	public int getCosponsor() {
		return cosponsor;
	}

	public void setCosponsor(int cosponsor) {
		this.cosponsor = cosponsor;
	}

	public List<Committee> getCommittees() {
		return committees;
	}

	public void setCommittees(List<Committee> committees) {
		this.committees = committees;
	}

	public String getPrimarySubject() {
		return primarySubject;
	}

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

	public void setSummaryShort(String summaryShort) {
		this.summaryShort = summaryShort;
	}

	public DateTime getLastMajorActionDate() {
		if (actions.isEmpty())
			return null;

		return actions.get(0).getDateTime();
	}

	public String getLastMajorAction() {
		if (actions.isEmpty())
			return null;

		return actions.get(0).getDescription();
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		Collections.sort(actions);
		this.actions = actions;
	}

	public String getGovTrackUrl() {
		return govTrackUrl;
	}

	public void setGovTrackUrl(String govTrackUrl) {
		this.govTrackUrl = govTrackUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCongressSession() {
		return congressSession;
	}

	public void setCongressSession(int congressSession) {
		this.congressSession = congressSession;
	}

	public boolean isHousePassage() {
		return housePassage;
	}

	public boolean isSenatePassage() {
		return senatePassage;
	}
}
