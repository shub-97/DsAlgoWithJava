package HashTable;

import java.util.HashMap;
import java.util.Map;

//Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]:
//It should return 2

//Given an array = [2,1,1,2,3,5,1,2,4]:
//It should return 1

//Given an array = [2,3,4,5]:
//It should return undefined

public class FirstRecurringExercise {
    
    private int checkRecurring(int[] input1) {

        Map<Integer,Integer> input=new HashMap<>();   //can be solved using HashSet also
        Integer k=0; int value=-1;
        for(int i:input1){    //o(n)
            if(input.containsValue(i)){           
            value=i;
            break;
            }
            input.put(k, i);
            k++;
        }
        return value;    
       

        //brute force method O(n)*O(n) =O(n^2)
        /* Boolean flag=false;      
        for(int i=0;i<input1.length;i++) {   //O(n)
            for(int j=i+1;j<input1.length;j++) {  //O(n)
                if(input1[i]==input1[j]) {   O(1)
                    System.out.println(input1[i]);
                    flag=true;
                    break;
                }                
            }
            if(flag==true) {
                return input1[i];
            }
        } */
       

    }

    public static void main(String[] args) {
        int [] input1={2,5,5,2};
        FirstRecurringExercise recur=new FirstRecurringExercise();        
        System.out.println("1st recurring is :" +recur.checkRecurring(input1));

    }

    
}
