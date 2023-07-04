package StepDefiniton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import PageObject.SearchPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSteps {
	
	public WebDriver driver;
	public SearchPage sp ;
	
	
	@Given("an user navigate to {string}")
	public void an_user_navigate_to(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		sp= new SearchPage(driver);
	}

	@Given("user clicks on the search icon")
	public void user_clicks_on_the_search_icon() {
	    sp.ClickSearchIcon();
	}

	@Given("user search for a course using the serach box {string}")
	public void user_search_for_a_course_using_the_serach_box(String text) {
	    sp.EnterTextInSearchBox(text); 
	}

	@Given("hit enter to submit the search")
	public void hit_enter_to_submit_the_search() {
	     sp.HitEnter();
	}

	@Then("the course user searched for should appear {string}  in the result")
	public void the_course_user_searched_for_should_appear_in_the_result(String result) {
		  Assert.assertEquals(sp.AdvanceBaristaTextCheck(),"Advanced Barista Skills");
		  driver.quit();
	} 
	
	 	

}
