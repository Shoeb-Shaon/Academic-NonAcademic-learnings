import java.util.Scanner;

public class SuperIncreasingKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size numbers of elements");
        int size = sc.nextInt();
        System.out.println("Enter the elements / private keys: ");
        int [] arr = new int [size];
        for (int i = 0; i <size ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int[] arr2 = new int [size];
        for (int i = 0; i <size ; i++) {
            arr2[i] = (arr[i]*m ) % n ;
        }
        System.out.println("General knapsack / public key: ");
        for (int x:
                arr2) {
            System.out.print(x + ",");
        }
        Methods method = new Methods();
        int magicNumber= method.modInverse(m,n);
        int [] plainText = new int [size];
        System.out.println("\nEnter the plainText one by one in array");

        for (int i = 0; i <size; i++) plainText[i] = sc.nextInt();
        int sum=0;
        for (int i = 0; i <size ; i++) {
            if(plainText[i]==1)
                sum=sum+arr2[i];
        }
        System.out.println("Now Decrypting");
        int s = (sum*magicNumber)%n;
        int x = 0;
        int finalSum [] = new int[size];
        for (int i = 0; i <size; i++) {
            if(arr[arr.length-1-i]<= s){
                finalSum[finalSum.length-1-i] = arr[arr.length-1-i];
                s= s- arr[arr.length-1-i];
            }
        }
        for (int p:finalSum
        ) System.out.print(p + "+");


        for (int i = 0; i <size ; i++) {
            if(finalSum[i]!=0){
                finalSum[i]=1;
            }
        }System.out.println();
        for (int p:finalSum
        ) {
            System.out.print(p);
        }
    }
}
