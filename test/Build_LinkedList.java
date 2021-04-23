package test;


import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        System.out.println("Node obj instantiated");
        this.data = data;
    }

    Node(int data , Node next){
        this(data);
        this.next = next;
    }
}
class LinkedList{
    private Node head , tail;
    private int size;

    LinkedList(){
        System.out.println("LinkedList obj instantiated");
        head = tail = null;
        size = 0;
    }

    public void addLast(int val){
        Node newnode = new Node(val, null);
        if(size == 0) head = tail = newnode;
        else{

            tail.next = newnode;
            tail = newnode;
        }
        size++;
        
    }

    public void addFirst(int val){
        Node node = new Node(val, head);
        if(size == 0) head = tail = node;
        else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addAt(int idx,int val){
        if(idx <= size && idx >= 0){
          if(idx == 0) addFirst(val);
          else if(idx == size) addLast(val);
            else{
                Node temp = head;
                while(idx > 1){
                    temp = temp.next;
                    idx--;
                }
                Node nbr = temp.next;
                Node newnode = new Node(val);
                newnode.next = nbr;
                temp.next = newnode;
                size++;
            }
        }
    }

    public void removeFirst(){
        // Node newnode = head.next;
        head = head.next;
        // head = newnode;
        size--;
    }

    public void removeLast(){
        Node newnode = head;
        while(newnode.next != tail){
            newnode = newnode.next;
        }
        newnode.next = null;
        size--;
    }

    public void removeAt(int idx){
        Node newnode = head;
        Node n1 = null;
        while(idx > 0){
           n1 = newnode;
           newnode = newnode.next;
           idx--;
        }
        n1.next = newnode.next;
        newnode.next = null;
        
    }

    public void display(){
        Node newnode = head;
        while(newnode != tail){
            System.out.print(newnode.data + " -> ");
            newnode = newnode.next;
        }
        System.out.println(".");
    }

    public int size(){
        return size;
    }

    public int getFirst(){
        if(size > 0) return head.data;
        else {
            System.out.println("List is empty");
            return -1;
        }
    }

    public int getLast(){
        if(size == 0){
            System.out.println("List is empty");
            return -1;
        }else{
            int val = tail.data;
            return val;
        }
    }

    public int getAt(int idx){
        if(idx >= 0 && idx <= size){
            Node newnode = head;
            while(idx > 0){
                newnode = newnode.next;
                idx--;
            }
            return newnode.data;
        }
        else{
            System.out.println("Invalid args");
            return -1;
        }
    } 
}



public class Build_LinkedList{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        while(!str.equals("quit!")){
            String parts[] = str.split(" ");

            switch(parts[0]){
                case "addAt" : {
                    System.out.println("addAt cmd"+parts[1]+"-->"+parts[2]);
                    list.addAt(Integer.parseInt(parts[1]) , Integer.parseInt(parts[2]));
                }break;
                case "addFirst" : {
                    System.out.println("addFirst cmd"+parts[1]);
                    list.addFirst(Integer.parseInt(parts[1]));
                }break;
                case "addLast" : {
                    System.out.println("addLast cmd"+parts[1]);
                    list.addLast(Integer.parseInt(parts[1]));
                }break;
                case "getFirst" : {
                    System.out.println("getFirst cmd");
                    System.out.println(list.getFirst());
                }break;
                case "getAt" : {
                    System.out.println("getAt cmd"+parts[1]);
                    System.out.println(list.getAt(Integer.parseInt(parts[1])));
                }break;
                case "getLast" : {
                    System.out.println("getLast cmd");
                    System.out.println(list.getLast());
                }break;
                case "removeFirst" : {
                    System.out.println("remove first");
                    System.out.println(list.getFirst());
                    list.removeFirst();
                }break;
                case "removeLast" : {
                    System.out.println("remove last");
                    System.out.println(list.getLast());
                    list.removeLast();
                }break;
                case "removeAt" : {
                    System.out.println("remove at" + parts[1]);
                    System.out.println(list.getAt(Integer.parseInt(parts[1])));
                    list.removeAt(Integer.parseInt(parts[1]));
                }break;
                case "size" : {
                    System.out.println("size : "+list.size());
                }break;
                case "display" : {
                    System.out.println("display : ");
                    list.display();
                }break;
            }
            str = scn.nextLine();
        }
        scn.close();

    }
}
