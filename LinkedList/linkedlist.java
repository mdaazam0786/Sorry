import java.util.Scanner;

public class linkedlist {
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

    // if tail is given
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

    // if tail is not given
    void add2(int data) {
        Node newNode = new Node(data);
        Node currNode = headNode;
        if (headNode == null) {
            headNode = currNode;
        } else {
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            currNode = newNode;
        }
        length++;
    }

    void addFirst(int data) {
        Node tempNode = new Node(data);
        if (headNode == null) {
            headNode = tempNode;
        } else {
            tempNode.next = headNode;
            headNode = tempNode;
        }
        length++;
    }

    void addAtIndex(int data, int i) {
        Node tempNode = new Node(data);
        Node currNode = headNode;
        for (int j = 0; j < i - 1; j++) {
            currNode = currNode.next;
        }
        tempNode.next = currNode.next;
        currNode.next = tempNode;
        if (i == 0) {
            addFirst(data);
            return;
        } else if (i == length) {
            add1(data);
            return;
        }
        length++;
    }

    int getAtIndex(int i) {
        Node currNode = headNode;
        for (int j = 0; j < i; j++) {
            currNode = currNode.next;
        }
        return currNode.data;
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

    void deleteAtIndex(int i) {
        Node currNode = headNode;
        if (i == length) {
            for (int j = 0; j < length - 1; j++) {
                currNode = currNode.next;
            }
            currNode.next = currNode.next.next;
            tailNode = currNode;
        }
        if (i == 0) {
            headNode = headNode.next;
        }
        for (int j = 0; j < i - 1; j++) {
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
        length--;
    }

    void reverseIterative() {
        Node prevNode = headNode;
        Node currNode = headNode.next;
        if (headNode == null || headNode.next == null) {
            return;
        }
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        headNode.next = null;
        headNode = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if (headNode == null || headNode.next == null) {
            return headNode;
        }
        Node newNode = reverseRecursive(headNode.next);
        headNode.next.next = headNode;
        headNode.next = null;
        return newNode;
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many nodes you want to add : ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            System.out.print("Enter the number : ");
            int x = sc.nextInt();
            list.add1(x);
        }
        
        list.printList();

    }
}