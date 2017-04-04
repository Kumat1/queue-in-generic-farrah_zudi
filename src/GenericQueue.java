/**
 * Created by WIN-8 on 03/04/2017.
 */
interface GenericQueue<E> {
    void enqueue(E e);

    E dequeue();

    boolean isEmpty();

    boolean isFull();

    int size();
}
