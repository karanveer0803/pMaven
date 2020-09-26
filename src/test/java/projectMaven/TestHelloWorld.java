package projectMaven;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;



@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestHelloWorld {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	@Test
	@Order(1)
	public void bhellow1(){
System.out.println("hello 1");	
	}
	
	@Test
	@Order(2)
	public void ahellow2(){
System.out.println("hello 2");	
	}
	
}
