package tray;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import configuration.propfile;

public class script {
	static String projectpath = System.getProperty("user.dir");
	static WebDriver Driver;
	public static String browser;

	public static void main(String[] args) {
		// browser();
		propfile.Propertiesfile();
		contiguration();
		run();

	}
	public static void browser(){
		setBrowser("");
		
	}
	public static void contiguration(){
		// TO USE CHROME ENTER CHROME AS BROWSER
		if(getBrowser().contains("Chrome")){
			System.setProperty("webdriver.chrome.driver", projectpath+"\\libs\\driver\\chromedriver.exe");
			Driver = new ChromeDriver();
		}
		// TO USE FIREFOX SET BROWSER OF CHOICE AS FIREFOX
		if(getBrowser().contains("Firefox")){
			System.setProperty("webdriver.firefox.driver", projectpath+"\\libs\\driver\\geckodriver.exe");
	}
	}
	
		public static void run(){
			Driver.get("konga.com");
			Driver.manage().window().maximize();
			Driver.manage().deleteAllCookies();
		}
		public static String getBrowser() {
			return browser;
		}
		public static void setBrowser(String browser) {
			script.browser = browser;
		}

}
