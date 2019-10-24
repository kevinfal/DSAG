
/**
 * 
 * @author kevin
 *Binary Search tree class, holds TreeNodes
 * @param <E>
 */
public class BinarySearchTree<E extends Comparable <E>> {
	//private data
	private TreeNode<E> root;
	
	/**
	 * Constructor
	 */
	public BinarySearchTree() {
		root = null;
	}
	public TreeNode<E> getRoot(){
		return root;
	}
	
	/**
	 * clears entire Tree
	 */
	public void clear() {
		root = null;
	}
	
	/**
	 * adds node to the Tree
	 * @param added - node to be added
	 */
	public void add(E added) {
		if(root == null) {
			//Tree is empty, set as root
			root = new TreeNode<E>(added);
			System.out.println("Added successfully");
		}
		else if(added.compareTo(root.getData()) == 0) {
			//Data being added is already in Tree
			System.out.println("Already contained");
		}
		else {
			insert(root, new TreeNode<E>(added));
		}
	}
	
	/**
	 * recursive method to insert a new node that is not root
	 * actually puts it in tree
	 * @param node - root usually
	 * @param added - new node to be added
	 * @return the node, root usually
	 */
	public TreeNode<E> insert(TreeNode<E> node, TreeNode<E> added){
		if(node != null) {
			if(added.compareTo(node) < 0){
				node.setLeft(insert(node.getLeft(), added));
			}
			else if(added.compareTo(node) > 0) {
				node.setRight(insert(node.getRight(), added));
			}
			else {
				System.out.println(added + " currently in tree");
			}
		}
		else {
			System.out.println("Add successful");
			return added;
		}
		return node;
	}
	
	/**
	 * calls for the preOrder without the parameter in case you forget
	 * default
	 */
	public void preOrder() {
		preOrder(root);
	}
	
	/**
	 * 
	 * traverses the tree (preOrder) from the specified node (root)
	 * @param node - Root usually
	 */
	public void preOrder(TreeNode<E> node) {
		if(root == null) {
			System.out.println("Tree is empty");
		}
		
		else if(node != null) {
			System.out.println(node);
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}
	
	/**
	 * simple postOrder call, default
	 */
	public void postOrder() {
		postOrder(root);
	}
	
	/**
	 * traverses tree (postOrder)
	 * @param node - root please
	 */
	public void postOrder(TreeNode<E> node) {
		
		if(root == null) {
			System.out.println("Tree is empty");

		}
		
		else if(node != null) {
			postOrder(node.getLeft());
			postOrder(node.getRight());
			
			
			System.out.println(node);
		}
		
	}
	/**
	 * simple inOrder call, default
	 */
	public void inOrder() {
		inOrder(root);
	}
	/**
	 * traverses tree (inOrder) and prints out nodes
	 * @param node - root usually
	 */
	public void inOrder(TreeNode<E> node) {
		if(root == null) {
			System.out.println("Tree is empty");

		}
		else if(node != null) {
			inOrder(node.getLeft());
			System.out.println(node);
			inOrder(node.getRight());
		}
	}
	
	/**
	 * initiates removal process
	 * @param removed - item to be removed
	 */
	public void remove(E removed) {
		if(root == null) {
			//tree is empty
			System.out.println("Empty Tree ");
		}
		else if(root.getData().compareTo(removed) == 0) {
			//remove root
			System.out.println("Deleted Successfuly");
			if(root.getLeft() == null) {
				root = root.getRight();
			}
			else {
				delete(root);
			}
		}
		else {
			TreeNode<E> parent = findParent(root, removed);
			//find parent of node to delete
			TreeNode<E> child;
				if(removed.compareTo(parent.getData()) > 0) {
					child = parent.getRight();
				}
				else {
					child = parent.getLeft();
				}
			if(child == null) {
				//not in tree
				System.out.println("Not in tree");
			}
			else if(child.getLeft() == null) {
				System.out.println("deleted");

				//child has 1 or 0 children
				if(removed.compareTo(parent.getData())>0)
					parent.setRight(child.getRight());
				else 
					parent.setLeft(child.getRight());
			}
			else {
				System.out.println("deleted");

				delete(child);
			}
		}
	}
	/**
	 * finds parent of node we are looking for
	 * @param node
	 * @param obj
	 * @return the parent node
	 */
	public TreeNode<E> findParent(TreeNode<E> node, E obj) {
		
		TreeNode<E> child;
		if(obj.compareTo(node.getData()) > 0) {
			child = node.getRight();
		}
		else {
		 child = node.getLeft();//Decides which child to look at
		}
		
		if (child == null || child.getData().compareTo(obj) == 0) {
			//found
			return node;
		}
		//keep looking
		return findParent(child, obj);
}
	
	/**
	 * deletes a node from existence
	 * absolute destruction of node
	 * sent straight to the garbage bin
	 * ________
	 * |trash |
	 * | bin  |
	 * |	  |
	 * --------
	 * @param node - node to find
	 */
	public void delete(TreeNode<E> node) {
		if (node.getLeft().getRight() == null) {
			
			node.setData(node.getLeft().getData());
			node.setLeft(node.getLeft().getLeft());
			//no right node
		} 
		else {
			//while loop to find the parent node
			TreeNode<E> temp = node.getLeft();
			while (temp.getRight().getRight() != null) {
				temp = temp.getRight();
			}
			node.setData(temp.getRight().getData());
			temp.setRight(temp.getRight().getLeft());
		}
}
}