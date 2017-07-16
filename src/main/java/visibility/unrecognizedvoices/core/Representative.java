package visibility.unrecognizedvoices.core;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.*;

import java.util.*;

/**
 * Created by benjaminpurdy on 6/4/17.
 */
public class Representative {
	@JsonProperty
	private int id;
	@JsonProperty
	private String firstName;
	@JsonProperty
	private String middleName;
	@JsonProperty
	private String lastName;
	@JsonProperty
	private String url;
	@JsonProperty
	private boolean inOffice;
	@JsonProperty
	private int votesTotal;
	@JsonProperty
	private int votesMissed;
	@JsonProperty
	private String nextElectionDate;
	@JsonProperty
	private boolean senate = false;
	@JsonProperty
	private boolean house = false;
	@JsonProperty
	private ArrayList<Role> roles;
	@JsonIgnore
	private String fullName;
	@JsonIgnore
	private String tracker;

	public void setName(String name) {
		String[] nameSections = name.split(" ");
		switch (nameSections.length) {
			case 1:
				firstName = nameSections[0];
				middleName = null;
				lastName = null;
				break;
			case 2:
				firstName = nameSections[0];
				middleName = null;
				lastName = nameSections[1];
				break;
			case 3:
				firstName = nameSections[0];
				middleName = nameSections[1];
				lastName = nameSections[2];
				break;
			default:
				firstName = nameSections[0];
				middleName = "";
				for (int i = 1; i < nameSections.length - 1; i++) {
					middleName += nameSections[i] + " ";
				}
				middleName = middleName.substring(0, middleName.length() - 1);
				lastName = nameSections[nameSections.length];
		}
	}

	public String getName() {
		return StringUtils.defaultIfEmpty(this.firstName, "") +
					 StringUtils.defaultIfEmpty(this.middleName, " ") +
				   StringUtils.defaultIfEmpty(this.lastName, "").trim();
	}

	//GETTERS AND SETTERS
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isInOffice() {
		return inOffice;
	}

	public void setInOffice(boolean inOffice) {
		this.inOffice = inOffice;
	}

	public boolean isSenate() {
		return senate;
	}

	public void setSenate(boolean senate) {
		this.senate = senate;
	}

	public boolean isHouse() {
		return house;
	}

	public void setHouse(boolean house) {
		this.house = house;
	}

	public int getVotesTotal() {
		return votesTotal;
	}

	public void setVotesTotal(int votesTotal) {
		this.votesTotal = votesTotal;
	}

	public int getVotesMissed() {
		return votesMissed;
	}

	public void setVotesMissed(int votesMissed) {
		this.votesMissed = votesMissed;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTracker() {
		return tracker;
	}

	public void setTracker(String tracker) {
		this.tracker = tracker;
	}

	public void setNextElectionDate(String nextElectionDate) {
		this.nextElectionDate = nextElectionDate;
	}

	public String getNextElectionDate() {
		return nextElectionDate;
	}

	public ArrayList<Role> getRoles() {
		return roles;
	}

	public void setRoles(ArrayList<Role> roles) {
		this.roles = roles;
	}
}
