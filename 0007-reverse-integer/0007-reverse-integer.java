class Solution {
    public  int reverse(int x) {
    boolean isNegative = x < 0;
    if (isNegative) {
        x = -x;
    }

    String str = String.valueOf(x);
    char[] str2 = new char[str.length()];

    for (int i = str.length() - 1; i >= 0; i--) {
        str2[str.length() - 1 - i] = str.charAt(i);
    }

    String reversedStr = new String(str2);

    int result;
    try {
        result = Integer.parseInt(reversedStr);
    } catch (NumberFormatException e) {
        return 0; // overflow occurred
    }

    if (isNegative) {
        result = -result;
    }

    return result;
}

    }