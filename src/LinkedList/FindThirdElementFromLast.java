package linkedlist;

class DataStructure{
	public String data="";
	public DataStructure next=null;
	public DataStructure randomNext=null;
}

public class FindThirdElementFromLast {
	static DataStructure head=null;
	public static void main(String[] args) {

		DataStructure first = new DataStructure();
		first.data="One";
		first.next=null;
		head=first;
		
		for(int x=0;x<10;x++) {
			
			DataStructure ds = new DataStructure();
			ds.data="Value"+x;
			ds.next=null;
			if(first.next==null) {
				first.next=ds;
			}else {
				insertData(ds,"Value-"+x,first);
			}
		}
		display(first);
		get3rdLastElement(first);
		insertCyclicData();

	}
	
	public static void get3rdLastElement(DataStructure node) {
		
		DataStructure pointer=node;
		DataStructure fastPointer=node.next.next.next;
		
		while(fastPointer.next!=null) {
			
			fastPointer=fastPointer.next;
			pointer=pointer.next;
			if(fastPointer.next==null)
				System.out.println(pointer.data);
			
			
		}
		
		
		
	}
	
	public static  void insertData(DataStructure node,String data,DataStructure firstNode) {
		DataStructure first = firstNode;
	    
		while(first.next!=null) {
	    	first=first.next;
	    	if(first.next==null) {
	    		first.next=node;
	    		break;
	    	}
	    	
	    }
	    
	}
	public static  void insertCyclicData() {
		DataStructure one = new DataStructure(); one.data="one";
		DataStructure two = new DataStructure(); two.data="two";
		DataStructure three = new DataStructure(); three.data="three";
		DataStructure four = new DataStructure(); four.data="four";
		DataStructure five = new DataStructure(); five.data="five";
		DataStructure six = new DataStructure(); six.data="six";
		DataStructure seven = new DataStructure(); seven.data="seven";
		DataStructure eight = new DataStructure(); eight.data="eight";
		DataStructure nine = new DataStructure(); nine.data="nine";
		DataStructure ten = new DataStructure(); ten.data="ten";
		
		
		one.next=two;
		one.randomNext=six;
		two.next=three;
		two.randomNext=four;
		three.next=four;
		three.randomNext=seven;
		four.next=five;
		
		five.next=six;
		six.next=seven;
		seven.next=eight;
		eight.next=nine;
		nine.next=ten;
		ten.next=null;
	    //ten.next=five; to create a cycle
		///findCycle(one);
			//removeCycle(one);//not working
		//System.out.println(printLinkListRecursively(one));
		//printLinkList(one); not Working 
	}
	
	public static void printLinkList(DataStructure first) {
		DataStructure node=null;
		DataStructure nextNode=first;
		DataStructure prevNode=null;
		System.out.println("DisplayReverse");
		
		while(nextNode.next!=null) {
			
			if(prevNode==null) {
				prevNode=nextNode;
				nextNode=nextNode.next;
			}else{
				
				node=nextNode;
				node.next=prevNode;
				prevNode=nextNode;
				nextNode=nextNode.next;
				System.out.println(nextNode.data);
			}
			
			
		}
		
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		
	}
	
	public static String printLinkListRecursively(DataStructure first) {
		
		if(first.next==null)
			return first.data;
		
		
		String value=printLinkListRecursively(first.next)+","+first.data;
		return value;
	}
	
	public static void findCycle(DataStructure head) {
		
		DataStructure pointer=head;
		DataStructure fastPointer=head;
		System.out.println("Finnd Cycle");
		while(fastPointer.next!=null) {
			System.out.println("FP"+fastPointer.data);
			if(fastPointer.next==pointer) {
				System.out.println("data is"+pointer.data);
				break;
			}
			fastPointer=fastPointer.next.next;
			pointer=pointer.next;
		}
		removeCycle(head);
		
	}
	
	public static void removeCycle(DataStructure head) {
		
		DataStructure pointer=head;
		DataStructure fastPointer=head;
		boolean incrementPointer=true;
		boolean breakNext=false;
		int length=0;
		System.out.println("Remove Cycle");
		while(fastPointer.next!=null) {
			if(fastPointer.next==pointer) {
				incrementPointer=false;
				System.out.println("data is"+pointer.data);
				if(breakNext)
				break;
			}
			
			
			if(incrementPointer) {
				pointer=pointer.next;
				fastPointer=fastPointer.next.next;
			}
			if(!incrementPointer) {
				++length;
				breakNext=true;
				fastPointer=pointer.next;
			}
		}
		
		System.out.println(length);
		
		display(head);
		
	}
	
	public static void display(DataStructure node) {
		
		
		while(node.next!=null) {
			System.out.print(node.data+",");
			node=node.next;
		}
	}

}
