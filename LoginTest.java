package dev.felipe.pratice.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {
	private WebDriver driver;	

	@BeforeEach
	void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","drives/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mundoinfantilstore.com.br/login");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}
	@Test
	void test(){
		WebElement emailAddressLocator = driver.findElement(By.id("login_1"));
		emailAddressLocator.sendKeys("06255355888");
		
		WebElement cookiesBtnElement = driver.findElement(By.xpath("/html/body/div[10]/button"));
		cookiesBtnElement.click();
		
		WebElement passwordElement = driver.findElement(By.name("pass"));
		passwordElement.sendKeys("Espiga22");
		
		WebElement submitBtnElement = driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/div[5]/button"));
		submitBtnElement.click();
		
		
	}
	}


