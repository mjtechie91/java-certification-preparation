package strings;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeRansomeNote383 {
    public static void main(String[] args) {
       Boolean flag =  canConstruct("hello", "hellohaii");
        System.out.println(flag);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> stringMap = new HashMap<>(ransomNote.length());
        int count = 0;
        for(char c: ransomNote.toCharArray()){

            if(stringMap.containsKey(c)){
                count = stringMap.get(c);
            }
            stringMap.put(c, count + 1);
            count = 0;
            System.out.println(c);
        }

        for(Map.Entry<Character, Integer> entry: stringMap.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("KEY: "+ key + " Value: "+ value);
        }
        count = 0;
        for(char c: magazine.toCharArray()){
            System.out.println(c);
            if(stringMap.containsKey(c)){
                 count = stringMap.get(c) - 1;
                 stringMap.put(c, count);
            }
        }

        for(Map.Entry<Character, Integer> entry: stringMap.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("KEY: "+ key + " Value: "+ value);
            if(value > 0){
                return false;
            }
        }
        return true;
    }
}
