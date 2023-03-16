package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {




//method 1 
  public String reverseInLameWay(String inputData) {
	  inputData=inputData.replaceAll("\\s", "");
    int length = inputData.length();
    char[] inputArray=inputData.toCharArray();
    char[] temp=new char[length];
    int index=length;

    for(int i=0;i<length;i++) {    	
    	temp[i]=inputArray[index-1];
    	index--;
    }

    return Arrays.toString(temp);
  }
  
  
  //Method 2
 void reverseUsingSplit(String inputData){
	  String [] data=inputData.split("");
	  
	  int length=data.length;
	 String [] revData=new String[length];
	 int index=length;
	 for(int i=0;i<length;i++) {
		 revData[i]=data[index-1];
		 index--;
	 }
	 printArray(revData);
  }
 
  void printArray(String[] arr){
	  for(String s :arr) {
		  System.out.print(s);
	  }
  }
	 
  
  //method 3
  private String reverseUsingBuilder(String string) {
	  
	  StringBuilder temp=new StringBuilder();
	  for(int i=string.length()-1;i>-1;i--) {
		  temp.append(string.charAt(i));
	  }
	  return temp.toString();
  }
  
  //method4  
  private StringBuilder reverseBuiltIn(String input) {
	  StringBuilder str=new StringBuilder();
	  str.append(input);
	  return str.reverse();
  }
  
  
  //method 5 using java8
  private String reverseUsingJava8(String input) {
	  return Stream.of(input).map(s->new StringBuffer(s).reverse()).collect(Collectors.joining());
  }
  
  //method 6 using recurssion
   public String reverseStringRecursive(String string) {
        if (string.equals("")) {
            return "";
        }
        return reverseStringRecursive(string.substring(1)) + string.charAt(0);
    }
  

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String inputData = sc.nextLine();
    ReverseString rev = new ReverseString();
    System.out.println("Given String is : \t" +inputData);
  // System.out.println("Reversed String is : "  +rev.reverseInLameWay(inputData));
   // System.out.print("Reversed String is : ");
   //rev.reverseUsingSplit(inputData);
   //System.out.println("Reversed String is : "  +rev. reverseUsingBuilder(inputData));
    //System.out.println("Reversed String is : "  +rev. reverseBuiltIn(inputData));
    System.out.println("Reversed String is : "  +rev.reverseUsingJava8(inputData));
    
   
   
  }
}
