package com.stepdefenition;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Stepdefenition {

	RequestSpecification req;
	io.restassured.response.Response response;
	
	@When("Hit the api")
	public void hit_the_api() {
		RestAssured.baseURI="https://reqres.in/";
	}
	@When("Get the response from website")
	public void get_the_response_from_website() {
		req = RestAssured.given();
		response= req.get("api/users?page=2");
	}
	@When("print the response")
	public void print_the_response() {
		response.prettyPrint();
	}
	@Then("print the particular path")
	public void print_the_particular_path() {
		Assert.assertEquals(response.statusCode(), 200);
		System.out.println(response.statusCode());
		System.out.println(response.jsonPath().getString("data[5]"));
	}

}

