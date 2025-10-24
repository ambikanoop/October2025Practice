package TestingPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
By searchBox=By.name("q");

WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
WebElement search=wait.until(ExpectedConditions.presenceOfElementLocated(searchBox));
search.sendKeys("Selenium");
	}


}