package visibility.unrecognizedvoices.db.services;

import visibility.unrecognizedvoices.core.*;
import visibility.unrecognizedvoices.db.daos.*;

import java.util.*;

/**
 * Created by benjaminpurdy on 6/4/17.
 */
public class BillService {
	private final BillDao billDao;

	public BillService(BillDao billDAO) {
		this.billDao = billDAO;
	}

	public Bill findBill(Bill bill) {
		return billDao.findBill(bill);
	}

	public Bill findBill(int id) {
		return billDao.findBill(id);
	}

	public Bill findBill(String tracker) {
		return billDao.findBill(tracker);
	}

	public List<Bill> findAllBillsSponsoredByRepresentative(int representativeId) {
		return billDao.findAllBillsSponsoredByRepresentative(representativeId);
	}
}
