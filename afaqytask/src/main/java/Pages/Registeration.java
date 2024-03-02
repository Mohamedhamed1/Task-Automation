package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Registeration extends PageBase {

	public Registeration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement Signup; 

	@FindBy(xpath ="//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
	WebElement usernme; 

	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
	WebElement emailFld; 
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	WebElement SignupBtn; 

	@FindBy(id="id_gender1")
	WebElement Title;
	
	@FindBy(id="name")
	WebElement mainname;
	
	@FindBy(id="password")
	WebElement passwordfld;

	@FindBy(id="days")
	WebElement dateOfBirtDAYs;
	
	@FindBy(id="months")
	WebElement dateOfBirtMONTHs;
	
	@FindBy(id="years")
	WebElement dateOfBirtYEARs;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(id="address1")
	WebElement address;
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="city")
	WebElement city;

	@FindBy(id="zipcode")
	WebElement zipcode;
	
	@FindBy(id="mobile_number")
	WebElement mobilenumber;
	
	@FindBy(xpath ="/html/body/ins[2]/div[1]//ins/span/svg/g")
	WebElement Advertise;
	
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div/form/button")
	WebElement CreateAccount;
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement logout;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div/p[1]")
	public	WebElement successmessage;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
	public WebElement continuebutn;
	
	
	
	
	
	
	
	public void userRegistration(String username , String email , String mainname , String Password , String firstname ,
			String lastname , String address ,String state , String city , String zipcode , String mobilenumber)
	
	{ 
		clickButton(Signup);
		setTextElementText(usernme, username);
		setTextElementText(emailFld, email);
		clickButton(SignupBtn);
		clickButton(Title);
		setTextElementText(this.mainname, mainname);
		setTextElementText(passwordfld, Password);
		
		
	    Select selectoptionsyear = new Select(dateOfBirtYEARs);
	    Select selectoptionsmonth = new Select(dateOfBirtMONTHs);
		Select selectoptionsdays = new Select(dateOfBirtDAYs);
		selectoptionsyear.selectByVisibleText("1990");
		selectoptionsmonth.selectByVisibleText("January");
		selectoptionsdays.selectByVisibleText("1");
		
			
		
		
		setTextElementText(this.firstname, firstname);
		setTextElementText(this.lastname, lastname);
		setTextElementText(this.address, address);
		setTextElementText(this.state, state);
		setTextElementText(this.city, city);
		setTextElementText(this.zipcode, zipcode);
		setTextElementText(this.mobilenumber, mobilenumber);
		clickButton(CreateAccount);
		
	}
	
	public void userLogout() 
	{
		
		clickButton(continuebutn);
		clickButton(logout);
	}
	
}
