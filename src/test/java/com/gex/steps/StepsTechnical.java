package com.gex.steps;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageObject.Homepage;
import com.PageObject.LoginPage;

public class StepsTechnical {

	Homepage homepage;
	LoginPage loginPage;
		
		//@Managed(driver="chrome")
		
		// private WebDriver driver;
		
		//public GexStepsTechnical(WebDriver driver) {
			 //this.driver=driver;
	WebDriver driver=new ChromeDriver();
		
	 	
	 	public void IopenGex() {
			loginPage.IopenGex();
		}
				
				

	 	@Test
		public void i_click_on_My_invoices() {
			homepage.i_click_on_My_invoices();
			
		}
	 	@Test
	 		public void i_select_the_first_invoice() {
	 		homepage.i_select_the_first_invoice();
			
		}

	 	@Test
		public void i_am_redirected_to_the_contents_of_the_invoice() {
	 		homepage.i_am_redirected_to_the_contents_of_the_invoice();
			
		}


		
			
		}
	//@After
	//public void After() {


		//driver.quit();
		
	//}

	//}
		

	
	

