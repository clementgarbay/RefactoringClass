package extractmethod;

import java.util.Enumeration;
import java.util.Vector;

public class PrintRefactored {

	private Vector<Order> _orders = new Vector<>();
	private String _name = "Refactoring Classe";
	
	public static void main(String[] args) {
		new PrintRefactored().printOwning(100.0);
	}
	
	public void printOwning(double previousAmount) {

		printBanner();

        double outstanding = getOutstanding(previousAmount * 1.2);
		
		printDetails(outstanding);
	}

    private double getOutstanding(double previousAmount) {
        Enumeration<Order> e = _orders.elements();
        double outstanding = previousAmount;

        // calculate outstanding
        while (e.hasMoreElements()) {
            Order each = e.nextElement();
            outstanding += each.getAmount();
        }
        return outstanding;
    }

    private void printDetails(double outstanding) {
		System.out.println("name: " + _name);
		System.out.println("amount: " + outstanding);
	}

	private void printBanner() {
		System.out.println("**************************");
		System.out.println("********* Banner *********");
		System.out.println("**************************");
	}

	public class Order {
		public Order(double _amount) {
			super();
			this._amount = _amount;
		}

		private double _amount = 0.0;

		public double getAmount() {
			return _amount;
		}
	}
}
