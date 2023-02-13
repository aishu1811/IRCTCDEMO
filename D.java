package org.utilityclass;

import org.openqa.selenium.By;
import java.awt.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class D extends Baseclass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		launchbrowser();
		launchurl("https://testngetjp.irctc.co.in/nget/train-search");
		maximizewindow();

		IrctcPojo p = new IrctcPojo();
		p.getAdvbtn().click();
		p.getProceedbtn().click();
		// p.getAlert().click();
    //    Thread.sleep(5000);
	//	 p.getFrombtn1().click();
		 
		 
		
	 try {
            p.getUsernamelogin().sendKeys("priyaranjan91");
			Thread.sleep(1000);
			p.getPswdlogin().sendKeys("Priyaranjan@91");
			Thread.sleep(15000);
			p.getSigninbtn().click();
		Thread.sleep(2000);
	 }
	 catch(Exception var){
		 
		 System.out.println("Exception: "+ var);
	 }
	 finally {
				    driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("NEW DELHI - NDLS");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys(Keys.TAB);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("PATNA JN - PNBE");
					Thread.sleep(1000);

					driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys(Keys.TAB);

					p.getDojbtn().click();
					driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[5]/td[4]/a")).click();
					Thread.sleep(2000);
					p.getClassbtn().click();
					p.getSecondac().click();
				       Thread.sleep(2000);
					WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
					searchbtn.click();
					Thread.sleep(2000);
					WebElement secondac = driver.findElement(By.xpath(
							"//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[5]/div[1]/table/tr/td[2]/div"));
					secondac.click();
					Thread.sleep(3000);
					WebElement twentynov = driver.findElement(By.xpath(
							"//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[7]/div[1]/div[3]/table/tr/td[2]/div"));
				
					twentynov.click();
					WebElement booknowbtn = driver.findElement(By.xpath(
							"//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[2]/div/span/span[1]/button"));
					booknowbtn.click();
					driver.findElement(
							By.xpath("//*[@id=\"divMain\"]/div/app-train-list/p-confirmdialog[1]/div/div/div[3]/button[1]/span[2]"))
							.click();
					try {
					p.getUsernamelogin().sendKeys("priyaranjan91");
					Thread.sleep(1000);
					p.getPswdlogin().sendKeys("Priyaranjan@91");
					Thread.sleep(15000);
					p.getSigninbtn().click();
					}
					catch(Exception B) {
						System.out.println("Exception: "+ B);
					}
					finally {
						
					Thread.sleep(5000);
					
					JavascriptExecutor js=(JavascriptExecutor)driver;

					js.executeScript("window.scroll(0,450)");
					Thread.sleep(2000);
					WebElement psngrname = driver.findElement(By.xpath("//*[@id=\"ui-panel-12-content\"]/div/div[1]/div[2]/div/app-passenger/div/div[1]/span/div[1]/p-autocomplete/span/input"));
					psngrname.sendKeys("priya");
					driver.findElement(By.xpath("//*[@id=\"ui-panel-12-content\"]/div/div[1]/div[2]/div/app-passenger/div/div[1]/span/div[2]/input")).sendKeys("31");
					WebElement gender = driver.findElement(By.xpath("//*[@id=\"ui-panel-12-content\"]/div/div[1]/div[2]/div/app-passenger/div/div[1]/span/div[3]/select"));
					Select a=new Select(gender);
					a.selectByIndex(1);
					Thread.sleep(1000);
					WebElement preference=driver.findElement(By.xpath("//*[@id=\"ui-panel-12-content\"]/div/div[1]/div[2]/div/app-passenger/div/div[1]/div[1]/select"));
					preference.click();
					Select s=new Select(preference);
					s.selectByIndex(1);
					Thread.sleep(1000);
					WebElement food = driver.findElement(By.xpath("//*[@id=\"ui-panel-12-content\"]/div/div[1]/div[2]/div/app-passenger/div/div[1]/div[2]/select"));
					Select s2=new Select(food);
					s2.selectByIndex(2);
					Thread.sleep(3000);
					JavascriptExecutor js1=(JavascriptExecutor)driver;
					js1.executeScript("window.scroll(0,1500)");
					driver.findElement(By.xpath("//*[@id=\"psgn-form\"]/form/div/div[1]/div[14]/div/button[2]")).click();
					JavascriptExecutor js2=(JavascriptExecutor)driver;
					Thread.sleep(2000);
					js2.executeScript("window.scroll(0,600)");

					Thread.sleep(15000);
					driver.findElement(By.xpath("//*[@id=\"review\"]/div[1]/form/div[3]/div/button[2]")).click();
					Thread.sleep(3000);
					try {
					driver.findElement(By.xpath("//*[@id=\"bank-type\"]/div/table/tr/span/td/div/div")).click();
					}
					catch(Exception click) {
						System.out.println("Exception: "+ click);
					}
					finally {
					 Thread.sleep(2000);
					JavascriptExecutor js3=(JavascriptExecutor)driver;
					js3.executeScript("window.scroll(0,500)");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"psgn-form\"]/div[1]/div[1]/app-payment/div[2]/button[2]")).click();
										
	 }   
	}
		
	}
		
}
 }
	

