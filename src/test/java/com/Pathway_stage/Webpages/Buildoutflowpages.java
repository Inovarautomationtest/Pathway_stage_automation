package com.Pathway_stage.Webpages;

import org.openqa.selenium.By;

import com.Pathway_stage.Base.Basepage;

public class Buildoutflowpages extends Basepage
{
	private By createnewbutton = By.xpath(".//*[@id='dropdownMenuButton']");
	private By buildoutdropdownbutton = By.xpath("//a[contains(text(),'Buildout Complete')]");
	private By createnewbuildoutbutton = By.xpath(".//*[text()=' + CREATE NEW ']");
	private By txidfiledbox = By.xpath("//input[@placeholder='Enter TX Site ID']");
	private By rxfieldboxforbuildout = By.xpath("//input[@placeholder='Enter RX Site ID']");
	private By searchidbutton = By.cssSelector("#search-button");
	private By marketuserchicklestbox = By.xpath("(.//*[@class='slick-cell l0 r0 true'])[1]");
	private By rpmuserchecklistbox =By.xpath("(.//*[@class='slick-cell l0 r0 true'])[1]");
	private By dateofcompletedlabel = By.xpath("//h2[contains(text(),'Date Completed')]");
	private By selectdatefieldbox = By.xpath("//input[@placeholder='Date To Complete']");
	private By proceedbuttonforbuildout = By.xpath("//button[contains(text(),'PROCEED')]");
	private By proceedbuttonforRPM = By.xpath("//button[@class='btn-grid approve create-cancel float-right mb-5 ng-star-inserted']");
	private By buildoutconfirmationbutton = By.xpath("(.//*[text()='YES'])[1]");
	private By okbutton = By.xpath("(.//*[text()='OK'])[1]");
	private By rpmchecklistbox = By.xpath("//input[@type='checkbox']");
	private By approvebuildoutbutton = By.xpath(".//*[@data-target='#approve']");
	private By rejectforbuildoutbutton = By.xpath("(.//*[@class='btn-grid reject ng-star-inserted'])[1]");
	private By selectrejectreasonforbuildout =By.xpath(".//*[@class='w-100 ng-valid ng-dirty ng-touched']");
	private By rejectconfirmationbutton =By.xpath("(.//*[text()='YES'])[2]");
	private By noccheclistboxforbuildout = By.xpath("//input[@type='checkbox']");
	private By legalsuerchecklistbox = By.xpath("//input[@type='checkbox']");
	private By sendtofccbuildoutbutton =By.xpath(".//*[@class='btn-grid approve width-170 ng-star-inserted']");
	private By SendoutFCCconfirmatiobuttonforbuildout =By.xpath("(.//*[text()='YES'])[1]");
	private By yesbuttonforrpm =By.xpath("(.//*[@class='btn-grid approve'])[2]");
	private By legaluserrejectbutton = By.xpath("//button[@class='btn-grid reject ng-star-inserted']");
	private By sendtounderreviewbutton =By.xpath("//button[@class='btn-grid approve width-170 ng-star-inserted']");
	private By underreviewtabbutton = By.xpath("//a[normalize-space()='UNDER REVIEW (6)']");
	private By rejectfromunderreview =By.xpath("//button[normalize-space()='REJECT']");
	public void createnewbuildoutrequestwithMarketuser(String txid, String rxid, String date)
	{
		explicitWaitClickable(createnewbuildoutbutton);
		sleep();
		enterText(txidfiledbox, txid);
		sleep();
		enterText(rxfieldboxforbuildout, rxid);
		sleep();
		click(searchidbutton);
		sleep();
		explicitWaitClickable(marketuserchicklestbox);
		scrollintoelement(dateofcompletedlabel);
		sleep();
//		cleartext(selectdatefieldbox);
//		sleep();
//		enterText(selectdatefieldbox, date);
//		sleep();
		/*elementscrollintoviewwithjs(proceedbuttonforbuildout);
		//scrollintoelement(proceedbuttonforbuildout);
		sleep();
		//click(proceedbuttonforbuildout);
		 */
		
		explicitWaitClickable(proceedbuttonforbuildout);
		sleep();
		click(buildoutconfirmationbutton);
		sleep();
		explicitWaitClickable(okbutton);
		refreshthepage();
		
		
		
		}
	public void createnewbuildoutrequestwithRPMuser(String txid, String rxid, String date)
	{
		refreshthepage();
		sleep();
		explicitWaitClickable(createnewbutton);
		explicitWaitClickable(buildoutdropdownbutton);
		sleep();
		enterText(txidfiledbox, txid);
		sleep();
		enterText(rxfieldboxforbuildout, rxid);
		sleep();
		click(searchidbutton);
		sleep();
		explicitWaitClickable(rpmuserchecklistbox);
		/*scrollintoelement(dateofcompletedlabel);
		sleep();*/
		/*cleartext(selectdatefieldbox);
		sleep();
		enterText(selectdatefieldbox, date);
		sleep();*/
		elementclickbywait(proceedbuttonforRPM);
		explicitWaitClickable(yesbuttonforrpm);
		explicitWaitClickable(okbutton);
		refreshthepage();
	}
	
	public void buildoutrequestapprovewithRPMuser()
	{
		elementclickbyjs(rpmchecklistbox);
		click(approvebuildoutbutton);
		sleep();
		click(buildoutconfirmationbutton);
		sleep();
	}
	public void buildoutrequestrejectwithRPMuser()
	{
		elementclickbyjs(rpmchecklistbox);
		click(rejectforbuildoutbutton);
		sleep();
		/*select(selectrejectreasonforbuildout, "Test Buildout Reason");
		sleep();*/
		click(rejectconfirmationbutton);
		sleep();
	}
	
	public void buildoutrequestapprovewithNOCuser()
	{
		
		elementclickbyjs(noccheclistboxforbuildout);
		click(approvebuildoutbutton);
		sleep();
		click(buildoutconfirmationbutton);
		sleep();
	}
	public void buildoutrequestrejectwithNOCuser()
	{
		elementclickbyjs(noccheclistboxforbuildout);
		click(rejectforbuildoutbutton);
		sleep();
		/*select(selectrejectreasonforbuildout, "Test Buildout Reason");
		sleep();*/
		explicitWaitClickable(rejectconfirmationbutton);
		sleep();
	}
	public void sendtoundereviewbuildoutrequest()
	{
		elementclickbyjs(legalsuerchecklistbox);
		click(sendtounderreviewbutton);
		sleep();
		click(SendoutFCCconfirmatiobuttonforbuildout);
		sleep();
	}
	public void clickunderreviewtab()
	{
		elementclickbyjs(underreviewtabbutton);
		sleep();
		
	}
	public void sendtoFCCfromundereview()
	{
		elementclickbyjs(legalsuerchecklistbox);
		sleep();
		elementclickbyjs(sendtofccbuildoutbutton);
		click(SendoutFCCconfirmatiobuttonforbuildout);
		sleep();
	}
	public void Rejectfromunderreviewpage()
	{
		elementclickbyjs(legalsuerchecklistbox);
		sleep();
		elementclickbyjs(rejectfromunderreview);
		sleep();
		click(rejectconfirmationbutton);
		sleep();
	}
	public void rejectwithlegaluser()
	{
		elementclickbyjs(legalsuerchecklistbox);
		elementclickbyjs(legaluserrejectbutton);
		sleep();
		elementclickbyjs(rejectconfirmationbutton);
	}
}
