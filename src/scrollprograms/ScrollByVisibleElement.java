package scrollprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByVisibleElement {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Vijaya\\GCATAccount\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		WebElement ele = driver.findElement(By.linkText("Linux"));
		
		js.executeScript("arguments[0].scrollIntoView();",ele);

	}

}
