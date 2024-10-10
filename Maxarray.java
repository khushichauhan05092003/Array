import java.util.Scanner;

public class Maxarray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;//this was the generic method while arr[0] is not the generic method
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            System.out.println(max);
    }
    
}
