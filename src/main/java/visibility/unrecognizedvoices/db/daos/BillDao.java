package visibility.unrecognizedvoices.db.daos;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.*;
import visibility.unrecognizedvoices.core.*;
import visibility.unrecognizedvoices.mappings.*;

import java.util.List;

/**
 * Created by benjaminpurdy on 5/25/17.
 */
@RegisterMapper(BillMapper.class)
public interface BillDao {

    @SqlQuery("select * from Bill where id = :id")
    Bill findBill(@BindBean Bill bill);

    @SqlQuery("select * from Bill where id = :id")
    Bill findBill(@Bind("id") int bill);

    @SqlQuery("select * from Bill where tracker = :id")
    Bill findBill(@Bind("tracker") String tracker);

    @SqlQuery("select * from Bill where representative_id = :representative_id")
    List<Bill> findAllBillsSponsoredByRepresentative(@Bind("representative_id") int representativeId);
}
