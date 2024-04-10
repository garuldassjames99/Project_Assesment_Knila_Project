package Step_Definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.reader.property_file.File_Reader_Management;

import Base_Class.BaseClass;
import Page_Object_Manager.Page_Object_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Deff extends BaseClass {

	static Page_Object_Manager p;

	static String userName;

	@Given("User initialize the chrome browser to launch")
	public void user_initialize_the_chrome_browser_to_launch() throws IOException, InterruptedException {
		Thread.sleep(2000);
		System.out.println(File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("browser"));
		BrowserLaunch(File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("browser"));
		p = new Page_Object_Manager(driver);
	}

	@When("Redirect to https:\\/\\/qa-refapp.openmrs.org\\/openmrs\\/login.htm")
	public void redirect_to_https_qa_refapp_openmrs_org_openmrs_login_htm() throws IOException {
		launchurl(File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("url"));

	}

	@When("enter Username {string}")
	public void enter_username(String string) throws IOException {
		System.out.println(string);
		userName = File_Reader_Management.getInstanceFR().getInstanceCR().getproperty(string);
		p.getLogin().enterUsername(userName);

	}

	@When("enter Password {string}")
	public void enter_password(String string) throws IOException {
		p.getLogin().enterPassword(File_Reader_Management.getInstanceFR().getInstanceCR().getproperty(string));

	}

	@When("pick session location")
	public void pick_session_location() {
		p.getLogin().selectOutpatientClinic();
	}

	@When("click on login button")
	public void click_on_login_button() {
		p.getLogin().clickLoginButton();
	}

	@Then("verify User Is LoggedIn successfully in OpenMRS Dashboard")
	public void verify_user_is_logged_in_successfully_in_open_mrs_dashboard() {
		Assert.assertEquals(p.getHome().getProfileUser().getText(), userName.toLowerCase());
	}

	@Given("User click the register a Patient")
	public void user_click_the_register_a_patient() {
		WebElement register_a_patient = p.getHome().getRegister_a_patient();
		click(register_a_patient);

	}

	@When("User Enters in the Patient Name")
	public void user_enters_in_the_patient_name() throws IOException {
		sendkeys(p.get_Reg_Patient().getGiven_Name(),
				File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("givenName"));
		sendkeys(p.get_Reg_Patient().getFamily_Name(),
				File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("familyName"));

	}

	@When("clicks the Next button1")
	public void clicks_the_next_button1() {
		click(p.get_Reg_Patient().getNext_button());
	}

	@When("User Selects the Patients Gender")
	public void user_selects_the_patients_gender() {
		click(p.get_Reg_Patient().getGender());

		selectbyvalue(p.get_Reg_Patient().getGender(), "M");
	}

	@When("clicks the next button2")
	public void clicks_the_next_button2() {
		click(p.get_Reg_Patient().getNext_button());

	}

	@When("User enters the Date Of Birth")
	public void user_enters_the_date_of_birth() throws IOException {
		sendkeys(p.get_Reg_Patient().getB_Day(),
				File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("date"));
		selectbyvisibletext(p.get_Reg_Patient().getSelect_B_Month(),
				File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("month"));
		sendkeys(p.get_Reg_Patient().getB_Year(),
				File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("year"));
	}

	@When("clicks the Next button3")
	public void clicks_the_next_button3() {
		click(p.get_Reg_Patient().getNext_button());
	}

	@When("User enters the Address")
	public void user_enters_the_address() throws IOException {
		sendkeys(p.get_Reg_Patient().getAddress1(),
				File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("address"));
		sendkeys(p.get_Reg_Patient().getCity_Village(),
				File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("city"));
		sendkeys(p.get_Reg_Patient().getProvince(), File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("province"));
		sendkeys(p.get_Reg_Patient().getCountry(),
				File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("country"));
		sendkeys(p.get_Reg_Patient().getPostCode(),
				File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("postalCode"));

	}

	@When("clicks the Next button4")
	public void clicks_the_next_button4() {
		click(p.get_Reg_Patient().getNext_button());
	}

	@When("User enters the Phone Number")
	public void user_enters_the_phone_number() throws IOException {
		sendkeys(p.get_Reg_Patient().getPhone_Number(),
				File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("phNumber"));
	}

	@When("clicks the Next button5")
	public void clicks_the_next_button5() {
		click(p.get_Reg_Patient().getNext_button());
	}

	@When("clicks the Next button6")
	public void clicks_the_next_button6() {
		click(p.get_Reg_Patient().getNext_button());
	}

	@Then("user Confirms The Patients Name, Gender, DOB, Address and Phone Number")
	public void user_confirms_the_patients_name_gender_dob_address_and_phone_number() throws IOException {

		String name = p.get_Reg_Patient().getConfirmName().getText();
		String[] actName = name.split(":")[1].trim().split(",\\s*");
		String givenName = actName[0];
		String familyName = actName[1];
		Assert.assertEquals(givenName, File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("givenName"));
		Assert.assertEquals(familyName, File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("familyName"));

		String gen = p.get_Reg_Patient().getConfirmGender().getText();
		String[] actGen = gen.split(":")[1].trim().split(",\\s*");
        String actGender = actGen[0];
		Assert.assertEquals(actGender, File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("gender"));
        
		String dob =p.get_Reg_Patient().getConfirmBirthdate().getText();
		String[] actDob = dob.split(":")[1].trim().split(",\\s*");
		String actDate = actDob[0];
		String actMonth = actDob[1];
		String actYear = actDob[2];
		Assert.assertEquals(actDate, File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("date"));
		Assert.assertEquals(actMonth, File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("month"));
		Assert.assertEquals(actYear, File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("year"));

		String address = p.get_Reg_Patient().getConfirmAddress().getText();
		String[] actAddress = address.split(":")[1].trim().split(",\\s");
		String add = actAddress[0];
		String city = actAddress[1];
		String state = actAddress[2];
		String count = actAddress[3];
		String pin = actAddress[4];
		Assert.assertEquals(add, File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("address"));
		Assert.assertEquals(city, File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("city"));
		Assert.assertEquals(state, File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("province"));
		Assert.assertEquals(count, File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("country"));
		Assert.assertEquals(pin, File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("postalCode"));

		String phone = p.get_Reg_Patient().getConfirmPhoneNumber().getText();
		String[] actPhone = phone.split(":")[1].trim().split(",\\s*");
		String num = actPhone[0];
		Assert.assertEquals(num, File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("phNumber"));

		click(p.get_Reg_Patient().getConfirm());

	}

	@Given("User verifies the patient details and selects the start visit")
	public void user_verifies_the_patient_details_and_selects_the_start_visit() {

		click(p.getPatient().getStart_Visit());
	}

	@Then("clicks the confirm button")
	public void clicks_the_confirm_button() {
		click(p.getPatient().getStart_Confirm());
	}

	@Then("User selects the attachments and uploads the file")
	public void user_selects_the_attachments_and_uploads_the_file() throws IOException, InterruptedException, AWTException {

		click(p.getPatient().getAttachments());
		click(p.getPatient().getDrop_File());
		Thread.sleep(2000);
		Robot rr = new Robot();
		StringSelection str = new StringSelection("OpenMRS\resource\FileUploadScript.exe");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		rr.keyPress(KeyEvent.VK_CONTROL);
		rr.keyPress(KeyEvent.VK_V);

		rr.keyRelease(KeyEvent.VK_CONTROL);
		rr.keyRelease(KeyEvent.VK_V);

		rr.keyPress(KeyEvent.VK_ENTER);
		rr.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}

	@Then("User enter the captions for the file")
	public void user_enter_the_captions_for_the_file() throws IOException {
		sendkeys(p.getPatient().getEnter_Caption(),
				File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("caption"));
	}

	@Then("clicks the upload file button")
	public void clicks_the_upload_file_button() {
		click(p.getPatient().getUpload_Fle());
	}

	@Then("user clicks the Patients name near the home symbol")
	public void user_clicks_the_patients_name_near_the_home_symbol() {
		click(p.getPatient().getPatient_Name());
		driver.navigate().refresh();
	}

	@Then("User selects the End Visit")
	public void user_selects_the_end_visit() throws InterruptedException {
//		Thread.sleep(2000);
		click(p.getPatient().getEnd_Visit());
		click(p.getPatient().getYes_Button());

	}

	@Given("User selects the stat visit button")
	public void user_selects_the_stat_visit_button() {
		click(p.getVitals().getStart_Visit());
		click(p.getVitals().getConfirm());
	}

	@Then("User clicks the Capital Vitals")
	public void user_clicks_the_capital_vitals() {
		waitforvisibilityofelment(p.getVitals().getCapture_vitals());
		click(p.getVitals().getCapture_vitals());
	}

	@Then("User enters the Height,Weight and saves the form")
	public void user_enters_the_height_weight_and_saves_the_form() throws IOException, InterruptedException {
		sendkeys(p.getVitals().getHeight(),
				File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("height"));
		click(p.getVitals().getNext_button());
		sendkeys(p.getVitals().getWeight(),
				File_Reader_Management.getInstanceFR().getInstanceCR().getproperty("weight"));
		click(p.getVitals().getNext_button());
//		Thread.sleep(1000);
		click(p.getVitals().getNext_button());
		click(p.getVitals().getSaveForm());

	}

	@Then("User verifies the vitals and select the save button")
	public void user_verifies_the_vitals_and_select_the_save_button() {
		click(p.getVitals().getSaveButton());
	}

	@Then("User selects the End Visit and clicks the Yes button")
	public void user_selects_the_end_visit_and_clicks_the_yes_button() {
		click(p.getVitals().getEnd_Visit());
		click(p.getVitals().getYes_button());
	}

	@Then("User clicks the Patient Name on the Dashboard")
	public void user_clicks_the_patient_name_on_the_dashboard() throws Throwable {
		driver.navigate().refresh();
		click(p.getVitals().getGiven_Name());
		}

	@Then("User selects the merge visit and selects the visits and selects the Merge Selected Visits button")
	public void user_selects_the_merge_visit_and_selects_the_visits_and_selects_the_merge_selected_visits_button()
			throws InterruptedException {
		click(p.getVitals().getMerge_Visits());
		click(p.getVitals().getCheckbox());
//		Thread.sleep(1000);
		click(p.getVitals().getCheckbox2());
		click(p.getVitals().getConfirm_Enabled());
	}

	@Then("User clicks the return button")
	public void user_clicks_the_return_button() throws InterruptedException {
		click(p.getVitals().getReturn());
//		Thread.sleep(1000);
		click(p.getVitals().getDelete());
	}
	
	@Then("User enters the reason for delete and veerifies the deleting process is completed")
	public void user_enters_the_reason_for_delete_and_veerifies_the_deleting_process_is_completed() throws IOException {
		sendkeys(p.getVitals().getReason(), "Successfully completed the framework");
		
		click(p.getVitals().getConfirm_Reason());
		
		WebElement patient_id = p.getVitals().getPatient_id();
		String patientID = patient_id.getText();
		
		sendkeys(p.getVitals().getPatient_search(), patientID);
	}
}
