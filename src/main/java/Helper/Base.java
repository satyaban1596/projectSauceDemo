package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	
static {
		
		try {
			FileInputStream file = new FileInputStream
					(System.getProperty("user.dir")+"/src/test/java/Properties/env.properties");					
			prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
@Before
	public void setup() {
		String value = prop.getProperty("browser");
		
		if (value.equals("chrome")) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins-*");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		} else if (value.equals("edge")) {
			EdgeOptions options=new EdgeOptions();
			options.addArguments("--remote-allow-origins-*");
			options.addArguments("--incognito");
			driver = new EdgeDriver(options);

		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

@After
	public void Screenshot(Scenario s) throws IOException {
		if(s.isFailed()) {
		TakesScreenshot shot=(TakesScreenshot)driver;
	File src=shot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File ("Screenshots/"+s.getName()+".png"));
			
	}
		driver.quit();
	}
	
	public WebElement explicitywait(By by) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	
	public void Dropdown(By ele,int value) {
		Select s= new Select(driver.findElement(ele));
		s.selectByIndex(value);
	}
	
	
	
	
}
