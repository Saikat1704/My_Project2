package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseTest.BaseClass;

public class Test_2 extends BaseClass{
	
	@Test
	public static void RForm() throws InterruptedException {
		
		dv.findElement(By.xpath("//*[@name='firstname'] ")).sendKeys("Saikat");
		dv.findElement(By.xpath("//*[@name='lastname'] ")).sendKeys("Sil");
		JavascriptExecutor js = (JavascriptExecutor)dv;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		dv.findElement(By.xpath("//*[@id='sex-0'] ")).click();
		dv.findElement(By.xpath("//*[@id='exp-3']")).click();
		Thread.sleep(2000);
		dv.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("14/06/2023");
		js.executeScript("window.scrollBy(0,350)", "");
		dv.findElement(By.xpath("//*[@id='profession-0']")).click();
		dv.findElement(By.xpath("//*[@id='profession-1']")).click();
		dv.findElement(By.xpath("//*[@id='tool-2']")).click();
		Thread.sleep(5000);
		Select Continents = new Select(dv.findElement(By.xpath("//*[@id='continents']")));
		Continents.selectByVisibleText("Europe");
		Thread.sleep(2000);
		Select Commands = new Select(dv.findElement(By.xpath("//*[@id='selenium_commands']")));
		Commands.selectByVisibleText("WebElement Commands");
		Thread.sleep(2000);
		WebElement Upload = dv.findElement(By.xpath("//*[@id='photo']"));
		Upload.sendKeys("C:\\Users\\saika\\Downloads\\download.jpg");
		Thread.sleep(2000);
		dv.findElement(By.xpath("//*[@Class='control-group']/a")).click();
		Thread.sleep(2000);
		dv.switchTo().alert().accept();
		System.out.println(dv.getTitle());
		
		
		
	}
	
   

}
