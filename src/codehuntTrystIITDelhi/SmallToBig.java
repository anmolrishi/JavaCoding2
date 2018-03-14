package codehuntTrystIITDelhi;

import java.util.Scanner;

public class SmallToBig {
    public static void main(String[] args){Scanner s = new Scanner(System.in);String i = s.nextLine(),a="";for (int j = 0; j < i.length(); j++){if (i.charAt(j) >= 'a' && i.charAt(j) <= 'z'){a+=(char)(i.charAt(j)-32);}else if(i.charAt(j) >= 'A' && i.charAt(j) <= 'Z'){a+=(char)(i.charAt(j)+32);}else{a+=i.charAt(j);}}System.out.println(a); }
}
