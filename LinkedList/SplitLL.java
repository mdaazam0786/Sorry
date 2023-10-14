public class SplitLL {
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
            }
            System.out.print("NULL");
        }
    }
    public static Node split(Node head){
        Node curr = head;
        
        Node a = new Node(100);
        Node temp1 = a;
        Node b = new Node(200);
        Node temp2 = b;
        while(curr!=null){
            if(curr.data %2 != 0){
                Node node = new Node(curr.data);
                temp1.next = node;
                temp1 = node;
                curr = curr.next;
            }
            else{
                Node node = new Node(curr.data);
                temp2.next = node;
                temp2 = node;
                curr = curr.next;
            }
        }
        temp1.next = b.next;
        return a.next;
    }
    public static void main(String[] args) {
        SplitLL list = new SplitLL();
        list.add1(3);
        list.add1(5);
        list.add1(4);
        list.add1(1);
        list.add1(2);
        list.add1(8);
        list.add1(10);
        list.add1(12);
        list.printList();
        System.out.println();
        list.split(headNode);
        list.printList();

    }
}
