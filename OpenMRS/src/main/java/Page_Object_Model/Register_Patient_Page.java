package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Patient_Page {

	private WebDriver driver= null;
	

	public WebElement getGiven_Name() {
		return Given_Name;
	}

	public WebElement getFamily_Name() {
		return Family_Name;
	}

	public WebElement getNext_button() {
		return Next_button;
	}

	public WebElement getGender() {
		return Gender;
	}

	public WebElement getB_Day() {
		return B_Day;
	}

	public WebElement getSelect_B_Month() {
		return select_B_Month;
	}

	public WebElement getB_Year() {
		return B_Year;
	}

	public WebElement getAddress1() {
		return Address1;
	}

	public WebElement getCity_Village() {
		return City_Village;
	}

	public WebElement getState_Province() {
		return State_Province;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getPostCode() {
		return PostCode;
	}

	public WebElement getPhone_Number() {
		return Phone_Number;
	}

	public WebElement getConfirm() {
		return Confirm;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getConfirmName() {
		return confirmName;
	}

	public WebElement getConfirmGender() {
		return confirmGender;
	}

	public WebElement getConfirmBirthdate() {
		return confirmBirthdate;
	}

	public WebElement getConfirmAddress() {
		return confirmAddress;
	}

	public WebElement getConfirmPhoneNumber() {
		return confirmPhoneNumber;
	}

	public WebElement getProvince() {
		return province;
	}
	
	@FindBy(xpath="//input[@name='givenName']")
	private WebElement Given_Name;
	
	@FindBy(xpath="//input[@name='familyName']")
	private WebElement Family_Name;
	
	@FindBy(xpath="//button[@id='next-button']")
	private WebElement Next_button;
	
	@FindBy(xpath="//select[@id='gender-field']")
	private WebElement Gender;
	
	@FindBy(xpath="//input[@name='birthdateDay']")
	private WebElement B_Day;
	
	@FindBy(xpath="//select[@id='birthdateMonth-field']")
	private WebElement select_B_Month;
	
	@FindBy(xpath="//input[@name='birthdateYear']")
	private WebElement B_Year;
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement Address1;
	
	@FindBy(xpath="//input[@id='cityVillage']")
	private WebElement City_Village;
	
	@FindBy(xpath="//input[@name='stateProvince']")
	private WebElement State_Province;
	
    @FindBy(xpath="//input[@id='country']")
	private WebElement Country;
	
	@FindBy(xpath ="//input[@name='postalCode']")
	private WebElement PostCode;
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	private WebElement Phone_Number;
	
	@FindBy(xpath="//input[@value='Confirm']")
	private WebElement Confirm;
	
	@FindBy(xpath="//span[contains(text(),'Name:')]/..")
	private WebElement confirmName;
	
	@FindBy(xpath="//span[contains(text(),'Gender:')]/..")
	private WebElement confirmGender;
	
	@FindBy(xpath="//span[contains(text(),'Birthdate:')]/..")
	private WebElement confirmBirthdate;
	
	@FindBy(xpath="//span[contains(text(),'Address:')]/..")
	private WebElement confirmAddress;
	
	@FindBy(id = "stateProvince")
	private WebElement province;
	
	@FindBy(xpath="//span[contains(text(),'Phone Number:')]/..")
	private WebElement confirmPhoneNumber;
	
	
	public Register_Patient_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
}
