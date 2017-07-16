package visibility.unrecognizedvoices.db.services;

import visibility.unrecognizedvoices.api.*;
import visibility.unrecognizedvoices.core.*;
import visibility.unrecognizedvoices.core.Bill;
import visibility.unrecognizedvoices.db.daos.*;
import visibility.unrecognizedvoices.jobs.bills.jsons.*;

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


	public void findOrCreate(visibility.unrecognizedvoices.jobs.bills.jsons.Bill billJson) {
		ApiHelper apiHelper = new ApiHelper();
		findOrCreate(billJson, apiHelper.currentPropublicaChamber);
	}

	private void findOrCreate(visibility.unrecognizedvoices.jobs.bills.jsons.Bill billJson, String currentPropublicaChamber) {
		Bill bill = billJson.map();
		bill.setCongressSession(Integer.parseInt(currentPropublicaChamber));

		Bill existingBill = billDao.findBill(bill.getTracker());
		if (existingBill == null) {
			billDao.createBill(bill);
		} else {
			bill.setId(bill.getId());
			billDao.updateBill(bill);
		}
	}

}
