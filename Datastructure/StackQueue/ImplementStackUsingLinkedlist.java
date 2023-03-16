package StackQueue;

public class ImplementStackUsingLinkedlist {

    Node top;
    int length=0;
    Node bottom;

 ImplementStackUsingLinkedlist(){
    this.top=null;
    this.bottom=null;
    this.length=0;
 }

    //peek method ,whatever at top 
    private  String peek() {
         if (length > 0) return this.top.value;
         else return null; 
       
    }

        //push method
        private Node push(String data){
           Node newNode=new Node(data); //get value to insert in stack
           if(length==0){
            top=newNode;
            bottom=newNode;
           }else{
            Node oldNode=top;
           top=newNode;
           top.next=oldNode;
           }
           length++;
           return top;
        }

       void  printStack(){
            Node temp = top;
            if(length==0)  System.out.println("Empty stack");
            while(temp!=null){
                System.out.println(temp.value);
                temp=temp.next;

            }
        }

        void pop(){
            if(length>0){
                top=top.next;
                if (length == 1) {
                    bottom = null;
                }
                length--;
            }

        }

        //check empty stack
        public boolean isEmpty() {
            return length == 0;
        }

        //get last element in stack
        public String getLastElement() {
            if (length > 0) {
                return bottom.value;
            }
            return null;
        }
    public static void main(String[] args) {
        ImplementStackUsingLinkedlist stack =new ImplementStackUsingLinkedlist();
      
         stack.push("hi");
         stack.push("are");
         stack.push("you");
         stack.peek();
         System.out.println("calling peek ops :" +stack.peek());
         System.out.println("printing stack :");
         stack.printStack();
         


    }

  
    
}
