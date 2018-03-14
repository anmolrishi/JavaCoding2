package codechef;

import java.util.Scanner;

public class felicity {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            String input = s.next();
            String ans = "";
            for (int i = 0; i < input.length(); i++) {
                char c = (char)(input.charAt(i) + i + 1);
                if(c > 122){
                    int l = c - 122;
                    c = (char)(97+ l -1);
                }
                ans+=c;
            }

        System.out.println(ans);

    }
}
