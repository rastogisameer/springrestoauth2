package demo1.invoice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InvoiceRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Invoice> getAll(){

		List<Invoice> list = new ArrayList<Invoice>();

		jdbcTemplate.query("select invoiceid, amount, payor from invoices",
				rs -> {
					Invoice inv = new Invoice(rs.getLong("invoiceid"), rs.getDouble("amount"), rs.getString("payor"));
					list.add(inv);
				} );

		return list;
	}

}
