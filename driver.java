/*
 * Jun 3, 2023
 * Driver class for OrderedList
 */

public class driver extends OrderedList<Integer> {
    public static void main(String[] args) {

        //Creates a new OrderedList object called list that accepts
        //integers and adds some integers as objects
        OrderedList<Integer> list = new OrderedList<>();
        list.add(22);
        list.add(44);
        list.add(44);
        list.add(3);
        list.add(9);
        list.add(102);

        //Prints the list, the size of the list, the first int, and removes some ints
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.remove(44));
        System.out.println(list.remove(45));
        System.out.println(list.remove(22));

        //Adds 2 new integers 
        list.add(4);
        list.add(99);

        /*Prints the list, the size of the list, and some objects in the middle of the list
        *removes an int at the beginning and end of the list, and then prints the list again
        */
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.get(4));
        System.out.println(list.remove(102));
        System.out.println(list.remove(3));
        System.out.println(list);
    
    }
}
