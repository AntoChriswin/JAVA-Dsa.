class Main {
    public static void main(String[] args) {
        int[] arr = {4,1,4,4,4,4};
        int max1,max2;
        if(arr[0] > arr[1]){
            max1 = arr[0];
            max2 = arr[1];
        }
        else{
            max1 = arr[1];
            max2 = arr[0];
        }
        for(int n : arr){
            if(n > max1){
                max2 = max1;
                max1 = n;
            }
            else if(n > max2 && n < max1){
                max2 = n;
            }
        }
        if(max1 == max2){
            System.out.println(-1);
        }
        else{
            System.out.println(max2);
        }
    }
}
