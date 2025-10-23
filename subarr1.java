import java.util.*;
public class subarr1 {
    public static void subarr(int num[]) {
        int ts = 0, maxsum = Integer.MIN_VALUE, minsum = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++) {
            for(int j=i; j<num.length; j++) {
                int sum = 0;
                for(int k=i; k<=j; k++) {
                    System.out.print(num[k] + " ");
                    sum += num[k];
                }
                if(sum > maxsum) {
                    maxsum = sum;
                }
                if(minsum > sum) {
                    minsum = sum;
                }
                System.out.println();
                ts++;
            }
        }
        System.out.println("Total subarrays: " + ts);
        System.out.println("Maximun sum: " + maxsum);
        System.out.println("Minimum sum: " + minsum);
    }
    public static void main(String[] args) {
        int num[] = {40, 32, 10, 34, 39, 12, 54, 46, 73, 30, 85};
        subarr(num);
    }
}
