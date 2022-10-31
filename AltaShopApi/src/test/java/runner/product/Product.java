package runner.product;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class Product {
    private String url;

    public void setUrlGetProduct(){
        url = "https://alta-shop.herokuapp.com/api/products";

    }

//    public JSONObject bodyCreateNewProduct(String name, String desc, String price, String category){
//
//    }
//    public void requestCreateaNewProduct(){
//        given().header("Content-Type", "application/json")
//                .body()
//    }
    public void requestGetProduct(){
        given().when().get(url);
    }
    public void verifedStatusCode200(){
        then().statusCode(200);
    }
}
