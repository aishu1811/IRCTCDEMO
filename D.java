package org.utilityclass;

import org.openqa.selenium.By;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D extends Baseclass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		launchbrowser();
		launchurl("https://testngetjp.irctc.co.in/nget/train-search");
		maximizewindow();
		IrctcPojo p = new IrctcPojo();
		p.getAdvbtn().click();
		p.getProceedbtn().click();
		// p.getAlert().click();
		Thread.sleep(2000);
		// p.getFrombtn1().click();
		// Thread.sleep(3000);
		// p.getUsernamelogin().sendKeys("priyaranjan91");
		// p.getPswdlogin().sendKeys("Priyaranjan@91");
		// Thread.sleep(50000);
		// p.getSigninbtn().click();

		// *[@id="origin"]/span/input
		// p.getMenubtn().click();
//	p.getFrombtn1().sendKeys("MAYILADUTHURAI J - MV");
//	p.getFrombtn1().sendKeys(Keys.TAB);
//		p.getTobtn().sendKeys("MGR CHENNAI CTL - MAS");
//		p.getTobtn().sendKeys(Keys.ENTER);
		// WebElement frombtn1 =
		// driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
		// frombtn1.click();
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("NDLS");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("PNBE");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys(Keys.TAB);

		p.getDojbtn().click();
		p.getDatebtn().click();
		p.getClassbtn().click();
		p.getSecondac().click();
//	Thread.sleep(2000);
		WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		searchbtn.click();
		Thread.sleep(2000);
		WebElement secondac = driver.findElement(By.xpath(
				"//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[5]/div[1]/table/tr/td[2]/div"));
		secondac.click();
		Thread.sleep(3000);
		WebElement twentynov = driver.findElement(By.xpath(
				"//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[7]/div[1]/div[3]/table/tr/td[2]/div"));
	//	twentynov.click();
	//	JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].click();", twentynov);
	//	WebElement twentynov = driver.findElement(By.xpath(
	//			"/html/body/app-root/app-home/div/div[3]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[7]/div[1]/div[3]/table/tr/td[2]/div"));
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
	//	wait.until(ExpectedConditions.elementToBeSelected(twentynov));
		twentynov.click();
		WebElement booknowbtn = driver.findElement(By.xpath(
				"//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[2]/div/span/span[1]/button"));
		booknowbtn.click();
		driver.findElement(
				By.xpath("//*[@id=\"divMain\"]/div/app-train-list/p-confirmdialog[1]/div/div/div[3]/button[1]/span[2]"))
				.click();
		p.getUsernamelogin().sendKeys("aishv1811");
		p.getPswdlogin().sendKeys("Naaa@2021");
		Thread.sleep(10000);
		p.getSigninbtn().click();
	}
}
