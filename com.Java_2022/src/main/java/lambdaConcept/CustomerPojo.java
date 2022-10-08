package lambdaConcept;

public class CustomerPojo {
	
	private int age;
	private String customerName;
	
	public CustomerPojo(int age,String customerName) {
		
		this.age=age;
		this.customerName=customerName;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
