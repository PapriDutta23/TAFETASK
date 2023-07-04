package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/*import org.openqa.selenium.support.How;*/
import org.openqa.selenium.support.PageFactory;

public class CourseSearchPage {
    WebDriver Idriver;
	
	public CourseSearchPage(WebDriver rDriver)
	{
		 Idriver = rDriver;
		 PageFactory.initElements(rDriver,this);
	}
	
	
	
	//WEBELEMENT FORT SEARCH BUTTON
	@FindBy(xpath = "//label[@for='headerSearch']//*[name()='svg']")
	WebElement searchbutton;
	
	//WEBELEMENT FOR SEARCHBOX
	@FindBy(xpath = "//input[@id='headerSearch']")
	WebElement searchbox;

	
	@FindBy(xpath = "//h4[@class='h4']")
	WebElement AdvBaristaskills;

	
	//WEBELMENT FOR THE DELIVERY FILTER SIGN
	@FindBy(xpath= "//span[@class='ml-1 text-brand-grey-400 hover:text-brand-grey-600 has-tooltip v-tooltip-open']//*[name()='svg']")
	WebElement QuarrySign;
	
	//WEBELEMENT FOR THE ONCAMPUS LABEL
	@FindBy(xpath = "//label[@for='on-campus']")
	WebElement OnCampus;
	
	//WEBELEMENT FOR THE CHECKBOX FOR ONCAMPUS
	@FindBy(xpath="//input[@id='on-campus']")
	WebElement OnCampusCheckBox;
	
	//WEBELEMENT FOR THE ONCAMPUS TEXT POST THE APPLICATION OF THE FILTER
	@FindBy(xpath="//p[normalize-space()='On campus']")
	WebElement OnCampusText;
	
	
	

	

	//CLICK THE SEARCH ICON
	public void ClickSearchIcon() {
		searchbutton.click();
	}
	
	//ENTER TEXT IN THE SEARCH BOX
	public void EnterTextInSearchBox(String text)
	{
		searchbox.sendKeys(text);
		//searchbox.sendKeys(Keys.ENTER);
	}
	
	//CLICK THE SEARCH BOX
	public void ClickSearchBox()
	{
		searchbox.click();
	}
	
	//HIT ENTER ON THE SEARCHBOX
	public void HitEnter()
	{
		searchbox.sendKeys(Keys.ENTER);
	}
	
				
	//CLICK ON THE DELIVERY FILTER SIGN
	public void ClickQuarrySign() {
		QuarrySign.click();
	}
	
	//CHECK THE ON CAMPUS CHECKBOX
	public void ClickOnCampusCheckbox() {
		OnCampusCheckBox.click();
	}
	
	//COLLECT THE TEXT OF THE FILTER ON THE COURSE
	public String OnCampusTextCheck() {
		String  abc = OnCampusText.getText();
		return abc;
	}
	
	

			
	
	
	
	


}
