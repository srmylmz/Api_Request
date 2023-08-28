package pojos;

import java.io.Serializable;
public class PetPojo implements Serializable {

	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phone;
	private int userStatus;

	public PetPojo() {
	}

	public PetPojo(String username, String firstName, String lastName, String email, String password, String phone, int userStatus) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.userStatus = userStatus;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setUserStatus(int userStatus){
		this.userStatus = userStatus;
	}

	public int getUserStatus(){
		return userStatus;
	}

	@Override
 	public String toString(){
		return 
			"PetPojo{" +
			",username = '" + username + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",email = '" + email + '\'' + 
			",password = '" + password + '\'' + 
			",phone = '" + phone + '\'' + 
			",userStatus = '" + userStatus + '\'' + 
			"}";
		}
}