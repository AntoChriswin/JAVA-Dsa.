class Solution {
    // Please change the array in-place
    public void sorting(int[] arr , int n){
        if(n<=0){
            return;
        }
        sorting(arr,n-1);
        int key = arr[n-1];
        int j = n-2;
        
        while(j>=0 && arr[j] > key){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
    
    
    public void insertionSort(int arr[]) {
        // code here
        int n = arr.length;
        Solution sol = new Solution();
        sol.sorting(arr,n);
        for(int num : arr){
            System.out.print(num+" ,");
        }
    }
    public static void main(String[] args){
        int arr[] = {12, 11, 13, 5, 6};
        Solution sol = new Solution();
        sol.insertionSort(arr);
    }
}
