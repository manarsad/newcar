package caraccessoriesTest;

import static org.junit.Assert.assertTrue;
import org.junit.Assert;

import caraccessories.User;
import caraccessories.mydata;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.*;



public class userSignupTest {
	
    private User user = new User();
	 private static List<User> userList = mydata.listUsers(); 
	 private String email;
	 private String password;
	 private String username;
	 private String userlevel;
	 private boolean l;
	 
	@Given("the usear is already logged in")
	public void the_usear_is_already_logged_in() {
		   System.out.println("..");
	}
	@When("add a user with username {string} and email {string} and password {string} and userlevel {string}")
	public void add_a_user_with_username_and_email_and_password_and_userlevel(String string, String string2, String string3, String string4) {
		l=user.retsign(string2, userList);
	}
	@Then("I will found the user with email {string}")
	public void i_will_found_the_user_with_email(String string) {
	    assertTrue(l);
	}
	
	@Given("the usear not logged in")
	public void the_usear_not_logged_in() {
		System.out.println("..");
	}
	@When("I try to add a user with username {string} and email {string} and password {string} and userlevel {string}")
	public void i_try_to_add_a_user_with_username_and_email_and_password_and_userlevel(String string, String string2, String string3, String string4) {
		
		userList=user.signup(string, string2, string3, string4, userList);
		l=user.retsign(string2, userList);

	}
	@Then("I can't found the user with email {string}")
	public void i_can_t_found_the_user_with_email(String string) {
		assertTrue(l);
		
	}


}
