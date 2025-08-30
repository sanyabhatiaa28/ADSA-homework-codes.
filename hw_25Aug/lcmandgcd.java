package hw_25Aug;
class Solution {
    public static int[] lcmandgcd(int a, int b) {
        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;
        return new int[]{lcm, gcd};
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
