class Solution {

    public void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int partition(int[] arr , int low , int high){
        int pivot = arr[high];

        int i = low-1;

        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    public void Sorting(int[] arr , int low , int high){
        if(low < high){
            int pi = partition(arr , low , high);

            Sorting(arr , low , pi-1);
            Sorting(arr , pi+1 , high);

        }
    }
    public int[] quickSort(int[] nums) {
        Solution sol = new Solution();
        int n = nums.length;
        sol.Sorting(nums , 0 , n-1);

        return nums;
    }
}
