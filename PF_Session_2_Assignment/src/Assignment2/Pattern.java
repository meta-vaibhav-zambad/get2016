/**
 * 
 */
package Assignment2;

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
		
int n = 10,temp = 1;
		
		for(int i=0;i<=n/2;++i){

			for(int j=0;j<n/2-i;++j){
				System.out.print(" ");
			}

			for(int k=0;k<i+1;++k){
				System.out.print(k+1);
			}

			for(int k=i;k>0;--k){
				System.out.print(k);
			}

			System.out.println();

		}

		for(int i=n/2+1;i<n;++i){

			for(int k=0;k<i-(n/2);++k){
				System.out.print(" ");
			}

			for(int k=0;k<i-temp;++k){
				System.out.print(k+1);
			}

			for(int k=i-temp-1;k>0;--k){
				System.out.print(k);

			}

			temp+=2;

			System.out.println();

		}

	}

}
