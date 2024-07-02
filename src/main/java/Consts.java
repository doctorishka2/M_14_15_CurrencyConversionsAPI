public class Consts {

    public static final String FULL_URL = "https://api.apilayer.com/currency_data/live?apikey=";
    public static final String MY_KEY = "KQU5knBvMgAZeEfh82zuGRRGuXRL0RiM";
    public static final String CURRENCIES_USD_ALL = "&source=USD";
    public static final String CURRENCIES_USD_CAD = "&source=USD&currencies=CAD";
    public static final String CURRENCIES_USD_EUR = "&source=USD&currencies=EUR";
    public static final String CURRENCIES_USD_BRL = "&source=USD&currencies=BRL";   //Brazilian Real
    public static final String CURRENCIES_USD_JPY = "&source=USD&currencies=JPY";
    // GET: All Data Request: FULL_URL + MY_KEY
    // GET: Currency Request: FULL_URL + MY_KEY + CURRENCIES

    public static final String URL = "https://api.apilayer.com/currency_data";
    public static final String LIVE_ENDPOINT = "/live";
    public static final String HISTORICAL = "/historical?date=2024-01-09&apikey=";  //Date Jan.09, 2024
    //GET: Historical Request: URL + HISTORICAL + MY_KEY



}
