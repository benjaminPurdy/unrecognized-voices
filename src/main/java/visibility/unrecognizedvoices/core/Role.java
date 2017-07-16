package visibility.unrecognizedvoices.core;

import java.util.*;

/**
 * Created by benjaminpurdy on 12/14/16.
 */
public class Role {

	public Role() { }

	private int congress;
	private boolean house;
	private boolean senate;
	private String title;
	private State state;
	private Party party;
	private Date startDate;
	private Date endDate;
	private ArrayList<Committee> committees;

	public int getCongress() {
		return congress;
	}

	public void setCongress(int congress) {
		this.congress = congress;
	}

	public boolean isHouse() {
		return house;
	}

	public void setHouse(boolean house) {
		this.house = house;
	}

	public boolean isSenate() {
		return senate;
	}

	public void setSenate(boolean senate) {
		this.senate = senate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public ArrayList<Committee> getCommittees() {
		return committees;
	}

	public void setCommittees(ArrayList<Committee> committees) {
		this.committees = committees;
	}

	@Override
	public String toString() {
		return "Role{" + "congress=" + congress + ", house=" + house + ", senate=" + senate + ", title='" + title + '\'' + ", state=" + state + ", party=" + party + ", startDate=" + startDate + ", endDate=" + endDate + ", committees=" + committees + '}';
	}
}
