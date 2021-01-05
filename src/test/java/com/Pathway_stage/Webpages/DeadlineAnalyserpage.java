package com.Pathway_stage.Webpages;

import org.openqa.selenium.By;

import com.Pathway_stage.Base.Basepage;

public class DeadlineAnalyserpage extends Basepage
{
	private By licenseexperationtab = By.xpath("//a[@id='nav-approved-tab']");
	private By buildoutlinetab = By.xpath("//a[@id='nav-rejected-tab']");
	private By enterfromdate = By.xpath("(.//*[@class='mr-5 ng-untouched ng-pristine ng-valid'])[1]"); 
	private By entertodate = By.xpath("//input[@placeholder='To Expiration Date']");
	private By firstcheckbox = By.xpath("(.//*[@type='checkbox'])[2]");
	private By cancelationbuttton =By.xpath(".//*[@name='createCancellationRequestBtn:0']");
	private By Exportallbutton = By.xpath(".//*[@class='btn-grid mr-5']");
	private By rxside = By.xpath("(.//*[@class='ui-widget-content slick-row even active'])[1]");
	private By selectdropdownforcancelation = By.xpath("//select[@class='w-100 ng-untouched ng-pristine ng-valid']");
	private By clickyesbutton = By.xpath("//button[contains(text(),'YES')]");
	private By gettingnewtxid =By.xpath("(.//*[@class='slick-cell l0 r0 true'])[1]/following-sibling::div[@class='slick-cell l1 r1 true']");
	private By okbutton =By.xpath(".//*[@class='btn-grid approve']");
	
	
	

	
	public String RisecancelationRequestwithMarketuser(String fromdate, String todate)
	
	{
		
		cleartext(entertodate);
		enterText(entertodate, todate);
		sleep();
		enter();
		sleep();
		String txidtext =getText(gettingnewtxid);
		sleep();
		click(firstcheckbox);
		sleep();
		mouseoverelement(rxside);
		sleep();
		click(cancelationbuttton);
		sleep();
		select(selectdropdownforcancelation, " Link no longer needed ");
		sleep();
		explicitWaitClickable(clickyesbutton);
		explicitWaitClickable(okbutton);
		return txidtext;
		
		
		
	}

	
	
}  

       