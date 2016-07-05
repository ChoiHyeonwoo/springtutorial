package test;

import java.util.Date;

public class Member {

	private Long id;
	private String email;
	private String password;
	private String name;
	private Date registerDate;
	
	public Member(String _email, String _password, String _name, Date _registerDate){
		this.email = _email;
		this.password = _password;
		this.name = _name;
		this.registerDate = _registerDate;			
	}

	public String getEmail() {
		return email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	
	public void changePassword(String oldPassword, String newPassword){
		if(!password.equals(oldPassword))
			throw new IdPasswordNotMatchingException();
		this.password = newPassword;
	}
	
	
}
