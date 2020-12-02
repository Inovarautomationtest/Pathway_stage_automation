package com.Pathway_stage.Webpages;

import org.openqa.selenium.By;

import com.Pathway_stage.Base.Basepage;

public class Renewalflowpages extends Basepage
{

	private By createnewRenewalbutton = By.xpath(".//*[@class='btn-grid approve create-cancel ml-0 mr-0 button-margin ng-star-inserted']");
	private By entertxidfiledforrenewal = By.xpath("//input[@placeholder='Enter TX Site ID']");
	private By enterrxidfieldforrenewal = By.xpath("//input[@placeholder='Enter RX Site ID']");
	private By searchbutton = By.cssSelector("#search-button");
	private By Marketuserchecklistbox = By.xpath("//div[@class='slick-cell l0 r0 true']//label");
	private By reasonlbl = By.className("reject-text");
	private By reasonforrenewal = By.xpath("//select[@class='ng-untouched ng-pristine ng-valid']");
	private By proceedbutton = By.xpath("//button[contains(text(),'PROCEED')]");
	private By renewalconfirmationbutton = By.xpath("(.//*[text()='YES'])[1]");
	private By okbuttonforrenewal = By.xpath("(.//*[text()='OK'])[1]");
	private By MDUchecklistboxforrenewal = By.xpath("//input[@type='checkbox']");
	private By approverenewalbutton = By.xpath("//button[@class='btn-grid approve ng-star-inserted']");
	private By rejectrenewalbutton = By.xpath("(.//*[@class='btn-grid reject ng-star-inserted'])[1]");
	private By rejectreasonforrenewal = By.xpath(".//*[@class='w-100 ng-pristine ng-valid ng-touched']");
	private By rejectconfirmationbutton = By.xpath("(.//*[text()='YES'])[2]");
	private By mochekclistforrenewal = By.xpath("//input[@type='checkbox']");
	private By RPMchecklistforrenewal = By.xpath("//input[@type='checkbox']");
	private By NOCchecklistforrenewal = By.xpath("//input[@type='checkbox']");
	private By Legaluserchecklistforrenewal =By.xpath("//input[@type='checkbox']");
	private By sendtofccforrenewalbutton = By.xpath("//button[@class='btn-grid approve width-170 ng-star-inserted']");
	private By legaluserconfirmationbutton = By.xpath("(.//*[text()='YES'])[1]");
	private By legaluserrejeectbutton = By.xpath("//button[@class='btn-grid reject ng-star-inserted']");
	private By sendtounderreeviewbutton = By.xpath("//button[@class='btn-grid approve width-170 ng-star-inserted']");
	private By underreviewtab = By.xpath("//a[normalize-space()='UNDER REVIEW (4)']");
	private By rejectbuttonfromunderreview  = By.xpath("//button[normalize-space()='REJECT']");
	
	public void renewalrequestwithmarketuser(String txid, String rxid)
	{
		explicitWaitClickable(createnewRenewalbutton);
		sleep();
		enterText(entertxidfiledforrenewal,txid );
		sleep();
		enterText(enterrxidfieldforrenewal, rxid);
		sleep();
		click(searchbutton);
		sleep();
		explicitWaitClickable(Marketuserchecklistbox);
		sleep();
		scrollintoelement(reasonlbl);
		sleep();
		select(reasonforrenewal, " Test Child Renewal Reason ");
		sleep();
		scrollintoelement(proceedbutton);
		sleep();
		click(proceedbutton);
		sleep();
		click(renewalconfirmationbutton);
		sleep();
		explicitWaitClickable(okbuttonforrenewal);
		sleep();
		
	}
	
	public void createnewrenewalrequestwithRPMuser(String txid, String rxid)
	{
		explicitWaitClickable(createnewRenewalbutton);
		sleep();
		enterText(entertxidfiledforrenewal,txid );
		sleep();
		enterText(enterrxidfieldforrenewal, rxid);
		sleep();
		click(searchbutton);
		sleep();
		explicitWaitClickable(Marketuserchecklistbox);
		sleep();
		scrollintoelement(reasonlbl);
		sleep();
		select(reasonforrenewal, " Other/Custom Comment ");
		sleep();
		scrollintoelement(proceedbutton);
		sleep();
		click(proceedbutton);
		sleep();
		click(renewalconfirmationbutton);
		sleep();
		explicitWaitClickable(okbuttonforrenewal);
		sleep();

	}public void renewlapprovewithMDuser()
	{
		elementclickbyjs(MDUchecklistboxforrenewal);
		click(approverenewalbutton);
		sleep();
		click(renewalconfirmationbutton);
		sleep();
	}
	
	public void rejectrenewalwithMDuser()
	{	
		elementclickbyjs(MDUchecklistboxforrenewal);
      click(rejectrenewalbutton);
      sleep();
      select(rejectreasonforrenewal, "Test Child Renewal Reason");
      sleep();
      click(rejectconfirmationbutton);
      sleep();
}
	public void renewlapprovewithMOuser()
	{
		elementclickbyjs(mochekclistforrenewal);
		click(approverenewalbutton);
		sleep();
		click(renewalconfirmationbutton);
		sleep();
	}
	
	public void rejectrenewalwithMOuser()
	{	
		elementclickbyjs(mochekclistforrenewal);
      click(rejectrenewalbutton);
      sleep();
      select(rejectreasonforrenewal, "Test Child Renewal Reason");
      sleep();
      click(rejectconfirmationbutton);
      sleep();
}
	public void renewlapprovewithRPMuser()
	{
		elementclickbyjs(RPMchecklistforrenewal);
		click(approverenewalbutton);
		sleep();
		click(renewalconfirmationbutton);
		sleep();
	}
	
	public void rejectrenewalwithRPMuser()
	{	
		elementclickbyjs(RPMchecklistforrenewal);
      click(rejectrenewalbutton);
      sleep();
      select(rejectreasonforrenewal, "link no longer needed");
      sleep();
      click(rejectconfirmationbutton);
      sleep();
}
	public void renewlapprovewithNOCuser()
	{
		elementclickbyjs(NOCchecklistforrenewal);
		explicitWaitClickable(approverenewalbutton);
		sleep();
		click(renewalconfirmationbutton);
		sleep();
	}
	
	public void rejectrenewalwithNOCuser()
	{	
		elementclickbyjs(NOCchecklistforrenewal);
      click(rejectrenewalbutton);
      sleep();
     /* select(rejectreasonforrenewal, " Test Child Renewal Reason ");
      sleep();*/
      click(rejectconfirmationbutton);
      sleep();
}
	public void sendtounderrenewalforrenewalconnection()
	{
		elementclickbyjs(Legaluserchecklistforrenewal);
		click(sendtounderreeviewbutton);
		sleep();
		click(legaluserconfirmationbutton);
		sleep();
	}
	public void Clickunderreviewtab()
	{
		elementclickbyjs(underreviewtab);
		sleep();
	}
	public void sendtofccfromundereviewpage()
	{
		elementclickbyjs(Legaluserchecklistforrenewal);
		sleep();
		elementclickbyjs(sendtofccforrenewalbutton);
		sleep();
		elementclickbyjs(legaluserconfirmationbutton);
		sleep();
	}
	public void rejectionfromunderreview()
	{
		elementclickbyjs(Legaluserchecklistforrenewal);
		sleep();
		elementclickbyjs(rejectbuttonfromunderreview);
		sleep();
		elementclickbyjs(legaluserconfirmationbutton);
		sleep();
	}
	public void rejectwithLegaluser()
	{
		elementclickbyjs(Legaluserchecklistforrenewal);
		elementclickbyjs(legaluserrejeectbutton);
		elementclickbyjs(rejectconfirmationbutton);
	}

	
	
}





