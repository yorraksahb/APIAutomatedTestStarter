package com.roy.whatSteps;

import net.serenitybdd.jbehave.SerenityStories;

public class RadioTestSuite extends SerenityStories {
	public RadioTestSuite() {
		this.findStoriesCalled("*.feature");
	}
}
