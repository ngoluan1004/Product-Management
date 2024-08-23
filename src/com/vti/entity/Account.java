package com.vti.entity;
import java.time.LocalDate;
/**
 * @author Admin
 *
 */
public class Account {
	private int id;
	private String email, username, fullName, avatarImageName, mobile, address;
	private LocalDate createDate;
	private String password;
	private boolean status;
	private Product product;
	
	public Account() {

	}

	public Account(int id, String email, String username, String fullName, String avatarImageName, String mobile,
			String address, LocalDate createDate, String password, boolean status) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullName = fullName;
		this.avatarImageName = avatarImageName;
		this.mobile = mobile;
		this.address = address;
		this.createDate = createDate;
		this.password = password;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAvatarImageName() {
		return avatarImageName;
	}

	public void setAvatarImageName(String avatarImageName) {
		this.avatarImageName = avatarImageName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", fullName=" + fullName
				+ ", avatarImageName=" + avatarImageName + ", mobile=" + mobile + ", address=" + address
				+ ", createDate=" + createDate + ", password=" + password + ", status=" + status + "]";
	}
	
	
}
