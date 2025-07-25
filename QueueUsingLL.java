public class QueueUsingLL {

    static class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }
    }

        static class queue{
            static node head=null;
            static node tail=null;

            public static boolean isEmpty(){
                return head==null && tail==null;
            }

            //add
            public static void add(int data){
                node newnode=new node(data);
                if(head==tail){
                    head=tail=newnode;
                    return;
                }
                tail.next=newnode;
                tail=newnode;
            }

            //remove
            public static int remove(){
                if(isEmpty()){
                    System.out.println("Queue is empty.");
                    return -1;
                }

                int front=head.data;
                if(head==tail){
                    head=tail=null;
                }else{
                    head=head.next;

                }    
                return front;
            }

            //remove
            public static int peek(){
                if(isEmpty()){
                    System.out.println("Queue is empty.");
                    return -1;
                }
                return head.data;
            } 
        }
    
    public static void main(String [] args){
        queue q= new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println("Front: " + q.peek());
            q.remove();
        }




    }
    
}
