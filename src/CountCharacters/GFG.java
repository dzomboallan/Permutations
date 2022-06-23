package CountCharacters;

import java.util.*;
import java.io.*;

public class GFG {
    static int NO_OF_CHARS = 256;

    static boolean arePermutation(char str1[], char str2[]){
        //Create 2 count arrays and initialize all values as 0
        int count1[] = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int count2[] = new int[NO_OF_CHARS];
        Arrays.fill(count2, 0);
        int i;

        //For each character in the input string, increment count to  the corresponding count array
        for(i=0; i< str1.length && i< str2.length; i++){
            count1[str1[i]]++;
            count2[str2[i]]++;
        }
        //If both strings are of different length. Removing this condition will make the program
        //fail for things like "aaca" and "aca'
        if(str1.length != str2.length)
            return false;
        //Compare count arrays
        for(i=0;i < NO_OF_CHARS;i++)
            if(count1[i] != count1[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        char str1[] = ("allan").toCharArray();
        char str2[] = ("lalan").toCharArray();

        if(arePermutation(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}
