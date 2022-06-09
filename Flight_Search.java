package Selenium_Practice_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flight_Search {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja\\Selenium\\Software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
		
//		WebElement selectLanguage = driver.findElement(By.xpath("//span[text()='English']"));
//		Select languageDropDown = new Select(selectLanguage);
//		languageDropDown.selectByVisibleText("English");
		
		WebElement full_name = driver.findElement(By.id("name"));
		full_name.sendKeys("Shweta");
		
		WebElement org_name = driver.findElement(By.id("orgName"));
		org_name.sendKeys("Technolite Software Solutions");
		
		WebElement email = driver.findElement(By.id("singUpEmail"));
		email.sendKeys("shwetapaatil02@gmail.com");
		
		WebElement terms = driver.findElement(By.xpath("//span[@class=\"black-color ng-binding\"]"));
		terms.click();
		
		WebElement getStarted = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		getStarted.click();

		Thread.sleep(4000);
		driver.close();
	}

}
