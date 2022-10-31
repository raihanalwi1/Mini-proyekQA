package runner.auth;

import org.json.simple.JSONObject;
import runner.utils.GeneratedString;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class Register {
    private String url;
    private String Email;

    public void setUrlRegister(){
        url = "https://alta-shop.herokuapp.com/api/auth/register";
    }
    public JSONObject bodyRegister(String email, String password, String fullname){
        GeneratedString generatedString = new GeneratedString();
//        fullname = generatedString.randomFullname();
//        email = generatedString.randomEmail();
//        password = generatedString.randomPassword();


        JSONObject body = new JSONObject();
        if (email.equals("naixxy1")){
            email = generatedString.randomEmail();
            fullname = generatedString.randomFullname();
            password = generatedString.randomPassword();
        }
        body.put("email", email);
        body.put("password", password);
        body.put("fullname", fullname);
        return body;
    }

    public void requestWithEmailPasswordAndFullname(String email, String password, String fullname){
        given().header("Content-Type", "application/json")
                .body(bodyRegister(email, password, fullname))
                .post(url);
    }
    public void verifyStatusCode200(){
        then().statusCode(200);
    }public void verifyStatusCode400(){
        then().statusCode(400);
    }

}
