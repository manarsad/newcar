package caraccessoriesTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import caraccessories.Product;
import caraccessories.ProductFun;
import caraccessories.UserFun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deletecategioreTest {
	private Product product = new Product();
    private static ProductFun productfun = new ProductFun();

    private static List<Product> result;
	private int productid;
	 private boolean d;
	 
	 @Given("the admin is already logged in")
	 public void the_admin_is_already_logged_in() {
			System.out.println("..");
	 }
	 @When("delete a product with productcategiore {string}")
	 public void delete_a_product_with_productcategiore(String string) {
		    d= productfun.deletecategorie(string);

	 }
	 @Then("I will found the product with productcategiore as {string}")
	 public void i_will_found_the_product_with_productcategiore_as(String string) {
			assertTrue(ProductFun.getflag2()==true);
		 productfun.printProductList();
	     
	 }
	 
	 @When("I try to delete a product with productcategiore {string}")
	 public void i_try_to_delete_a_product_with_productcategiore(String string) {
		 d= productfun.deletecategorie(string);
	 }
	 @Then("I can't found the product with a productcategiore {string}")
	    public void i_can_t_found_the_product_with_a_productcategiore(String string) {
	        assertTrue(ProductFun.getflag2() == false);
	        assertFalse(d);

	        // Additional Test Case 1: Trying to delete a non-existing product category
	        String nonExistingCategory = "NonExistingCategory";
	        assertFalse(productfun.deletecategorie(nonExistingCategory));
	        assertFalse(ProductFun.getflag2());

	        // Additional Test Case 2: Deleting a product category with associated products
	        // (Ensure appropriate setup in the ProductFun for this scenario)
	        String categoryWithProducts = "CategoryWithProducts";
	        assertTrue(productfun.deletecategorie(categoryWithProducts));
	        assertTrue(ProductFun.getflag2());
	        productfun.printProductList(); // Print updated product list
	    }
	 
//	 @Then("I can't found the product with  a productcategiore {string}")
//	 public void i_can_t_found_the_product_with_a_productcategiore(String string) {
//			assertTrue(ProductFun.getflag2()==false);
//		 //assertFalse(productfun.getproductcategiore1(string)!=null);		
//		 assertFalse(d);
//	 }

}
