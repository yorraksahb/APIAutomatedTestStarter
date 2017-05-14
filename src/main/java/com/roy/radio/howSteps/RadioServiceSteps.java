package com.roy.radio.howSteps;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class RadioServiceSteps extends ScenarioSteps{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean switchMode = false; 

	@Step
	public void invokeRadio() {
		System.out.println("Given Statement");
	}
	
	@Step
	public void switchPressed() {
		switchMode = !switchMode;
	}
	
	@Step
	public void statusOfRadio() {
		Assert.assertTrue(switchMode);
	}
}
