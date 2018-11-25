package CIB_DIGITAL_TECH;


import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import files.Resources;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ListAllBreedDogsTest extends Resources
{
	String hostname;
	
	@BeforeTest
	public void initializeEnvironment() throws IOException
	{
		hostname = InitializeHost();
		RestAssured.baseURI = prop.getProperty("HOST");
	}
	
	@Test
	public void listAllBreedDogs() 
	{
		//Test case 1: Perform an API request to produce a list of all dog breeds. (Diagram 1)
		
	    RequestSpecification httpRequest = RestAssured.given();
	    Response response = httpRequest.get("api/breeds/list/all");	    
	    
	    //Display a list of all dog breeds
	    System.out.println("The list of all dog breeds: \n\n"+response.asString()+ "\n\n");		
		
	}
}
