package codehuntTrystIITDelhi;

import java.util.Scanner;

public class nextProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        int input[] = new int[n];
        for (int i = 0; i < input.length; i++) {
            input[i]=s.nextInt();
        }
        int d=input[1]-input[0];
        int ans = input[0] + (n)*d;
        System.out.println(ans);


    }
}
