package codehuntTrystIITDelhi;

import java.util.Scanner;

public class quad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();

        int root1, root2;

        double d = b * b - 4 * a * c;

        if(d > 0) {
            root1 = (int) ((-b + Math.sqrt(d)) / (2 * a));
            root2 = (int) ((-b - Math.sqrt(d)) / (2 * a));
            System.out.println(root1+" "+root2);
        }
        else if(d == 0)
        {
            root1 = root2 = -b / (2 * a);
            System.out.println(root1 + " " + root2);

        }
    }

}
