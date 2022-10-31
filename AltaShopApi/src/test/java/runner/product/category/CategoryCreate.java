package runner.product.category;

import org.json.simple.JSONObject;
import runner.utils.GeneratedString;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class CategoryCreate {
    private String url,token;

    public void setUrl(){
        url = "https://alta-shop.herokuapp.com/api/categories";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Im5haW5haSIsIkVtYWlsIjoibmFpeHh5QG1haWwuY28ifQ.ocYBbSLqpHsF6Zlxr4eMamLhr0hAfeosG0mYw5V-FUE";
    }
    public JSONObject bodyCategory(String name, String desc){
        GeneratedString generatedString = new GeneratedString();
        JSONObject body = new JSONObject();
        if(name.equals("kopi")){
            name = generatedString.nameCategory();
            desc = generatedString.descCategory();
        }
        body.put("name", name);
        body.put("desc", desc);
        return body;
    }

    public void requestCategoryWithNameAndDesc(String name, String desc){
        given().header("Authorization", "Bearer " + token)
                .header("Content-Type", "application/json")
                .body(bodyCategory(name, desc))
                .post(url);
    }
    public void verifStatusCode200(){
        then().statusCode(200);
    }
    public void verifStatusCode400(){
        then().statusCode(400);
    }
    public void verifStatusCode500(){
        then().statusCode(500);
    }
}
