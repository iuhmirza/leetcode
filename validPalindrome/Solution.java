package validPalindrome;

public class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toUpperCase();
        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        char leftChar;
        char rightChar;
        while (leftPointer < rightPointer) {
            leftChar = s.charAt(leftPointer);
            rightChar = s.charAt(rightPointer);
            if (leftChar < 48 || (leftChar > 57 && leftChar < 65) || leftChar > 90) {
                leftPointer++;
                continue;
            }
            if (rightChar < 48 || (rightChar > 57 && rightChar < 65) || rightChar > 90) {
                rightPointer--;
                continue;
            }
            if (leftChar != rightChar) return false;
            leftPointer++;
            rightPointer--;
        }
        return true;
    }
}
