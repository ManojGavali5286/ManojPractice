package TestClass;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMClasses.Pom_HomePage;



public class TC04_VerifyAllProductsAddToCart_Functionality extends TestBaseClass
{
   	
	@Test
	public void  verifyAllProductsAddToCartFunctionality() 
	{
		Pom_HomePage hp = new Pom_HomePage(driver);
		
		//allPrdtClick
//		hp.click();
//		System.out.println("Clicked on all Product");
//		
//		System.out.println("Apply the validation");
//		
//		String expectedProductSelection = "6";
//		String actualProductSelected = hp.getTextFromAddToCartBtn();  //1
//		
		//Assert.assertEquals(actualProductSelected, expectedProductSelection);
	}
	
	

}
