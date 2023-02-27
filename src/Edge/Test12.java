package Edge;

import java.io.File;
//import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//HERE WE DO A SCREENSHOT AND SAVE IT AS DESSENDING WAY IN SPICEFIC FILE IN ECLIPCE PROJECT FILE
public class Test12 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "D:\\\\webdriver\\\\Edge\\\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		Date currentDate = new Date();
		String TheAtualDate=currentDate.toString().replace(":", "_");
		TakesScreenshot src =((TakesScreenshot)driver);
		File srcFile =  (File) src.getScreenshotAs(OutputType.FILE);
		File Dest = new File(".\\mypictures/"+TheAtualDate+".png");
		FileUtils.copyFile(srcFile , Dest );
	}

}




