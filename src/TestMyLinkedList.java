public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList();
        MyLinkedList<Integer> cloneList = new MyLinkedList();


//        linkedList.addFirst(13);
//        linkedList.addFirst(12);
//        linkedList.addFirst(11);
//
//        linkedList.add(4 , 15);
//        linkedList.add(1 , 16);
//        linkedList.addLast(32);
//        linkedList.add(33);
//        linkedList.add(43);
//        linkedList.add(53);
//        linkedList.add(63);
//        linkedList.add(1,23);
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.remove(2);
//        cloneList = (MyLinkedList<Integer>) linkedList.clone();
//        cloneList.printList();
//        linkedList.addLast(33);
//        linkedList.addFirst(1);
//        System.out.println("//");
//        cloneList.printList();
//        cloneList.clear();
//        System.out.println("//");
//        cloneList.printList();




        linkedList.printList();

//        linkedList.remove(4);
//        linkedList.printList();
//        System.out.println("//////");
//
//        System.out.println(linkedList.remove((Integer) 10));


//        System.out.println("//");
//        System.out.println(linkedList.get(1));
//        System.out.println(linkedList.getFirst());
//        System.out.println(linkedList.getLast());
//        System.out.println("//");
//        linkedList.clear();

//      System.out.println(linkedList.getFirst());
//      System.out.println(linkedList.getLast());
//        System.out.println(linkedList.contains((Integer) 12));
//        System.out.println(linkedList.indexOf((Integer) 12));
    }
}
