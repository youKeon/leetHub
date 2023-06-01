class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        ArrayList<String> list = new ArrayList<>();
        
        for (String x : magazine.split("")) {
            list.add(x);
        }
        
        for (String x : ransomNote.split("")) {
            if (!list.contains(x)) return false;
            list.remove(x);
        }
        return true;
    }
}