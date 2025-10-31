import java.util.*;
public class kadanes {
    //calculate maximum sum using kadanes algorithm
    //key point: if(crr < 0) {crr = 0}
    public static int maxsum(int[] arr) {
        int crr = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            crr += arr[i];
            if(crr < 0) crr = 0;
            max = Math.max(crr, max);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the value of the array: ");
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxsum(arr));
        sc.close();
    }
}
