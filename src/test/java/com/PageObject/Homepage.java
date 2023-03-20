package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class Homepage extends PageObject{

	
	

	 WebDriver driver;
	 
    public Homepage(WebDriver driver) {
		    this.driver=driver;
} 
	@Step
	public  void i_click_on_My_invoices() {
		
		 getDriver().manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		 getDriver().findElement(By.xpath(("//span[@data-iv-role='label' and text()='Menu Factures']/ancestor::a"))).click();	
		
		
		
		
		// xpath du bouton ("Menu Fournisseurs")
		//driver.findElement(By.xpath("//span[@data-iv-role='label' and text()='Menu Fournisseurs']/ancestor::a")).click();
		
		
		}
	
	
	
	
	
	
	@Step
	public  void i_select_the_first_invoice() {
		
		getDriver().findElement(By.cssSelector(getTitle()));
		
	}
	@Step
	public  void i_am_redirected_to_the_contents_of_the_invoice() {
		// TODO Auto-generated method stub
		
	}

}
	



	
		
	


