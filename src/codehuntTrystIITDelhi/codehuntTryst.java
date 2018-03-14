package codehuntTrystIITDelhi;

import java.util.Scanner;

public class codehuntTryst { //diff
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        int input[] = new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int i = 0; i < input.length; i++) {
            input[i]=s.nextInt();
            if(max<input[i]){
                max=input[i];
            }

            if(min>input[i]){
                min=input[i];
            }
        }

        System.out.println(max-min);


    }
}
