package utils;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.json.*;

/**
 * Created by olivier on 06/01/2016.
 */
public class JsonParse {

    public static void reader(String file){

        try {
            JSONObject _file = new JSONObject(file);

            Iterator<?> keys = _file.keys();

            while (keys.hasNext()){
                String key = (String)keys.next();
                System.out.println("key = " + key);
            }
        }
        catch (JSONException je){
            System.out.printf("JSONException: " + je.getMessage());
        }

    }
}
