import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BinaryTree {

    Node root;

    public void add(int value, Item i) {
        root = addRecursive(root, value, i);
    }

    private Node addRecursive(Node current, int value, Item i) {

        if (current == null) {
            return new Node(value, i, null, null);
        }

        if (value < current.key) {
            current.left = addRecursive(current.left, value, i);
        } else if (value > current.key) {
            current.right = addRecursive(current.right, value, i);
        }

        return current;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getSize() {
        return getSizeRecursive(root);
    }

    private int getSizeRecursive(Node current) {
        return current == null ? 0 : getSizeRecursive(current.left) + 1 + getSizeRecursive(current.right);
    }

   
    
    public int getCount() {
    	return count;
    }
    
    int count;
    public Node search(int value) {
    	count = 0;
        return searchRecursive(root, value);
    }

    private Node searchRecursive(Node current, int value) {
    	
    	count++;
        if (current == null) {
            return null;
        }

        if (value == current.key) {
            return current;
        }

        return value < current.key
          ? searchRecursive(current.left, value)
          : searchRecursive(current.right, value);
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.key) {
            // Case 1: no children
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: only 1 child
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            // Case 3: 2 children
            int smallestValue = findSmallestValue(current.right);
            current.key = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (value < current.key) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.key : findSmallestValue(root.left);
    }

    public void inorder() {
    	traverseInOrder(root);
    }
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println("bt " + node.key);
            traverseInOrder(node.right);
        }
    }
    
    ArrayList<String> ar = new ArrayList<>();
    
   
    
    public ArrayList printAll() {
    	ar.clear();
    	print(root);
		return ar;
	 }
    
    public void print(Node node) {
        if (node != null) {
        	print(node.left);
           ar.add(node.key + ":" + node.item);
            print(node.right);
        }
        
    }
    
    //creating Items list for Iterator
   
    int ni = 0;
    Item[] it = new Item[10];
    public Item[] getItems() {
    
    	getItem(root);
    	 System.out.println(it.toString());
    	 return it;
    }
    
    private void getItem(Node node) {
    	  if (node != null) {
    		  getItem(node.left);
    		  it[ni] = (node.item);ni++;
             getItem(node.right);
          }
		
	}

	public void saveAll() {
   	 
   	 File file = new File("file.txt");
        try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
   	 
   	 try {
            FileOutputStream fileOut =new FileOutputStream("file.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
           
            ArrayList<String> ar = printAll();
            
           	out.writeObject(ar);
			 
            out.close();
            fileOut.close();
           
         } catch (IOException i) {
            i.printStackTrace();
         }
   	
    }

	public String readAll() {
		// TODO Auto-generated method stub
		 
		try {
			FileInputStream fin = new FileInputStream("file.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
			Object object = oin.readObject();
			oin.close();
			return(object.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
    
 
 
    
    
}