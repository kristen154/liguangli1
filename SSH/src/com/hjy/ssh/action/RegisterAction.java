 package com.hjy.ssh.action;

import com.opensymphony.xwork2.ActionSupport;  
  
import com.hjy.ssh.forms.UserForm;
import com.hjy.ssh.service.UserManager;  
import com.hjy.ssh.serviceImpl.UserManagerImpl;  
	  
	public class RegisterAction extends ActionSupport {  
	  
	    private static final long serialVersionUID = 1L;  
	  
	    private UserForm user;  
	  
	    private UserManager userManager;  
	  
	    public UserForm getUser() {  
	        return user;  
	    }  
	  
	    public void setUser(UserForm user) {  
	        this.user = user;  
	    }  
	  
	    public UserManager getUserManager() {  
	        return userManager;  
	    }  
	  
	    public void setUserManager(UserManager userManager) {  
	        this.userManager = userManager;  
	    }  
	  
	    public String execute() {  
	        try {  
	            /*this.setUserManager(new UserManagerImpl());  */
	            userManager.regUser(user);  
	            return "success";  
	  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	            return "error";  
	        }  
	    }

		
	  
	
}
