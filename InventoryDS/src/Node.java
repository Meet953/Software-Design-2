
class Node {
	int key;
	Item item;
	Node left;
	Node right;
	Node(int k,Item it,Node ll, Node rr)
		{ key = k;
		 item = it;
		  left = ll; right = rr; }
	public int readKey(){return key;}
	public Item readItem(){return item;}
	}