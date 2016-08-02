package assignment_1;

public class BinaryTree<E> {

	int size;
	
	public BinaryTree(){

		size = 1;
		
	}
	
	public Node<E> insertRoot(Node<E> rootNode , E elementForRoot , E elementForLeftOfRoot , 
			E elementForRightOfRoot){
		
		if(rootNode == null){
			
			rootNode = new Node<E>();
			
			rootNode.nodeValue = elementForRoot;
			
			rootNode.left = new Node<E>();
			
			rootNode.left.nodeValue = elementForLeftOfRoot;
			
			rootNode.right = new Node<E>();
			
			rootNode.right.nodeValue = elementForRightOfRoot;
		}
		
		return rootNode;
	}
	
	public Node<E> insert(Node<E> rootNode , E elementForLeft , E elementForRight){

		try{
			
			if(rootNode.left == null && rootNode.right == null){
				
				rootNode.left = new Node<E>();
				
				rootNode.left.nodeValue = elementForLeft;
				
				rootNode.right = new Node<E>();
				
				rootNode.right.nodeValue = elementForRight;
				
				size++;
				
			}
			else{
				
				if(size % 2 == 0){

					rootNode.left = insert(rootNode.left , elementForLeft , elementForRight);
				}

				else{

					rootNode.right = insert(rootNode.right , elementForLeft , elementForRight);
				}
			}

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
		}

		return rootNode;
	}
}