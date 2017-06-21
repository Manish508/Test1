package Multi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class cbcp
{
	@Test
	public void cross() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://testing.clictest.com/Login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='username-inputEl']")).sendKeys("manish.b@infotreesolutions.com");
		driver.findElement(By.xpath(".//*[@id='textfield-1015-inputEl']")).sendKeys("12345");
		driver.findElement(By.id("button-1017-btnEl")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ext-gen2036']/div/img[3]")).click();
		driver.findElement(By.xpath(".//*[@id='ext-gen2113']/div/img[2]")).click();
		driver.findElement(By.xpath(".//*[@id='ext-gen2213']/div/img[3]")).click();
		driver.findElement(By.xpath(".//*[@id='ext-gen2262']/div/img[3]")).click();
		driver.findElement(By.xpath(".//*[@id='ext-gen2274']/div/span")).click();
		driver.findElement(By.xpath(".//*[@id='app-url-new-btnIconEl']")).click();
		driver.findElement(By.xpath(".//*[@id='cbscenarioname-id-inputEl']")).sendKeys("sc5081");
		driver.findElement(By.xpath(".//*[@id='cburl-id-inputEl']")).sendKeys("https://www.flipkart.com/");
		Thread.sleep(5000);
		// TODO Auto-generated method stub

	}

}
