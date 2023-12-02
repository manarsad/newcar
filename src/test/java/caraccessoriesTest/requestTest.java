package caraccessoriesTest;

import static org.junit.Assert.assertTrue;

import java.util.List;

import caraccessories.Installationrequest;
import caraccessories.InstallationrequestFun;
import caraccessories.Product;
import caraccessories.ProductFun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class requestTest {
	
	private Installationrequest request = new Installationrequest();
    private static InstallationrequestFun requestfun = new InstallationrequestFun();
    private static List<Installationrequest> result;

	@Given("the customer is already logged in")
	public void the_customer_is_already_logged_in() {
		System.out.println("..");

	}
	@When("customer request installation with requestid {int}, and reqinstallername {string} , and  productid {int} , reqproductname {string} and  reqcostumername {string} and day {string} and month {string} and hour {int}")
	public void customer_request_installation_with_requestid_and_reqinstallername_and_productid_reqproductname_and_reqcostumername_and_day_and_month_and_hour(Integer int1, String string, Integer int2, String string2, String string3, String string4, String string5, Integer int3) {
		result=requestfun.request(int1, string, int2, string2, string3, string4, string5, int3);
	}
	@Then("the request installation it will be add")
	public void the_request_installation_it_will_be_add() {
		assertTrue(InstallationrequestFun.getflag1()==true);

		requestfun.printRequestList();

	}



}
