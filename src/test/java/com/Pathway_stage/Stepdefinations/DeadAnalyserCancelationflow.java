package com.Pathway_stage.Stepdefinations;

import com.Pathway_stage.Base.Basepage;
import com.Pathway_stage.Pathwayconstants.Pathwayconstants;
import com.Pathway_stage.Users.MarketUser;
import com.Pathway_stage.Webpages.DeadlineAnalyserpage;
import com.Pathway_stage.Webpages.Homepage;
import com.Pathway_stage.Webpages.Loginpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeadAnalyserCancelationflow  extends Basepage
{
	Loginpage login = new Loginpage();
	Homepage home = new Homepage();
	MarketUser market = new MarketUser();
	DeadlineAnalyserpage deadline = new DeadlineAnalyserpage();
	@Given("^enter url application into \"([^\"]*)\" for Deadlineanlayser in the \"([^\"]*)\" environment with  first Market user$")
	public void enter_url_application_into_for_Deadlineanlayser_in_the_environment_with_first_Market_user(String browsername, String environment) throws Throwable {
	    
		init(browsername);
		if (environment.equals("local")) {
			geturl(Pathwayconstants.URL_OF_THE_APPLICATION);
		}
		else {
			geturl(Pathwayconstants.STAGE_URL_OF_THE_APPLICATION);
		}
		
		/*extentpassreport("Launch Application succesfully into the browser");
		System.out.println("Launch Application succesfully into the browser");*/
	}

	@When("^first Market user login with valid credtinlas for Deadline analyser$")
	public void first_Market_user_login_with_valid_credtinlas_for_Deadline_analyser() throws Throwable 
	{
		market.loginwithMarketUser();
		market.marketuserpopuplogin();
	   
	}

	@Then("^rise a canceanlation request with  first marketuser in the deadline analyser section with \"([^\"]*)\" to \"([^\"]*)\"$")
	public void rise_a_canceanlation_request_with_first_marketuser_in_the_deadline_analyser_section_with_to(String fromdate, String todate) throws Throwable
	{
	   home.clickDeadlineanalyserbutton();
	   deadline.RisecancelationRequestwithMarketuser(fromdate, todate);
	}

	@Then("^close browser after rise a request with  first market user$")
	public void close_browser_after_rise_a_request_with_first_market_user() throws Throwable {
	    
	}

	@When("^first Rpm user login with valid credtinals  for Cancelation process for Deadline analyser moduel$")
	public void first_Rpm_user_login_with_valid_credtinals_for_Cancelation_process_for_Deadline_analyser_moduel() throws Throwable {
	   
	}

	@Then("^Check the \"([^\"]*)\" status of the Cancelation application for deadLine analyser moduel with first RPM USER$")
	public void check_the_status_of_the_Cancelation_application_for_deadLine_analyser_moduel_with_first_RPM_USER(String arg1) throws Throwable {
	    
	}

	@Then("^close browser after check the status of the cancelation application with  first RPMuser for deadLine analyser moduel$")
	public void close_browser_after_check_the_status_of_the_cancelation_application_with_first_RPMuser_for_deadLine_analyser_moduel() throws Throwable {
	    
	}

	@When("^first NOC user login with valid credtinals  for Cancelation process for Deadline analyser moduel$")
	public void first_NOC_user_login_with_valid_credtinals_for_Cancelation_process_for_Deadline_analyser_moduel() throws Throwable {
	   
	}

	@Then("^Check the \"([^\"]*)\" status of the Cancelation application for deadLine analyser moduel with first NOC user$")
	public void check_the_status_of_the_Cancelation_application_for_deadLine_analyser_moduel_with_first_NOC_user(String arg1) throws Throwable {
	    
	}

	@Then("^close browser after check the status of the cancelation application with first NOCuser for deadLine analyser moduel$")
	public void close_browser_after_check_the_status_of_the_cancelation_application_with_first_NOCuser_for_deadLine_analyser_moduel() throws Throwable {
	    
	}

	@When("^first legal user login with valid credtinals  for Cancelation process for Deadline analyser moduel$")
	public void first_legal_user_login_with_valid_credtinals_for_Cancelation_process_for_Deadline_analyser_moduel() throws Throwable {
	    
	}

	@Then("^Check the \"([^\"]*)\" status of the Cancelation application for deadLine analyser moduel with first Legalsuer$")
	public void check_the_status_of_the_Cancelation_application_for_deadLine_analyser_moduel_with_first_Legalsuer(String arg1) throws Throwable {
	    
	}

	@Then("^close browser after check the status of the cancelation application with first legal user for deadLine analyser moduel$")
	public void close_browser_after_check_the_status_of_the_cancelation_application_with_first_legal_user_for_deadLine_analyser_moduel() throws Throwable {
	    
	}

	@Given("^enter url application into \"([^\"]*)\" for Deadlineanlayser in the \"([^\"]*)\" environment with second Marketuser$")
	public void enter_url_application_into_for_Deadlineanlayser_in_the_environment_with_second_Marketuser(String arg1, String arg2) throws Throwable {
	    
	}

	@When("^second Marketuser login with valid credtinlas for Deadline analyser$")
	public void second_Marketuser_login_with_valid_credtinlas_for_Deadline_analyser() throws Throwable {
	    
	}

	@Then("^rise a canceanlation request with second marketuser in the deadline analyser section with \"([^\"]*)\" to \"([^\"]*)\"$")
	public void rise_a_canceanlation_request_with_second_marketuser_in_the_deadline_analyser_section_with_to(String arg1, String arg2) throws Throwable {
	    
	}

	@Then("^close browser after rise a request with second marketuser$")
	public void close_browser_after_rise_a_request_with_second_marketuser() throws Throwable {
	   
	}

	@When("^second Rpm user login with valid credtinals  for Cancelation process for Deadline analyser moduel$")
	public void second_Rpm_user_login_with_valid_credtinals_for_Cancelation_process_for_Deadline_analyser_moduel() throws Throwable {
	    
	}

	@Then("^Check the \"([^\"]*)\" status of the Cancelation application for deadLine analyser moduel with second RPMUSER$")
	public void check_the_status_of_the_Cancelation_application_for_deadLine_analyser_moduel_with_second_RPMUSER(String arg1) throws Throwable {
	   
	}

	@Then("^close browser after check the status of the cancelation application with  second RPMuser for deadLine analyser moduel$")
	public void close_browser_after_check_the_status_of_the_cancelation_application_with_second_RPMuser_for_deadLine_analyser_moduel() throws Throwable {
	   
	}

	@Given("^enter url application into \"([^\"]*)\" for Deadlineanlayser in the \"([^\"]*)\" environment with third  Marketuser$")
	public void enter_url_application_into_for_Deadlineanlayser_in_the_environment_with_third_Marketuser(String arg1, String arg2) throws Throwable {
	   
	}

	@When("^third Market user login with valid credtinlas for Deadline analyser$")
	public void third_Market_user_login_with_valid_credtinlas_for_Deadline_analyser() throws Throwable {
	   
	}

	@Then("^rise a canceanlation request with  third market user in the deadline analyser section with \"([^\"]*)\" to \"([^\"]*)\"$")
	public void rise_a_canceanlation_request_with_third_market_user_in_the_deadline_analyser_section_with_to(String arg1, String arg2) throws Throwable {
	   
	}

	@Then("^close browser after rise a request with  third market user$")
	public void close_browser_after_rise_a_request_with_third_market_user() throws Throwable {
	   
	}

	@When("^Third Rpm user login with valid credtinals  for Cancelation process for Deadline analyser moduel$")
	public void third_Rpm_user_login_with_valid_credtinals_for_Cancelation_process_for_Deadline_analyser_moduel() throws Throwable {
	    
	}

	@Then("^Check the \"([^\"]*)\" status of the Cancelation application for deadLine analyser moduel with third RPMUSER$")
	public void check_the_status_of_the_Cancelation_application_for_deadLine_analyser_moduel_with_third_RPMUSER(String arg1) throws Throwable {
	   
	}

	@Then("^close browser after check the status of the cancelation application with Third  RPMuser for deadLine analyser moduel$")
	public void close_browser_after_check_the_status_of_the_cancelation_application_with_Third_RPMuser_for_deadLine_analyser_moduel() throws Throwable {
	   
	}

	@When("^Third NOC user login with valid credtinals  for Cancelation process for Deadline analyser moduel$")
	public void third_NOC_user_login_with_valid_credtinals_for_Cancelation_process_for_Deadline_analyser_moduel() throws Throwable {
	    
	}

	@Then("^Check the \"([^\"]*)\" status of the Cancelation application for deadLine analyser moduel with third NOCuser$")
	public void check_the_status_of_the_Cancelation_application_for_deadLine_analyser_moduel_with_third_NOCuser(String arg1) throws Throwable {
	   
	}

	@Then("^close browser after check the status of the cancelation application with  third NOCuser for deadLine analyser moduel$")
	public void close_browser_after_check_the_status_of_the_cancelation_application_with_third_NOCuser_for_deadLine_analyser_moduel() throws Throwable {
	   
	}

	@Given("^enter url application into \"([^\"]*)\" for Deadlineanlayser in the \"([^\"]*)\" environment with  fourth Marketuser$")
	public void enter_url_application_into_for_Deadlineanlayser_in_the_environment_with_fourth_Marketuser(String arg1, String arg2) throws Throwable {
	   
	}

	@When("^fourth Marketuser login with valid credtinlas for Deadline analyser$")
	public void fourth_Marketuser_login_with_valid_credtinlas_for_Deadline_analyser() throws Throwable {
	   
	}

	@Then("^rise a canceanlation request with fourth marketuser in the deadline analyser section with \"([^\"]*)\" to \"([^\"]*)\"$")
	public void rise_a_canceanlation_request_with_fourth_marketuser_in_the_deadline_analyser_section_with_to(String arg1, String arg2) throws Throwable {
	    
	}

	@Then("^close browser after rise a request with  fourth marketuser$")
	public void close_browser_after_rise_a_request_with_fourth_marketuser() throws Throwable {
	  
	}

	@When("^fourth Rpm user login with valid credtinals  for Cancelation process for Deadline analyser moduel$")
	public void fourth_Rpm_user_login_with_valid_credtinals_for_Cancelation_process_for_Deadline_analyser_moduel() throws Throwable {
	   
	}

	@Then("^Check the \"([^\"]*)\" status of the Cancelation application for deadLine analyser moduel with fourth  RPMUSER$")
	public void check_the_status_of_the_Cancelation_application_for_deadLine_analyser_moduel_with_fourth_RPMUSER(String arg1) throws Throwable {
	   
	}

	@Then("^close browser after check the status of the cancelation application with fourth RPMuser for deadLine analyser moduel$")
	public void close_browser_after_check_the_status_of_the_cancelation_application_with_fourth_RPMuser_for_deadLine_analyser_moduel() throws Throwable {
	   
	}

	@When("^fourth NOC user login with valid credtinals  for Cancelation process for Deadline analyser moduel$")
	public void fourth_NOC_user_login_with_valid_credtinals_for_Cancelation_process_for_Deadline_analyser_moduel() throws Throwable {
	     
	}

	@Then("^Check the \"([^\"]*)\" status of the Cancelation application for deadLine analyser moduel with fourth NOCuser$")
	public void check_the_status_of_the_Cancelation_application_for_deadLine_analyser_moduel_with_fourth_NOCuser(String arg1) throws Throwable {
	   
	}

	@Then("^close browser after check the status of the cancelation application with  fourth NOCuser for deadLine analyser moduel$")
	public void close_browser_after_check_the_status_of_the_cancelation_application_with_fourth_NOCuser_for_deadLine_analyser_moduel() throws Throwable {
	    
	}

	@When("^fourth legal user login with valid credtinals  for Cancelation process for Deadline analyser moduel$")
	public void fourth_legal_user_login_with_valid_credtinals_for_Cancelation_process_for_Deadline_analyser_moduel() throws Throwable {
	    
	}

	@Then("^Check the \"([^\"]*)\" status of the Cancelation application for deadLine analyser moduel with fourty  Legalsuer$")
	public void check_the_status_of_the_Cancelation_application_for_deadLine_analyser_moduel_with_fourty_Legalsuer(String arg1) throws Throwable {
	    
	}

	@Then("^close browser after check the status of the cancelation application with fourth  legal user for deadLine analyser moduel$")
	public void close_browser_after_check_the_status_of_the_cancelation_application_with_fourth_legal_user_for_deadLine_analyser_moduel() throws Throwable {
	    
	}

	@Given("^enter url application into \"([^\"]*)\" for Deadlineanlayser in the \"([^\"]*)\" environment with fifth RPMUSER$")
	public void enter_url_application_into_for_Deadlineanlayser_in_the_environment_with_fifth_RPMUSER(String arg1, String arg2) throws Throwable {
	   
	}

	@When("^fifth RPMUSER login with valid credtinlas for Deadline analyser$")
	public void fifth_RPMUSER_login_with_valid_credtinlas_for_Deadline_analyser() throws Throwable {
	    
	}

	@Then("^rise a canceanlation request with fifth RPMUSER in the deadline analyser section with \"([^\"]*)\" to \"([^\"]*)\"$")
	public void rise_a_canceanlation_request_with_fifth_RPMUSER_in_the_deadline_analyser_section_with_to(String arg1, String arg2) throws Throwable {
	   
	}

	@Then("^close browser after rise a request with fifth RPMUSER$")
	public void close_browser_after_rise_a_request_with_fifth_RPMUSER() throws Throwable {
	    
	}

	@When("^fifth NOC user login with valid credtinals  for Cancelation process for Deadline analyser moduel$")
	public void fifth_NOC_user_login_with_valid_credtinals_for_Cancelation_process_for_Deadline_analyser_moduel() throws Throwable {
	    
	}

	@Then("^Check the \"([^\"]*)\" status of the Cancelation application for deadLine analyser moduel with fifth NOCuser$")
	public void check_the_status_of_the_Cancelation_application_for_deadLine_analyser_moduel_with_fifth_NOCuser(String arg1) throws Throwable {
	   
	}

	@Then("^close browser after check the status of the cancelation application with  fifth NOCuser for deadLine analyser moduel$")
	public void close_browser_after_check_the_status_of_the_cancelation_application_with_fifth_NOCuser_for_deadLine_analyser_moduel() throws Throwable {
	   
	}

	@When("^fifth legal user login with valid credtinals  for Cancelation process for Deadline analyser moduel$")
	public void fifth_legal_user_login_with_valid_credtinals_for_Cancelation_process_for_Deadline_analyser_moduel() throws Throwable {
	   
	}

	@Then("^Check the \"([^\"]*)\" status of the Cancelation application for deadLine analyser moduel with fifth Legalsuer$")
	public void check_the_status_of_the_Cancelation_application_for_deadLine_analyser_moduel_with_fifth_Legalsuer(String arg1) throws Throwable {
	    
	}

	@Then("^close browser after check the status of the cancelation application with fifth legaluser for deadLine analyser moduel$")
	public void close_browser_after_check_the_status_of_the_cancelation_application_with_fifth_legaluser_for_deadLine_analyser_moduel() throws Throwable {
	    
	}

	@Given("^enter url application into \"([^\"]*)\" for Deadlineanlayser in the \"([^\"]*)\" environment with sixth RPMUSER$")
	public void enter_url_application_into_for_Deadlineanlayser_in_the_environment_with_sixth_RPMUSER(String arg1, String arg2) throws Throwable {
	   
	}

	@When("^sixth RPMUSER login with valid credtinlas for Deadline analyser$")
	public void sixth_RPMUSER_login_with_valid_credtinlas_for_Deadline_analyser() throws Throwable {
	   
	}

	@Then("^rise a canceanlation request with  sixth RPMUSER in the deadline analyser section with \"([^\"]*)\" to \"([^\"]*)\"$")
	public void rise_a_canceanlation_request_with_sixth_RPMUSER_in_the_deadline_analyser_section_with_to(String arg1, String arg2) throws Throwable {
	   
	}

	@Then("^close browser after rise a request with  sixth RPMUSER$")
	public void close_browser_after_rise_a_request_with_sixth_RPMUSER() throws Throwable {
	   
	}

	@When("^sixth NOC user login with valid credtinals  for Cancelation process for Deadline analyser moduel$")
	public void sixth_NOC_user_login_with_valid_credtinals_for_Cancelation_process_for_Deadline_analyser_moduel() throws Throwable {
	    
	}

	@Then("^Check the \"([^\"]*)\" status of the Cancelation application for deadLine analyser moduel with  sixth NOCuser$")
	public void check_the_status_of_the_Cancelation_application_for_deadLine_analyser_moduel_with_sixth_NOCuser(String arg1) throws Throwable {
	    
	}

	@Then("^close browser after check the status of the cancelation application with sixth  NOCuser for deadLine analyser moduel$")
	public void close_browser_after_check_the_status_of_the_cancelation_application_with_sixth_NOCuser_for_deadLine_analyser_moduel() throws Throwable {
	    
	}

	@Given("^enter url application into \"([^\"]*)\" for Deadlineanlayser in the \"([^\"]*)\" environment with seventh RPMUSER$")
	public void enter_url_application_into_for_Deadlineanlayser_in_the_environment_with_seventh_RPMUSER(String arg1, String arg2) throws Throwable {
	   
	}

	@When("^seventh RPMUSER login with valid credtinlas for Deadline analyser$")
	public void seventh_RPMUSER_login_with_valid_credtinlas_for_Deadline_analyser() throws Throwable {
	   
	}

	@Then("^rise a canceanlation request with  seventh RPMUSER in the deadline analyser section with \"([^\"]*)\" to \"([^\"]*)\"$")
	public void rise_a_canceanlation_request_with_seventh_RPMUSER_in_the_deadline_analyser_section_with_to(String arg1, String arg2) throws Throwable {
	   
	}

	@Then("^close browser after rise a request with seventh  RPMUSER$")
	public void close_browser_after_rise_a_request_with_seventh_RPMUSER() throws Throwable {
	   
	}

	@When("^seventh NOC user login with valid credtinals  for Cancelation process for Deadline analyser moduel$")
	public void seventh_NOC_user_login_with_valid_credtinals_for_Cancelation_process_for_Deadline_analyser_moduel() throws Throwable {
	    
	}

	@Then("^Check the \"([^\"]*)\" status of the Cancelation application for deadLine analyser moduel with  seventh NOCuser$")
	public void check_the_status_of_the_Cancelation_application_for_deadLine_analyser_moduel_with_seventh_NOCuser(String arg1) throws Throwable {
	   
	}

	@Then("^close browser after check the status of the cancelation application with seventh NOCuser for deadLine analyser moduel$")
	public void close_browser_after_check_the_status_of_the_cancelation_application_with_seventh_NOCuser_for_deadLine_analyser_moduel() throws Throwable {
	   
	}

	@When("^seventh legal user login with valid credtinals  for Cancelation process for Deadline analyser moduel$")
	public void seventh_legal_user_login_with_valid_credtinals_for_Cancelation_process_for_Deadline_analyser_moduel() throws Throwable {
	   
	}

	@Then("^Check the \"([^\"]*)\" status of the Cancelation application for deadLine analyser moduel with seventh Legalsuer$")
	public void check_the_status_of_the_Cancelation_application_for_deadLine_analyser_moduel_with_seventh_Legalsuer(String arg1) throws Throwable {
	    
	}

	@Then("^close browser after check the status of the cancelation application with  seventh legaluser   for deadLine analyser moduel$")
	public void close_browser_after_check_the_status_of_the_cancelation_application_with_seventh_legaluser_for_deadLine_analyser_moduel() throws Throwable {
	   
	}

}
