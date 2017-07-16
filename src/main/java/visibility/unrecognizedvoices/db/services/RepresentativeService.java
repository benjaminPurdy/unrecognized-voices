package visibility.unrecognizedvoices.db.services;

import com.fasterxml.jackson.dataformat.yaml.snakeyaml.representer.*;
import visibility.unrecognizedvoices.core.*;
import visibility.unrecognizedvoices.db.daos.*;
import visibility.unrecognizedvoices.jobs.representatives.jsons.*;

/**
 * Created by benjaminpurdy on 6/4/17.
 */
public class RepresentativeService {
	private final RepresentativeDao representativeDao;
	private enum Congress {SENATE, HOUSE}

	public RepresentativeService(RepresentativeDao billDAO) {
		this.representativeDao = billDAO;
	}

	public Representative findRepresentative(Representative representative) {
		return representativeDao.findRepresentative(representative);
	}

	public Representative findRepresentative(int id) {
		return representativeDao.findRepresentative(id);
	}

	public Representative findRepresentative(String tracker) {
		return representativeDao.findRepresentative(tracker);
	}

	public void findOrCreateHouseRep(Member member) {
		try {
			findOrCreate(member, Congress.HOUSE);
		} catch (Exception e) {e.printStackTrace();}
	}

	public void findOrCreateSenateRep(Member member) {
		findOrCreate(member, Congress.SENATE);
	}

//PRIVATE METHODS

	private void findOrCreate(Member member, Congress congress) {
		Representative representative = populateVia(member, congress);
		Representative existingRepresentative = representativeDao.findRepresentative(representative.getTracker());
		if (existingRepresentative == null) {
			representativeDao.createRepresentative(representative);
		} else {
			representative.setId(existingRepresentative.getId());
			representativeDao.updateRepresentative(representative);
		}
	}

	private Representative populateVia(Member member, Congress congress) {
		Representative representative = new Representative();
		representative.setTracker(member.getId());
		representative.setFirstName(member.getFirstName());
		representative.setMiddleName(member.getMiddleName());
		representative.setLastName(member.getLastName());
		representative.setInOffice(Boolean.valueOf(member.getInOffice()));
		representative.setUrl(member.getUrl());
		representative.setVotesMissed(member.getMissedVotes());
		representative.setVotesTotal(member.getTotalVotes());
		representative.setNextElectionDate(member.getNextElection());

		if (congress.equals(Congress.HOUSE)) {
			representative.setHouse(true);
		} else if (congress.equals(Congress.SENATE)) {
			representative.setSenate(true);
		}

		return representative;
	}
}
