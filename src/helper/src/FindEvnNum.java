package helper.src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvnNum {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(25,14,10,9,8,15,20,3,2,7);

        List<Integer> evenNumb=  numbers
                .stream()
                .filter(e -> e % 2 !=0)
                .collect(Collectors.toList());

        System.out.println("evenNumbers are ::::: "+evenNumb);


    }

}
