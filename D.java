package org.utilityclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D extends Baseclass {
	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		launchurl("https://testngetjp.irctc.co.in/nget/train-search");
		maximizewindow();
		IrctcPojo p = new IrctcPojo();
		p.getAdvbtn().click();
		p.getProceedbtn().click();
	//	p.getAlert().click();
		Thread.sleep(2000);
//		p.getFrombtn1().click();
	//	Thread.sleep(3000);
	//	p.getUsernamelogin().sendKeys("priyaranjan91");
	//	p.getPswdlogin().sendKeys("Priyaranjan@91");
	//	Thread.sleep(10000);
	//	p.getSigninbtn().click();
	//	Thread.sleep(3000);

	//	p.getMenubtn().click();
	p.getFrombtn1().sendKeys("NDLS");
		p.getTobtn().sendKeys("PNBE");
		
	p.getDojbtn().click();
		p.getDatebtn().click();
		p.getClassbtn().click();
		p.getSecondac().click();
	Thread.sleep(2000);
	WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
	searchbtn.click();
	Thread.sleep(5000);
	System.out.println("success");
	//WebDriverWait w=new WebDriverWait(driver,10);
	//w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@type='submit']")))).click();
	//System.out.println("success");

	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", searchbtn);
	//	p.getSearchbtn().click();
		
	//	WebElement signinbtn = driver.findElement(By.xpath("//button[@type='submit']"));

	
//	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//button[@type='submit']")));
	//	Thread.sleep(2000);
		//signinbtn.click();
	//		Thread.sleep(5000);	
	//	p.getUsernamebtn().sendKeys("priyaranjan91");//
	//	p.getCheckbox().click();
	}
}
