// https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1

import java.util.*;

public class TripletSuminArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(find3Numbers(a, n, k));
    }

    private static int find3Numbers(int[] a, int n, int k) {
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            int x = i + 1, y = n - 1;
            while (x < y) {
                int king = a[i] + a[x] + a[y];
                if (king == k) return 1;
                else if (king > k) y--;
                else x++;
            }
        }
        return 0;
    }
}
