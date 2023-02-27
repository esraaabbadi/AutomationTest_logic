package Edge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Lesson12_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\\\webdriver\\\\Edge\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://127.0.0.1:5500/Qa-automation-7thmar/index.html");

		List<WebElement> thestudents = driver.findElements(By.tagName("option"));
		int TotalStudensNum = thestudents.size();

		System.out.println(TotalStudensNum + "  " + "this is the total num of students");
		int NumDelStudent = 2;
		System.out.println(NumDelStudent + "  " + "this is the number num of del students");

		for (int i = 0; i < NumDelStudent; i++) {
			driver.findElement(By.id("remove")).click();
		}
		List<WebElement> thestudentsAfterDel = driver.findElements(By.tagName("option"));
		int actualitem = thestudentsAfterDel.size();
		int expecteditem = TotalStudensNum - NumDelStudent;
		System.out.println(actualitem+"    "+"this is Actual num");
		System.out.println(expecteditem+"    "+"this is Expected num");

		Assert.assertEquals( actualitem,expecteditem );
	}

}
