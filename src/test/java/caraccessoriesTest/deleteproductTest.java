
package caraccessoriesTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;

import caraccessories.Product;
import caraccessories.User;
import caraccessories.mydata;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.*;

public class deleteproductTest {
	
	private Product product = new Product();
	private static List<Product> productList = mydata.listproducts();
	private int productid;
	 private boolean l;
	
	@When("delete a product with productid {int}")
	public void delete_a_product_with_productid(Integer int1) {
		l=product.deleteproduct(int1, productList);

	}
	@Then("I will found the product with productid as {int}")
	public void i_will_found_the_product_with_productid_as(Integer int1) {
	    assertTrue(l);

	}
	
	@When("I try to delte a product with productid {int}")
	public void i_try_to_delte_a_product_with_productid(Integer int1) {
		l=product.deleteproduct(int1, productList);

	}
	@Then("I can't found the product with productid")
	public void i_can_t_found_the_product_with_productid() {
		assertFalse(l);

	}


}
