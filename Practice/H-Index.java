class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int h =0;
        for(int i = 0 ; i<n ; i++){
            int pcleast = n-i;
            if(citations[i]>=pcleast){
            h = pcleast;
                    break;
            }
    
        }
        return h;
    }
}