package linklist;


class AddNodes{
	
	private Node firstNode=null;
	
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
		}
	}
	
	public void display(){
		Node currentNode=firstNode;
		
		while(currentNode.next!=null){
			System.out.println(currentNode.item);
			currentNode=currentNode.next;
		}
	}
	
	public void displayNthNode(){
		Node node = findMax( firstNode );
		System.out.println("maxNode="+node.item);
		for(int x=0;x<=5;x++){
			
			if( node != firstNode )
				firstNode = firstNode.next;
			
		}

		System.out.println(node.item);
		
		
		
	}
	//Searching for max value in unsorted list.
	public Node findMax( Node linkedList ){
		Node maxNode = null;
		Node preMaxNode = null;
		Node lastNode = null;
		while( linkedList != null ){
			if( maxNode == null || maxNode.item < linkedList.item ){
				maxNode = linkedList;
				preMaxNode = lastNode;
			}
			lastNode = linkedList;
			linkedList = linkedList.next;
		}
		if( lastNode != null )
			lastNode.next = maxNode.next;
		return maxNode;
	}
	public void addToFirst(Node n1){ // While adding in the front, set null as pointed to the new node and make the new node as first node.
		n1.next=firstNode;
		firstNode=n1;
		
	}
	public void displayLastInFirst(){
		while(firstNode.next!=null){
			System.out.println(firstNode.item);
			firstNode=firstNode.next;
		}
	}
	public void search(int value){
		int large=0;
		int secondLarge=0;
		if(firstNode!=null){
			large=firstNode.item;
			secondLarge=firstNode.item;
		}
		while(firstNode.next!=null){
			 if(firstNode.item > large)
	            {
	                secondLarge = large;
	                
	                System.out.println("secondLarge now is"+secondLarge);
	                
	                large = firstNode.item;
	            }   
	                System.out.println("First Large is"+large);

	                if(firstNode.item > secondLarge && firstNode.item != large)
	                {
	                    secondLarge = firstNode.item;
	                    System.out.println("SecondLarge set is"+secondLarge);
	                }
	            
			firstNode=firstNode.next;
		}
		
		System.out.println("secondLarge="+secondLarge);
	}
}


public class AddToLinkList {

	public static void main(String ar[]){
		AddNodes addNodes=new AddNodes();
		addNodes.insert(new Node(41));
		addNodes.insert(new Node(39));
		addNodes.insert(new Node(43));
		addNodes.insert(new Node(42));
		addNodes.insert(new Node(45));
		addNodes.insert(new Node(75));
		addNodes.insert(new Node(35));
		addNodes.insert(new Node(55));
		addNodes.insert(new Node(65));
		
		addNodes.displayNthNode();
	/*	System.out.println("LastInFirst Starts");
		addNodes.addToFirst(new Node(45));
		addNodes.addToFirst(new Node(46));
		addNodes.addToFirst(new Node(47));
		addNodes.addToFirst(new Node(48));
		addNodes.displayLastInFirst();*/
		//addNodes.search(43);
	}
	
}
