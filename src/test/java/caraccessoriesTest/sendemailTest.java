package caraccessoriesTest;

import static org.junit.Assert.assertTrue;

import caraccessories.ProductFun;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sendemailTest {
	@When("order is complete with produtname {string} and price {int}")
	public void order_is_complete_with_produtname_and_price(String string, Integer int1) {
		ProductFun.sendOrderConfirmationEmail(string, int1);
	}
	@Then("Send email")
	public void send_email() {
		assertTrue(ProductFun.getisSented()==true);


	}

	
//	@When("order is complete")
//	public void order_is_complete() {
//		ProductFun.sendOrderConfirmationEmail(null, 0);
//		
//		
//	}
//	@Then("Send email")
//	public void send_email() {
//		assertTrue(ProductFun.getisSented()==true);
//
//		
//	}
//	
//	@When("order is not complete")
//	public void order_is_not_complete() {
//
//	}
//	@Then("print your product is not incomplete yet")
//	public void print_your_product_is_not_incomplete_yet() {
//		assertTrue(ProductFun.getisSented()==false);
//
//
//	}


}
