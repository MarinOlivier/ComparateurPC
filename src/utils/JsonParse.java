package utils;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Iterator;

import org.json.*;

/**
 * Created by olivier on 06/01/2016.
 */
public class JsonParse {

    public static void reader(File file) {

        try {
            JSONObject _file = new JSONObject(utils.JsonParse.utf8FileToString(file));
            Iterator<?> keys = _file.keys();

            while (keys.hasNext()){
                String key = (String)keys.next();
                System.out.println("key = " + key);
            }
        }
        catch (Exception je) {
            System.out.printf("JSONException: " + je.getMessage());
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
