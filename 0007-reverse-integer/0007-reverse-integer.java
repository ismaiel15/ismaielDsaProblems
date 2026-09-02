class Solution {
    public int reverse(int x) {
        int remainder;
        int digit = 0;

        while (x != 0) {
            remainder = x % 10;

            if (digit > Integer.MAX_VALUE / 10 ||
                digit < Integer.MIN_VALUE / 10) {
                return 0;
            }

            digit = digit * 10 + remainder;

            x = x / 10;
        }

        return digit;

    }
}