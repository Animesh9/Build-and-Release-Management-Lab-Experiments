import org.openqa.selenium.By;  
import org.openqa.selenium.*;  
import org.openqa.selenium.chrome.ChromeDriver;  
	  
public class First 
{  
	public static void main(String[] args) 
	{  
        
		// declaration and instantiation of objects/variables  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  
		// Launch website  
		driver.navigate().to("http://www.google.com/");  
	          
		// Click on the search text box and send value  
		driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");  
          
		// Click on the search button  
		driver.findElement(By.name("btnK")).submit();    
    }  
	  
}  