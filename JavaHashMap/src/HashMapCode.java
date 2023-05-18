/*
     hashmap : set of key value pairs
     values will be auto-sorted
 */

import java.util.HashMap;

public class HashMapCode {
    public static void main(String[] args)
    {
        HashMap <String,Integer> eID = new HashMap<>();  // <> is called diamond operator

        eID.put("Abdur Rahman", 202260);
        eID.put("Mahdi", 272270);
        eID.put("Aliraj", 272277);

        System.out.println(eID.keySet());  // [Abdur Rahman, Aliraj, Mahdi]
        System.out.println(eID);           // {Abdur Rahman=202260, Aliraj=272277, Mahdi=272270}
        System.out.println("ID of Abdur Rahman : " + eID.get("Abdur Rahman"));  // 202260


        eID.remove("Aliraj");
        System.out.println(eID);  // {Abdur Rahman=202260, Mahdi=272270}


        eID.replace("Mahdi", 5555555);
        System.out.println(eID);   //  {Abdur Rahman=202260, Mahdi=5555555}


        eID.putIfAbsent("L Lawliet", 485612);
        System.out.println(eID);   //  {Abdur Rahman=202260, Mahdi=5555555, L Lawliet=485612}


        eID.putIfAbsent("Abdur Rahman", 874512);  // no change since it's already present
        System.out.println(eID);   //   {Abdur Rahman=202260, Mahdi=5555555, L Lawliet=485612}
    }
}
