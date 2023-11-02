package caraccessories;

import java.util.ArrayList;
import java.util.*;


//import project2021.Book;

public class mydata {
	 public static List<User> userList = new ArrayList<User>();
	 public static List<Product> productList = new ArrayList<Product>();
	 
	 
	 public  List<User> getUserList() {
		 return userList; 
	 }

	 public void setUserList (ArrayList<User> userList) {
		 mydata.userList= userList ;
	 }
	 
	 public  List<Product> getProductList() {
		 return productList; 
	 }
	 
	 public void setProductList (ArrayList<Product> productList) {
		 mydata.productList= productList ;
	 }
	 
	 public static List<User> listUsers(){
		 userList.add(new User ("manar","manar@gmail.com", "manar","ADMIN"));
		 userList.add(new User ("sama","sama@gmail.com", "sama","CUSTOMER"));
		 userList.add(new User ("ali","ali@gmail.com", "ali","INSTALLER"));
		return userList;
		 
	 }
	 
	 public static List<Product> listproducts(){
		 productList.add(new Product (1,"vehicle engine","strong vehicle engine", "interior","1000","C:\\Users\\lenovo\\Desktop\\manar\\4th year\\first\\software\\proj\\vehicle_engine.jpg","valied"));
		 productList.add(new Product (2,"vehicl door","strong vehice door", "exterior","100","C:\\Users\\lenovo\\Desktop\\javaoop_workspace\\caraccessories\\src\\test\\resources\\door.jpg","valied"));
		 productList.add(new Product (3, "car radio","strong car radio", "Electronics","150", "C:\\Users\\lenovo\\Desktop\\javaoop_workspace\\caraccessories\\src\\test\\resources\\radio.jpg","valied"));
		return productList;
		 
	 }
	 


}
