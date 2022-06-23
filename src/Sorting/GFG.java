package Sorting;

import java.util.*;

public class GFG {
    static boolean arePermutations(String str1, String str2){
        //Get length of both strings
        int n1 = str1.length();
        int n2 = str2.length();
        //If the length of the two string are not equal then they cannot be permutation
        if(n1 != n2)
            return  false;
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        //Sort both strings
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        //Compare the sorted arrays
        for(int i=0; i<n1;i++)
            if(ch1[i] != ch2[i])
                return false;
        return true;
    }

    public static void main(String[] args) {

        String input1;
        String input2;
        System.out.println("Enter string 1: ");
        Scanner scanner = new Scanner(System.in);
        input1 = scanner.next();
        System.out.println("Enter string 2: ");
        input2 = scanner.next();

        if(arePermutations(input1, input2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
