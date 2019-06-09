package Collections;

import java.util.HashMap;

public class Question3 {
    public static void main(String[] args) {

        HashMap<String, String> hmap = new HashMap<String, String>();
        hmap.put("Israel", "Jerusalem");
        hmap.put("USA", "Washington D.C");
        hmap.put("Great Britain", "London");
        hmap.put("Germany", "Berlin");

        System.out.println(hmap.get("Israel"));
        
    }
}
