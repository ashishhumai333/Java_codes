package sorting;
import java.sql.Time;
import java.util.*;
public class bubble_sort {
    public static void main(String[] args) {
        int[] arr={1,4,6,2,7,5,30};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }


    //<---------------------------CONCEPT--------------------------->
    // BUBBLE SORT

    // Example:
    // [5, 1, 4, 2, 8]
    // Compare adjacent elements and swap if left > right.


    // PASS 1
    // --------

    // [5, 1, 4, 2, 8]
    //  ↑  ↑
    //  5 > 1  → SWAP

    // [1, 5, 4, 2, 8]
    //     ↑  ↑
    //     5 > 4  → SWAP

    // [1, 4, 5, 2, 8]
    //        ↑  ↑
    //        5 > 2  → SWAP

    // [1, 4, 2, 5, 8]
    //           ↑  ↑
    //           5 < 8  → NO SWAP

    // Result:
    // [1, 4, 2, 5, 8]
    //              ↑
    //         Largest element
    //         reached the end!


    // PASS 2
    // --------

    // [1, 4, 2, 5, 8]
    //  ↑  ↑
    //  1 < 4  → NO SWAP

    // [1, 4, 2, 5, 8]
    //     ↑  ↑
    //     4 > 2  → SWAP

    // [1, 2, 4, 5, 8]
    //        ↑  ↑
    //        4 < 5  → NO SWAP


    // PASS 3
    // --------

    // [1, 2, 4, 5, 8]

    // Already sorted → NO SWAPS


    // FINAL RESULT
    // ------------

    // [1, 2, 4, 5, 8]


    //Bubble Sort code
    public static void bubble(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean check=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1); //dono element ko swap(mtlb ek dusre se badal denge).
                    check=true;
                }
            }
            if(!check){break;} //Agar ek bhi swap nhi hua matlab sare elements sorted hai toh loop break kar denge.
        }
    }
    

    //Swapping Function
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


    // Time Complexity:
    // Best    → O(n)     [with optimized version]
    // Average → O(n²)
    // Worst   → O(n²)

    // Space Complexity:
    // O(1)

    // Stable: Yes
    // In-place: Yes
}
