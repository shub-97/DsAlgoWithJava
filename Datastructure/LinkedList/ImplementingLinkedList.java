package LinkedList;

import java.util.Arrays;

public class ImplementingLinkedList {
    private Node head;
    private int length;
    private Node tail;
    public ImplementingLinkedList(int value){
        head =new Node(value);
        tail =head;
        length=1;
    }

    //append,add at end
    public void append(int value){
        Node newNode=new Node(value);
        tail.next=newNode;
        tail=newNode;
        length++;
    }

    //prepend,add at start  of list
    public void prepend(int value){
        Node newNode=new Node(value);
        System.out.println(head);
        newNode.next=head;
        head=newNode;
        System.out.println(head);
        length++;

    }

    //list length
    public int getLength() {
        return length;
    }

    //insert at specific position
    public void insert(int index,int value){
        if (index < 0 || index > length) {
            System.err.println("Index Out Of Bounds For Length " + length);
        } else if (index == 0) {
            prepend(value);
        } else if (index == length) {
            append(value);
        } else {
            Node newNode=new Node(value);
            Node leaderNode=head;
            for(int i=0;i<index-1;i++){
                leaderNode=leaderNode.next;
            }
            newNode.next=leaderNode.next;
            leaderNode.next=newNode;
            length++;
        }
    }

    //print list
    public int[] printList() {
        int[] myList = new int[length];
        Node current = this.head;
        int i = 0;
        while (current != null) {
            myList[i] = current.value;
            current = current.next;
            i++;
        }
        return myList;
    }

    //remove at specific position
    public void remove(int index) {
        if (index < 0 || index > length) {
            System.err.println("Index Out Of Bounds For Length " + length);
        } else if (index == 0) {
            head = this.head.next;
            length--;
        } else {
            Node leaderNode=head;
            int i;
            for(i=0;i<index-1;i++){
                leaderNode = leaderNode.next;
            }
            Node unwantedNode=leaderNode.next;
            leaderNode.next=unwantedNode.next;  // leaderNode.next =leaderNode.next.next
            length--;
            if (i == length - 1) {
                tail = leaderNode;
            }


        }
    }

    //reverse 
    public ImplementingLinkedList reverse(ImplementingLinkedList linkedList) {      
        ImplementingLinkedList newList = new ImplementingLinkedList(linkedList.head.value);
            Node first = linkedList.head;				    //first element ,length=1 , tail=head,next=null;
            Node second=first.next ;
            Node previous=null;
            while (second!= null) {
                first = second;   					    //current =current.next
                Node newNode = new Node(first.value); 
                previous=newList.head; 
                newNode.next=previous;      
                //previous=newNode;                   //next =null
                newNode.next = newList.head;   				//previous=newList.head;  newNode.next=previous; 
                newList.head = newNode;						//previous=newNode;
                newList.length++;							//newList lentght increase by 1 as 1 element added; 
            }
            return newList;
        }
       /*  ImplementingLinkedList newList = new ImplementingLinkedList(linkedList.head.value);
        //newList now has head :{next=null ,value=linkedList.head.value} and tail==head ,
        //tail:{next=null ,value=linkedList.head.value}  , as 1st object as of now in list.
        Node first = linkedList.head;
        Node second=first.next;
        while (second != null) {
            first = first.next;
            // Node temp=second.next;
            // second.next=first;
            // first=second;
            // second=temp;
            // first = first.next;
            Node newNode = new Node(first.value);
            System.out.println(first.value);
            newNode.next = newList.head;
            newList.head = newNode;
            System.out.println(first.value);
            newList.length++;
            System.out.println("Now lisy" +newList.printList());
        } */
       // linkedList.head=null;
       // linkedList.head=first;
        //return newList;
    //}
    //     if(linkedList==null) return linkedList;
    //    // ImplementingLinkedList newList = new ImplementingLinkedList(linkedList.head.value);
    //     Node current = linkedList;  //assign head
    //     Node  previous=null;
    //     Node next=null;
    //     while (current!= null) {
    //         next =current.next;
    //         current.next = previous;
    //         previous=current;
    //         current=next;
    //     }
    //     return previous;


    public Node reverseList(Node head){
        Node current=head;
        Node previous=null;
        Node next=null;
        while(current!=null){
           next=current.next;
           current.next=previous;
           previous=current;
           current=next;
        }
        head=previous;

    return head;
}    

void print(Node head){
    System.out.print("List is ");
    while(head!=null){
    System.out.print(" " +head.value);
    head=head.next;
} 
}

    public static void main(String[] args) {
        ImplementingLinkedList myLinkedList = new ImplementingLinkedList(4);
        myLinkedList.append(12);
        myLinkedList.append(16);
        //prepend
        myLinkedList.prepend(20);
        myLinkedList.prepend(50);
        System.out.println("length: " + myLinkedList.getLength());
        System.out.println("list: " + Arrays.toString(myLinkedList.printList()));
        //insert
        myLinkedList.insert(2, 25);
        System.out.println("length: " + myLinkedList.getLength());
        System.out.println("list: " + Arrays.toString(myLinkedList.printList()));
        //remove
        myLinkedList.remove(4);
        System.out.println("length: " + myLinkedList.getLength());
        System.out.println("list: " + Arrays.toString(myLinkedList.printList()));
       //reverse
      // ImplementingLinkedList linkedList2 = myLinkedList.reverse(myLinkedList);
      // System.out.println("reverse linkedList" + (linkedList2));
      // System.out.println("list: " + Arrays.toString(myLinkedList.printList()));

      Node list = myLinkedList.reverseList(myLinkedList.head);
      myLinkedList.print(list);
   }
        
     
    
}
