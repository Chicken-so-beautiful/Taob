package demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {
//	指定数据表id
	private Integer id;
		
	private String username;

//	json忽视传送 
	@JsonIgnore	
	private String password;
	private String phone;
	private String email;
	private String address;
	private String create_time;
	
//	指定数据表名称    用于名称不同时
	private String photourl;
	
	public String getPhotoUrl() {
		return photourl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photourl = photoUrl;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

}
