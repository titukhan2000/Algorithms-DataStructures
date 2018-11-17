package linklist;

import java.util.Random;

class Node 
{
    public int item;
    public Node next;
    public Node prev;
    public Node(int val) 
    {
        item = val;
    }
 
    public Node() 
    {}
 
    public void displayNode() 
    {
        System.out.print("[" + item + "] ");
    }
}
 
class LinkedList 
{
    private Node first;
 
    public LinkedList() 
    {
        first = null;
    }
 
    public boolean isEmpty() 
    {
        return (first == null);
    }
 
    public void insert(int val)
    {
    	System.out.println("Value being inserted"+val);
        Node newNode = new Node(val);
        newNode.next = first;
        first = newNode;
    }
 
    public void append(Node result) 
    {
        first = result;
    }
 
    public void display() 
    {
        Node current = first;
        while (current != null) 
        {
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }
 
    public Node extractFirst() 
    {
        return first;
    }
    
 
 
    public Node MergeSort(Node headOriginal) 
    {
        if (headOriginal == null || headOriginal.next == null)
            return headOriginal;
        Node a = headOriginal;
        Node b = headOriginal.next;
        while ((b != null) && (b.next != null)) 
        {
            headOriginal = headOriginal.next;
            b = (b.next).next;
        }
        b = headOriginal.next;
        headOriginal.next = null;
        return merge(MergeSort(a), MergeSort(b));
    }
 
    public Node merge(Node a, Node b) 
    {
        Node temp = new Node();
        Node head = temp;
        Node c = head;
        while ((a != null) && (b != null)) 
        {
            if (a.item <= b.item) 
            {
                c.next = a;
                c = a;
                a = a.next;
            }
            else 
            {
                c.next = b;
                c = b;
                b = b.next;
            }
        }
        c.next = (a == null) ? b : a;
        return head.next;
    }
}
 
class Merge_Sort 
{
    public static void main(String[] args) 
    {
        LinkedList object = new LinkedList();
        Random random = new Random();
        int N = 20;
        for (int i = 0; i < N; i++)
            object.insert(Math.abs(random.nextInt(100)));
 
        System.out.println("List items before sorting :");
        object.display();
        object.append(object.MergeSort(object.extractFirst()));
        System.out.println("List items after sorting :");
        object.display();
    }
}