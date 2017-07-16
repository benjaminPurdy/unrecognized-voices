package visibility.unrecognizedvoices.db.daos;

import org.skife.jdbi.v2.sqlobject.*;
import org.skife.jdbi.v2.sqlobject.customizers.*;
import visibility.unrecognizedvoices.core.*;
import visibility.unrecognizedvoices.mappings.*;

import java.util.List;

/**
 * Created by benjaminpurdy on 5/25/17.
 */
@RegisterMapper(BillMapper.class)
public interface BillDao {
	//test

    @SqlQuery("select * from Bill where id = :id")
    Bill findBill(@BindBean Bill bill);

    @SqlQuery("select * from Bill where id = :id")
    Bill findBill(@Bind("id") int bill);

    @SqlQuery("select * from Bill where tracker = :tracker")
    Bill findBill(@Bind("tracker") String tracker);

    @SqlQuery("select * from Bill where representative_id = :representative_id")
    List<Bill> findAllBillsSponsoredByRepresentative(@Bind("representative_id") int representativeId);

    @SqlUpdate("insert into Bill (tracker, url, congress_session, title, type, active, house_passage, senate_passage, cosponsor, vetoed, primary_subject, summary, summary_short) " +
                         "values (:tracker, :url, :congressSession, :title, :type, :active, :housePassage, :senatePassage, :cosponsor, :vetoed, :primarySubject, :summary, :summaryShort)")
    void createBill(@BindBean Bill bill);

    @SqlUpdate("update Bill set tracker = :tracker, " +
        "congress_session = :congressSession, " +
        "url = :url, " +
        "title = :title, " +
        "type = :type, " +
        "active = :active, " +
        "house_passage = :housePassage, " +
        "senate_passage = :senatePassage, " +
        "cosponsor = :cosponsor, " +
        "vetoed = :vetoed, " +
        "primary_subject = :primarySubject, " +
        "summary = :summary, " +
        "summary_short = :summaryShort " +
        "where id = :id")
    void updateBill(@BindBean Bill bill);
}
