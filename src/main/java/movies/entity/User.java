package movies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Column(nullable = false)
	private String name;
	@Column(nullable = false,unique = true)
	private String number;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [name=" + name + ", number=" + number + ", email=" + email + ", password=" + password + "]";
	}

	public User(String name, String number, String email, String password) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
