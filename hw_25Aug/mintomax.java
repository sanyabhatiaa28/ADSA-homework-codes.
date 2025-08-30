package hw_25Aug;

//min to max problem codechef
//in this ques basic logic is if all number are less or eqaul to min then min is max number so we count freq of min and subtract it from total number of elements will get number of operations req to make min a max element in the givenn arr
import java.util.*;

public class mintomax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // these are the number of test cases
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            // firstly we will find the minimum element
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                if (A[i] < min) {
                    min = A[i];
                }
            }

            // Count frequency of M
            int countMin = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] == min) {
                    countMin++;
                }
            }

            // Result = total elements - count of minimum these no. of op req to make min a max number in arr
            System.out.println(N - countMin);
        }

        sc.close();
    }
}
