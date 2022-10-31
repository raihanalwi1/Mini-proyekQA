package runner.auth;

import static net.serenitybdd.rest.RestRequests.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class GetUser {
    private String url, token;

    public void setUrlGetUser(){
        url = "https://alta-shop.herokuapp.com/api/auth/info";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Im5haW5haSIsIkVtYWlsIjoibmFpeHh5QG1haWwuY28ifQ.ocYBbSLqpHsF6Zlxr4eMamLhr0hAfeosG0mYw5V-FUE";
    }
    public void requestGet(){
        given().header("Content-Type"," application/json")
                .header("Authorization","Bearer " + token)
                .when().get(url);
    }

    public void verifStatusCode200(){
        then().statusCode(200);
    }
}
