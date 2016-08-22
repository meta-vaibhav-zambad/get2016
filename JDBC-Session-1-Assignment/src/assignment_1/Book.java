package assignment_1;

import java.util.Date;

public class Book {
	
	private String bookTitleName;
	private Date bookType;
	private double bookPrice;
	
	public String getBookTitleName() {
		return bookTitleName;
	}
	
	public void setBookTitleName(String bookTitleName) {
		this.bookTitleName = bookTitleName;
	}
	
	public Date getBookType() {
		return bookType;
	}
	
	public void setBookType(Date bookType) {
		this.bookType = bookType;
	}
	
	public double getBookPrice() {
		return bookPrice;
	}
	
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
}