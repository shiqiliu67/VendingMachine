package lab5;
public class Book {
 private int id;
 private String title;
 private double price;
 private int totalCopies;
 private static int count=0;
 
 
 public Book(String title1, double price1, int copies1){
	 	title = title1;
	 	price = price1;
	 	totalCopies = copies1;
	 	id = count;
	 	count++;
 }
 public void setTitle(String title1) {
	 this.title = title1;
 }
 public void setPrice(double price1) {
	 this.price = price1;
 }
 public void setTotalCopies(int copies1) {
	 this.totalCopies = copies1;
 }
 
 public int getId() {
	 return id;
 }
 public String getTitle() {
	 return title;
 }
 
 public double getPrice() {
	 return price;
 }
 public int totalCopies() {
	 return totalCopies;
 }
 public int titleCharCount() {
	 return title.length();
 }
 public static int getCount() {
	 return count;
 }
 
 //to string method;
 public String toString() {
	 String output = "The title of the book:" + this.title + "\n" 
  + "The ID of the book:" + this.id + "\n" + "The price of the book:"+
			 this.price +"\n" + "Totalcopies of the book:" + this.totalCopies+"\n";
	 return output;}
}
 

