package runner.order;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class CreateOrder {
    private String url,token;

    public void setUrlCreateOrder(){

        url = "https://alta-shop.herokuapp.com/api/orders";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Im5haW5haSIsIkVtYWlsIjoibmFpeHh5QG1haWwuY28ifQ.ocYBbSLqpHsF6Zlxr4eMamLhr0hAfeosG0mYw5V-FUE";
    }
    public List<JSONObject> bodyCreateOrder(int id, int qty){
        JSONObject body = new JSONObject();
        List<JSONObject> data = new ArrayList<>();

        body.put("product_id", id);
        body.put("quantity", qty);
        data.add(body);
        return data;
    }

    public void requestIdAndQty(int id, int qty){
        given().header("Authorization", "Bearer " + token)
                .header("Content-Type", " application/json")
                .body(bodyCreateOrder(id, qty))
                .post(url);
    }


    public void verifyStatusCode200(){
        then().statusCode(200);
    }
    public void verifyStatusCode400(){
        then().statusCode(400);
    }
}
