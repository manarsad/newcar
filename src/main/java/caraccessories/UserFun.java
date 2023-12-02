package caraccessories;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.*;

public class UserFun {
	static Logger logger = Logger.getLogger(firstclass.class.getName());
	private static List<User> userList = new ArrayList<User>();
	private static boolean flag1 = false;
	private static boolean flag2 = false;
	private static boolean flag3 = false;
	private static boolean flag4 = false;
	private static boolean flag5 = false;
	private static boolean flag6 = false;
	public static boolean getflag1() {
		return flag1;
	}
	public static boolean getflag2() {
		return flag2;
	}
	public static boolean getflag3() {
		return flag3;
	}
	public static boolean getflag4() {
		return flag4;
	}
	public static boolean getflag5() {
		return flag5;
	}
	public static boolean getflag6() {
		return flag6;
	}
	

	
	static {
		User user1 = new User("manar","manar@gmail.com", "manar","ADMIN",12345,"jenin");
		User user2 = new User("sama","sama@gmail.com", "sama","CUSTOMER", 12345,"jenin");
		User user3 = new User("ali","ali@gmail.com", "ali","INSTALLER", 12345,"nablus");
		User user4 = new User("user4","user4@gmail.com", "user4","INSTALLER", 12345,"nablus");
		User user5 = new User("user5","user5@gmail.com", "user5","ADMIN", 12345,"nablus");
		User user6 = new User("user6","user6@gmail.com", "user6","CUSTOMER", 12345,"Nablus");
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);
		userList.add(user6);
		
	}
	
	public static void add(String username,String email,String password,String userlevel ,int userphone, String useraddress ) {

		User user = new User();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setUserlevel(userlevel);
		user.setUserphone(userphone);
		user.setUseraddress(useraddress);
		userList.add(user);
	}
	
	public boolean login(String email, String password) {
		for (User user : userList) {
	        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
		        logger.log(Level.INFO, "login success ! ");
		        flag4=true;
	            return true ;
	        }
	    }
		flag4=false;
		return false;
	}
	
	public int gotopage(String email, String password) {
		for (User user : userList) {
		    if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
//		        String userlevelupper = level.toUpperCase(); 

		        if ("ADMIN".equals(user.getUserlevel())) {
		            return 1;
		        } else if ("CUSTOMER".equals(user.getUserlevel())) {
		            return 2;
		        } else {
		            return 3;
		        }
		    }
		}
		return 0;
	}
 
	public static User getemail1(String email) {
		
		for (User user : userList) {
		
			if ( email.equals(user.getEmail())) {
			
			return user;

		}
	
		}
		return null;
	}
	
public String getusername1(String email) {
		
		for (User user : userList) {
		
			if ( email.equals(user.getEmail())) {
				String username1=user.getUsername();
			
			return username1;

		}
	
		}
		return null;
	}
	
	public List<User> signup(String username, String email, String password, String userlevel, int userphone, String useraddress) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                System.out.println("This user already exists.");
                flag5=false;
                return null; 
            }
        }

        String userlevelupper = userlevel.toUpperCase();
        userList.add(new User(username, email, password, userlevelupper , userphone, useraddress));
        flag5=true;
        return userList;
    }
	
	
	public void printUserList() {
        System.out.println("User List:");
        for (User user : userList) {
            System.out.println(user);
        }
    }
	
	public boolean deleteuser (String useremail){
		for (User user : userList) {
            if ( useremail.equals(user.getEmail()) ) {
            	//flag1=true;
            	userList.remove (user);
            	flag1=true;
                return true; 
            }
        }
        System.out.println("This User already not exist.");
        flag1=false;
		return false;
		
	}
	
	
	public List<User> updateUser(String username, String email1, String password, String userlevel, int userphone, String useraddress , String oldemail) {
		for (User user : userList) {
	        String userlevelupper = userlevel.toUpperCase();
			if (oldemail.equals(user.getEmail())) {
		        user.setUsername(username);
				user.setEmail(email1);
				user.setPassword(password);
				user.setUserlevel(userlevelupper);
				user.setUserphone(userphone);
				user.setUseraddress(useraddress);
				flag3=true;
				return userList;
			}
		}
		return null;
		}
	
	
	
	public static void logout () {
	    logger.log(Level.INFO, "Log out sucess!");
	    flag2=true;

    }
	



}
