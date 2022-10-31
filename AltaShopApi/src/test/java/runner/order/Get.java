package runner.order;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class Get {
    private String url1, url2, token, gid;

    public void setUrlGetAllOrder(){
        url1 = "https://alta-shop.herokuapp.com/api/orders/";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Im5haW5haSIsIkVtYWlsIjoibmFpeHh5QG1haWwuY28ifQ.ocYBbSLqpHsF6Zlxr4eMamLhr0hAfeosG0mYw5V-FUE";
    }
    public void setUrlGetById(String id){
        if (id.equals("1")){
            gid = "1";
        }else if (id.equals("0")){
            gid = "0";
        }
        url2 = "https://alta-shop.herokuapp.com/api/orders/" + gid;
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Im5haW5haSIsIkVtYWlsIjoibmFpeHh5QG1haWwuY28ifQ.ocYBbSLqpHsF6Zlxr4eMamLhr0hAfeosG0mYw5V-FUE";

    }
    public void requestGetById(){
        given().header("Authorization", "Bearer " + token)
                .when().get(url2);
    }
    public void requestGetAll(){
        given().header("Authorization", "Bearer " + token)
                .when().get(url1);
    }
    public void verifyStatusCode200(){
        then().statusCode(200);
    }
    public void verifyStatusCode404(){
        then().statusCode(404);
    }
}
