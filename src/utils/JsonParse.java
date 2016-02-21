package utils;

import java.io.*;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.util.HashMap;

import org.json.*;

public class JsonParse {
    public static void reader(File file, Connection conn) {

        try {
            JSONObject _file = new JSONObject(utils.JsonParse.utf8FileToString(file));

            JSONArray data = _file.getJSONArray("data");
            JSONObject _computer = data.getJSONObject(0);
            JSONArray computer = _computer.getJSONArray("computer");

            for (int i = 0 ; i < computer.length() ; i++){
                JSONObject current = computer.getJSONObject(i);

                HashMap<String, String> toPush = new HashMap<>();

                toPush.put("name", (current.has("Name") ? current.getString("Name") : null));
                toPush.put("motherBoard", (current.has("motherBoard") ? current.getString("motherBoard") : null));
                toPush.put("CPU", (current.has("CPU") ? current.getString("CPU") : null));
                toPush.put("RAM", (current.has("RAM") ? current.getString("RAM") : null));
                toPush.put("GPU", (current.has("GPU") ? current.getString("GPU") : null));
                toPush.put("ROM", (current.has("HDD") ? current.getString("HDD") : null));
                toPush.put("powerSupply", (current.has("Alim") ? current.getString("Alim") : null));
                toPush.put("price", (current.has("prix") ? current.getString("prix") : null));
                toPush.put("RAM_freq", (current.has("Freq_RAM") ? current.getString("Freq_RAM") : null));
                toPush.put("CPU_freq", (current.has("Freq_CPU") ? current.getString("Freq_CPU") : null));
                toPush.put("GPU_freq", null);
                toPush.put("GPU_RAM", (current.has("Ram_GPU") ? current.getString("Ram_GPU") : null));
                toPush.put("E_S", (current.has("ES") ? current.getString("ES") : null));
                toPush.put("case_PC", (current.has("boitier") ? current.getString("boitier") : null));
                toPush.put("airing", null);
                toPush.put("OS", (current.has("OS") ? current.getString("OS") : null));
                toPush.put("brand", (current.has("marque") ? current.getString("marque") : null));
                toPush.put("soundCard", null);
                toPush.put("pict", (current.has("pict") ? current.getString("pict") : null));

                utils.ConnectDB.pushComputerOnDB(toPush);
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
