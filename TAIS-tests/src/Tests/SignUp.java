package Tests;


import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SignUp {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void emailCpassC() {
		driver.get("https://tais-d3ba8.web.app/user/login");
		driver.manage().window().setSize(new Dimension(1275, 695));
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("ffsdafh@gmail.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.cssSelector(".mat-button-wrapper")).click();
	}
	
	@Test
	public void emailCpassI() {
		driver.get("https://tais-d3ba8.web.app/user/login");
		driver.manage().window().setSize(new Dimension(1275, 695));
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("alvaro@ffee.com");
		driver.findElement(By.cssSelector(".ng-tns-c27-3 > .mat-form-field-infix")).click();
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.cssSelector(".mat-focus-indicator")).click();
		assertThat(driver.findElement(By.cssSelector(".ng-trigger-flyInOut")).getText(), is(" Error\\\\nFirebase: Password should be at least 6 characters (auth/weak-password). "));
	}
	
	@Test
	public void emailCpassV() {
		driver.get("https://tais-d3ba8.web.app/user/login");
		driver.manage().window().setSize(new Dimension(1275, 695));
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("dasd@ucu.com");
		driver.findElement(By.id("password")).click();
		{
			WebElement element = driver.findElement(By.cssSelector(".mat-button-wrapper"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		driver.findElement(By.id("password")).sendKeys(" ");
		driver.findElement(By.cssSelector(".mat-button-wrapper")).click();
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
	}
	
	@Test
	public void emailIpassV() {
		driver.get("https://tais-d3ba8.web.app/user/login");
		driver.manage().window().setSize(new Dimension(1275, 695));
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("werwer");
		driver.findElement(By.id("password")).click();
		{
			WebElement element = driver.findElement(By.cssSelector(".mat-button-wrapper"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		driver.findElement(By.id("password")).sendKeys(" ");
		driver.findElement(By.cssSelector(".mat-button-wrapper")).click();
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		{
			WebElement element = driver.findElement(By.cssSelector(".mat-focus-indicator"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
	}
	
	@Test
	public void emailVpass6V() {
		driver.get("https://tais-d3ba8.web.app/user/login");
		driver.manage().window().setSize(new Dimension(1275, 695));
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("dasd@ucu.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("      ");
		driver.findElement(By.cssSelector(".mat-button-wrapper")).click();
		driver.findElement(By.id("email")).sendKeys("dasd@ucu.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("      ");
		driver.findElement(By.cssSelector(".mat-button-wrapper")).click();
		driver.findElement(By.id("email")).click();
	}
	
	@Test
	public void emailVpassV() {
		driver.get("https://tais-d3ba8.web.app/user/login");
		driver.manage().window().setSize(new Dimension(1275, 695));
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys(" ");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys(" ");
		driver.findElement(By.cssSelector(".mat-button-wrapper")).click();
	}

}
