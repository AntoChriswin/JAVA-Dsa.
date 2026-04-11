import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        
        int len = (n+"").length();
        int result = 0;
        
        for(int num = n;num > 0; num = num/10){
            result = result + (int)Math.pow(num%10,len);
        }
        if(result == n){
            System.out.println("its a Armstrong");
        }
        else{
            System.out.println("its not a Armstrong");
        }
    }
}
