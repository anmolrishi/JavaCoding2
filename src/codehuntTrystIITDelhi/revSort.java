package codehuntTrystIITDelhi;

import java.util.Collections;import java.util.Arrays;
import java.util.Scanner;


public class revSort {
    public static void main(String[] args){Scanner s = new Scanner(System.in);int n=s.nextInt();Integer array[] = new Integer[n];for (int i = 0; i < array.length; i++) { array[i]=s.nextInt();}Arrays.sort(array, Collections.reverseOrder());for (int i = 0; i < array.length; i++){System.out.print(array[i] + " "); } }
}
