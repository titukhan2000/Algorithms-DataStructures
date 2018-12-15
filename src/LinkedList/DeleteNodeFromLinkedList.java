package linkedlist;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import linkedlist.AddElementAtGivenPosition.SinglyLinkedListNode;

public class DeleteNodeFromLinkedList {

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

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

    	SinglyLinkedListNode copiedNode=head;
    	SinglyLinkedListNode prevNode=null;
    	int counter=1;
    	if(counter==position) {
    		head=head.next;
    		System.out.println("first Item Deleted");
    		return head;
    	}else {
    		
    		while(copiedNode.next!=null) {
    			if(counter==position) {
    	    		prevNode.next=copiedNode.next;
    	    		break;
    			}else {
    				counter++;
    				prevNode=copiedNode;
    				copiedNode=copiedNode.next;
    				if(copiedNode.next==null) {
    				     System.out.println("Position does not exist");
    				}
    				
    			}
    		}
    	}
    		
    		return head;
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	System.setProperty("OUTPUT_PATH", "C:\\Users\\gsubramani\\LinkedList\\linkedListDelete.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();
        System.out.println("Enter the no of items to be populated");
        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
        	System.out.println("Enter the Item");
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }
        
        System.out.println("Enter the position to be removed");
        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);
        System.out.println("Items being printed");
        printSinglyLinkedList(llist1, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
