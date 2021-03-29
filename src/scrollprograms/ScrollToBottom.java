package scrollprograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToBottom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Vijaya\\GCATAccount\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}
