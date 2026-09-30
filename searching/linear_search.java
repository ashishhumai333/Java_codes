package searching;
import java.util.*;

public class linear_search {
    public static void main(String[] args) {

        //Linear Search number k liye
        int[] arr={1,2,3,4,8,5,7};
        int target=4;
        System.out.println(linear_number(arr, target));//linear_number search k code ko call kar rahe hai

        //Linear Search charcter k liye
        String s="Ashish";
        char t='s';
        System.out.println(linear_char(s, t));
        
    }



    //<------------------------------CONCEPT------------------------------------------->
    // Linear serach me hum array k har element ko ek ek karke dekhte hai ki kya woh taregt k barabar hai aur 
    //agar hame element mil jata hai toh uska index return kar dete hai.




    //Number k liye.
    public static int linear_number(int[] arr,int target){//ye linear search ka code hai
        int i=0;
        while(i<arr.length){
            if(arr[i]==target) return i;
            i++;
        }
        return -1; //agar target array me na ho tab
    }

    //Character k liye
    public static boolean linear_char(String s,char t){
        if(s.length()==0) return false;
        for(char ch:s.toCharArray()){
            if(ch==t) return true;
        }
        return false; // agar t string me na ho tab
    }

    //Iska time complexity O(n) hoga jaha (n=array ki length) hogi kyuki hum array k saare element ko traverse kar rahe hai.
    //Iska space complexity O(1) hogi kyuki isme hum koi bhi extra space use nhi kar rahe hai.
}
