package hw_25Aug;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    static ArrayList<Integer> arraysleader(int arr[], int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int maxFromRight = arr[n - 1];
        ans.add(maxFromRight);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                ans.add(arr[i]);
                maxFromRight = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
