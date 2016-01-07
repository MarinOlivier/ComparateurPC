package utils;

import java.io.*;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.*;

/**
 * Created by olivier on 06/01/2016.
 */
public class JsonParse {

    public static void reader(File file, Connection conn) {

        try {
            JSONObject _file = new JSONObject(utils.JsonParse.utf8FileToString(file));

            JSONArray data = _file.getJSONArray("data");
            JSONObject _computer = data.getJSONObject(0);
            JSONArray computer = _computer.getJSONArray("computer");

            for (int i = 0 ; i < computer.length() ; i++){
                JSONObject current = computer.getJSONObject(i);

                Map toPush = new HashMap<>();


                if(current.has("Name")) {
                    String name = current.getString("Name");
                }
                else {
                    String name = null;
                }
                if(current.has("motherBoard")) {
                    String motherBoard = current.getString("motherBoard");
                }
                else{
                    String motherBoard = null;
                }

                toPush.put("name", current.getString("Name"));
                toPush.put("motherBoard", null);
                toPush.put("CPU", current.getString("CPU"));
                toPush.put("RAM", current.getString("RAM"));
                toPush.put("GPU", current.getString("GPU"));
                toPush.put("ROM", current.getString("HDD"));
                toPush.put("powerSupply", current.getString("Alim"));
                toPush.put("price", current.getString("prix"));
                toPush.put("RAM_freq", null);
                toPush.put("CPU_freq", current.getString("Freq_CPU"));
                toPush.put("GPU_freq", null);
                toPush.put("GPU_RAM", current.getString("Ram_GPU"));
                toPush.put("E_S", current.getString("ES"));
                toPush.put("case_PC", current.getString("boitier"));
                toPush.put("airing", null);
                toPush.put("OS", current.getString("OS"));
                toPush.put("brand", current.getString("marque"));
                toPush.put("soundCard", null);


            }

        }
        catch (Exception je) {
            je.printStackTrace();
        }
    }
    
    /** Lit l'InputStream entièrement et le charge en mémoire sous forme de String avec le charset donné.
     * Ignore les fins de ligne.
     * Ne ferme pas l'InputStream, qui doit donc être fermé par son créateur. */
    public static String inputStreamToString(InputStream is, Charset charset) throws IOException {
      StringBuilder builder = new StringBuilder();
      BufferedReader reader = new BufferedReader(new InputStreamReader(is, charset));
      for(String line = reader.readLine(); line != null; line = reader.readLine()) {
        builder.append(line);
      }
      return builder.toString();
    }
     
    /** Lit le fichier entièrement et le charge en mémoire sous forme de String avec le charset donné.
     * Ignore les fins de ligne. */
    public static String fileToString(File file, Charset charset) throws IOException {
      try(InputStream is = new FileInputStream(file)) {
        return inputStreamToString(is, charset);
      }
    }
     
    /** Lit le fichier utf-8 entièrement et le charge en mémoire sous forme de String.
     * Ignore les fins de ligne. */
    public static String utf8FileToString(File file) throws IOException {
        return fileToString(file, Charset.forName("utf-8"));
    }
}
