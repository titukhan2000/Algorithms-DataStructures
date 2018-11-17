package linklist;



public class DoublyLinkList {
	public static void main(String ar[]){
		AddNodesToEnd addNodes=new AddNodesToEnd();
		addNodes.insert(new Node(41));
		addNodes.insert(new Node(42));
		addNodes.insert(new Node(43));
		addNodes.insert(new Node(44));
		addNodes.precedeNode(new Node(45));
		addNodes.precedeNode(new Node(46));
		addNodes.precedeNode(new Node(47));
		addNodes.precedeNode(new Node(48));
		addNodes.display();
	}
}

class AddNodesToEnd{
	
	private Node firstNode=null;
	private Node startNode=null;
	private Node endNode=null;
	
	public void insert(Node n1){
		if(firstNode==null){
			firstNode=n1;
		}else{
		
		
		Node currentNode=firstNode;
		
		while(currentNode.next!=null){
			currentNode=currentNode.next;
		}
		currentNode.next=n1;
		currentNode=n1;
		endNode=n1;
		}
	}
	public void precedeNode(Node n1){
		if(firstNode==null){
			firstNode=n1;
		}else{
		
		
		Node currentNode=firstNode;
		
		while(currentNode.prev!=null){
			currentNode=currentNode.prev;
		}
		startNode=firstNode;
		currentNode.prev=n1;
		n1.next=firstNode;
		firstNode=n1;
		}
	}
	
	public void display(){
		Node currentNode=firstNode;
		boolean iterate=true;
		while(iterate){
			if(currentNode.next!=null){
			System.out.println(currentNode.item);
			currentNode=currentNode.next;
			}else{
				System.out.println(currentNode.item);
				iterate=false;
			}
			
		}
		System.out.println("---------------------------------------");
		iterate=true;
		currentNode=startNode;
		while(iterate){
			
			if(currentNode.next!=null){
			System.out.println(currentNode.item);
			currentNode=currentNode.next;
			}else{
				System.out.println(currentNode.item);
				iterate=false;
			}
			
		}
		System.out.println("---------------------------------------");
		iterate=true;
		currentNode=endNode;
		while(iterate){
			
			if(currentNode.prev!=null){
			System.out.println(currentNode.item);
			currentNode=currentNode.prev;
			}else{
				System.out.println(currentNode.item);
				iterate=false;
			}
			
		}
		
	}
	
	
	
}
