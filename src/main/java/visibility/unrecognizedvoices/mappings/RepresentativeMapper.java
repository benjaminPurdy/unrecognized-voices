package visibility.unrecognizedvoices.mappings;

/**
 * Created by benjaminpurdy on 6/4/17.
 */
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import visibility.unrecognizedvoices.core.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RepresentativeMapper implements ResultSetMapper<Representative> {
	public Representative map(int index, ResultSet resultSet, StatementContext statementContext) throws SQLException {
		Representative representative = new Representative();
		representative.setId(resultSet.getInt("id"));
		representative.setTracker(resultSet.getString("tracker"));
		representative.setFirstName(resultSet.getString("first_name"));
		representative.setMiddleName(resultSet.getString("middle_name"));
		representative.setLastName(resultSet.getString("last_name"));
		representative.setUrl(resultSet.getString("url"));
		representative.setInOffice(resultSet.getBoolean("in_office"));
		representative.setNextElectionDate(resultSet.getString("next_election_date"));
		representative.setVotesTotal(resultSet.getInt("votes_total"));
		representative.setVotesMissed(resultSet.getInt("votes_missed"));
		representative.setHouse(resultSet.getBoolean("house"));
		representative.setSenate(resultSet.getBoolean("senate"));


		return representative;
	}
}
