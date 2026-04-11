class Solution {
    public int Fact(int n) {
        if(n == 0){
            return 1;
        }
        else{
            return n*Fact(n-1);
        }
        
    
    }
    public static void main(String[] args){
        Solution arr = new Solution();
        System.out.println(arr.Fact(3));
    }
}
