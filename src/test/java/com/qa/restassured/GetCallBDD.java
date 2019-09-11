package com.qa.restassured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class GetCallBDD {
	
	
	@Test
	public void test_numberOfCircuits_2o17_Season(){
		
		// given()
		 // .when()
		//.then();
	given()
	      
	      
  .when()
	    .get("http://ergast.com/api/f1/2017/circuits.json")
	      
  .then()
  .assertThat()
  .statusCode(200)

 // .and()
  
  
 .body("MRData.CircuitTable.Circuits.circuitId", hasSize(20))
 // .and()
 .header("Content-Type", equalTo("application/json; charset=utf-8"))
 // .and()
  .header("Content-Length",equalTo(4551))
  .log().all();
		
	}

}
