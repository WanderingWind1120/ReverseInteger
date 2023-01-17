package org.example;

public class Solution {
    public int reverse(int x) { 

        long store = x;
        long ans = 0;

        // Nếu x dương reverse như bình thường
        if (x > 0) {
            ans = helper (x, 0);
            if (ans > Integer.MAX_VALUE) store =  0;
            else store = ans;

        } else {

            // Nếu x âm nhân với -1
            long positive = x * -1;
            ans = helper (positive, 0);

            // Nếu x ra ngoài khoảng cho phép của của kiểu dữ liệu Int thì gán kết quả bằng 0
            if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) store = 0;
            else store = -(ans);
        }
        return (int) store;
    }

    // Sử dụng đệ quy đảo ngược tham số integer lớn được pass in
    static long helper (long n, long rev) {

        // base case;
        if (n == 0) {
            return rev;
        }

        long rem = n % 10;
        return helper (n = n / 10, rev = (rev * 10) + rem);
    }
}
