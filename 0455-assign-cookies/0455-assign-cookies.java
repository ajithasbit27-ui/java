class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int count = 0;
        int i = 0;
        
        while (i < s.length && count < g.length) {
            if (s[i] >= g[count]) {
                count++;
            }
            i++;
        }
        
        return count;
    }

}