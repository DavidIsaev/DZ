import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class POSTM {

    

    @BeforeAll
    public static void setUp() {
    
        RestAssured.baseURI = "https://postman-echo.com"; 
    }

    @Test
    public void test1() {
        
        given()
            .queryParam("foo1", "bar1") 
            .queryParam("foo2", "bar2")
        .when()
            .get("/get") 
        .then()
            .statusCode(200) 
            .body("args.foo1", equalTo("bar1"))
            .body("args.foo2", equalTo("bar2"));
    }



    @Test
    public void test2 (){
        String da = "This is expected to be sent back as part of response body.";
        given()
            .body(da)
        .when()
            .post("/post")
        .then()
            .statusCode(200)
            .body("data", equalTo(da));

    }

@Test
    public void test3 () {
        String jsss = "{ \"foo1\": \"bar1\", \"foo2\": \"bar2\" }";
        given()
        .header("Content-Type", "application/json") 
        .body(jsss)
    .when()
        .post("/post")
    .then()
        .statusCode(200)
        .body("json.foo1", equalTo("bar1")) 
        .body("json.foo2", equalTo("bar2")); 
    }

   @Test
    public void test4 () {
        String da = "This is expected to be sent back as part of response body."; 
        given()
        .header("Content-Type", "application/json") 
        .body(da)
        .when()
            .put("/put")
        .then()
            .statusCode(200)
            .body("data", equalTo(da));

    }
    @Test
    public void test5 () {
        String da = "This is expected to be sent back as part of response body."; 
        given()
        .header("Content-Type", "application/json") 
        .body(da)
        .when()
            .patch("/patch")
        .then()
            .statusCode(200)
            .body("data", equalTo(da));
    }
    @Test
    public void test6 () {
        String da = "This is expected to be sent back as part of response body."; 
        given()
        .header("Content-Type", "application/json") 
        .body(da)
        .when()
            .delete("/delete")
        .then()
            .statusCode(200)
            .body("data", equalTo(da));
    }
}


