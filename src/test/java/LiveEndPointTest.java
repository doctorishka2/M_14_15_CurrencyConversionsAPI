import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static groovy.xml.Entity.times;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class LiveEndPointTest {

    private static Response response;

    @BeforeAll
    public static void setup() {
        response = given().get(Consts.FULL_URL + Consts.MY_KEY + Consts.CURRENCIES_USD_ALL);
        //System.out.println(response.asString());
    }

    @Test
    public void getAllCurrenciesTest() {
        response = given().get(Consts.FULL_URL + Consts.MY_KEY);
        response.then().statusCode(200);
    }

    @Test   //USD to All
    public void getSpecificCurrenciesTest() {
        response = given().get(Consts.FULL_URL + Consts.MY_KEY + Consts.CURRENCIES_USD_ALL);
        response.then().statusCode(200);
        response.then().body("success", equalTo(true));
        response.then().body("timestamp", notNullValue());
        response.then().body("source", notNullValue());
        response.then().body("source", equalTo("USD"));
        response.then().body("quotes.USDCAD", hasItem(1.367935f));
        response.then().body("quotes.USDCAD", greaterThan(1.0));
        System.out.println(response.asString());
    }

    @Test   //USD to CAD
    public void get_USD_CAD_CurrenciesTest() {
        response = given().get(Consts.FULL_URL + Consts.MY_KEY + Consts.CURRENCIES_USD_CAD);
        response.then().statusCode(200);
        response.then().body("success", equalTo(true));
        response.then().body("timestamp", notNullValue());
        response.then().body("source", notNullValue());
        response.then().body("source", equalTo("USD"));
        response.then().body("quotes", notNullValue());
        System.out.println(response.asString());
    }


    @Test   //USD to EUR
    public void get_USD_EUR_CurrenciesTest() {
        response = given().get(Consts.FULL_URL + Consts.MY_KEY + Consts.CURRENCIES_USD_EUR);
        response.then().statusCode(200);
        response.then().body("success", equalTo(true));
        response.then().body("timestamp", notNullValue());
        response.then().body("source", notNullValue());
        response.then().body("source", equalTo("USD"));
        System.out.println(response.asString());
    }

    @Test //USD to Brazilian Real
    public void get_USD_BRL_CurrenciesTest() {
        response = given().get(Consts.FULL_URL + Consts.MY_KEY + Consts.CURRENCIES_USD_BRL);
        response.then().statusCode(200);
        response.then().body("success", equalTo(true));
        response.then().body("timestamp", notNullValue());
        response.then().body("source", notNullValue());
        response.then().body("source", equalTo("USD"));
        System.out.println(response.asString());
    }

    @Test   //USD to JPY
    public void get_USD_JPY_CurrenciesTest() {
        response = given().get(Consts.FULL_URL + Consts.MY_KEY + Consts.CURRENCIES_USD_JPY);
        response.then().statusCode(200);
        response.then().body("success", equalTo(true));
        response.then().body("timestamp", notNullValue());
        response.then().body("source", notNullValue());
        response.then().body("source", equalTo("USD"));

        System.out.println(response.asString());
    }


}
