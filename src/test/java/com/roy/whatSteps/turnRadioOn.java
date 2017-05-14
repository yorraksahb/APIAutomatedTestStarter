package com.roy.whatSteps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.roy.radio.howSteps.RadioServiceSteps;

import net.thucydides.core.annotations.Steps;

public class turnRadioOn {
	
	@Steps
	private RadioServiceSteps radioServiceSteps;
	
	@Given ("a digital radio")
	public void givenRadio() {
		radioServiceSteps.invokeRadio();
	}
	
	@When ("I press the on/off switch")
	public void pressedSwitch(){
		radioServiceSteps.switchPressed();
	}
	
	@Then ("the radio should be turned on")
	public void finalResult(){
		radioServiceSteps.statusOfRadio();
	}
	

}
