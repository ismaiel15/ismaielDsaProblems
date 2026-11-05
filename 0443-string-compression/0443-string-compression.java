class Solution {
    public int compress(char[] chars) {
           int n = chars.length;
    if (n == 1) {
        return 1;
    }

    StringBuffer sb = new StringBuffer();
    char current = chars[0];
    int count = 0;

    for (int i = 0; i < n; i++) {

        if (chars[i] == current) {
            count++;
        }
        else {
            sb.append(current);

            if (count > 1) {
                sb.append(count);
            }

            current = chars[i];
            count = 1;
        }
    }

    // Process the last group
    sb.append(current);

    if (count > 1) {
        sb.append(count);
    }

    // Copy compressed characters into original array
    for (int i = 0; i < sb.length(); i++) {
        chars[i] = sb.charAt(i);
    }

    return sb.length();
    }
}