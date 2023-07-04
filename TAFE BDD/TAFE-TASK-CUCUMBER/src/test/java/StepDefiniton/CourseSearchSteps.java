package StepDefiniton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObject.CourseSearchPage;
import PageObject.SearchPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class CourseSearchSteps {
	
	public WebDriver driver;
	public SearchPage sp ;
	public CourseSearchPage csp;
	
	
	@Given("an user navigate to {string}")
	public void an_user_navigate_to(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		csp= new CourseSearchPage(driver);
		
		
	}
	
	@Given("user clicks on the search icon")
	public void user_clicks_on_the_search_icon() {
		csp.ClickSearchIcon();
	}
	
	@Given("user search for a course using the serach box {string}")
	public void user_search_for_a_course_using_the_serach_box(String text) {
		csp.EnterTextInSearchBox(text);
	}
	
	@Given("hit enter to submit the search")
	public void hit_enter_to_submit_the_search() {
		csp.HitEnter();
	}
	
	@When("navigated to course search page and click on delivery filter")
	public void navigated_to_course_search_page_and_click_on_delivery_filter() {
	    csp.ClickQuarrySign();
	}
	
	@When("set the filter {string}")
	public void set_the_filter(String string) {
	  csp.ClickOnCampusCheckbox();
	    
	}
	
	@Then("it should be present in choosen course")
	public void it_should_be_present_in_choosen_course() {
	   
		  Assert.assertEquals(csp.OnCampusTextCheck(),"On campus");
		  driver.quit();
		
	}
 
}
