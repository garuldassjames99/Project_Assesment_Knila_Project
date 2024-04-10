package Page_Object_Model;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends Base_Class.BaseClass {

	public static WebDriver driver;
	Logger logger = Logger.getLogger("org.openqa.selenium");

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	@FindBy(id = "Inpatient Ward")
	private WebElement inpatientWard;

	@FindBy(id = "Isolation Ward")
	private WebElement isolationWard;

	@FindBy(id = "Laboratory")
	private WebElement laboratory;

	@FindBy(id = "Outpatient Clinic")
	private WebElement outpatientClinic;

	@FindBy(id = "Pharmacy")
	private WebElement pharmacy;

	@FindBy(id = "Registration Desk")
	private WebElement registrationDesk;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getInpatientWard() {
		return inpatientWard;
	}

	public WebElement getIsolationWard() {
		return isolationWard;
	}

	public WebElement getLaboratory() {
		return laboratory;
	}

	public WebElement getOutpatientClinic() {
		return outpatientClinic;
	}

	public WebElement getPharmacy() {
		return pharmacy;
	}

	public WebElement getRegistrationDesk() {
		return registrationDesk;
	}

	public void enterUsername(String user_name) {
		logger.log(Level.INFO, "Verify whether user is able to enter username");
		username.sendKeys(user_name);
	}

	public void enterPassword(String user_password) {
		logger.log(Level.INFO, "Verify whether user is able to enter password");
		password.sendKeys(user_password);
	}

	public void clickLoginButton() {
		logger.log(Level.INFO, "Verify whether user is able to click login button");
		loginButton.click();
	}

	public void selectInpatientWard() {
		logger.log(Level.INFO, "Verify whether user is able to click Inpatient Ward");
		inpatientWard.click();
	}

	public void selectIsolationWard() {
		logger.log(Level.INFO, "Verify whether user is able to click Isolation Ward");
		isolationWard.click();
	}

	public void selectLaboratory() {
		logger.log(Level.INFO, "Verify whether user is able to click Laboratory");
		laboratory.click();
	}

	public void selectOutpatientClinic() {
		logger.log(Level.INFO, "Verify whether user is able to click Outpatient Clinic");
		outpatientClinic.click();
	}

	public void selectPharmacy() {
		logger.log(Level.INFO, "Verify whether user is able to click Pharmacy");
		pharmacy.click();
	}

	public void selectRegistrationDesk() {
		logger.log(Level.INFO, "Verify whether user is able to click Registration Desk");
		registrationDesk.click();
	}

}