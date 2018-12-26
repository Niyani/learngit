package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

//���ﳵ��
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
	//��ӹ��ﳵ
	public void addBook(Book b){
		if(hm.containsKey(b.getId())){
			int num=b.getNum();
			b.setNum(num+1);
			hm.put(b.getId(),b);
		}else{
			hm.put(b.getId(), b);
		}
	}
	//ɾ��ͼ��
	public void deleteBook(Book b){
		if(hm.containsKey(b.getId())){
			int num=b.getNum();
			b.setNum(num-1);
		}
		
	}
	//������ﳵ
	public  void clearCart(){
		hm.clear();
	}
	//��ȡ���ﳵ�ܼ�Ǯ
	public double getTotalPrice(){
		double totalPrice=0.0;
		
		ArrayList<Book> a=new ArrayList<Book>();
		Iterator it=hm.keySet().iterator();
		while(it.hasNext()){
			int b=(Integer)it.next();//ȡ�����
			Book book=hm.get(b);//ȡ����Ŷ�Ӧ��book
			totalPrice+=book.getPrice()*book.getNum();
		}
		return totalPrice;
	}
	//չ�ֹ��ﳵ����
	public ArrayList<Book> printCart(){
		ArrayList<Book> al=new ArrayList<Book>();
		
		Iterator it=hm.keySet().iterator();
		while(it.hasNext()){
			int id=(Integer)it.next();//ȡ��key
			Book book=hm.get(id);//ȡ��book
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