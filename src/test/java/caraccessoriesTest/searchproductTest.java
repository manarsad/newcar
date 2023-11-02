package caraccessoriesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import caraccessories.Product;
import caraccessories.mydata;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class searchproductTest {
	
	private Product product = new Product();
	private static List<Product> productList = mydata.listproducts();
	private int productid;
	private boolean s;
	public Product result = new Product();

	
	@Given("there is a product with id {int}")
	public void there_is_a_product_with_id(Integer int1) {
		System.out.println("..");
	
	}
	@When("I search with {int}")
	public void i_search_with(Integer int1) {
		result = product.searchproduct(int1, productList);
 
	}
	@Then("{int} product should have been found with id {int}")
	public void product_should_have_been_found_with_id(Integer int1, Integer int2) {
		String res1= String.valueOf(result.getProductid());
		String res2= String.valueOf(int2);
		
	//	int i = int2;
		//int iac = result.getProductid();
		assertEquals( res1,res2);
	}
	

	}


