package test_case;
import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.Module1;
import test_base.BaseClass;
 
public class TC001 extends BaseClass {
	
	@Test(priority=1)
	public void search_webDevelopment() {
		Module1 m1=new Module1(driver);
		m1.clicksearch();
		logger.info("**** Search button is clicked and Web Development is Searched ****");
	}
	
	@Test(priority=2)
	public void select_english_and_beginner() {
		Module1 m1=new Module1(driver);
		m1.clickEng();
		logger.info("**** English Checkbox is Selected ****");
		m1.clickBeg();
		logger.info("**** Beginner Checkbox is Selected ****");
	}
	
	 @Test(priority=3)
	 public void get_course1_details() throws IOException {
		 Module1 m1=new Module1(driver);
		 m1.clickCourse1();
		 logger.info("**** 1st Course Card is Clicked ****");
		 m1.getCourse1();
		 logger.info("**** Title, Rating and Duration of 1st Course is Printed ****");
	 }
		
	 @Test(priority=4)
	 public void get_course2_details() throws IOException {
		 Module1 m1=new Module1(driver);
		 m1.clickCourse2();
		 logger.info("**** 2nd Course Card is Clicked ****");
		 m1.getCourse2();
		 logger.info("**** Title, Rating and Duration of 2nd Course is Printed ****");
	 }
	

}