package runner.product;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class GetById {
    private String url, id;

    public void setUrlGetByIdProduct(){
        url = "https://alta-shop.herokuapp.com/api/products/13";
    }
    public void requestById(){
        given().when().get(url);
    }
    public void verifStatusCode200(){
        then().statusCode(200);
    }


}
