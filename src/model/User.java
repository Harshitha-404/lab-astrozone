package model;
public class User{
	private String name;
	//private String email;
	private String dob;
	private String gender;
	
	public User(String n,String g,String d) {
		this.name = n;
		//this.email = e;
		this.dob = d;
		this.gender = g;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//public String getEmail() {
	//	return email;
	//}
	//public void setEmail(String email) {
	//	this.email = email;
	//}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	}

	

	 