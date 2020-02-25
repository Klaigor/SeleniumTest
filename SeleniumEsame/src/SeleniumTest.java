import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static String translate() {
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://context.reverso.net/traduzione/inglese-italiano/");
		driver.findElement(By.xpath("//*[@id=\"entry\"]")).sendKeys("The pizza margherita is awseome");
		driver.findElement(By.xpath("//*[@id=\"search-button\"]")).click();
		WebElement txtBoxContente = driver.findElement(By.xpath("//*[@id=\"mt-box\"]/div[3]/div[2]/span"));
		String traduzione = (txtBoxContente.getText());
		
		driver.close();
		return (traduzione);
	}
}
