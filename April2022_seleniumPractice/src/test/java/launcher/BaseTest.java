package launcher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	public static Properties p;// Declared globally to use everywhere 
	public static FileInputStream fis;
	public static Properties mainProp;
	public static Properties childProp;
	
	public static void init() throws Exception {
		
		fis = new FileInputStream(projectpath+"/src/test/resources/environment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectpath+"/src/test/resources/"+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		String url = childProp.getProperty("amazonurl");
		System.out.println(url);
		
		
		
		
		// read from file
		fis = new FileInputStream(projectpath+"/src/test/resources/data.properties");//fileinputstream to get the file data properties
		//Properties p = new Properties(); declaring globally
		p = new Properties();
		p.load(fis);//properties reference object to load the file
		//String e = p.getProperty("chromebrowser");// Retrieve the corresponding value
		//System.out.println(e);
		
	}
	
	public static void launch(String browserkey) {
		
		if(p.getProperty(browserkey).equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hkhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			
			// chrome options arguments: https://stackoverflow.com/questions/38335671/where-can-i-find-a-list-of-all-available-chromeoption-arguments
			//https://peter.sh/experiments/chromium-command-line-switches/
			option.addArguments("user-data-dir=C:\\Users\\hkhan\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
			option.addArguments("--disable-notifications");
			option.addArguments("--start-maximized");
			//option.addArguments("--ignore-certificate-errors-spki-list");
			//option.addArguments("--proxy-server=https://192.168.10.1:9090");
			driver = new ChromeDriver(option);
			
		}
		
		else if(p.getProperty(browserkey).equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\hkhan\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
			ProfilesIni p = new ProfilesIni();
			FirefoxProfile profile = p.getProfile("AprilFFProfile");
			
			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);
			/*
			//Setting Firefox binaries path
								
			option.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			*/
			//Handling notifications
			
			profile.setPreference("dom.webnotifications.enabled", false);
			
			/*
			// Certificate error handling
			
			profile.setAcceptUntrustedCertificates(true);
			profile.setAssumeUntrustedCertificateIssuer(false);
			
			// setting up proxy
			
			profile.setPrefnavigateUrlerence("network.proxy.type", 1);
			profile.setPreference("network.proxy.socks", "192.168.10.1");// every thing is given by clint -- example ip address
			profile.setPreference("network.proxy.socks_port", 1744);
			
		*/
			
			
			driver = new FirefoxDriver(option);
		}
		
	}

	public static void navigateUrl(String urlkey) {
		
		//driver.get(url);
		//driver.navigate().to(p.getProperty(urlkey)); // for dataproperties example
		driver.navigate().to(childProp.getProperty(urlkey));
		
	}
}
