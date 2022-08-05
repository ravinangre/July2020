import org.testng.Assert;
import org.testng.annotations.Test;

import groovyjarjarantlr4.v4.codegen.model.decl.ContextRuleListGetterDecl;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_Request {
@Test
public void get_reqest_1() {
	RestAssured res = new RestAssured();
	Response response =	res.get("https://reqres.in/api/users/5");
	System.out.println(response.asString());
	System.out.println(response.getBody().asString());
	System.out.println(response.getStatusCode());
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("content-type"));
	System.out.println(response.getTime());
	
	int statusCode = response.getStatusCode();
	Assert.assertEquals(statusCode, 200);
}

}
