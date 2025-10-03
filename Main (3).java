
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CpatureAllTheLink {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://ksrtc.com");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++) {
			System.out.println( links.get(i).getText());
		}
		driver.quit();
	}
}
