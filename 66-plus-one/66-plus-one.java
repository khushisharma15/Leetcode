class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int carry=1;
        int r=n-1;
        while(r>=0){
            if(digits[r]<9){
                digits[r]++;
                return digits;
            }
            else{
                digits[r]=0;
            }
            r--;
        }
        int []arr=new int[n+1];
        arr[0]=1;
        return arr;
    }
}