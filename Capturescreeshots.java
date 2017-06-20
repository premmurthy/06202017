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



public class Capturescreeshots extends Capturescreeshotsfull{
	
	//WebDriver driver;
	
//public static long number1 = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 

//public static String strLong;
	
 // public static long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
  
	 public static String capture(WebDriver driver,String screenShotName) throws IOException
	 
	 
	    {
		 
	long number1 = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
         
	        strLong = Long.toString(number1);
	        screenShotName=strLong;
	        
	       TakesScreenshot ts = (TakesScreenshot)driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        String dest = System.getProperty("user.dir") +"\\Screenshots\\"+screenShotName+".png";
	        File destination = new File(dest);
	        FileUtils.copyFile(source, destination);     
	        
	        //long number1 = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
	                  
	      //  strLong = Long.toString(number1);
	        
	        //System.out.println(strLong);
	        
	        
	       // dest=strLong;
	     // strLong=dest;
	        
	      //  System.out.println(dest);
	        //strLong=dest;
	       
	        return dest;
	        
	    }
	 
	 
	/* public static String screen(WebDriver driver,String screenshotout) throws IOException{
		 
		 Screenshot screenshot = new AShot().shootingStrategy(new ViewportPastingStrategy(1000)).takeScreenshot(driver);
		 ImageIO.write(screenshot.getImage(), "PNG", new File(("user.dir")+"\\Screenshots\\"+screenshotout+".png"));
		return screenshotout;
		
		
		 
		 
	 }*/
	 
	 
	 
	 
	 
}
	        
	       
	     /********************************************
	      * 
	      *    
	      *    
	      */
		 
		/* long number1 = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
		 
		 strLong = Long.toString(number1);
	        screenShotName=strLong;
	        
	      //take the screenshot of the entire home page and save it to a png file
	        Screenshot screenshot = new AShot().shootingStrategy(new ViewportPastingStrategy(1000)).takeScreenshot(driver);
	        
	        File source = screenshot.getImage().
	        String dest=ImageIO.write(screenshot.getImage(), "PNG", new File("./reports/images/"+screenShotName+".jpg"));
			
			// new File("./reports/images/"+number+".jpg"));
*/			
			
			
			
			
	       /* String dest = System.getProperty("user.dir") +"\\Screenshots\\"+screenShotName+".png";
	        File destination = new File(dest);
	        FileUtils.copyFile(source, destination);*/
	        
	        
	        
	       
	        
	   


	/* public long takeSnap5(WebDriver driver,String screenShotName){
			long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
			
				
				FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE) , new File("./reports/images/"+number+".jpg"));
			
			return number;
		}
*/










