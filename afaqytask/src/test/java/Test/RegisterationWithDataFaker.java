package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Pages.Registeration;


public class RegisterationWithDataFaker extends TestBase {

	Registeration registerobject;
	
	
	
	Faker fakeData = new Faker(); 
	String usernme = fakeData.name().username();
	String emailFld = fakeData.internet().emailAddress();
	String Title = fakeData.name().title();
	String mainname = fakeData.name().fullName();
	String firstname = fakeData.name().firstName();
	String lastname = fakeData.name().firstName();
	String passwordfld = fakeData.number().digits(8).toString();
	String address = fakeData.address().firstName();
	String state = fakeData.address().state();
	String city =fakeData.address().city();
	String zipcode = fakeData.address().zipCode();
	String mobilenumber = fakeData.phoneNumber().cellPhone();
	
	
	
	
	
	
	@SuppressWarnings("deprecation")
	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() 
	{
		
		registerobject = new Registeration(driver);
		
		registerobject.userRegistration(usernme, emailFld, mainname, passwordfld, firstname, lastname, address, state, city, zipcode, mobilenumber);
		Assert.assertTrue(registerobject.successmessage.getText().contains("Congratulations! Your new account has been successfully created!"));
		
		
		
}
	
	
	@Test(dependsOnMethods= {"UserCanRegisterSuccssfully"})
	public void RegisteredUserCanLogout() 
	{
		registerobject.userLogout();
	}


}
