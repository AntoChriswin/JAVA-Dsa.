class Solution {
    public void bubbleSort(int[] arr , int n){
        if(n==1){
            return;
        }
        int count = 0;
        for(int i = 0;i<n-1;i++){
            if(arr[i] < arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count++; 
            }
        }
        if(count == 0){
            return;
        }

        bubbleSort(arr,n-1);
    }
    
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        
        System.out.print("before sorting :  ");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        sol.bubbleSort(arr,n);
        
        
        System.out.print("After sorting :  ");
        for(int num:arr){
            System.out.print(num+" ");
        }
        

    }
    
}
