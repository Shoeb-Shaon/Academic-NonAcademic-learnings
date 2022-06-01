import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        System.out.println("Number key stream bits R1");
        int r1Size = sc.nextInt();
        int r1 [] = new int [r1Size+1] ;

        System.out.println("Enter bits in R1 array: ");
        for (int i = 0; i <r1.length ; i++)
            r1[i]=sc.nextInt();

        System.out.println("Number of key stream bits in R2");
        int r2Size = sc.nextInt();
        int r2 [] = new int [r2Size+1] ;

        System.out.println("Enter bits in R2 array: ");
        for (int i = 0; i <r2.length ; i++)
            r2[i]=sc.nextInt();

        System.out.println("Number of key stream bits in R3");
        int r3Size = sc.nextInt();
        int r3 [] = new int [r3Size+1] ;

        System.out.println("Enter bits in R3 array: ");
        for (int i = 0; i <r3.length ; i++)
            r3[i]=sc.nextInt();

        int clockingBitR1 = 8;
        int clockingBitR2 = 10;
        int clockingBitR3 = 10;

        int trapBitR1 [] = new int []{13,16,17,18};
        int trapBitR2 [] = new int []{20,21};
        int trapBitR3 [] = new int []{7,20,21,22};

         int [] majArray = new int [3];

         int arr[] = new int [64];


        int k =0 ;


       while(k<=64) {

            int majBit = 0;
            if ((r1[clockingBitR1] + r2[clockingBitR2] + r3[clockingBitR3]) >= 2)
                majBit = 1;



            int xor1 = 0, xor2 = 0, xor3 = 0;

            if (r1[clockingBitR1] == majBit) {
                xor1 = r1[13] ^ r1[16] ^ r1[17] ^ r1[18];
                Methods.rightShift(r1, xor1);
            }

            if (r2[clockingBitR2] == majBit) {
                xor2 = r2[21] ^ r2[21];
                Methods.rightShift(r2, xor2);
            }

            if (r3[clockingBitR3] == majBit) {
                xor2 = r3[7] ^ r3[20] ^ r3[21] ^ r3[22];
                Methods.rightShift(r2, xor3);
            }

            arr[k] = r1[r1.length-1]^r2[r2.length-1]^r3[r3.length-1];
            k++;
        }

        for (int x: arr
            ) {
            System.out.print(x);

        }
    }
}
