package assignment_1;

import java.util.Date;

public class Book {
	
	private String bookTitleName;
	private String bookType;
	private double bookPrice;
	
	public String getBookTitleName() {
		return bookTitleName;
	}
	
	public void setBookTitleName(String bookTitleName) {
		this.bookTitleName = bookTitleName;
	}
	
	public String getBookType() {
		return bookType;
	}
	
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	public double getBookPrice() {
		return bookPrice;
	}
	
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
}