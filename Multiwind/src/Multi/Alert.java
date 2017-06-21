package Multi;

//import java.awt.SplashScreen;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class Alert {
	static WebDriver driver;

	public  static void main(String[] args) throws InterruptedException, Throwable {
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.onlinesbi.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='banking']/div[2]/div/a")).click();
		Screen sc=new Screen();
		Pattern pt=new Pattern("C:\\Users\\manish.bontagarla\\Desktop\\ok.PNG");
		sc.click(pt);
		
		

		// TODO Auto-generated method stub

	}

}
