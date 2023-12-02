package caraccessoriesTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import caraccessories.Product;
import caraccessories.ProductFun;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deletecategioreTest {
	private Product product = new Product();
    private static ProductFun productfun = new ProductFun();

    private static List<Product> result;
	private int productid;
	 private boolean d;
	 
	 @When("delete a product with productcategiore {string}")
	 public void delete_a_product_with_productcategiore(String string) {
		    d= productfun.deletecategorie(string);

	 }
	 @Then("I will found the product with productcategiore as {string}")
	 public void i_will_found_the_product_with_productcategiore_as(String string) {
			assertTrue(ProductFun.getflag2()==true);
		// assertFalse(productfun.getproductcategiore1(string)!=null);		
		 //assertTrue(d);
		 productfun.printProductList();
	     
	 }
	 
	 @When("I try to delete a product with productcategiore {string}")
	 public void i_try_to_delete_a_product_with_productcategiore(String string) {
		 d= productfun.deletecategorie(string);
	 }
	 @Then("I can't found the product with  a productcategiore {string}")
	 public void i_can_t_found_the_product_with_a_productcategiore(String string) {
			assertTrue(ProductFun.getflag2()==false);
		 //assertFalse(productfun.getproductcategiore1(string)!=null);		
		 assertFalse(d);
	 }

}
