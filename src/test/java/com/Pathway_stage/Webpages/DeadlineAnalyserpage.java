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
	private By selectdropdownforcancelation = By.xpath("/html[1]/body[1]/app-root[1]/app-deadline-analyser[1]/div[1]/div[1]/div[2]/div[1]/div[2]/section[1]/div[1]/div[1]/app-license-expiration-data-grid[1]/div[3]/div[1]/div[1]/div[2]/div[1]/select[1]");
	private By clickyesbutton = By.xpath("//button[contains(text(),'YES')]");
	private By gettingnewtxid =By.xpath(".//*[@class='slick-cell l1 r1 selected true active']");
	

	
	public void RisecancelationRequestwithMarketuser(String fromdate, String todate)
	
	{
		
		cleartext(entertodate);
		enterText(entertodate, todate);
		sleep();
		enter();
		enter();
		sleep();
		click(firstcheckbox);
		sleep();
		mouseoverelement(rxside);
		sleep();
		click(cancelationbuttton);
		sleep();
		getText(gettingnewtxid);
		select(selectdropdownforcancelation, " Link no longer needed ");
		sleep();
		explicitWaitClickable(clickyesbutton);
		
		
		
	}

	
	
}  

       