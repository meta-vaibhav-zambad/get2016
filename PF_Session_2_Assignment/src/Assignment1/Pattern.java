/**
 * 
 */
package Assignment1;

/**
 * @author vaibhav
 *
 */
public class Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		for(int i=0;i<n;++i){
			for(int j=0;j<i;++j){
				System.out.print(" ");
			}
			for(int j=0;j<n-i;++j){
				System.out.print(j+1);
				//System.out.print(" ");
			}
			System.out.println();

		}

	}

}