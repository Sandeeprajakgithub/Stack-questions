//selection sort
import java.util.*;
class A{
    public static void main(String args[]){
        int arr[] = {4,1,9,2,0,0,3,6};

        int n = arr.length;
        System.out.println(n);
        for(int i = 0 ; i < n ; i++){
            int min = i;
            for(int j = i+1 ; j < n ; j++){
                if(arr[j]<arr[min]){
                    int y = arr[min];
                    arr[min] = arr[j];
                    arr[j] = y;
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print("  "+arr[i]);
        }
    }
}

// Sandeep Rajak