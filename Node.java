/*
 * Josh Benner
 * CS 145
 * Asin 2
 * 
 * This is a node class that is accesed the String node class. 
 * Its public, because no client directly access this class. 
 */

public class Node{
	public String data;
	public Node next;
	//has data and pointer
	public Node(String data,Node next ){
		this.data=data;
		this.next=next;
	}
	//has nohting
	public Node(){
		this(null,null);
	}
	//has data no pointer
	public Node (String data){
		this(data,null);
	}
	
	}
