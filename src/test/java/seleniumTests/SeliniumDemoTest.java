package seleniumTests;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumDemoTest {
	public static void main(String args[])
    {
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\goura\\eclipse-workspace2\\MavenSele\\Driver\\chromedriver.exe");
  
        ChromeDriver driver = new ChromeDriver();
  
        // Maximize the browser
        // using maximize() method
        driver.manage().window().maximize();
  
        // Launching website
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("pics");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        try {
			Thread.sleep(5000);
			driver.close();
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
