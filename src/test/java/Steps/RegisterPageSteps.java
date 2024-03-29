package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;

public class RegisterPageSteps extends BaseClass {

	public static RegisterPage registerPage;
	
	@Given("user is on Facebook Register Page and validate the Facebook URL")
	public void user_is_on_facebook_register_page_and_validate_the_facebook_url() {
	   
		BaseClass.initialization();
		registerPage=new RegisterPage();
		String actualUrl=registerPage.validateRegisterPageUrl();
		boolean a=actualUrl.contains("reg");
		Assert.assertEquals(a,true);
	}
	
	
	@Given("user enters a valid FirstName and LastName")
	public void user_enters_a_valid_first_name_and_last_name() {
	    
		registerPage.FirstNameAndLastNameFunctionality("Sonali", "Khalate");
	}
	
	@Given("user enters a valid email address and password")
	public void user_enters_a_valid_email_address_and_password() {
	    
		registerPage.enterEmailAndPass("khalatesonali@gmail.com", "khalatesonali123");
	}
	@Given("user enters a valid date of birth")
	public void user_enters_a_valid_date_of_birth() {
	   
		registerPage.enterDOBFunctionality("14", "Mar", "2000");
	}
}


