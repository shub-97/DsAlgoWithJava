package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class duplicateCheck {

	public static void main(String[] args) {
		int[] input= {2,4,5,5};
		PriorityQueue queue = new PriorityQueue<>();
        queue.add(23);
        queue.add(34);
        queue.add(2);
        queue.add(99);
        

       

        System.out.println("1-." +queue.add(199));
		System.out.println("2->" +queue.offer(90));
		System.out.println("3->." +queue.peek());
		
		
		duplicateCheck check=new duplicateCheck();
		System.out.println(check.verify(input));
	}

	private boolean verify(int[] nums) {
		
		int k=0;
		   HashMap<Integer,Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            if (map.containsKey(nums[i])) {
	                return true;
	            }
	            map.put(nums[i],1);
	        
	        }
	        return false;
		/*
		 * List<Integer> arr=new ArrayList(); for(int k:input) { if((arr.contains(k)))
		 * return true; else arr.add(k); }
		 * 
		 * return false;
		 */

}
}
