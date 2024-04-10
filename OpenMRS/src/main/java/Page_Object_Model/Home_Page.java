package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	private WebDriver driver= null;
	
	@FindBy(xpath ="//a[contains(@id,'referenceapplication-registrat')]")
	private WebElement register_a_patient;
	
	@FindBy(xpath ="//li[@class=\"nav-item identifier\"]")
	private WebElement profileUser;

	public WebElement getProfileUser() {
		return profileUser;
	}


	public WebElement getRegister_a_patient() {
		return register_a_patient;
	}
	
	
	public Home_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	
	
	

}
