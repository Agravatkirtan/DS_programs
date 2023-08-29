public class QueueImplment{
    static class Queue{
        static int arr[];
        static int size;
        static int front= -1;
        static int rear =-1;
        Queue(int size){
            arr =new int[size];
            this.size=size;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full");
                return;
            }
            arr[++rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            // System.out.println(front);
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args){
        Queue q = new Queue(8);
        q.add(5);
        q.add(4);
        q.add(8);
        q.add(3);
        q.add(6);
        q.add(10);
        q.add(14);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}