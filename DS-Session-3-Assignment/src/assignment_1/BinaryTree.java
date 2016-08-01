package assignment_1;

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

	public void preorder(Node<E> rootNode){

		try{
			if(rootNode != null){

				System.out.println(rootNode.nodeValue);

				preorder(rootNode.left);

				preorder(rootNode.right);
			}
		}catch(Exception ex){
			
			System.out.println("Something went wrong: "+ex.getMessage());
		}
	}
}