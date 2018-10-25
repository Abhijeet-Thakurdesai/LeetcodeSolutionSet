package largestnumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Solution {

    public static String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0){

            return "0";
        }

        String[] stringOfNumbers = Arrays.stream(nums).mapToObj( String::valueOf )
                .toArray(String[]::new);

        Arrays.sort(stringOfNumbers, (s1, s2)-> {
            String order1 = s1+s2;
            String order2 = s2+s1;
            return order2.compareTo(order1);
        });

        if (stringOfNumbers[0].equals("0")) return "0";

        StringBuilder stringBuilder = new StringBuilder();
        for (String number : stringOfNumbers) {
            stringBuilder.append(number);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {3,30,34,5,9};
        System.out.println(Solution.largestNumber(numbers));
    }
}

/*
[3,30,34,5,9]
 930 ,309, 59 95 ...

 */