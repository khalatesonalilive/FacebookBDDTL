package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	@FindBy(name="birthday_day")
	private WebElement  bdate;
	
	@FindBy(name="birthday_month")
	private WebElement  bmonth;
	
	@FindBy(name="birthday_year")
	private WebElement  byear;

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
	
	public void enterDOBFunctionality(String Date, String Month , String Year)
	{
		Select sel=new Select(bdate);
		sel.selectByVisibleText(Date);
		
		Select sel1=new Select(bmonth);
		sel1.selectByVisibleText(Month);
		
		Select sel2=new Select(byear);
		sel2.selectByVisibleText(Year);
		
		
	}
}
