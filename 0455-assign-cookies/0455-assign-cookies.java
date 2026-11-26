// class Solution {
//     public int findContentChildren(int[] g, int[] s) {
//         Arrays.sort(g);
//         Arrays.sort(s);
//         int n=g.length;
//         int m=s.length;
//         int l=0,r=0;
//         while(l<m && r<n){
//             if(g[l]<=s[r]){
//                 r++;
//             }
//             l++;
//         }
//         return r;
//     }
// }
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length;
        int m = s.length;
        int l = 0, r = 0;
        while (l < n && r < m) {
            if (s[r] >= g[l]) {
                l++;
                r++;
            } else {
                r++;
            }
        }

        return l;
    }
}