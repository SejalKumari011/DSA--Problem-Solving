public class circularQueue {

    static class queue{
        static int arr[];
        static int size;
        static int front;
        static int rear;

        queue(int n){
            arr=new int[n];
            size=n;
            front=-1;
            rear=-1;
        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //add
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full.");
                return;
            }

            if(isEmpty()){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            int result=arr[front];

            //del last element
            if(front==rear){
                return front=rear=-1;
            }else{
                front=(front+1)%size;
            }
            return result;

        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }

            return arr[front];
        }
    }
    public static void main(String [] args){
        queue q=new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();

        }


    }
    
}
