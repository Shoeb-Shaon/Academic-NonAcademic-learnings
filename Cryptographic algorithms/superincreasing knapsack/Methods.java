public class Methods {
    public static int modInverse(int number, int base) {
        int  invMod = 0;
        int a = number % base;
        for (int x=1; x<base; x++){
            if ((a*x)%base==1){
                invMod = x;
            }
        }
        return invMod;
    }

    public static void relativelyPrime(int a, int b) {
        int max;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        int count = 0;
        for (int i=2; i<=max; i++) {
            if (a % i == 0 && b % i==0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("m and n are relatively Prime");
        } else {
            System.out.println("m and n are Not Prime");
        }
    }
}
