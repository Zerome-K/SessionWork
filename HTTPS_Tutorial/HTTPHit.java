package apiTutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPHit {

    public void getCall() {

        URL url = null;
        try {
            url = new URL(" https://reqres.in/api/users?page=2");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            int responseCode = urlConnection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                String line = reader.readAll();
                System.out.println(line);
            } else System.out.println("RESPONSE ERROR");
        } catch(IOException e){
                System.out.println("NETWORK FAILURE");
            }
        }
        public static void main (String[]args){
            HTTPHit hh = new HTTPHit();
            hh.getCall();
        }
    }
