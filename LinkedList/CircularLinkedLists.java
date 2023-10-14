public class CircularLinkedLists{
    static Node headNode = null;
    static Node tailNode = null;
    int length = 0;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    void add1(int data) {
        Node tempNode = new Node(data);
        if (headNode == null) {
            headNode = tempNode;
        } else {
            tailNode.next = tempNode;
        }
        tailNode = tempNode;
        length++;
    }
    void printList() {
        if (headNode == null) {
            System.out.println("Empty List");
        } else {
            Node tempNode = headNode;
            while (tempNode != null) {
                System.out.print(tempNode.data + "-->");
                tempNode = tempNode.next;
                if(tempNode == null){
                    tempNode.next = headNode;
                }
            }
            System.out.print("NULL");
        }
    }
    public static void main(String[] args) {
        CircularLinkedLists list = new CircularLinkedLists();
        list.add1(0);
        list.add1(1);
        list.add1(2);
        list.add1(3);
        list.printList();

    }
}