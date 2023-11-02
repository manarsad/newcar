package caraccessories;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

public class User {
	
	static Logger logger = Logger.getLogger(firstclass.class.getName());

	
	private String username;	 
	private String email;
	private String password;
	private String userlevel; 
	private String userlevelupper;
	
	 private boolean userlogged;
	 private boolean l;
	 public User () {
		 
	 }
	
    public User(String username, String email,String password,String userlevel) {
    	   this.username = username;
           this.email = email;
           this.password = password;
           this.userlevel = userlevel ; 
			this.userlogged = false;

           
    }
    public boolean login(String email, String password, List<User> userlist) {
        for (User user : userlist) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
    	        logger.log(Level.INFO, "login success ! ");
                return true ;
            }
        }
        return false;
    }
    
    
    public int gotopage(String email, String password, List<User> userlist) {
        for (User user : userlist) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                String userlevelupper = user.getUserlevel().toUpperCase(); 

                if ("ADMIN".equals(userlevelupper)) {
                    return 1;
                } else if ("CUSTOMER".equals(userlevelupper)) {
                    return 2;
                } else {
                    return 3;
                }
            }
        }
        return 0;
    }
    
	public List<User>signup(String username, String email,String password, String userlevel , List<User> userlist)
	{
		String userlevelupper = userlevel.toUpperCase();
    	userlist.add(new User(username,email ,password , userlevelupper));
		return userlist;

		}
	
    public boolean retsign(String email, List<User> userlist) {
        for (User user : userlist) {
            if ( user.getEmail().equals(email))
            {
                return true ;
            }
        }
        return false;
    }
    
    
    public static void printuserlist( List<User> userlist) {
    	 for (User user : userlist) {
	    	    logger.log(Level.INFO, "User name :"+ user.getUsername()+"\n");
	    	    logger.log(Level.INFO, "User email :"+ user.getEmail()+"\n");
	    	    logger.log(Level.INFO, "User password :"+ user.getPassword()+"\n");
	    	    logger.log(Level.INFO, "User level :"+ user.getUserlevel()+"\n");
         }
    	
    }
    
    public static void logout () {
	    logger.log(Level.INFO, "Log out sucess!");

    }

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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

	public String getUserlevel() {
		return userlevel;
	}
	public void setUserlevel(String userlevel) {
		this.userlevel = userlevel;
	}

	 

}
