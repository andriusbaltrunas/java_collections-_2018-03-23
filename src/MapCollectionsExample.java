import java.util.HashMap;
import java.util.Map;

/**
 * Created by Studentas on 3/23/2018.
 */
public class MapCollectionsExample {

    public static void main(String[] args) {
        Map<Integer, String> mapExample = new HashMap<>();

        mapExample.put(12, "Jonas");
        mapExample.put(3, "Jonas");
        mapExample.put(4, "Antanas");
        mapExample.put(1, "Petras");
        mapExample.put(12, "Jonas_pakartojam");

        for(Integer m : mapExample.keySet()){
            System.out.println("key:" +m + " values:"+mapExample.get(m));
        }
    }
}
