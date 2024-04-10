package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Patient_Page {

	public WebDriver driver = null;

	public WebElement getStart_Visit() {
		return Start_Visit;
	}

	public WebElement getStart_Confirm() {
		return Start_Confirm;
	}

	public WebElement getAttachments() {
		return Attachments;
	}

	public WebElement getDrop_File() {
		return Drop_File;
	}

	public WebElement getEnter_Caption() {
		return Enter_Caption;
	}

	public WebElement getUpload_Fle() {
		return Upload_Fle;
	}

	public WebElement getPatient_Name() {
		return Patient_Name;
	}

	public WebElement getEnd_Visit() {
		return End_Visit;
	}

	public WebElement getYes_Button() {
		return Yes_Button;
	}

	@FindBy(xpath="//div[normalize-space(text()) = 'Start Visit']")
	private WebElement Start_Visit;
	
	@FindBy(xpath="//button[@id='start-visit-with-visittype-confirm']")
	private WebElement Start_Confirm;
	
	@FindBy(xpath="//a[text()=' Attachments']")
	private WebElement Attachments;
	
	@FindBy(xpath="//div[text()='Click or drop a file here.']")
	private WebElement Drop_File;
	
	@FindBy(xpath="//textarea[@placeholder='Enter a caption']")
	private WebElement Enter_Caption;
	
	@FindBy(xpath="//button[text()='Upload file']")
	private WebElement Upload_Fle;
	
	@FindBy(xpath="//a[contains(text(),'TestJames Smith')]")
	private WebElement Patient_Name;
	
	@FindBy(xpath="//div[@class='action-section col-12 order-first d-lg-none']/following::div[normalize-space(text()) = 'End Visit']")
	private WebElement End_Visit;
	
	@FindBy(xpath="//span[contains(text(),'Are you sure you want to e')]/following::button[text()='Yes']")
	private WebElement Yes_Button;
	
	public Patient_Page(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(this.driver, this);
	}
	}
