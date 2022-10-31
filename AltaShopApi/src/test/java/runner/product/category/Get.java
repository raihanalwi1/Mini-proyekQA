package runner.product.category;

import static junit.runner.Version.id;
import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class Get {
    private String url, id;

    public void setUrlGetCategory(){
        url = "https://alta-shop.herokuapp.com/api/categories/";
    }

    public void requestGetById(String gid){
        if (gid.equals("1")){
            id = "1";
        }else if (gid.equals("2")){
            id = "2";
        }
        given().when().get(url + gid);
    }
    public void requestGetAll(){
        given().when().get(url);
    }
    public void verifStatusCode200(){
        then().statusCode(200);
    }
    public void verifStatusCode404(){
        then().statusCode(404);
    }
    public void verifStatusCode400(){
        then().statusCode(400);
    }
}
