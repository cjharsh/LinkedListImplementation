class Node{
    int data;
    Node next;

}
public class MyLinkedListMain{
    Node head;
    int size;
    //inserfting a new node at the end
    void insert(Node newnode){
        System.out.println("inserting newnode at the end "+newnode.data);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }

    }
    //method to insert at begining
    void insertAtBegining(Node newnode) {
        System.out.println("inserting new node at begining " + newnode.data);

        newnode.next = head;
        head = newnode;
    }
    //method to display linkedlist
    void display(){
        System.out.println("MyLinkedList: ");
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ---> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //method to delete
    void delete(){
        if(head==null){
            System.out.println("empty list");
        }
        else {
            Node current = head;
            Node previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            System.out.println("deleting last node " + current.data);
            previous.next=null;
        }
    }
    //method to delete from beginning
    void deleteFromBeginning(){
        if(head!=null) {
            System.out.println(head.data);
            head = head.next;
        }
    }


    public static void main(String[] args) {
        MyLinkedListMain linkedList=new MyLinkedListMain();
        Node newnode=new Node();
        newnode.data=10;
        newnode.next=null;
        Node n1=new Node();
        n1.data=454;
        n1.next=null;
        Node n2=new Node();
        n2.data=345;
        n2.next=null;
        Node n3=new Node();
        n3.next=null;
        n3.data=987;
        linkedList.insert(newnode);
        linkedList.insert(n1);
        linkedList.insert(n2);
        linkedList.insert(n3);
        linkedList.display();
        Node n4=new Node();
        n4.data=98675;
        n4.next=null;
        Node n5=new Node();
        n5.data=78945;
        n5.next=null;
        linkedList.insertAtBegining(n4);
        linkedList.insertAtBegining(n5);
        linkedList.display();
        linkedList.delete();
        linkedList.display();
    }
}