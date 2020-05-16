package linked_lists;

public class Linked_list_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linked_lists list= new Linked_lists();
		System.out.println(list.isEmpty());
		list.addfirst(34);
		list.addfirst(32);
		list.addlast(321);
		list.display();
		list.removeat(1);
		list.display();
	
		

	}

}
