package caraccessoriesTest;

import static org.junit.Assert.assertTrue;
import org.junit.Assert;

import caraccessories.User;
import caraccessories.firstclass;
import caraccessories.mydata;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class userLoginTest {
     private User user = new User();
	 private static List<User> userList = mydata.listUsers(); 
	 private String email;
	 private String password;
	 private boolean b;
	 
		static Logger logger = Logger.getLogger(firstclass.class.getName());

	@Given("there is already email {string} and password {string}")
	public void there_is_already_email_and_password(String string, String string2) {
		email = string;
		password = string2;
		
	}
	@When("the user try to login with email {string} and password {string}")
	public void the_user_try_to_login_with_email_and_password(String string, String string2) {
	     b = user.login(string ,string2,userList);
	}
	
	@Then("the user will login")
	public void the_user_will_login() {
		Assert.assertTrue(b);
	}
	@Then("the user will not login")
	public void the_user_will_not_login() {
		Assert.assertFalse(b);
        logger.log(Level.INFO, "try again please\\n");


	}

}
