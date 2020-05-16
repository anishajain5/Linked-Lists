package linked_lists;

public class Linked_lists {

	public class Node{
		int data;
		Node next;
		Node(int data, Node next){
			this.data= data;
			this.next= next;
		}
	}
	int size;
	Node head;
	Node tail;
	
	public Linked_lists() {
		this.size=0;
		this.head=null;
		this.tail= null;
	}
	
	public int size() {
		return this.size;
	}
	
	 public void addfirst(int data) {
		 Node node= new Node(data,this.head);
		 this.head= node;
		 if(this.isEmpty()) {
			 this.tail= node;
		 }
		 this.size++;
	 }
	 public void addlast(int data) {
		 Node node= new Node(data,null);
		 if(this.isEmpty()) {
			 this.head=node;
			 this.tail=node;
		 }
		 else {
			 this.tail.next=node;
			 this.tail=node;
		 }
		 this.size++;
	 }
	public boolean isEmpty() {
		return this.size()==0;
	}
	
	private Node getnodeAt(int index) throws Exception {
		if(index<0||index<=size) {
			throw new Exception("Invalid index");
		}
		Node temp= this.head;
		int counter=0;
		while(counter<index) {
			temp=temp.next;
			counter++;
		}
		return temp;
	}
	public void addnodeAt(int data, int index) throws Exception {
		if(index<0||index> this.size) {
			throw new Exception("Invalid index");
		}
		if(index==0) {
			this.addfirst(data);
		}
		else if(index==this.size) {
			this.addlast(data);
		}
		else {
			Node nm1= getnodeAt(index-1);
			Node node= new Node(data, nm1.next);
			nm1.next=node;
			this.size++;
		}
	}
	
	public int getfirst()throws Exception {
		if(this.isEmpty()) {
			throw new Exception("List is empty");
		}
		return this.head.data;
	}
	
	public int getlast() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("List is empty");
		}
		return this.tail.data;
	}
	
	public int getAt(int index) throws Exception {
		if(this.isEmpty()) {
			throw new Exception("List is empty");
		}
		if(index<0||index>this.size) {
			throw new Exception("Invalid index");
		}
		return this.getnodeAt(index).data;
	}
	
	
public int removefirst() throws Exception {
	if(this.isEmpty()) {
		throw new Exception("List is empty");
	}
	Node rv= this.head;
	if(this.size()==1) {
		this.head=null;
		this.tail=null;
	}
	else {
		this.head= this.head.next;
		this.size--;
	}
	return rv.data;
	
}

public int removelast() throws Exception {
	if(this.isEmpty()) {
		throw new Exception("List is empty");
	}
	Node rv= this.tail;
	if(this.size()==1) {
		this.head=null;
		this.tail= null;
	}
	else {
		Node temp= this.getnodeAt(size-2);
		temp.next=null;
		this.tail=temp;
	}
	this.size--;
	return rv.data;
}

public int removeat(int index) throws Exception{
	if(this.isEmpty()) {
		throw new Exception("List is empty");
	}
	if(index==0) {
		return this.removefirst();
	}
	else if(index==this.size()-1) {
		return this.removelast();
	}
	else {
		Node rv= this.getnodeAt(index);
		Node temp= this.getnodeAt(index-1);
		temp.next= temp.next.next;
		this.size--;
		return rv.data;
		
	}
}

public void display() {
	Node temp= this.head;
	while(temp!=null) {
		System.out.print(temp.data+" => ");
		temp= temp.next;
	}
	System.out.print("End");
	
}
	
}


