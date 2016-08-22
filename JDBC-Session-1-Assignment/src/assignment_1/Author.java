package assignment_1;

public class Author {

	private String authorId;
	private String authorLName;
	private String authorFName;
	private String authorAddress;
	private String authorState;
	
	public Author(){
		
		this.authorId = null;
		this.authorLName = null;
		this.authorFName = null;
		this.authorAddress = null;
		this.authorState = null;
	}

	public Author(String authorId,String authorLName,String authorFName,
			String authorAddress , String authorState){

		this.authorId = authorId;
		this.authorLName = authorLName;
		this.authorFName = authorFName;
		this.authorAddress = authorAddress;
		this.authorState = authorState;

	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getAuthorLName() {
		return authorLName;
	}

	public void setAuthorLName(String authorLName) {
		this.authorLName = authorLName;
	}

	public String getAuthorFName() {
		return authorFName;
	}

	public void setAuthorFName(String authorFName) {
		this.authorFName = authorFName;
	}

	public String getAuthorAddress() {
		return authorAddress;
	}

	public void setAuthorAddress(String authorAdddress) {
		this.authorAddress = authorAdddress;
	}

	public String getAuthorState() {
		return authorState;
	}

	public void setAuthorState(String authorState) {
		this.authorState = authorState;
	}
	
	public String toString(){
		
		return this.authorId +" "+this.authorLName+" "+this.authorFName+" "+this.authorAddress
				+" "+this.authorAddress+" "+this.authorState;
	}
}