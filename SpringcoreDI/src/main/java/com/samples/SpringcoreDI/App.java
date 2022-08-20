package com.samples.SpringcoreDI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	//creating container
    	ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/SpringcoreDI/SpringConfig.xml");
//    	Employee emp = (Employee) springContainer.getBean("emp");
//    	System.out.println(emp);
//    	
//    	Hospital hospital = (Hospital) springContainer.getBean("hospital");
//    	System.out.println(hospital);
    	CarDealer dealer = (CarDealer) springContainer.getBean("cardealer");
    	System.out.println(dealer);
//    	Customer cus = (Customer) springContainer.getBean("customer");
//    	System.out.println(cus);
//    	 ShoppingCart shoppingCart=(ShoppingCart) springContainer.getBean("shoppingcart");
//    	 System.out.println(shoppingCart);
    	
    	
//    	AbstractApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/SpringCoreDI/SpringConfig.xml");
//    	Patient patient = (Patient) springContainer.getBean("patient");
//    	System.out.println(patient);
//    	springContainer.registerShutdownHook();
    }
}
