package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass {

	@FindBy(name = "firstname")
	private WebElement fname;

	@FindBy(name = "lastname")
	private WebElement lname;

	@FindBy(name = "reg_email__")
	private WebElement emailId;

	@FindBy(name = "reg_passwd__")
	private WebElement regPass;

	public RegisterPage() {
		PageFactory.initElements(driver, this);

	}

	public String validateRegisterPageUrl() {

		return driver.getCurrentUrl();

	}

	public void FirstNameAndLastNameFunctionality(String FirstName, String LastName) {

		fname.sendKeys(FirstName);

		lname.sendKeys(LastName);
	}

	public void enterEmailAndPass(String Email, String Password) {
		emailId.sendKeys(Email);
		regPass.sendKeys(Password);

	}
}
