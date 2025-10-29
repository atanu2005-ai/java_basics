import java.util.*;
public class trappedwater {
    public static int water(int[] height) {
        int n = height.length;
        //find left max height
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //find right max height
        int[] rightmax = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        //loop (fow water level calculation)
        int trappedwater = 0;
        for(int i=0; i<n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int num = sc.nextInt();
        int[] height = new int[num];
        System.out.println("Enter the value of the array: ");
        for(int i=0; i<num; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println("Volume of trapped water: " + water(height));
        sc.close();
    }
}