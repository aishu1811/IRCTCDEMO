package org.utilityclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IrctcPojo extends Baseclass{
public IrctcPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="userName")
private WebElement username;
public WebElement getUsername() {
	return username;
}
public WebElement getPswd() {
	return pswd;
}
public WebElement getCnfpswd() {
	return cnfpswd;
}
public WebElement getLang() {
	return lang;
}
public WebElement getSecq() {
	return secq;
}
public WebElement getSecans() {
	return secans;
}
public WebElement getAdvbtn() {
	return advbtn;
}
public WebElement getProceedbtn() {
	return proceedbtn;
}
public WebElement getAlert() {
	return alert;
}
public WebElement getFrombtn() {
	return Frombtn;
}
public WebElement getFrombtn1() {
	return Frombtn1;
}
public WebElement getUsernamebtn() {
	return usernamebtn;
}
public WebElement getMenubtn() {
	return menubtn;
}
public WebElement getCheckbox() {
	return checkbox;
}
public WebElement getTobtn() {
	return Tobtn;
}
public WebElement getDojbtn() {
	return dojbtn;
}
public WebElement getDatebtn() {
	return datebtn;
}
public WebElement getClassbtn() {
	return classbtn;
}
public WebElement getSecondac() {
	return secondac;
}
public WebElement getSearchbtn() {
	return searchbtn;
}
public WebElement getSigninbtn() {
	return signinbtn;
}
public WebElement getUsernamelogin() {
	return usernamelogin;
}
public WebElement getPswdlogin() {
	return pswdlogin;
}


@FindBy(id="password")
private WebElement pswd;
@FindBy(id="cnfUsrPwd")
private WebElement cnfpswd ;
@FindBy(xpath="//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div")
private WebElement lang;
@FindBy(xpath="//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div")
private WebElement secq;
@FindBy(xpath="//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input")
private WebElement secans;
@FindBy(id="details-button")
private WebElement advbtn;
@FindBy(id="proceed-link")
private WebElement proceedbtn;
@FindBy(xpath="/html/body/app-root/app-home/div/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")
private WebElement alert;
@FindBy(xpath="//*[@id=\"origin\"]/span/input")
private WebElement Frombtn;
@FindBy(xpath="//*[@id=\"origin\"]/span/input")
private WebElement Frombtn1;
@FindBy(name="userid")
private WebElement usernamebtn;
@FindBy(xpath="/html/body/app-root/app-home/div/div[1]/app-header/div[1]/div[2]/a/i")
private WebElement menubtn;
@FindBy(xpath="//*[@id=\"login_header_disable\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/div[5]/div/label")
private WebElement checkbox;
@FindBy(xpath="//*[@id=\"destination\"]/span/input")
private WebElement Tobtn;
@FindBy(xpath="//*[@id=\"jDate\"]/span/input")
private WebElement dojbtn;
@FindBy(xpath="//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[4]/td[1]/a")
private WebElement datebtn;
@FindBy(xpath="//*[@id=\"journeyClass\"]/div")
private WebElement classbtn;
@FindBy(xpath="//*[@id=\"journeyClass\"]/div/div[4]/div/ul/p-dropdownitem[6]/li/span")
private WebElement secondac;
@FindBy(xpath="//button[@type='submit']")
private WebElement searchbtn;
@FindBy(xpath="//input[@formcontrolname='userid']")
private WebElement usernamelogin;

@FindBy(xpath="//input[@formcontrolname='password']")
private WebElement pswdlogin;

@FindBy(xpath="//*[@id=\"login_header_disable\"]/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/form/span/button")
private WebElement signinbtn;

}




