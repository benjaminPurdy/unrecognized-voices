package visibility.unrecognizedvoices.core;

public class SalesInvoice extends Invoice {
	public static String formatId(String oldId) {
		return oldId + "_SalesInvoice";
	}
}
