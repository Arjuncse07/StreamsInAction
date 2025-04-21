package helper.src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckPalindromic {

    /*
    7.Find All Palindromic Strings in a List using Stream API
        List<String> stringList = Arrays.asList("madam", "level", "hello", "rotor", "stats", "apple",
        "A man, a plan, a canal: Panama", "12321", "");

     */
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("madam", "level", "hello", "rotor", "stats", "apple",
                "A man, a plan, a canal: Panama", "12321", "");

             List<String> palindromicStrings  = stringList.stream()
                .filter(string->!string.trim().isEmpty())
                .filter(CheckPalindromic::checkStringIsPalindromic)
                .collect(Collectors.toList());

        System.out.println("PalindromicStrings Strings::: "+palindromicStrings);
    }

    public static boolean checkStringIsPalindromic(String wordOfString){
        String cleanString= wordOfString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleanString.equals(new StringBuilder(cleanString).reverse().toString());
    }


}
