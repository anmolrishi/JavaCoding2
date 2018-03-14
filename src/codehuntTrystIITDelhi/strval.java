package codehuntTrystIITDelhi;

import java.util.Scanner;

public class strval {
    public static void main(String[] args){Scanner s = new Scanner(System.in);String i=s.next();int a=0;for (int j = 0; j < i.length(); j++){a+=(i.charAt(j)-96);}System.out.print(a);}
}
