//package hack;
//
//import com.google.gson.Gson;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.fasterxml.jackson.core;
//import netscape.javascript.JSException;
//import netscape.javascript.JSObject;
//
//import java.io.*;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.ArrayList;
//class Result {
//
//    /*
//     * Complete the 'bestInGenre' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts STRING genre as parameter.
//     *
//     * Base URL: https://jsonmock.hackerrank.com/api/tvseries?page=
//     */
//
//    public static String bestInGenre(String genre)throws IOException {
//        ArrayList<String> imdb_rating = new ArrayList<>();
//        int page = 0;
//        int totalPage = 200;
//        String response;
//
//        final String baseUrl = "https://jsonmock.hackerrank.com/api/tvseries?page=";
//        while(page <= totalPage){
//            URL obj = new URL(baseUrl + page);
//
//            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//            con.setRequestMethod("GET");
//
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            while((response = in.readLine())!= null){
//                JSObject jsonResponse = new JSObject(response, JsonObject.class) {
//                    @Override
//                    public Object call(String methodName, Object... args) throws JSException {
//                        return null;
//                    }
//
//                    @Override
//                    public Object eval(String s) throws JSException {
//                        return null;
//                    }
//
//                    @Override
//                    public Object getMember(String name) throws JSException {
//                        return null;
//                    }
//
//                    @Override
//                    public void setMember(String name, Object value) throws JSException {
//
//                    }
//
//                    @Override
//                    public void removeMember(String name) throws JSException {
//
//                    }
//
//                    @Override
//                    public Object getSlot(int index) throws JSException {
//                        return null;
//                    }
//
//                    @Override
//                    public void setSlot(int index, Object value) throws JSException {
//
//                    }
//                };
//                totalPage = jsonResponse.get("totlal_pages").getAsInt();
//                JsonArray data = jsonResponse.getAsJonsArray("data");
//
//                for(JsonElement e: data){
//                    System.out.println(data);
//                }
//            }
//
//
//
//
//        }
//
//
//        // Write your code here
//        return "";
//    }
//
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String genre = bufferedReader.readLine();
//
//        String result = Result.bestInGenre(genre);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}

