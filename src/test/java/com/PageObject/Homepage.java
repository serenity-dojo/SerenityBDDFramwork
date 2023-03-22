package com.PageObject;

import java.time.Duration;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

// TODO: Add the correct URL
//@DefaultUrl("https://your.site.url.com/")
@DefaultUrl("https://www.carwale.com/")
public class Homepage extends PageObject {

    private static final By MENU_FACTURES = By.xpath("//span[@data-iv-role='label' and text()='Menu Factures']/ancestor::a");

    public void selectFirstInvoice() {
        withTimeoutOf(Duration.ofSeconds(120)).waitFor(MENU_FACTURES).click();
    }

    public void i_select_the_first_invoice() {
        // TODO: Locate and click on the first invoice

    }

    public void navigateToMyInvoices() {
        // TODO: Locate and click on the "My invoices" menu entry or tab
    }
}
	



	
		
	


