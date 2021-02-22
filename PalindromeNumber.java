public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String xString = Integer.toString(x);
        StringBuffer yString = new StringBuffer(xString.length());

        for(int i = xString.length() - 1; i >= 0; i--) {
            yString.append(xString.charAt(i));
            System.out.println(yString);
        }

        return xString.equals(yString.toString());
    }
}
