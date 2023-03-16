package Datastructure.StackQueue;

public class ImplementQueue {
    //use linked list to create queue bcz if we use array then when dequeue will be called it should remove
    //first data which is inserted so array[0] will be removed and index needs to be shifted accordingly
    //which is not good way to do.
Node first;
Node last;
int length;

    ImplementQueue(){
        this.first=null;
        this.last=null;
        this.length=0;
    }

    void enqueue(String data){
        Node newNode=new Node(data);
        if(length==0) {
            first=newNode;
            last=newNode;
        }else{           
            last.next=newNode;      //last.next was null now it will point to newNode which has next as null   
            last=newNode;       //so now last will be the new data  which is inserted,so at end at last enetered
                                //data will be pointed by last in queue.
        }
        length++;
    }

   void dequeue(){
    if(length>0) {
        System.out.println("first next " +first.next);
        first=first.next;        
        if(length==1){
            last=null;
        }   
    length--;
 }


    }

    public String peek(){
        if(length>0) return first.value;
        else    return null;
    }

    public static void main(String[] args) {   
        ImplementQueue queue=new ImplementQueue();
        queue.enqueue("groww");
        queue.enqueue("Zerodha");
        queue.enqueue("5Paisa");
       
        queue.dequeue();
        System.out.println(queue.peek());
    }
    
    
}
