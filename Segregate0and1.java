import java.util.Scanner;

public class Segregate0and1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []a = new int[n];
        
        for (int i =0;i<n;i++){
            a[i] = scan.nextInt();
        }
        
        int start =0;
        int count =0;
        
        for (int i =0;i<n;i++){
            if(a[i] == 1) {
                a[start++] = 1;
            }
        }
        
        for (int i =start;i<n;i++){
            a[i] =0;
        }

        for (int i:
             a) {

            System.out.println(a[i]);
            
        }
    }
}
