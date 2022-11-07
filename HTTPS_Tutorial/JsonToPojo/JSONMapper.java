package apiTutorial;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JSONMapper {

    public void conversion() {

        URL url = null;
        try {
            url = new URL(" https://reqres.in/api/users?page=2");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            int responseCode = urlConnection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                StringBuilder responseString = new StringBuilder();
                String str;
                while ((str = reader.readLine()) != null) responseString.append(str).append("\n");
                ObjectMapper objectMapper = new ObjectMapper();
                UserData userData = objectMapper.readValue(responseString.toString(), UserData.class);
                new JlistView().display(userData.getData());
            } else System.out.println("RESPONSE ERROR");
        } catch (JsonMappingException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("NETWORK FAILURE");
        }
    }


    public static void main(String[] args) {
        JSONMapper map = new JSONMapper();
        map.conversion();
    }
}



