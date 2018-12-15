package linkedlist;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Compare2LinkedList {

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

    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    	if(head1==null && head2==null) {
    		System.out.println(" node list does not exist");
    		return true;
    	}
    	if((head1==null && head2!=null) || (head2==null && head1!=null)) {
    		System.out.println(" One list is null and hence not equal");
    		return false;
    	}
    	if(head1.next==null && head2.next==null) {
    		if(head1.data==head2.data) {
    			System.out.println("single node list wiht same data");
    			return true;
    		}else {
    			System.out.println("single node list wiht diff data");
    			return false;
    		}
    	}
    	boolean flag=true;
    	do {
    		head1=head1.next;
    		head2=head2.next;
    		
    		if((head1!=null && head2==null) || (head1==null && head2!=null)) {
    			System.out.println("nodeList differs in size");
    			flag=false;
    		}else {
    			if(head1==null && head2==null) {
    				return true;
    			}else {
	    			if(head1.data!=head2.data) {
	    				System.out.println("nodeList differs in data");
	    				flag=false;
	    			}else {
	    				System.out.println("head1.data="+head1.data+":: head2.data="+head2.data);
	    			}
    			}
    		}
    		
    	}while(flag);
    	
    	return flag;
    	
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	System.setProperty("OUTPUT_PATH", "C:\\Users\\gsubramani\\LinkedList\\linkedListDelete.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("OUTPUT_PATH")));
        System.out.println("Enter tests");
        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();

            System.out.println("Enter list size");
            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
            	System.out.println("Enter List 1 items");
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }
          
          	SinglyLinkedList llist2 = new SinglyLinkedList();
          	System.out.println("Enter List 2 size");
            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
            	System.out.println("Enter List 2 items");
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            boolean result = compareLists(llist1.head, llist2.head);
            if(result)
            	System.out.println("Lists are: equal");
            else
            	System.out.println("Lists are not 1equal");
            
            bufferedWriter.write(String.valueOf(result ? 1 : 0));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

