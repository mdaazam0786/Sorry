public class PolynomialLL {
    static Node head1 = null;
    static Node head2 = null;
    public class Node{
        int coef;
        int exp;
        Node next;
        Node(int coef,int exp){
            this.coef = coef;
            this.exp = exp;
        }
    }
   
    void add1(int coef1 , int exp1) {
        Node newNode = new Node(coef1,exp1);
        Node currNode = head1;
        if (head1 == null) {
            head1 = newNode;
        } else {
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            currNode = newNode;
        }
    }
    void add2(int coef2 , int exp2) {
        Node newNode = new Node(coef2,exp2);
        Node currNode = head2;
        if (head2 == null) {
            head2 = newNode;
        } else {
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            currNode = newNode;
        }
    }
    void printList() {
        if (head1 == null) {
            System.out.println("Empty List");
        }
        else {
            Node temp1 = head1;
            while (temp1 != null) {
                System.out.print(temp1.coef + "," + temp1.exp + "-->");
                temp1 = temp1.next;
            }
            System.out.print("NULL");
        }
        System.out.println();
        if(head2 == null){
            System.out.println("Empty List");
        }
        else {
            Node temp2 = head2;
            while (temp2 != null) {
                System.out.print(temp2.coef + "," + temp2.exp + "-->");
                temp2 = temp2.next;
            }
            System.out.print("NULL");
        }
    }
    //Multiplication of two polynomial single variable
    Node poly(Node head1,Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node node = new Node(1, 2);
        Node temp = node;
        while(temp1!=null){
            while(temp2!=null){
                Node a = new Node(temp1.coef*temp2.coef, temp1.exp + temp2.exp);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
            temp2 = head2;
            temp1 = temp1.next;
        }
        node = node.next;
        return node;
    }
    //Addition of two polynomial single variable
    Node poly1(Node head1,Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node node = new Node(1, 2);
        Node temp = node;
        while(temp1!=null || temp2!=null){
            if(temp1.exp == temp2.exp){
                Node a = new Node(temp1.coef + temp2.coef, temp1.exp);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else if(temp1.exp > temp2.exp){
                Node a = new Node(temp1.coef, temp1.exp);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            }
            else if(temp1.exp < temp2.exp){
                Node a = new Node(temp2.coef, temp2.exp);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }
        node = node.next;
        return node;
    }
    //Subtraction of two polynomial single variable
    Node poly2(Node head1,Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node node = new Node(1, 2);
        Node temp = node;
        while(temp1!=null || temp2!=null){
            if(temp1.exp == temp2.exp){
                Node a = new Node(temp1.coef - temp2.coef, temp1.exp);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else if(temp1.exp > temp2.exp){
                Node a = new Node(temp1.coef, temp1.exp);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            }
            else if(temp1.exp < temp2.exp){
                Node a = new Node(temp2.coef, temp2.exp);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }
        node = node.next;
        return node;
    }
    void printpoly(Node temp){
        if(temp == null){
            System.out.println("Empty List");
        }
        while(temp!=null){
            System.out.print(temp.coef + "," + temp.exp + "-->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    
    public static void main(String[] args) {
        PolynomialLL list1 = new PolynomialLL();
        list1.add1(3,3);
        list1.add1(2, 2);
        list1.add1(10, 0);

        PolynomialLL list2 = new PolynomialLL();
        list2.add2(4, 2);
        list2.add2(2, 1);
        list2.add2(9, 0);

        list1.printList();

        System.out.println();

        PolynomialLL list = new PolynomialLL();
        Node mul = list.poly(head1,head2);
        list.printpoly(mul);
        System.out.println();
        Node add = list.poly1(head1,head2);
        list.printpoly(add);
        System.out.println();
        Node sub = list.poly2(head1, head2);
        list.printpoly(sub);
    }
}
