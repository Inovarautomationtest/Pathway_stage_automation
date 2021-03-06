package com.Pathway_stage.Users;

import org.openqa.selenium.StaleElementReferenceException;

import com.Pathway_stage.Base.Basepage;
import com.Pathway_stage.Testdata.*;
import com.Pathway_stage.Webpages.Buildoutflowpages;
import com.Pathway_stage.Webpages.Cancelationflowpages;
import com.Pathway_stage.Webpages.Homepage;
import com.Pathway_stage.Webpages.Loginpage;
import com.Pathway_stage.Webpages.Renewalflowpages;
import com.Pathway_stage.Webpages.RequestViewPage;

public class NOCUser extends Basepage
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	Cancelationflowpages cancel = new Cancelationflowpages();
    GettingData data = new GettingData();
	Renewalflowpages renewalpage = new Renewalflowpages();
	Buildoutflowpages buildout = new Buildoutflowpages();
	RequestViewPage view = new RequestViewPage();
	public void loginwithNOCUser()
	{
		try {
			login.stagelogin(data.getUsername(3));
		} catch (Exception e) {
			
		}
		
	}
	public void nocuserpopuplogin()
	{
		try {
			login.popupemail(data.getUsername(3));
			sleep();
			//login.nocuserpassword();
			login.popuppassword(data.getPassword(3));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void CancelationrequestwithNOCuser(String statusoftheapplication, int i)
	{
		refreshthepage();
		sleep();
		homepage.cancelationbutton();
		view.requestforcancelationview(i);
		
		
		if (statusoftheapplication.equals("Approved"))
		{
			cancel.approvecancelationwithNOCuser();
		}
		else {
			cancel.rejectcancelationwithNOCuser();
		}
	}
	public void CancelationrequestwithNOCuserfordeadlineanlayser(String statusoftheapplication, String txiddata)
	{
		refreshthepage();
		sleep();
		homepage.cancelationbutton();
		view.requestforcancelationviewdeadlineanalsyer(txiddata);
		
		
		if (statusoftheapplication.equals("approved"))
		{
			cancel.approvecancelationwithNOCuser();
		}
		else {
			cancel.rejectcancelationwithNOCuser();
		}
	}
	public void renewalrequestwithNOCuser(String statusoftheapplication, int i)
	{
		try {
			refreshthepage();
			sleep();
			refreshthepage();
			sleep();
			homepage.renewalbutton();	
			view.renwealrequestview(i);
			if (statusoftheapplication.equals("Approved"))
			{
				renewalpage.renewlapprovewithNOCuser();
			}
			else {
				renewalpage.rejectrenewalwithNOCuser();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void buildourequestwithNOCuser(String statusoftheapplication, int i)
	{
		refreshthepage();
		sleep();
		homepage.Buildoutbutton();
		sleep();
		view.requestviewforpm(i);
		if (statusoftheapplication.equals("Approved"))
		{
			buildout.buildoutrequestapprovewithNOCuser();
		}
		else {
			buildout.buildoutrequestrejectwithNOCuser();
		}
}

}
