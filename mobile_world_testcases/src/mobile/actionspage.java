package mobile;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actionspage {
	WebDriver driver;
	public actionspage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	//...........................................//
	
	
	
	public void open_mobileworld()
	{
		driver.get("https://mobileworld.banyanpro.com/");
		
	}
	
	@FindBy(css="button.btn.btn-warning.my-2.my-sm-0")
	WebElement signin;
	public void clicksignin()
	{
		signin.click();
	}
		
	
	//..................................//
	@FindBy(id="username")
	WebElement login_username;
	
	@FindBy(id="password")
	WebElement login_password1;
	
	@FindBy(css="a.btn.btn-primary.btn-block")
	WebElement login;
	
	public void login(String name,String pass)
	{
		login_username.sendKeys(name);
		login_password1.sendKeys(pass);
		login.click();
		
	}
	
	
	//..........................................................//
	@FindBy(css="a[href=\"signup.html\"]")
	WebElement signup;
	public void signup()
	{
		signup.click();
	}
	

	@FindBy(id="myName")
	WebElement firstname;
	
	@FindBy(css="input[placeholder=\"Last Name\"]")
	WebElement lastname;
	
	@FindBy(css="input[placeholder=\"Enter Email\"]")
	WebElement email;
	
	@FindBy(css="input[placeholder='Password']")
	WebElement password;
	
	@FindBy(css="input[type=\"date\"]")
	WebElement dateofbirth;
	
	@FindBy(xpath="//div[@class='col-md-2']/input[@name='gender']")
	WebElement genderm;
	
	@FindBy(xpath="//div[@class='col-md-3']/input[@name='gender']")
	WebElement genderf;
	
	@FindBy(css="input[type=\"number\"]")
	WebElement mobilenumber;
	
	@FindBy(css="textarea[placeholder=\"Short Bio\"]")
	WebElement shortbio;
	
	@FindBy(xpath="(//button[normalize-space()='Register'])[1]")
	WebElement reg;
	
	public void register(String sfname,String slname,String semail,String spassword,String sdateofbirth,String smobilenumber,String sshortbio)
	{
		firstname.sendKeys(sfname);
		lastname.sendKeys(slname);
		email.sendKeys(semail);
		password.sendKeys(spassword);
		dateofbirth.sendKeys(sdateofbirth);
		genderf.click();
		mobilenumber.sendKeys(smobilenumber);
		shortbio.sendKeys(sshortbio);
		reg.click();	
	}
	//..................contact us........................//
	
	@FindBy(linkText="Support")
	WebElement  support;
	
	@FindBy(xpath="(//a[@class='dropdown-item'][normalize-space()='Contact Us'])[1]")
	WebElement clickcontactus;
	
	public void clicksupport()
	{
		support.click();
		
	}
	public void contactusclick()
	{
		clickcontactus.click();
		Set<String> windows=driver.getWindowHandles();
		java.util.Iterator<String> it=windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
	}
	
	@FindBy(css="input[placeholder='Username']")
	WebElement contact_username;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement contact_email;
	
	@FindBy(xpath="//input[@placeholder='Phone']")
	WebElement contact_phone;
	
	@FindBy(xpath="//textarea[@placeholder='Message']")
	WebElement contact_message;
	
	@FindBy(xpath="//input[@value='Send']")
	WebElement contact_send;
	
	public void contactus(String cname,String cemail,String cphone,String cmessage ) throws InterruptedException 
	{
		
		contact_username.sendKeys(cname);
		contact_email.sendKeys(cemail);
		contact_phone.sendKeys(cphone);
		contact_message.sendKeys(cmessage);
		contact_send.click();
		
	}

}
