package StacksNQueues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;



public class QueuePertrolPump {
	static int[] availablePetrol= 	  {4,6,7,4};
	static int[] pumpDistance= 		  {6,5,3,5};
	static String[] stopName=         {"A","B","C","D"};
	public static Queue<String> queue= new LinkedList<String>() ;
	public static void main(String[] args) {
		
		int currPetrol=0;
		int startingPoint=0;
		int accumalatedPetrol=6;
		int stopNameCounter=0;
		int nextDistance=0;
		queue.add(stopName[stopNameCounter]);
		
		for(int x=startingPoint;x<stopName.length;x++) {
			 nextDistance=pumpDistance[x];
			 currPetrol=currPetrol+availablePetrol[x];
			 stopNameCounter=x;
			 if(currPetrol >=nextDistance) {
				 if((x+1) == stopName.length) {
					 stopNameCounter=-1;
				 }
					 queue.add(stopName[++stopNameCounter]);
				 currPetrol=currPetrol-nextDistance;
				 displayQueue();
				 System.out.println("******************************");
			 }else {
				currPetrol=0;
				 while(!queue.isEmpty()) {
					 queue.remove();
				 }
				x=startingPoint++;
				 if((startingPoint) == stopName.length) {
					 stopNameCounter=-1;
					 queue.add(stopName[++stopNameCounter]);
				 }else {
					 stopNameCounter=startingPoint;
					 queue.add(stopName[startingPoint]);
				 }
				 
			 }
			System.out.println("---------------------------------");
			displayQueue();
		}
		
		

	}
	public static void displayQueue() {
		Iterator <String> itr= queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
