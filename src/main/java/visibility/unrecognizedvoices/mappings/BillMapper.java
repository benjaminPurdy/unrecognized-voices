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

		return bill;
	}
}
