public class Palindrome {
    public static boolean isPalindrome(String s){
        char[] charArray = s.toCharArray();
        return isPalindromeAux(charArray, 0);
    }
    public static boolean isPalindromeAux(char[]  s, int i){
        if(i>=s.length-1-i){
            return true;
        }
        if(s[i]!=s[s.length-1-i]){
            return false;
        }
        return isPalindromeAux(s,i+1);
    }
}
