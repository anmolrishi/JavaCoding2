package codechef.FoolsProgramming;

import java.util.Scanner;

public class cheglove {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t=s.nextInt();

        while(t-- >0){
            int n=s.nextInt();
            int L[] = new int[n];
            int G[] = new int[n];

            for (int i = 0; i < L.length; i++) {
                L[i] = s.nextInt();
            }

            for (int i = 0; i < G.length; i++) {
                G[i] = s.nextInt();
            }
            boolean front = true,back = true, both, none;

            for (int i = 0; i < L.length; i++) {
                if(L[i] > G[i]){
                    front=false;
                }
                if(L[i] > G[n-i-1]){
                    back=false;
                }
            }

            if(front && back){
                System.out.println("both");
            }else if(!front && !back){
                System.out.println("none");
            }else if(front && !back){
                System.out.println("front");
            }else{
                System.out.println("back");
            }

        }
    }
}
