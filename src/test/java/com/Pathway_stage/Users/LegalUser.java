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

public class LegalUser extends Basepage
{
	Loginpage login = new Loginpage();
	Homepage homepage = new Homepage();
	Cancelationflowpages cancel = new Cancelationflowpages();
	GettingData data = new GettingData(); 
	Renewalflowpages  renewalpage = new Renewalflowpages();
	Buildoutflowpages buildout = new Buildoutflowpages();
	RequestViewPage view = new RequestViewPage();
	
	public void loginwithLeaglUser()
	{
        login.stagelogin(data.getUsername(4));
	}
	public void legaluserloginwithpopup()
	{
		try {
			login.popupemail(data.getUsername(4));
			login.popuppassword(data.getPassword(4));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public void CancelationrequestwithLeagluser( int i)
	{
		refreshthepage();
		sleep();
		homepage.cancelationbutton();
		view.requestforcancelationview(i);
		cancel.sendtoFCCwithLegaluser();
	}
	
	public void renewalrequestsendtoFCCwithLegalsuer(int i)
	{
		try {
			refreshthepage();
			sleep();
			homepage.renewalbutton();
			view.renwealrequestview(i);
			renewalpage.sendtoFCCforrenewalconnection();
		} catch (StaleElementReferenceException e) {
			
		}
		
	}
	public void sendtoFCCbuildrequestwithLegalsuer(int i)
	{
		refreshthepage();
		sleep();
		homepage.Buildoutbutton();
		sleep();
		view.requestviewforlegal(i);
		buildout.sendtoFCCbuildoutrequest();
		
	}
	public void rejectacancelationpplicationwithLegalsuer(int i)
	{
		refreshthepage();
		sleep();
		homepage.cancelationbutton();
		sleep();
		view.requestforcancelationview(i);
		cancel.rejectwithlegalsuer();
	}
	
	public void rejectrenewalapplicationwithLegalsuer(int i) {
		refreshthepage();
		sleep();
		homepage.renewalbutton();
		sleep();
		view.renwealrequestview(i);
		renewalpage.rejectwithLegaluser();
	}
	
	public void rejectbuildoutapplicationwithlegaluser(int i)
	{
		refreshthepage();
		sleep();
		homepage.Buildoutbutton();
		sleep();
		view.requestviewforlegal(i);
		buildout.rejectwithlegaluser();
	}

}
