package mobile;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class mainpage extends reusepage {
	
		@Test(dataProvider="login_data_username")
		public void login_username(String username,String password)
		{

			actionspage.clicksignin();
			actionspage.login(username, password);
			driver.close();	
		}
		
		@Test(dataProvider="login_data_password")
		public void login_password(String username,String password)
		{
			actionspage.clicksignin();
			actionspage.login(username, password);
			driver.close();
		}
		@Test(dataProvider="login_data_ntegration")
		public void loginintegration(String username,String password)
		{
			actionspage.clicksignin();
			actionspage.login(username, password);
			driver.close();
			
		}
		
		
		
		@Test(dataProvider="sign_up_data_firstname")
		public void sign_up_firstname(String firstname,String lastname,String email,String password,String dateofbirth,String mobilenumber,String bio)
		{
			actionspage.clicksignin();
			actionspage.signup();
			actionspage.register(firstname,lastname,email,password,dateofbirth,mobilenumber,bio);
			driver.switchTo().alert().accept();
			driver.close();
			
		}
		
		@Test(dataProvider="sign_up_data_lastname")
		public void sign_up_lastname(String firstname,String lastname,String email,String password,String dateofbirth,String mobilenumber,String bio)
		{
			actionspage.clicksignin();
			actionspage.signup();
			actionspage.register(firstname,lastname,email,password,dateofbirth,mobilenumber,bio);
			driver.switchTo().alert().accept();
			driver.close();
			
		}
		
		@Test(dataProvider="sign_up_data_email")
		public void sign_up_email(String firstname,String lastname,String email,String password,String dateofbirth,String mobilenumber,String bio)
		{
			actionspage.clicksignin();
			actionspage.signup();
			actionspage.register(firstname,lastname,email,password,dateofbirth,mobilenumber,bio);
			driver.switchTo().alert().accept();
			driver.close();
			
		}
		
		@Test(dataProvider="sign_up_data_password")
		public void sign_up_password(String firstname,String lastname,String email,String password,String dateofbirth,String mobilenumber,String bio)
		{
			actionspage.clicksignin();
			actionspage.signup();
			actionspage.register(firstname,lastname,email,password,dateofbirth,mobilenumber,bio);
			driver.switchTo().alert().accept();
			driver.close();
			
		}
		
		@Test(dataProvider="sign_up_data_mobilenumber")
		public void sign_up_mobilenumber(String firstname,String lastname,String email,String password,String dateofbirth,String mobilenumber,String bio)
		{
			actionspage.clicksignin();
			actionspage.signup();
			actionspage.register(firstname,lastname,email,password,dateofbirth,mobilenumber,bio);
			driver.switchTo().alert().accept();
			driver.close();
			
		}
		
		@Test(dataProvider="sign_up_data_bio")
		public void sign_up_bio(String firstname,String lastname,String email,String password,String dateofbirth,String mobilenumber,String bio)
		{
			actionspage.clicksignin();
			actionspage.signup();
			actionspage.register(firstname,lastname,email,password,dateofbirth,mobilenumber,bio);
			driver.switchTo().alert().accept();
			driver.close();
			
		}
		
		@Test(dataProvider="sign_up_data_integration")
		public void sign_up_integration(String firstname,String lastname,String email,String password,String dateofbirth,String mobilenumber,String bio)
		{
			actionspage.clicksignin();
			actionspage.signup();
			actionspage.register(firstname,lastname,email,password,dateofbirth,mobilenumber,bio);
			driver.switchTo().alert().accept();
			driver.close();
			
		}
		
	
	
		@Test(dataProvider="contact_us_data_username",dependsOnMethods= {"sign_up_integration"})
		public void contact_us_username(String username,String email,String mobilenumber,String message) throws InterruptedException
		{
			actionspage.clicksupport();
			actionspage.contactus(username,email,mobilenumber,message);
			driver.close();
	
		}
		
		@Test(dataProvider="contact_us_data_email",dependsOnMethods= {"sign_up_integration"})
		public void contact_us_email(String username,String email,String mobilenumber,String message) throws InterruptedException
		{
			actionspage.clicksupport();
			actionspage.contactusclick();
			actionspage.contactus(username,email,mobilenumber,message);
			driver.close();
	
		}
		
		@Test(dataProvider="contact_us_data_phonenumber",dependsOnMethods= {"sign_up_integration"})
		public void contact_us_phonenumber(String username,String email,String mobilenumber,String message) throws InterruptedException
		{
			actionspage.clicksupport();
			actionspage.contactus(username,email,mobilenumber,message);
			driver.close();
			
		}
			
		@Test(dataProvider="contact_us_data_message",dependsOnMethods= {"sign_up_integration"})
		public void contact_us_message(String username,String email,String mobilenumber,String message) throws InterruptedException
		{
			actionspage.clicksupport();
			actionspage.contactus(username,email,mobilenumber,message);
			driver.close();
		
		}
			
		@Test(dataProvider="contact_us_data_integration",dependsOnMethods= {"sign_up_integration"})
		public void contact_us_integration(String username,String email,String mobilenumber,String message) throws InterruptedException
		{
			actionspage.clicksupport();
			actionspage.contactus(username,email,mobilenumber,message);
			driver.close();
		}
		
		
		
		
		
		
		//.....................................................
		@DataProvider
		public Object[][] login_data_usernamevalid()
		{
			return new Object[][]  {{"aja"},{"qwertyuiopqwertyuiop"},{"aja"},{"qwertyuiopqwertyuiop",},{"abc123"},{"aja"}};
		}
		
		@DataProvider
		public Object[][] login_data_username()
		{
			return new Object[][] {{"aja","abc"},{"qwertyuiopqwertyuiop","abc"},{"aj","abc"},{"qwertyuiopasdqwertyuiopasd","abc"},{"abc123","abc"},{"","abc"}};
		}
		
		
		
		@DataProvider
		public Object[][] login_data_password()
		{
			return new Object[][] {{"aja","abc"},{"aja","abcdef@123"},{"aja","a1"},{"aja","abcdefg@123"}};
		}
		
		@DataProvider
		public Object[][] login_data_ntegration()
		{
			return new Object[][] {{"aja","abcdef@123"}};
		}
		//....................................................
		
		@DataProvider
		public Object[][] sign_up_data_firstname()
		
		{
			return new Object[][] {{"aja","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"qwertyuiopqwertyuiop","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aj","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"qwertyuiopasdqwertyuiopasd","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"@@","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"123","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja123","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"}};
			
		}
		
		
		@DataProvider
		public Object[][] sign_up_data_lastname()
		{
			return new Object[][] {{"aja","abc","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja","qwertyuiopqwertyuiop","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja","aj","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja","qwertyuiopasdqwertyuiopasd","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja","@@","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja","123","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja","abc1","abc@gmail.com","abc123","18-09-2002","9701574760","bio"},{"aja","","abc@gmail.com","abc123","18-09-2002","9701574760","bio"}};
		}
		
		@DataProvider
		public Object[][] sign_up_data_email()
		{
			return new Object[][] {{"aja","abc","abc@gmail.com","abc123","18-09-2022","9701574760","bio"},{"aja","abc","a@b","abc123","18-09-2022","9701574760","bio"},{"aja","abc","","abc123","18-09-2022","9701574760","bio"}};
		}
		
		@DataProvider
		public Object[][] sign_up_data_password()
		{
			return new Object[][] {{"aja","abc","abc@gmail.com","abc123","18-09-2022","9701574760","bio"},{"aja","abc","abc@gmail.com","abcdefg123","18-09-2022","9701574760","bio"},{"aja","abc","abc@gmail.com","a3","18-09-2022","9701574760","bio"},{"aja","abc","abc@gmail.com","abcdefgh123","18-09-2022","9701574760","bio"},{"aja","abc","abc@gmail.com","18-09-2022","9701574760","bio"}};
				
		}
		
		@DataProvider
		public Object[][] sign_up_data_mobilenumber()
		{
			return new Object[][] {{"aja","abc","abc@gmail.com","abc123","18-09-2022","9701574760","bio"},{"aja","abc","abc@gmail.com","abc123","18-09-2022","970157","bio"},{"aja","abc","abc@gmail.com","abc123","18-09-2022","970157476000","bio"},{"aja","abc","abc@gmail.com","abc123","18-09-2022","mob","bio"},{"aja","abc","abc@gmail.com","abc123","18-09-2022","9701574760","bio"},{"aja","abc","abc@gmail.com","abc123","18-09-2022","m@@","bio"},{"aja","abc","abc@gmail.com","abc123","18-09-2022","bio"}};
		}
		
		@DataProvider
		public Object[][] sign_up_data_bio()
		{
			return new Object[][] {{"aja","abc","abc@gmail.com","abc123","18-09-2022","9701574760","bio123"},{"aja","abc","abc@gmail.com","abc123","18-09-2022","9701574760",""}};
		}
		
		
		
		@DataProvider
		public Object[][] sign_up_data_integration()
		{
			return new Object[][] {{"aja","abc","abc@gmail.com","abc123","18-09-2022","9701574760","bio123"}};
		}
		
		//........................................................
		@DataProvider
		public Object[][] contact_us_data_username()
		{
			return new Object[][] {{"abc","abc@gmail.com","9701574760","msg"},{"abcdefghijklmnopqrst","abc@gmail.com","9701574760","msg"},{"a","abc@gmail.com","9701574760","msg"},{"abcdefghijklmnopqrstuv","abc@gmail.com","9701574760","msg"},{"","abc@gmail.com","9701574760","msg"}};
		}
		
		
		@DataProvider
		public Object[][] contact_us_data_email()
		{
			return new Object[][] {{"abc","abc@gmail.com","9701574760","msg"},{"abc","a@b","9701574760","msg"}};
		}
		
		@DataProvider
		public Object[][] contact_us_data_phonenumber()
		{
			return new Object[][] {{"abc","abc@gmail.com","9701574760","msg"},{"abc","abc@gmail.com","970157","msg"},{"abc","abc@gmail.com","970157476000","msg"},{"abc","abc@gmail.com","abc","msg"},{"abc","abc@gmail.com","@@","msg"},{"abc","abc@gmail.com","","msg"}};
		}
		
		@DataProvider
		public Object[][] contact_us_data_message()
		{
			return new Object[][] {{"abc","abc@gmail.com","9701574760","m"},{"abc","abc@gmail.com","9701574760","msg1000"},{"abc","abc@gmail.com","9701574760","msgmore1000"},{"abc","abc@gmail.com","9701574760","msg123"},{"abc","abc@gmail.com","9701574760",""}};
				
		}
		
		@DataProvider
		public Object[][] contact_us_data_integration()
		{
			return new Object[][] {{"abc","abc@gmail.com","9701574760","m"}};
		}
		

}
