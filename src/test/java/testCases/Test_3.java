package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseClass;

public class Test_3 extends BaseClass{
	
	@Test 
	public static void google() {
		
		String ExpTitle = dv.getTitle();
		String ActualTitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		
//		if(ExpTitle.equalsIgnoreCase(ActualTitle)) {
//			System.out.println("QA Automation Tools Trainings and Tutorials | QA Tech Hub");
//		}
//		else {
//			System.out.println("Title Not Matched");
//		}
		
		Assert.assertEquals(ExpTitle, ActualTitle,"Pass");
		
		
	}

}
