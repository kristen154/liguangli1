package com.hjy.ssh.beans;

public class User {

		private Integer userId;
	 	public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		private String username;  
	    private String password;  
	    private int gender;  
	  
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
	  
	    public int getGender() {  
	        return gender;  
	    }  
	  
	    public void setGender(int gender) {  
	        this.gender = gender;  
	    }  
}
