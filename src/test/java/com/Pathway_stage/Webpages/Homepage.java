package com.Pathway_stage.Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.Pathway_stage.Base.Basepage;

public class Homepage extends Basepage
{
	 private By cancelationbutton = By.xpath("//div[contains(text(),'Cancellations')]");
	 private By Renewalbutton = By.xpath("//div[contains(text(),'Renewal')]");
	 private By Buildooutbuuton = By.xpath("//div[contains(text(),'Buildout')]");
	public By accountlbl = By.className("dashboard-list-cards-header");
		private By dashboardbutton = By.xpath("(.//*[@class='menu-items'])[1]");
		private By lookupbutton =By.xpath("(//div[@class='menu-items'])[6]");
		
		private By Deadlineanalsyerbutton = By.xpath("(.//*[@class='menu-items'])[7]");
		
		
	 public void cancelationbutton()
	 {
		 refreshthepage();
		 sleep();
		explicitWaitClickable(cancelationbutton);
		 sleep();
	 }
	 public void dashboardbutton()
	 {
         explicitWaitClickable(dashboardbutton);
             sleep();
	 }public void renewalbutton()
	 {
		 refreshthepage();
		 sleep();
		 explicitWaitClickable(Renewalbutton);
		 sleep(); 
	 }
	 public void Buildoutbutton()
	 {
		 try {
			 refreshthepage();
	         sleep();
			explicitWaitClickable(Buildooutbuuton);
			sleep();
			 
			
		} catch (StaleElementReferenceException e) {
			
		}
		 
	 }
	 
	 public void clickDeadlineanalyserbutton()
	 {
		 
		 try {
			
			 refreshthepage();
			 sleep();
		
			 scrollDown();
			/* clicklookuptab();*/
			 sleep();
			 explicitWaitClickable(Deadlineanalsyerbutton);
			 sleep();
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
	 }
	 public void clicklookuptab()
	 {
		 explicitWaitClickable(lookupbutton);
		 sleep();
	 }
	 public void checkloginfunctionlaity()
	 {
		 String stepname ="Login functionality";
		 validatingpage(accountlbl, stepname);
	 }
}
