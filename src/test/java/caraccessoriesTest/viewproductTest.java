package caraccessoriesTest;

import static org.junit.Assert.assertTrue;

import caraccessories.ProductFun;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class viewproductTest {
	
    private static ProductFun productfun = new ProductFun();

	@When("the customer choose view product")
	public void the_customer_choose_view_product() {
        productfun.printProductList();
	}
	@Then("the product list is print in the screen")
	public void the_product_list_is_print_in_the_screen() {
		assertTrue(ProductFun.getflag7()==true);


	}
}
