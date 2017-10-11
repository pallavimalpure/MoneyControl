import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample 
{
	public static void main(String[] args) 
	{                                             
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yewal\\Desktop\\Selenium Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.lycaremit.co.uk/en");
		
		driver.findElement(By.linkText("Register")).click();
		
		//Alert alr = driver.switchTo().alert();
		
		//driver.findElement(By.xpath("//a/span[contains(normalize-space(.),'SIGN UP WITH EMAIL')]")).click();
		
		//driver.findElement(By.xpath("//a[text() = 'Lycaremit Send Money Home for Less']")).click();
		//driver.findElement(By.xpath("//a[contains(@text, 'Lycaremit Send Money Home for Less')]")).click();
		//driver.findElement(By.tagName("Lycaremit")).click();
		//driver.findElement(By.xpath(".//div[contains(@text, 'Lycaremit Send Money Home for Less')]/a")).click();
		driver.findElement(By.xpath(".//div[@class = 'logo pull-left']/a")).click();
		                             
		
	}
}
	
