package visibility.unrecognizedvoices.mappings;

/**
 * Created by benjaminpurdy on 6/4/17.
 */
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import visibility.unrecognizedvoices.core.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BillMapper implements ResultSetMapper<Bill> {

	public Bill map(int index, ResultSet resultSet, StatementContext statementContext) throws SQLException {
		Bill bill = new Bill();
		bill.setType(resultSet.getString("type"));
		bill.setTitle(resultSet.getString("title"));
		bill.setCongressSession(resultSet.getInt("congress_session"));
		bill.setActive(resultSet.getBoolean("active"));
		bill.setHousePassage(resultSet.getBoolean("house_passage"));
		bill.setSenatePassage(resultSet.getBoolean("senate_passage"));
		bill.setCosponsor(resultSet.getInt("cosponsor"));
		bill.setVetoed(resultSet.getBoolean("vetoed"));
		bill.setPrimarySubject(resultSet.getString("primary_subject"));
		bill.setSummary(resultSet.getString("summary"));
		bill.setSummaryShort(resultSet.getString("summary_short"));
		return bill;
	}
}
