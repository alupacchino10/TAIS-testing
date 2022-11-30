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

public class UpdateProduct {
	
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
	  public void agregarldefaultink2() {
	    driver.get("https://tais-d3ba8.web.app/user/login");
	    driver.manage().window().setSize(new Dimension(615, 699));
	    driver.findElement(By.cssSelector(".ng-tns-c27-0 > .mat-form-field-infix")).click();
	    driver.findElement(By.id("email")).sendKeys("alvaro@gmail.com");
	    driver.findElement(By.id("password")).click();
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
	    driver.findElement(By.cssSelector(".mat-row:nth-child(7) > .cdk-column-name")).click();
	    driver.findElement(By.cssSelector(".add-btn-container:nth-child(4) > .mat-icon")).click();
	    driver.findElement(By.cssSelector(".ng-tns-c45-13:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("#es > .mat-option-text")).click();
	    driver.findElement(By.cssSelector(".ng-tns-c27-14 > .mat-form-field-infix")).click();
	    driver.findElement(By.id("mat-input-6")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".mat-focus-indicator:nth-child(5)"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.id("mat-input-6")).sendKeys("https://www.burgerking.com.uy/");
	    driver.findElement(By.cssSelector(".cdk-focused")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.cssSelector(".cdk-focused"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    assertThat(driver.findElement(By.cssSelector(".ng-trigger-flyInOut")).getText(), is(" Product updated correctly\\\\nSuccess! "));
	  }
	  
	  @Test
	  public void agregarlink() {
	    driver.get("https://tais-d3ba8.web.app/user/login");
	    driver.manage().window().setSize(new Dimension(615, 699));
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("alvaro@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.cssSelector(".mat-focus-indicator")).click();
	    driver.findElement(By.cssSelector(".mat-row:nth-child(5) > .cdk-column-name")).click();
	    driver.findElement(By.cssSelector(".add-course-btn")).click();
	    driver.findElement(By.cssSelector(".mat-select-arrow")).click();
	    driver.findElement(By.cssSelector("#ingredientsInfo > .mat-option-text")).click();
	    driver.findElement(By.cssSelector(".add-btn-container:nth-child(4) > .mat-icon")).click();
	    driver.findElement(By.cssSelector(".ng-tns-c45-10:nth-child(2)")).click();
	    driver.findElement(By.cssSelector("#es > .mat-option-text")).click();
	    driver.findElement(By.id("mat-input-5")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".mat-focus-indicator:nth-child(5) > .mat-button-wrapper"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.id("mat-input-5")).sendKeys("https://www.conaprole.uy/producto/producto-leche-leche-fresca-entera-pasteurizada/");
	    driver.findElement(By.cssSelector(".cdk-focused > .mat-button-wrapper")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    assertThat(driver.findElement(By.cssSelector(".ng-trigger-flyInOut")).getText(), is(" Product updated correctly\\\\nSuccess! "));
	  }
	  
	  @Test
	  public void cambiarnombre() {
	    driver.get("https://tais-d3ba8.web.app/user/login");
	    driver.manage().window().setSize(new Dimension(615, 699));
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("alvaro@gmail.com");
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
	    {
	      WebElement element = driver.findElement(By.cssSelector(".mat-focus-indicator"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector(".mat-row:nth-child(6) > .cdk-column-name > .global-ellipsis")).click();
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).sendKeys("Portezuelo");
	    driver.findElement(By.cssSelector(".save-btn")).click();
	    assertThat(driver.findElement(By.cssSelector(".ng-trigger-flyInOut")).getText(), is(" Product updated correctly\\\\nSuccess! "));
	  }

}
