package ProjectOne.Lead;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.screentaker.ViewportPastingStrategy;



public class Capturescreeshotsfull {
	
	
	public static String strLong;
	 
	 public static String capture(WebDriver driver,String screenshotout) throws IOException{
		 
		 long number1 = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
         
	        strLong = Long.toString(number1);
	        screenshotout=strLong;
	        
	      //  Screenshot screenshot = new AShot().screenTaker(taker);
		 
		 /*Screenshot screenshot = new AShot().shootingStrategy(new ViewportPastingStrategy(1000)).takeScreenshot(driver);
		 ImageIO.write(screenshot.getImage(), "PNG", new File("C://Users//Temp//workspace//Lead//snaps"+screenshotout+".png"));
		//return screenshotout;
*/		  		 
		 
		 Screenshot screenshot = new AShot().shootingStrategy(new ViewportPastingStrategy(1000)).takeScreenshot(driver);
	        String dest = System.getProperty("user.dir") + "//Screenshots//" + screenshotout + ".png";
	        ImageIO.write(screenshot.getImage(),"PNG",new File(dest));
	        return dest;
		 
		 
		 
	 }
	  
	 
}
	        
	       
	    





