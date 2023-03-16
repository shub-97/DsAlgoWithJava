package Array;

import java.util.Arrays;
import java.util.Stack;

public class ImplementArray {
	
	
	private String[] data;
	
	private int length;
	private int capacity;
	
	
	public ImplementArray(){
		this.data=new String[1];
		this.capacity=1;
		this.length=0;		
		
	}

	
	//push method for array
	public void push(String item){
		if(length==capacity) {
			String[] tempData=Arrays.copyOf(data, 2*capacity);
			data=tempData;
			capacity*=2;	
			
		}
		data[length]=item;
		length++;
	}
	
	//get method for array at specific index
	public String get(int index){
		if(index > capacity || index <-1) {
			return "Idex Out of Bound";
		}
		else return data[index];
	}
	
	//get method for array 
	String[] getArray(){
		 return Arrays.copyOf(data,length);
	}
	
	//pop method remove from end
	public void pop() {
		if(length >0) length --;
	}
	
	
	//return length of array
	public int getLength() {
		return length;
	}
	
	
	//delete element at given index
	void delete(int index){
		if(index >-1 && index <length) {
			if(index==length-1) pop();
			else {
				for(int i=index;i<length;i++) {
					data[i]=data[i+1];
				}
				length--;
			}
		}else System.out.println("Index Outof Bound");
	}
	
	
	//replace at specific index, data
	public void replace(int index, String item) {
		if(index >-1 && index<length) {
			data[index]=item;
		}else System.out.println("Index Out Of Bound");
	}
	

	public static void main(String[] args) {
			
	ImplementArray arr = new ImplementArray();
	arr.push("hi");
	System.out.println("\t Array is =" +Arrays.toString(arr.getArray()));
	arr.push("how");
	System.out.println("\t Array is =" +Arrays.toString(arr.getArray()));
	arr.push("are");
	arr.push("you");
	arr.push("shub");
	System.out.println("\t Array is =" +Arrays.toString(arr.getArray()));
	arr.replace(2, "could");
	System.out.println("\t New replaced Array is =" +Arrays.toString(arr.getArray()));
	arr.pop();
	System.out.println("\t Array is =" +Arrays.toString(arr.getArray()));
	arr.delete(1);
	System.out.println("\t Array is =" +Arrays.toString(arr.getArray()));
	
	System.out.println("\t Length of given Array is =" +(arr.getLength()));
	}

}
