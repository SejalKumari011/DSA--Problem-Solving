public class queueImplementation {


    static class queue{
        static int arr[];
        static int size;
        static int rear;

        queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        //add
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full.");
                return ;
            }

            rear=rear+1;
            arr[rear]=data;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }

            int front=arr[0];
            for(int i=0;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[0];

        }

        public static void printQueue(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return;
            }

            for(int i=0;i<=rear;i++){
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }


    public static void main(String [] args){
        queue q=new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.printQueue();
        q.remove();
        System.out.println(q);
        q.printQueue();


    }
    
}
