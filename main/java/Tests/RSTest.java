package Tests	;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSTest 
{
	@Test
	public void HomePageCheck() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");	
//		caps.setPlatform(Platform.WINDOWS);
//		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		
		
	WebDriver driver=new RemoteWebDriver(new URL("http://192.168.8.97:4444/wd/hub"),caps);
	driver.get("https://rahulshettyacademy.com");
	Thread.sleep(5000);
	System.out.println("RSA title: "+driver.getTitle()); 
	driver.close();
	
// Chanage on 25/02/2025 by shubham 1535 hrs

// change from github repository on 25/02/2025 1545 hrs
	
//again chamge from eclipse 1548 hrs	

//change from Notepad on 27/02/2025 1609 hrs

	
//Changed from github on 29-5-25 1143 hrs
	
//Changed from eclipse on 29-5-25 on 1147 hrs

//again change from github at 1150 hrs
	
	}
}


