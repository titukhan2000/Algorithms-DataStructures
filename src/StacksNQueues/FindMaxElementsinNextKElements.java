package StacksNQueues;

public class FindMaxElementsinNextKElements {

	static int front=-1;
	static int noOfElements=0;
	static int rear=-1;
	static final int SIZE=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data=new int[SIZE];
		
		enQueue(data,8);
		enQueue(data,5);
		enQueue(data,10);
		enQueue(data,7);
		enQueue(data,9);
		enQueue(data,4);
		enQueue(data,15);
		enQueue(data,12);
		enQueue(data,90);
		enQueue(data,100);
		
		findMaxElementsInNextKElements(data,4);
		
	}
	public static void findMaxElementsInNextKElements(int queue[],int width) {
		boolean flag=true;
		int duplicateFront=front;
		while(flag) {
			int prevElement=0;
			if(front==width && front<=rear)
				width++;
			for(int x=front;x<width;x++) {
				int element=deQueue(queue,x);
				if(element>prevElement)
					prevElement=element;
				
			}
			if(front>rear)
				flag=false;
			System.out.println("From the elements the greatest is"+prevElement);
			front=++duplicateFront;
			if(width<rear)
			width++;
		}
		
	}
	public static int enQueue(int[] queue,int data) {
	
		if(!isFull()) {
		
			if(front==-1)//when first element is added..increment front
				front=0;
			
			rear=(rear+1)%SIZE;
			queue[rear]=data;
			noOfElements++;
		}
		return -1;
	}
	public static int deQueue(int[] queue,int location) {
		int element=-1;
		if(!isEmpty()) {
			
			element=queue[location];
			//queue[location]=0;
			//front=(front+1)%SIZE;
		}

		if(front==rear)
			front=rear=-1;
		
		return element;
	}
	public static boolean isEmpty() {
		if(front==-1)
			return true;
		return false;
	}
	public static boolean isFull() {
		return ((rear+1)%SIZE==front)?true:false;
	}
	public static int getNoOfElements(int[] queue) {
		int size=0;
		for(int x=0;x<SIZE;x++) {
			if(queue[x]!=0)
				size++;
		}
		return size;
	}
	public static void displayQueue(int queue[]) {
		for(int x=0;x<SIZE;x++) {
			System.out.println("Value At"+x+"::"+queue[x]);
		}
	}
}
