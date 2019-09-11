public class MyLinkedList<E> {
    public Node head;
    public Node tail;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    private class Node {
        private Node next;
        private Node previous;
        private Object data;

        public Node(E data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, E data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp;
        temp = new Node(data);
        temp.previous = holder.previous;
        temp.next = holder;
        holder.previous.next = temp;
        holder.previous = temp;
        numNodes++;
    }

    public void addFirst(E data) {
        if (this.head == null) {
            this.head = new Node(data);
            this.tail = this.head;
            numNodes++;
        }
        else {
            Node temp = head;
            head = new Node(data);
            head.next = temp;
            temp.previous = head;
            numNodes++;
        }
    }

    public void addLast(E data) {
        Node temp = head;
        if (this.head == null) {
            this.head = new Node(data);
            this.tail = this.head;
            numNodes++;
        }
        for (int i = 0; temp != null; i++) {
            if (temp.next == null) {
                temp.next = new Node(data);
                temp.next.previous = temp;
                this.tail = temp.next;
                numNodes++;
                break;
            }
            temp = temp.next;
        }
    }

    public void remove(int index) {
        Node temp = head;
        if (head == null) {
            return;
        }
        if (index == 0) {
            head = temp.next;
            numNodes--;
            return;
        }
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return;
        }
        Node next = temp.next.next;
        temp.next = next;
        temp.next.previous = temp;
        numNodes--;

    }

    public boolean remove(E e) {
        Node temp = head;
        int count = 0;
        for (int i = 0; temp != null; i++) {
            if (temp.data == e) {
                remove(count);
                numNodes--;
                return true;
            }
            temp = temp.next;
            ++count;
        }
        return false;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void printList() {
        try {

            Node temp = head;
            if (temp == null) {
                System.out.println("null");
            }
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        } catch (NullPointerException e) {
            System.out.println("Null");
        }
    }

    public int getSize() {
        return numNodes;
    }

    public boolean contains(E o) {
        Node temp = head;
        for (int i = 0; temp != null; i++) {
            if (temp.data == o) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node temp = head;
        int index = 0;
        for (int i = 0; temp != null; i++) {
            if (temp.data == o) {
                break;
            }
            temp = temp.next;
            index++;
        }
        return index;
    }

    public boolean add(E e) {
        Node temp = head;
        if (head == null) {
            this.head = new Node(e);
            this.tail = head;
        } else {
            for (int i = 0; temp.next != null; i++) {
                temp = temp.next;
            }

            temp.next = new Node(e);
            this.tail = temp.next;
            this.tail.previous = temp;
            numNodes++;


        }
        return true;
    }


    public Object getFirst() {
        return head.data;
    }

    public Object getLast() {
        return tail.data;
    }

    public Object clone() {
        MyLinkedList<E> ListClone = new MyLinkedList<>() ;
        ListClone.head = ListClone.tail = null;
        ListClone.numNodes = 0;
        for (Node x = head; x != null; x = x.next) {
            ListClone.add((E) x.data);
        }
        return ListClone;
    }

    public void clear() {
            this.head = null;
            this.tail = null;
            this.numNodes = 0;
    }


}






