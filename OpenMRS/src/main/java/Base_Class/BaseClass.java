package Base_Class;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
//=>methods in base
//	1.BrowserLaunch
//	2.quitBrowser
//	3.click
//	4.launchurl
//	5.sendkeys
//	6.waitElementVisibility
//	7.presenceOfElementLocated
//	8.selectbyvisibletext
//	9.selectbyvalue
//	10.selectbyindex
//	11.current date and time
	
	public static WebDriver BrowserLaunch(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions opt = new ChromeOptions();
				opt.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(opt);
				driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
				driver.manage().window().maximize();
			} else if(browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();	
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		return driver;
	}
	public static void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void launchurl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public  void sendkeys(WebElement element, String text) {
		try {
			element.sendKeys(text);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void selectbyvisibletext(WebElement dropdown , String text)  {

		try {
			Select select = new Select(dropdown);
			select.selectByVisibleText(text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void selectbyvalue(WebElement dropdown , String value) {
		try {
			Select select = new Select(dropdown);
			select.selectByValue(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void selectbyindex(WebElement dropdown , int index) {
		try {
			Select select = new Select(dropdown);
			select.selectByIndex(index);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void waitforvisibilityofelment(WebElement element) {

		try {
			WebDriverWait wb = new WebDriverWait(driver, 30);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void mousehover(WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void action(WebElement element, String options) throws Throwable {
		Actions a = new Actions(driver);
		try {
			if (options.equalsIgnoreCase("click")) {
				a.click(element).perform();
			} else if (options.equalsIgnoreCase("context click")) {
				a.contextClick(element).perform();
			} else if (options.equalsIgnoreCase("double click")) {
				a.doubleClick(element).perform();
			} else if (options.equalsIgnoreCase("move to element")) {
				a.moveToElement(element).perform();
				a.click().perform();
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("invalid mouse action");
		}
	}


	
	public static String DateAndTime() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy_HHmmss");
		LocalDateTime now = LocalDateTime.now();
		String strDate = dtf.format(now);
		return strDate;
		
	}
}
