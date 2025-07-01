package InterviewProblems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {


    public static void nonRepeatingFromLeftSide(String str){
        Map<Character,Integer> frequencyMap = new HashMap<>();

        for( char ch : str.toCharArray()){
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch,0)+1);
        }
        System.out.println(frequencyMap);

        for(char c : str.toCharArray()){
            if (frequencyMap.get(c) == 1){
                System.out.println(" First non repeating char : "+c);
                return;
            }
        }

    }


    public static void nonRepeatingFromRightSide(String str){
        Map<Character,Integer> frequencyMap = new HashMap<>();

        for( char ch : str.toCharArray()){
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch,0)+1);
        }
        System.out.println(frequencyMap);

        for(int i = str.length() - 1; i >=0; i--){
            char c = str.charAt(i);
            if (frequencyMap.get(c) == 1){
                System.out.println(" First Non repeating character from right side :: "+c);
                return;
            }

        }

    }




    public static void main(String[] args) {

        String str = "ibbvJamai";
        nonRepeatingFromLeftSide(str);

        String str1 = "ibbvJamai";
        nonRepeatingFromRightSide(str1);

    }

}
