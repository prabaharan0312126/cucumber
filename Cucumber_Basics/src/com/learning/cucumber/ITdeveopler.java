package com.learning.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ITdeveopler {

	/**
	 * @param args
	 */
	

	@Given("^I work in \"([^\"]*)\"$")
	public void give(String TesterType)
	{System.out.println(TesterType);
		System.out.println(TesterType);
		System.out.println(TesterType);
		System.out.println("Adsafdsafdsaf");
	}
	
  @When("^I meet ([^\"]*)$")
  public void www()
  {
	  System.out.println("give2");
	}

  @Then ("^I ([^\"]*)$")
  public void out(String Work_Output)
  {
	  System.out.println(Work_Output);
	}

  @But ("^he is a ([^\"]*) person$")
  public void action(String Boss_Action)
  {
	  System.out.println(Boss_Action);
  }
  
  
}
