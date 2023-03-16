package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sort_MergeArrary {

	


	public static void main(String[] args) {

		Sort_MergeArrary merge=new Sort_MergeArrary();
		int [] nums = {2,5,5,11};
		merge.twoSum(nums,6);
		
		/*		int[] arr1= {21,14,3,5};
		int[] arr2= {6,8,43,12};
		 *  merge.mergeSort(arr1,arr2);
		 */

	}
	
	
	    public int[] twoSum(int[] nums, int target) {
			/*
			 * Map<Integer, int[]> temp = new HashMap(); temp.put(target, nums);
			 */
	        int []  ref=new int[2];
	        if(nums.length==2){
	                      ref[0]=0;
	            ref[1]=1;
	         return ref;
	        }else{
	                        
	        for(int i=0;i<nums.length;i++){    
	            
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]+nums[j]==target){
	                    ref[0]=i;
	                    ref[1]=j;
	                    return ref;                 
	                }         }

	        }
	         return ref;
	        }
	    }

	    

	/*
	 * private void mergeSort(int[] arr1, int[] arr2) { Arrays.sort(arr1);
	 * Arrays.sort(arr2); int len1=arr1.length; int len2=arr2.length; int
	 * mergeLength=arr1.length +arr2.length; int [] merge =new int[mergeLength];
	 * for(int j=0;j<len1;j++) { merge[j]=arr1[j]; } int p=0; for(int
	 * k=len2;k>0;k--) { merge[mergeLength-k]=arr2[p]; p++; } Arrays.sort(merge);
	 * System.out.println("Merged Array is : " +Arrays.toString(merge ));
	 * 
	 * 
	 * }
	 */

}
