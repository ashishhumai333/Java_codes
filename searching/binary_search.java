package searching;

public class binary_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9}; //Sorted array;
        int target=5;
        System.out.println(binary(arr, target));//funtion ko call kar rahe hai 
        
    }


    //<-------------------------------CONCEPT-------------------------------------->
    //Sabse important baat BINARY SEARCH sirf sorted array par hi kaam karta hai.
    // 1-Ek array diya hua hai arr.
    // 2-Do pointers lo ek (low=0) aur ek (high=arr.length-1).
    // 3-Dono k bich ka mid calculate karo (mid=low+((high-low)/2)) formule se.
    // 4-Ab comparison suru karna hai by following steps:
    //     4.a-Agar target==arr[mid] toh mid hi answer hoga.
    //     4.b-Agar target>arr[mid] toh hum low=mid+1 kar denge.
    //     4.c-Agar target<arr[mid] toh hum high=mid-1 kar denge.
    //     4.d-Aur process(3-4) tab tak repeat karenge jab tak ya toh target na mil jaye ya low<=high ho.



    public static int binary(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;  // if target is not in the array
    }
    

    //Iska time complexity O(log(n)) hai kyuki har step me array aadha ho ja raha hai.
    //Iska space complexity O(1) hai kyuki ye extra storage use nhi kar raha hai.
}
