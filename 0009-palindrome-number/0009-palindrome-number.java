class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder str = new StringBuilder(String.valueOf(x));
        
        if(str.reverse().toString().equals(String.valueOf(x))) return true;
        else return false;
    }
}