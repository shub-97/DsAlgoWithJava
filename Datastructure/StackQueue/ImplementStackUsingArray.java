package StackQueue;

import java.util.ArrayList;
import java.util.List;

public class ImplementStackUsingArray {
    ArrayList<String> array;
    ImplementStackUsingArray (){
        array=new ArrayList<>();

    }

  public void  push(String data){
        array.add(data);       
    }

    public void pop(){
        String temp = array.get(array.size()-1);
        array.remove(array.size()-1);
       
    }

    public String peek (){
        if(array.size()==0) return null;
        return  array.get(array.size()-1);
    }

   void  printStack(){
        for( String s:array) System.out.println(" "+s);
    }


    public static void main(String[] args) {      
        ImplementStackUsingArray stack =new ImplementStackUsingArray();  

        int len=0;
        for(int j=0;j<len;j++){
            System.out.println("hi" +j + " "+len);
        }
        stack.peek();
        stack.push("Google");
        //stack.push("Yahoo");
       // stack.push("Bing");
        System.out.println("stack is :");
        stack.printStack();
        stack.pop();
        System.out.println("stack is :");
        stack.printStack();
        System.out.println("stack is :");
       // stack.push("chatGpt");
        stack.printStack();

    }
}
