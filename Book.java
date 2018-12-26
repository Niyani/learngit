package test1;

// È¿‡
class Book{
	private int id;
	private String name;
	private String author;
	private double price;
	private int num;
	
	public Book(){
		
	}
	public Book(int id,String name,String author,double price,int num){
		this.id=id;
		this.name=name;
		this.author=author;
		this.price=price;
		this.num=num;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	
	public int getNum(){
		return num;
	}
	
	public void setNum(int num){
		this.num=num;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}	 
	public String toString(){
		return "id:"+id+"  name:"+name +"  author:"+author +"  price:"+price +"  num:"+num;
	}
}
