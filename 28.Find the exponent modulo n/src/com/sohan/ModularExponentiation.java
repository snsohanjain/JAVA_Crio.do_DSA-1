package com.sohan;

import java.util.Scanner;

public class ModularExponentiation {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int ans = modularExponentiation(x, n);
        System.out.println(ans);
    }

    // TODO: Implement this method
    static int modularExponentiation(int x, int n) {
        long ans = 1;
        int m = 1000000007;
        for (int i = 0; i < n; i++){
            ans = (ans * x )%m;
        }
        return (int) ans;
    }
}
