import java.util.*;
public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] ara = new String[n];

        for (int i = 0; i < ara.length ; i++) {
            ara[i] = sc.next();
        }

        for (int i = 0; i < ara.length ; i++) {
            if (ara[i].length() < 10 && ara[i].length() !=0 || ara[i].length() ==10 ){
                System.out.println(ara[i]);
            }
            else {
                int wordLength = ara[i].length();
                System.out.print(ara[i].charAt(0));
                System.out.println(wordLength-2 + "" + ara[i].charAt(wordLength-1));
            }


        }



    }
}
