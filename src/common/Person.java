package common;

public class Person {
	
	private String name;
	private String address;
	private String nId;
	private boolean male;
	
	public Person() {
		super();
	}
	
	public Person(String name, String address, String nId, boolean male) {
		super();
		this.name = name;
		this.address = address;
		this.nId = nId;
		this.male = male;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getnId() {
		return nId;
	}
	public void setnId(String nId) {
		this.nId = nId;
	}
	public boolean isMale() {
		return male;
	}
	public void setMale(boolean male) {
		this.male = male;
	}
}
