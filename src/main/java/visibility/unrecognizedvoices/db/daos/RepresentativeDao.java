package visibility.unrecognizedvoices.db.daos;

import org.skife.jdbi.v2.sqlobject.*;
import org.skife.jdbi.v2.sqlobject.customizers.*;
import visibility.unrecognizedvoices.core.*;
import visibility.unrecognizedvoices.mappings.*;

/**
 * Created by benjaminpurdy on 5/25/17.
 */
@RegisterMapper(RepresentativeMapper.class)
public interface RepresentativeDao {

    @SqlQuery("select * from Representative where id = :id")
    Representative findRepresentative(@BindBean Representative representative);

    @SqlQuery("select * from Representative where id = :id")
    Representative findRepresentative(@Bind("id") int id);

    @SqlQuery("select * from Representative where tracker = :tracker")
    Representative findRepresentative(@Bind("tracker") String tracker);

    @SqlUpdate("insert into Representative (tracker, first_name, middle_name, last_name, next_election_date, url, in_office, votes_missed, votes_total, senate,  house) " +
		                              "values(:tracker, :firstName, :middleName, :lastName, :nextElectionDate, :url, :inOffice, :votesMissed, :votesTotal, :senate, :house)")
    void createRepresentative(@BindBean Representative representative);

    @SqlUpdate("update Representative set tracker = :tracker, " +
																					"first_name = :firstName, " +
																					"middle_name = :middleName, " +
																					"last_name = :lastName, " +
																					"next_election_date = :nextElectionDate, " +
																					"in_office = :inOffice, " +
																					"url = :url, " +
																					"votes_missed = :votesMissed, " +
																					"votes_total = :votesTotal, " +
																					"senate = :senate, " +
																					"house = :house " +
																					"where id = :id")
    void updateRepresentative(@BindBean Representative representative);
}
