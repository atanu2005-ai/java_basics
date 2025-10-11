import java.util.*;
public class ptr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for(int i=1; i<=row; i++) {
            for(int s=1; s<=row-i; s++) {
                System.out.print(" ");
            }
            if(i == 1 || i == row) {
                for(int j=1; j<=col; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");
                for(int k=2; k<col; k++) {
                    System.out.print(" ");
                }
                System.out.print("* ");
                System.out.println();
            }
        }
        sc.close();
    }
}    
