package org.example;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.data.Comics;
import org.example.data.targetAPI;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    static String URLAPI = "https://gateway.marvel.com:443/v1/public/";
    static String APIKEY = "ts=21&apikey=a93a5143951bc86ac7ea9e22c740605e";
    static String HASHAPI = "hash=b441d47de2134953f043cb7877b3b88a";
    static String URL = URLAPI+ targetAPI.COMICS + APIKEY + "&" + HASHAPI;


    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

public static void main(String[] args) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(URL))
                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

    JSONParser parser = new JSONParser();
    List<Comics> comicsList = new ArrayList<>();
    try {
        JSONObject json = (JSONObject) parser.parse(response.body());
        JSONObject data = (JSONObject) json.get("data");
        JSONArray results = (JSONArray) data.get("results");

        for (int i = 0; i < results.size(); i++) {


           JSONObject obje = (JSONObject) results.get(i);
           ObjectMapper mapper = new ObjectMapper();
            Map<String,Object> map = mapper.readValue(obje.toString(),Map.class);
            Comics comics = mapper.convertValue(map, Comics.class);
            comicsList.add(comics);
        }

    } catch (ParseException e) {
        throw new RuntimeException(e);
    }
    System.out.println(comicsList);

}

















//    public static void main(String[] args) throws IOException {
//        URL url = new URL(URLAPI+ targetAPI.CHARACTER + APIKEY + "&" + HASHAPI);
//        URLConnection connection = url.openConnection();
//
//        try (BufferedReader in = new BufferedReader(
//                new InputStreamReader(connection.getInputStream())))
//        {
//            System.out.println(connection.getInputStream());
//            //System.out.println(in);
//            String line;
//            List<Comics> comicsList = new ArrayList<>();
//            while ((line = in.readLine()) != null) {
//               // ObjectMapper mapper = new ObjectMapper();
//               // Map<String,Object> map = mapper.readValue(line, Map.class);
//               // Comics comics = mapper.convertValue(map, Comics.class);
//               // comicsList.add(comics);
//
//                //System.out.println(line.split("result"));
//                break;
//            }
//            //System.out.println(comicsList);
//        }
//    }
}