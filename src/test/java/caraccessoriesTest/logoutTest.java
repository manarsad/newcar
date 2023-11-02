package caraccessoriesTest;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Assert;

import caraccessories.User;
import caraccessories.firstclass;
import caraccessories.mydata;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logoutTest {
	static Logger logger = Logger.getLogger(firstclass.class.getName());

    private User user = new User();
	 private static List<User> userList = mydata.listUsers(); 
	 private String email;
	 private String password;

@When("the user try to logout")
public void the_user_try_to_logout() {
	user.logout();

}
@Then("the user will logout")
public void the_user_will_logout() {
    logger.log(Level.INFO, "logout success! ");



}


}
