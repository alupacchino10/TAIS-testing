package Tests;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateProduct {
	
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
	  public void correcto() {
	    driver.get("https://tais-d3ba8.web.app/user/login");
	    driver.manage().window().setSize(new Dimension(615, 696));
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("alvaro@gmail.com");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.cssSelector(".mat-focus-indicator")).click();
	    driver.findElement(By.cssSelector(".mat-button-wrapper")).click();
	    driver.findElement(By.id("gtin")).click();
	    driver.findElement(By.id("gtin")).sendKeys("12345678");
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).sendKeys("McDonald\'s");
	    driver.findElement(By.cssSelector(".mat-select-placeholder")).click();
	    {
	      WebElement element = driver.findElement(By.id("linkType-panel"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("linkType-panel"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("linkType-panel"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.cssSelector("#defaultLink > .mat-option-text")).click();
	    driver.findElement(By.cssSelector(".add-btn-container:nth-child(3) > .mat-icon")).click();
	    driver.findElement(By.cssSelector(".ng-tns-c27-9 > .mat-form-field-infix")).click();
	    {
	      WebElement element = driver.findElement(By.id("mat-select-2-panel"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("mat-select-2-panel"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.id("mat-select-2-panel"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.cssSelector("#es > .mat-option-text")).click();
	    driver.findElement(By.id("mat-input-5")).click();
	    driver.findElement(By.id("mat-input-5")).sendKeys("https://www.mcdonalds.com");
	    driver.findElement(By.cssSelector(".save-btn")).click();
	    assertThat(driver.findElement(By.cssSelector(".ng-trigger-flyInOut")).getText(), is(" Product added correctly\\\\nSuccess! "));
	  }
	  
	  @Test
	  public void gtiniguales() {
	    driver.get("https://tais-d3ba8.web.app/user/login");
	    driver.manage().window().setSize(new Dimension(615, 697));
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("alvaro@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.cssSelector(".mat-focus-indicator")).click();
	    driver.findElement(By.cssSelector(".mat-button-wrapper")).click();
	    driver.findElement(By.id("gtin")).click();
	    driver.findElement(By.id("gtin")).sendKeys("1234");
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).sendKeys("Pepsi");
	    driver.findElement(By.cssSelector(".mat-select-placeholder")).click();
	    driver.findElement(By.cssSelector("#defaultLink > .mat-option-text")).click();
	    driver.findElement(By.cssSelector(".add-btn-container:nth-child(3) > .mat-icon")).click();
	    driver.findElement(By.cssSelector(".ng-tns-c45-10:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("#en > .mat-option-text")).click();
	    driver.findElement(By.id("mat-input-5")).click();
	    driver.findElement(By.id("mat-input-5")).sendKeys("https://www.pepsi.com/");
	    driver.findElement(By.cssSelector(".mat-button-wrapper")).click();
	    assertThat(driver.findElement(By.cssSelector(".ng-trigger-flyInOut")).getText(), is(" Product added correctly\\\\nSuccess! "));
	  }
	  
	  @Test
	  public void multiURL() {
	    driver.get("https://tais-d3ba8.web.app/user/login");
	    driver.manage().window().setSize(new Dimension(615, 697));
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("alvaro@gmail.com");
	    {
	      WebElement element = driver.findElement(By.cssSelector(".mat-focus-indicator"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.cssSelector(".mat-focus-indicator")).click();
	    driver.findElement(By.cssSelector(".mat-button-wrapper")).click();
	    driver.findElement(By.id("gtin")).click();
	    driver.findElement(By.id("gtin")).sendKeys("11111111");
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).sendKeys("Amazon");
	    driver.findElement(By.cssSelector(".mat-select-placeholder")).click();
	    driver.findElement(By.cssSelector("#defaultLink > .mat-option-text")).click();
	    driver.findElement(By.cssSelector(".add-btn-container:nth-child(3) > .mat-icon")).click();
	    driver.findElement(By.id("mat-select-value-3")).click();
	    driver.findElement(By.cssSelector("#en > .mat-option-text")).click();
	    driver.findElement(By.id("mat-input-5")).click();
	    driver.findElement(By.id("mat-input-5")).sendKeys("https://www.amazon.com");
	    driver.findElement(By.cssSelector(".add-btn-container:nth-child(2) > .mat-icon")).click();
	    driver.findElement(By.cssSelector(".mat-select-placeholder")).click();
	    driver.findElement(By.cssSelector("#allergenInfo > .mat-option-text")).click();
	    driver.findElement(By.cssSelector(".lesson-form-row:nth-child(5) .add-btn-container > .mat-icon")).click();
	    driver.findElement(By.cssSelector(".ng-tns-c27-14 > .mat-form-field-infix")).click();
	    driver.findElement(By.cssSelector("#en > .mat-option-text")).click();
	    driver.findElement(By.id("mat-input-6")).click();
	    driver.findElement(By.id("mat-input-6")).sendKeys("https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc");
	    driver.findElement(By.cssSelector(".save-btn")).click();
	  }
	  
	  @Test
	  public void sinUrl() {
	    driver.get("https://tais-d3ba8.web.app/user/login");
	    driver.manage().window().setSize(new Dimension(1275, 695));
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("alvarolupa10@gmail.com");
	    {
	      WebElement element = driver.findElement(By.cssSelector(".mat-focus-indicator"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.cssSelector(".mat-focus-indicator")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    driver.findElement(By.id("add-household-button")).click();
	    driver.findElement(By.id("gtin")).click();
	    driver.findElement(By.id("gtin")).sendKeys("5346");
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).sendKeys("Portezuelo");
	    driver.findElement(By.cssSelector(".mat-select-placeholder")).click();
	    driver.findElement(By.cssSelector("#defaultLink > .mat-option-text")).click();
	    driver.findElement(By.cssSelector(".lesson-form-row")).click();
	    driver.findElement(By.cssSelector(".save-btn")).click();
	    assertThat(driver.findElement(By.cssSelector(".ng-trigger-flyInOut")).getText(), is(" Product added correctly\\\\nSuccess! "));
	  }

}
