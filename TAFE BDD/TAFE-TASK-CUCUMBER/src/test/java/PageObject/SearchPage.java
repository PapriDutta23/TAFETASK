package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver Idriver;
	
	public SearchPage(WebDriver rDriver)
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
	
	//WEBELEMENT FOR THE 'Advanced Barista Skills' COURSE THAT APPEARS IN THE SERACH RESULTS
		@FindBy(xpath="//h4[@class='h4'][contains(.,'Advanced Barista Skills')]")
		WebElement AdvanceBaristaSearchResult;
	
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

	
	//COLLECT THE TEXT OF THE SEARCH ON THE COURSE
	public String AdvanceBaristaTextCheck() {
		String  abc = AdvanceBaristaSearchResult.getText();
		return abc;
	}
		
}
