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
import java.util.logging.Level;



public class addproductTest {
	
	private Product product = new Product();
	private static List<Product> productList = mydata.listproducts();
	private int productid;
	private String productname;
	private String productdescription; 
	private String productcategorie;
	private String productprice;
	private String productimage; 
	private String productavailability ;	
	 private boolean l;

	
	@Given("the admin is already logged in")
	public void the_admin_is_already_logged_in() {
		System.out.println("..");

	}
	@When("add a product with productid {int} and  productname {string} and productdescription {string} and productcategorie {string} and productprice {string} and productimage {string} and productavailability {string}")
	public void add_a_product_with_productid_and_productname_and_productdescription_and_productcategorie_and_productprice_and_productimage_and_productavailability(Integer int1, String string, String string2, String string3, String string4, String string5, String string6) {
		l=product.ret(int1, productList);

	}

	@Then("I will found the product with productid {int}")
	public void i_will_found_the_product_with_productid(Integer int1) {
		
	    assertTrue(l);


	}
	
	@Given("the admin not logged in")
	public void the_admin_not_logged_in() {
		System.out.println("..");

	}
	
@When("I try to add a product with productid {int} and productname {string} and productdescription {string} and productcategorie {string} and productprice {string} and productimage {string} and productavailability {string}")
public void i_try_to_add_a_product_with_productid_and_productname_and_productdescription_and_productcategorie_and_productprice_and_productimage_and_productavailability(Integer int1, String string, String string2, String string3, String string4, String string5, String string6) {
	productList= product.addproduct(productid, string, string2, string3, string4, string5, string6, productList);
	l=product.ret(productid, productList);
}

@Then("I can't found the product with productid {int}")
public void i_can_t_found_the_product_with_productid(Integer int1) {
	assertTrue(l);

}




}
