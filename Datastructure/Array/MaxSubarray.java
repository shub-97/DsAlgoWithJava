package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(	Integer.MIN_VALUE);
	
	int[] nums={-3,-2,-2,-3};
	
	MaxSubarray max=new MaxSubarray();
	System.out.println(max.maxSubArray(nums));

	}
	
	public int maxSubArray(int[] nums) {
		
        if(nums.length==1){
            return nums[0];
        }else{
            //using Kadane’s Algorithm
            int currSum=0;
            int maxSum=Integer.MIN_VALUE;  //so that if -ve is there it will work
            for(int i=0;i<nums.length;i++){
                currSum+=nums[i];
                 maxSum=Math.max(currSum,maxSum);
               currSum=Math.max(currSum,0);
            }
            return maxSum;
            
        }
      
    }
	
	 

}
