package Page_Object_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Base_Class.BaseClass;
import Page_Object_Model.CaptureVitals_Page;
import Page_Object_Model.Home_Page;
import Page_Object_Model.Login_Page;
import Page_Object_Model.Patient_Page;
import Page_Object_Model.Register_Patient_Page;

public class Page_Object_Manager {

	WebDriver driver = null;

	private Login_Page login = new Login_Page(driver);
	
	public Login_Page getLogin() {
		if (login != null) {
			login = new Login_Page(driver);
		}
		return login;
	}

	private Home_Page home = new Home_Page(driver);

	public Home_Page getHome() {
		if (home != null) {
			home = new Home_Page(driver);
		}
		return home;
	}

	private Register_Patient_Page Reg_Patient_page = new Register_Patient_Page(driver);

	public Register_Patient_Page get_Reg_Patient() {
		if (Reg_Patient_page != null) {
			Reg_Patient_page = new Register_Patient_Page(driver);
		}
		return Reg_Patient_page;
	}

	private Patient_Page patient = new Patient_Page(driver);

	public Patient_Page getPatient() {
		if (patient != null) {
			patient = new Patient_Page(driver);
		}
		return patient;
	}
	
	private CaptureVitals_Page vitals = new CaptureVitals_Page(driver);
	
	public CaptureVitals_Page getVitals() {
		if (vitals != null) {
			vitals = new CaptureVitals_Page(driver);
		}
		return vitals;
	}

	public Page_Object_Manager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
}
