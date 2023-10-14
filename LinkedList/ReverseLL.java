public class ReverseLL {
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
    public static void main(String[] args) {
        
    }
}
