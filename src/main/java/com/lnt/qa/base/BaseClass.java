package com.lnt.qa.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	
	public static WebDriver driver;

	public static Properties prop;
	
	//public static EventFiringWebDriver e_driver;
	//public static WebEventListener eventListener;

	public BaseClass() {
		try {
			prop = new Properties();

			//File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\config\\Config.properties");
			File file = new File("C:\\Users\\suresh\\workspace\\Framewor\\src\\main\\java\\com\\lnt\\qa\\config\\Properties");
			FileInputStream fileInput = new FileInputStream(file);
			prop.load(fileInput);
			
			

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}
		public static void initialize() {
			// String browserName = prop.getProperty("browser");
			// String url = prop.getProperty("url");
			//String currentDir = System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\";
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(prop.getProperty("url"));
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			} 
		} 

}



