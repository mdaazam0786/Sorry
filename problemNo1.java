public class problemNo1 {
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
    void deleteAtIndex(Node a ) {
        if(headNode == null || headNode.next==null){
            return;
        }
        Node prevNode = headNode;
        Node currNode = headNode.next;
        while(currNode != a){
            prevNode = prevNode.next;
            currNode = currNode.next;
        }
        prevNode.next = prevNode.next.next;
    }
    void printList() {
        if (headNode == null) {
            System.out.println("Empty List");
        } else {
            Node tempNode = headNode;
            while (tempNode != null) {
                System.out.print(tempNode.data + "-->");
                tempNode = tempNode.next;
            }
            System.out.print("NULL");
        }
    }
    public static void main(String[] args) {
        blemNo1 list = new blemNo1();
        list.add1(0);
        list.add1(1);
        list.add1(2);
        list.add1(3);
        list.printList();
        System.out.println();
        list.deleteAtIndex(headNode.next);
        list.printList();
        
    }
}
