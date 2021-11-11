package PPS_Project.bean;


public class Transactions {
	
	private int transaction_ID;
	private String transaction_name;
	private String transaction_date;
	private String transaction_time;
	private double dollar_amount;
	private long PPS_amount;
	private String transaction_from_email;
	private String transaction_to_email;
	
	
	public Transactions() {}
	
	public Transactions(int transaction_ID, String transaction_name, String transaction_date, String transaction_time,
			double dollar_amount, long pPS_amount, String transaction_from_email, String transaction_to_email) {
		super();
		this.transaction_ID = transaction_ID;
		this.transaction_name = transaction_name;
		this.transaction_date = transaction_date;
		this.transaction_time = transaction_time;
		this.dollar_amount = dollar_amount;
		this.PPS_amount = pPS_amount;
		this.transaction_from_email = transaction_from_email;
		this.transaction_to_email = transaction_to_email;
	}

	
	
	public Transactions(String transaction_name, String transaction_date, String transaction_time, double dollar_amount,
			long pPS_amount, String transaction_from_email, String transaction_to_email) {
		super();
		this.transaction_name = transaction_name;
		this.transaction_date = transaction_date;
		this.transaction_time = transaction_time;
		this.dollar_amount = dollar_amount;
		this.PPS_amount = pPS_amount;
		this.transaction_from_email = transaction_from_email;
		this.transaction_to_email = transaction_to_email;
	}

	public Transactions(String transaction_name, String transaction_date, String transaction_time, double dollar_amount,
			long pPS_amount) {
		super();
		this.transaction_name = transaction_name;
		this.transaction_date = transaction_date;
		this.transaction_time = transaction_time;
		this.dollar_amount = dollar_amount;
		this.PPS_amount = pPS_amount;
	}

	public int getTransaction_ID() {
		return transaction_ID;
	}

	public void setTransaction_ID(int transaction_ID) {
		this.transaction_ID = transaction_ID;
	}

	public String getTransaction_name() {
		return transaction_name;
	}

	public void setTransaction_name(String transaction_name) {
		this.transaction_name = transaction_name;
	}

	public String getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(String transaction_date) {
		this.transaction_date = transaction_date;
	}

	public String getTransaction_time() {
		return transaction_time;
	}

	public void setTransaction_time(String transaction_time) {
		this.transaction_time = transaction_time;
	}

	public double getDollar_amount() {
		return dollar_amount;
	}

	public void setDollar_amount(double dollar_amount) {
		this.dollar_amount = dollar_amount;
	}

	public long getPPS_amount() {
		return PPS_amount;
	}

	public void setPPS_amount(long pPS_amount) {
		PPS_amount = pPS_amount;
	}

	public String getTransaction_from_email() {
		return transaction_from_email;
	}

	public void setTransaction_from_email(String transaction_from_email) {
		this.transaction_from_email = transaction_from_email;
	}

	public String getTransaction_to_email() {
		return transaction_to_email;
	}

	public void setTransaction_to_email(String transaction_to_email) {
		this.transaction_to_email = transaction_to_email;
	}
	
	
	
	
	

}
