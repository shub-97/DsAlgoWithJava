package StackQueue;
import java.util.ArrayList;
import java.util.Arrays;

class ImplementQueueUsingStackWithArray  {
    int length;
     ArrayList<Integer> array;     
    public ImplementQueueUsingStackWithArray() {
         array=new ArrayList();
         length=0;
    }
    
    public void push(int x) {
        array.add(x);
        length++;
         
    }
    
    public int pop() {
        if(length==0) return 0;
        else{
           Integer temp= array.get(0);
           array.remove(0);
           length--;
           return temp;
        }
    }
    
    public int peek() {
        if(length==0) return 0;
        return array.get(0);
    }
    
    public boolean empty() {
        if(length==0)  return true;
        return false;
    }

    public  void printQueue() {
        for(int i:array) System.out.print("\t"+i);
    }

    public static void main(String[] args) {   
        ImplementQueueUsingStackWithArray queue=new ImplementQueueUsingStackWithArray();
        queue.peek();
        queue.push(22);
        queue.push(34);
        queue.push(1);
        System.out.println(" Queue is ");
        queue.printQueue();
        queue.pop();
        System.out.println(" Queue is ");
        queue.printQueue();
        queue.pop();
        System.out.println(" Queue is ");
        queue.printQueue();
        System.out.println(" Queue is Empty :" +queue.empty());
    }

}

    