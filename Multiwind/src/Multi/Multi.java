package Multi;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi {
	static WebDriver driver;
	static String ParentWindow;
	int parent;
	public static void face() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='footer-widget-3']/div[4]/div/ul/li[4]/a")).click();

		Set<String> WindowHandles = driver.getWindowHandles();
		  String ParentWindow = (String) WindowHandles.toArray()[0];
		  System.out.println("Parent Window:"+driver.switchTo().window(ParentWindow).getTitle());
		  String ChildWindow = (String) WindowHandles.toArray()[1];
		  System.out.println("Child Window:"+driver.switchTo().window(ChildWindow).getTitle());
		  driver.switchTo().window(ChildWindow);
		  System.out.println("Navigated to Child Window");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(".//*[@id='u_0_39']/div/div[2]/div/div[1]/a")).click();
		  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("mani@gmail.com");
		  Thread.sleep(10000);
		  driver.switchTo().window(ParentWindow);
		  System.out.println("Navigated back to Parent Window");
	}
public static void twit() throws InterruptedException
{
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='footer-widget-3']/div[4]/div/ul/li[2]/a/i")).click();
	Set<String> WindowHandles = driver.getWindowHandles();
	  String ChildWindow1 = (String) WindowHandles.toArray()[2];
	  System.out.println("Parent Window:"+driver.switchTo().window(ChildWindow1).getTitle());
	  driver.switchTo().window(ChildWindow1);
	  System.out.println("Navigated to Child Window1");
}
public static void about() throws InterruptedException
{
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='global-nav-about']/a/span")).click();
	Set<String> WindowHandles = driver.getWindowHandles();
	  String ChildWindow2 = (String) WindowHandles.toArray()[3];
	  System.out.println("Parent Window:"+driver.switchTo().window(ChildWindow2).getTitle());
	  driver.switchTo().window(ChildWindow2);
	  System.out.println("Navigated to Child Window2");
	  Set<String> WindowHandles1= driver.getWindowHandles();
	  String ParentWindow = (String) WindowHandles1.toArray()[0];
	  System.out.println("Parent Window:"+driver.switchTo().window(ParentWindow).getTitle());
	  driver.switchTo().window(ParentWindow);
	  System.out.println("Navigated back to Parent Window");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(".//*[@id='footer-widget-3']/div[4]/div/ul/li[5]/a/i")).click();
	  Set<String> WindowHandles2= driver.getWindowHandles();
	  String ChildWindow3 = (String) WindowHandles2.toArray()[4];
	  System.out.println("Parent Window:"+driver.switchTo().window(ChildWindow3).getTitle());
	  driver.switchTo().window(ChildWindow3);
	  System.out.println("Navigated back to Child Window3");
	  driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div/button")).click();
	  driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div/div/div/div/div[3]/div/form/fieldset[1]/input")).sendKeys("test@gmail.com");
	  Set<String> WindowHandles3= driver.getWindowHandles();
	  String ParentWindow3 = (String) WindowHandles3.toArray()[0];
	  System.out.println("Parent Window:"+driver.switchTo().window(ParentWindow3).getTitle());
	  driver.switchTo().window(ParentWindow3);
	  System.out.println("Navigated back to Parent Window");  
	  
}
	public  static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.clictest.com//");
		face();
		twit();
		about();
		driver.quit();
		// TODO Auto-generated method stub

	}

}
