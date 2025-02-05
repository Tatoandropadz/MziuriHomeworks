package Saklaso1;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public void add (int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }

        else {
            Node atm = head;
            while(atm.next != null) {
                atm = atm.next;
            }
            atm.next = newNode;
        }
    }
}

public class Third {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Igive logikas gamoviyeneb, rac LinkedList-is washlis funqciashi gviweria (saerto elementebis mosadzebnad)
        // ert linkedlist-s wavyvebodi da tito misi elementistvis, gadavyvebodi meores da saertod list3-shi davamatebdi
    }
}
