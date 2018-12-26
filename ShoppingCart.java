package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

//购物车类
class ShoppingCar{
	private Book cart;
	HashMap<Integer,Book> hm=new HashMap<Integer,Book>();
	
	public ShoppingCar(){
		
	}
	public ShoppingCar(Book cart){
		this.cart=cart;
	}
	public Book getCart(){
		return cart;
	}
	public void setCart(Book cart){
		this.cart=cart;
	}
	//添加购物车
	public void addBook(Book b){
		if(hm.containsKey(b.getId())){
			int num=b.getNum();
			b.setNum(num+1);
			hm.put(b.getId(),b);
		}else{
			hm.put(b.getId(), b);
		}
	}
	//删除图书
	public void deleteBook(Book b){
		if(hm.containsKey(b.getId())){
			int num=b.getNum();
			b.setNum(num-1);
		}
		
	}
	//清除购物车
	public  void clearCart(){
		hm.clear();
	}
	//获取购物车总价钱
	public double getTotalPrice(){
		double totalPrice=0.0;
		
		ArrayList<Book> a=new ArrayList<Book>();
		Iterator it=hm.keySet().iterator();
		while(it.hasNext()){
			int b=(Integer)it.next();//取出书号
			Book book=hm.get(b);//取出书号对应的book
			totalPrice+=book.getPrice()*book.getNum();
		}
		return totalPrice;
	}
	//展现购物车方法
	public ArrayList<Book> printCart(){
		ArrayList<Book> al=new ArrayList<Book>();
		
		Iterator it=hm.keySet().iterator();
		while(it.hasNext()){
			int id=(Integer)it.next();//取出key
			Book book=hm.get(id);//取出book
			al.add(book);
		}
		return al;
	}
	public HashMap<Integer, Book> getHm() {
		return hm;
	}
	public void setHm(HashMap<Integer, Book> hm) {
		this.hm = hm;
	}
	
	
	
}