package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject{
	
	public  void IopenGex() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Soraya\\eclipse-workspace\\SerinityBDDFramwork\\src\\test\\resources\\drivers\\chromedriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://env11-pre.ivalua.app/buyer/oxylane/prepevol17/j86f4/page.aspx/fr/buy/homepage/cpt"); 
        //driver.get("https://env11-pre.ivalua.app/buyer/oxylane/prepevol17/j86f4/page.aspx/fr/buy/homepage/cpt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(600,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("XXXXXXX");
		driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("XXXXXXX**");
	    driver.findElement(By.id("cnxbton")).click();
	    driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	    // xpath du boutons: ("Menu Factures")
	   // driver.findElement(By.xpath("//span[@data-iv-role='label' and text()='Menu Factures']/ancestor::a")).click();
	    // xpath du boutons ("Menu Fournisseurs")
	    // driver.findElement(By.xpath("//span[@data-iv-role='label' and text()='Menu Fournisseurs']/ancestor::a")).click();
	    //webdriver driver=close
	}

}
