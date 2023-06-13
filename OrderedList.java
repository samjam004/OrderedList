import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
/*
 * Jun 3, 2023
 * Samuel Mount
 */

public class OrderedList<E extends Comparable<E>> implements Iterable<E> {
    LinkedList<E> list = new LinkedList<E>();
    /*
     * Ordered list objects contains a linked list and has a constructor that will 
     * create an instance of this list
     */
    public OrderedList(){
        list = new LinkedList<E>();
    }

    /*
     * This function returns an iterator that can iterate through the OrderedList's linked list
     */
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    /*
     * Returns object at specified position
     * @param index records the position in the list
     */
    public E get(int index) {
        return list.get(index);
    }

    /*
     * Returns the list's size
     */
    public int size() {
        return list.size();
    }
    
    /*
     * Removes the first instance of an object that matches obj in the list
     * @param obj is the obj that the user want's removed
     */
    public boolean remove(E obj) {
        return list.remove(obj);
    }

    /*
     * Adds an object into the list using the iterator function, after ensuring
     * all objects before it are smaller
     * If there are no objects, it will just add it nornally
     * 
     * @param obj is the obj that the user wants to add
     */
    public void add(E obj) {
        ListIterator<E> iter = list.listIterator();
        if (size() == 0) {
            iter.add(obj);
            return;
        }
        while (iter.hasNext()) {
            if (obj.compareTo(iter.next()) < 0) {
                iter.previous();
                iter.add(obj);
                return;
            }
        }
        iter.add(obj);
    }

    /*
     * returns the list as a string
     */
    public String toString() {
        return list.toString();
    }
    
}
