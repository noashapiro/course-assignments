import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Scanner;

public class RestCountries {
    private static Scanner scanner;
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter country name:");
        scanner = new Scanner(System.in);
        String userInput = scanner.next();
        getData(userInput);
    }

    public static void getData(String userInput) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://restcountries.com/v3.1/name/"+userInput)
                .build();
        Response response = client.newCall(request).execute();
        String jsonData = response.body().string();
        if (response.code() == 404){
            System.out.println("No such country..");
            tryAgain();
        }
        // parse JSON
        JSONArray mainJsonArray = new JSONArray(jsonData);
        JSONObject mainJsonObject = (JSONObject) mainJsonArray.get(0);
        // get Json object
        String region = mainJsonObject.getString("region");
        JSONArray borders = mainJsonObject.getJSONArray("borders");
       //JSONObject currencies = (JSONObject) mainJsonObject.getJSONArray("currencies").get(0);
       // String symbol = mainJsonObject.getString("currencies");
        JSONObject resultsJson = mainJsonObject.getJSONObject("currencies");
        JSONObject val = resultsJson.getJSONObject("ILS");
        String vall = val.getString("symbol");
        // print value
        System.out.println(region +""+borders+""+vall);
        tryAgain();
    }

    private static void tryAgain() throws IOException {
        System.out.println("Do you want to start again?");
        System.out.println("Press exit if not");
        String userInput = scanner.next();
        if (!userInput.equals("exit")){
            getData(userInput);
        } else {
            System.exit(0);
        }
    }
}
