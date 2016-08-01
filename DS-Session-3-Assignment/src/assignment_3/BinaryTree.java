package assignment_3;


public class BinaryTree<E> {

	int size;

	public BinaryTree(){

		size = 0;

	}

	public Node<E> insert(Node<E> rootNode , E element){

		try{

			if(rootNode == null){

				rootNode = new Node<E>();

				rootNode.nodeValue = element;

				rootNode.left = null;

				rootNode.right = null;

				size++;

			}

			else{

				if(size % 2 == 0){

					rootNode.left = insert(rootNode.left , element);
				}

				else{

					rootNode.right = insert(rootNode.right , element);
				}
			}

		}catch(Exception ex){

			System.out.println("Something went wrong: "+ex.getMessage());
		}

		return rootNode;
	}

	public void postorder(Node<E> rootNode){

		try{
			if(rootNode != null){

				postorder(rootNode.left);

				postorder(rootNode.right);
				
				System.out.println(rootNode.nodeValue);
			}
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}
}