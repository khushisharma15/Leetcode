class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>res = new ArrayList<>();
        balcomb("(",1,0,res,n);
        return res;
        
    }
    
    void balcomb(String curr, int oc, int cc, List<String>res, int n){
        if(curr.length() == 2*n){
            res.add(curr);
            return;
        }
        
        if(oc<n){
            balcomb(curr+"(",oc+1,cc,res,n);
        }
        if(cc<oc){
            balcomb(curr+")",oc,cc+1,res,n);
        }
        
    }
}