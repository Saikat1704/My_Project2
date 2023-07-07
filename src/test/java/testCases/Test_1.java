package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseTest.BaseClass;


public class Test_1 extends BaseClass{
	 
  @Test
  public static void Test1() throws InterruptedException {
	  
	  // URL : https://qavbox.github.io/demo/signup/
	  
	  dv.findElement(By.xpath("//*[@id='username']")).sendKeys("Saikat");
	  dv.findElement(By.xpath("//*[@id='email']")).sendKeys("s@g.com");
	  //Thread.sleep(5000);
	  JavascriptExecutor js = (JavascriptExecutor) dv;
	  js.executeScript("window.scrollBy(0,350)", "");	  
	  dv.findElement(By.xpath("//*[@id='tel']")).sendKeys("1234567890");
	  //Thread.sleep(5000);
	  js.executeScript("window.scrollBy(0,350)", "");
	  WebElement Upload = dv.findElement(By.xpath("//*[@name='datafile'] "));
	  Upload.sendKeys("C:\\Users\\saika\\Downloads\\download.jpg");
	  Thread.sleep(2000);
	  Select gender = new Select(dv.findElement(By.xpath("//*[@name='sgender'] ")));
	  gender.selectByVisibleText("Male");
	  //Thread.sleep(5000);
	  WebElement Radio = dv.findElement(By.xpath("//*[@value='one']"));
	  Radio.click();
	  //Thread.sleep(5000);
	  dv.findElement(By.xpath("//*[@value='manualtesting']")).click();
	  dv.findElement(By.xpath("//*[@value='automationtesting']")).click();
	  dv.findElement(By.xpath("//*[@value='testng']")).click();
	  js.executeScript("window.scrollBy(0,350)", "");
	  Thread.sleep(2000);
	  dv.findElement(By.xpath("//*[@value='selenium']")).click();
	  //Thread.sleep(5000);
	  dv.findElement(By.xpath("//*[@id='submit']")).click();
	  Thread.sleep(2000);
	  dv.switchTo().alert().accept();
	  
	  System.out.println(dv.getTitle()+" Submitted successfull" );
	  
	  
	    
  }
  

}
