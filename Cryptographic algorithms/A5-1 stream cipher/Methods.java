public class Methods {

    public static int[] rightShift(int[] r1 , int xor) {
        for(int i = 0 ; i < r1.length-1; i++){
            r1[r1.length-1-i]=r1[r1.length-2-i];
        }

        r1[0]=xor;
        return r1 ;

    }
}

