import java.util.Scanner;

public class SegregateArrayof0and1and2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int [] a = new int[n];
        for (int i =0;i<n;i++){
            a[i] = scan.nextInt();
        }

        int low =0;
        int mid =0;
        int hi = a.length -1;

        while (mid <= hi){
            if (a[mid] == 0){
                int temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;
                mid++;
                temp++;
            } else if (a[mid] ==1) {
                mid++;

            }

            else {
                int temp = a[hi];
                a[hi] = a[mid];
                a[mid] = temp;
                hi--;
            }
        }

        for (int i:
             a) {

            System.out.println(a[i]);

        }
    }
}
