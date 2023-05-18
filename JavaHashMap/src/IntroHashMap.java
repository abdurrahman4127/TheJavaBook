import java.util.HashMap;

public class IntroHashMap {
    public static void main(String[] args)
    {
        /*
        int a = 10;
        int b = 20;
        int c = 30;
        ...
         */

        HashMap <String,Integer> hMap = new HashMap<>();
        hMap.put("a", 10);
        hMap.put("b", 20);
        hMap.put("c", 30);
        hMap.put("d", 40);
        hMap.put("e", 50);

        //values will be auto-sorted
        System.out.println(hMap);   // {a=10, b=20, c=30, d=40, e=50}
        System.out.println(hMap.values());  // [10, 20, 30, 40, 50]
        System.out.println(hMap.keySet()); // [a, b, c, d, e]
        System.out.println(hMap.get("a")); // 10


        // removing an attribute from the hashmap
        hMap.remove("a");
        System.out.println(hMap);  // {b=20, c=30, d=40, e=50}


        // check if a value contains in the map
        System.out.println(hMap.containsValue(20));  // true
        System.out.println(hMap.containsValue(10));  // false


        // replace the value
        hMap.replace("e",60);
        System.out.println(hMap.values());   // [20, 30, 40, 60]
    }
}
