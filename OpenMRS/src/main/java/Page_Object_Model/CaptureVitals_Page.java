package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaptureVitals_Page {
	
	private WebDriver driver= null;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getStart_Visit() {
		return Start_Visit;
	}

	public WebElement getConfirm() {
		return Confirm;
	}

	public WebElement getCapture_vitals() {
		return Capture_vitals;
	}

	public WebElement getHeight() {
		return Height;
	}

	public WebElement getWeight() {
		return Weight;
	}

	public WebElement getNext_button() {
		return Next_button;
	}

	public WebElement getSaveForm() {
		return SaveForm;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public WebElement getEnd_Visit() {
		return End_Visit;
	}

	public WebElement getYes_button() {
		return Yes_button;
	}

	public WebElement getGiven_Name() {
		return Given_Name;
	}

	public WebElement getMerge_Visits() {
		return Merge_Visits;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}
	
	public WebElement getCheckbox2() {
		return checkbox2;
	}

	public WebElement getConfirm_Enabled() {
		return Confirm_Enabled;
	}

	public WebElement getReturn() {
		return Return;
	}

	public WebElement getReason() {
		return reason;
	}

	public WebElement getDelete() {
		return delete;
	}
	
	@FindBy(xpath="//h3[text()='General Actions']/following::div[normalize-space(text()) = 'Start Visit']")
	private WebElement Start_Visit;

	@FindBy(xpath="//h3[normalize-space(text()) = 'Start a visit']/following::button[text()='Confirm']")
	private WebElement Confirm;
	
	@FindBy(xpath="(//div[@class='visit-actions active-visit']/child::a)[4]")
	private WebElement Capture_vitals;
	
	@FindBy(xpath="//input[@class='number numeric-range focused']")
	private WebElement Height ;
	
	@FindBy(xpath="(//h3[text()='Weight (kg)']/following::input[@class='number numeric-range'])[1]")
	private WebElement Weight;
	
	@FindBy(xpath="//icon[@class='fas fa-chevron-right']")
	private WebElement Next_button ;
	
	@FindBy(xpath="//a[@id='save-form']")
	private WebElement SaveForm ;
	
	@FindBy(xpath="//button[@class='submitButton confirm right focused'] ")
	private WebElement  SaveButton;
	
	@FindBy(xpath="//i[@class='icon-off']")
	private WebElement  End_Visit;
	
	@FindBy(xpath="//h3[text()='End Visit']/following::button[text()='Yes']")
	private WebElement Yes_button ;

	@FindBy(xpath="//a[normalize-space(text())='TestJames Smith']")
	private WebElement Given_Name ;
	
	@FindBy(xpath="//a[@id='org.openmrs.module.coreapps.mergeVisits']")
	private WebElement  Merge_Visits;
	
	@FindBy(xpath="(//th[text()='Merge']/following::input[@class='selectVisit'])[1]")
	private WebElement  checkbox;

	@FindBy(xpath = "(//th[text()='Merge']/following::input[@class='selectVisit'])[2]")
	private WebElement checkbox2;
	
	@FindBy(xpath="//input[@class='confirm enabled']")
	private WebElement  Confirm_Enabled;
	
	@FindBy(xpath="//input[@class='cancel']")
	private WebElement  Return;
	
	@FindBy(xpath="//a[@id='org.openmrs.module.coreapps.deletePatient']")
	private WebElement delete;
	
	@FindBy(xpath = "//input[@id='delete-reason']")
	private WebElement reason;
	
	@FindBy(xpath = "(//button[@class='confirm right'])[6]")
	private WebElement confirm_Reason;
	
	public WebElement getConfirm_Reason() {
		return confirm_Reason;
	}

	@FindBy(xpath = "//em[text()='Patient ID']/following-sibling::span[text()]")
	private WebElement patient_id;

	@FindBy(xpath = "//input[@id='patient-search']")
	private WebElement Patient_search;
	public WebElement getPatient_search() {
		return Patient_search;
	}

	public WebElement getPatient_id() {
		return patient_id;
	}

	public CaptureVitals_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(this.driver, this);
	}
}
