class Customer {
	int amount = 10000;

	synchronized void withdraw(int amt) {
		System.out.println("Going to withdraw");
		if (amount < amt) {
			System.out.println("Balance is less, waiting to deposit...");
			try {
				Thread.sleep(5000);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			amount -= amt;
			System.out.println("Amount Withdrawn Completed");
		}
	}

	synchronized void deposit(int amt) {
		System.out.println("Going to deposit");
		amount += amt;
		System.out.println("Money Deposited");
		notify();
	}
}

class Thread14 extends Thread {
	Customer obj;

	Thread14(Customer obj) {
		this.obj = obj;
	}

	public void run() {
		obj.withdraw(15000);
	}
}

class Thread15 extends Thread {
	Customer obj;

	Thread15(Customer obj) {
		this.obj = obj;
	}

	public void run() {
		obj.deposit(15000);
	}
}

public class WaitNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer obj = new Customer();
		Thread t14 = new Thread14(obj);
		Thread t15 = new Thread15(obj);
		t14.start();
		t15.start();
	}
}
