package linkedlist;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AddElementAtGivenPosition {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    	SinglyLinkedListNode copiedNode=head;
    	SinglyLinkedListNode prevNode=null;
    	SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
    	int counter=1;
    	if(counter==position) {
    		newNode.next=head;
    		System.out.println("first Item inserted");
    		return newNode;
    	}else {
    		
    		while(copiedNode.next!=null) {
    			if(counter==position) {
    	    		newNode.next=copiedNode;
    	    		prevNode.next=newNode;
    	    		break;
    			}else {
    				counter++;
    				prevNode=copiedNode;
    				copiedNode=copiedNode.next;
    				if(copiedNode.next==null) {
    				     copiedNode.next=newNode;
    				     newNode.next=null;
    				     break;
    				}
    				
    			}
    		}
    		
    		
    		
    		return head;
    		
    		
    	}
    	
    	
    	
    }
    

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
    	System.setProperty("OUTPUT_PATH", "C:\\Users\\gsubramani\\LinkedList\\linkedList.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
        	System.out.println("Enter the next Item");
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }
        System.out.println("Enter the Item to be inserted");
        
        int data = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Enter the Position");
        
        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);
        System.out.println("Print the item");
        printSinglyLinkedList(llist_head, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}