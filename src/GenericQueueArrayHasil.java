/**
 * Created by user on 04/04/2017.
 */
public class GenericQueueArrayHasil {
    public static void main(String[] args) {
        //membuat antrian,maximal 4
        GenericQueue<Integer> queue = new GenericQueueArray(Integer.class, 4);

        queue.enqueue(3);
        queue.enqueue(13);
        queue.enqueue(224);
        queue.enqueue(136);


        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue(16);

        System.out.println(queue.dequeue());

        






    }
}
