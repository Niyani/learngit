package test1;

import java.util.*;



public class Demo6 {
	public HashMap<String,ShoppingCar> items = new HashMap<String,ShoppingCar>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(1,"����һֻ̩�ϵ�����������","���ߣ�̩��",36.50,100);
        Book b2 = new Book(2,"�������ռǡ�","���ߣ���ʿ��",25.5,67);
        Book b3 = new Book(3,"���������ռǡ�","���ߣ��붡",45.8,28);
        Book b4 = new Book(4,"��һֻ���յķϱ���","���ߣ�����",10.01,24);
        Book b5 = new Book(5,"���������--����","���ߣ�����",9.9,77);
        Book b6 = new Book(6,"����һ��Ҫ��","���ߣ�Сɧ",8.5,1);
        
       ShoppingCar car=new ShoppingCar();
       car.addBook(b1);
       car.addBook(b2);
       car.addBook(b3);
       car.addBook(b4);
       car.addBook(b5);
       car.addBook(b6);

		 while(true){
	    	   System.out.println("\t1 չʾ���ﳵ");
	    	   System.out.println("\t2 �����鱾");
	    	   System.out.println("\t3 ɾ���鼮");
	    	   System.out.println("\t4 ��չ��ﳵ");
	    	   System.out.println("\t5 ��ȡ���ﳵ�ܼ�Ǯ ");
	    	   System.out.println("\t0 �˳�");
	    	   System.out.println("��ѡ��");
	    	   
	    	  
	    	   Scanner s=new Scanner(System.in);
	    	   String x=s.nextLine();
	    	   switch(x){
	    	   case "1":{
	    		   ArrayList<Book> a=car.printCart();
	    		   for(int i=0;i<a.size();i++){
	    				System.out.print(a.get(i).toString()+"��"+"\n");
	    			}
	    		   break;
	    	   }case "2":{
	    		   System.out.println("������Ҫ��ӵ�����:");
	    		    x=s.nextLine();
	    		   if(x.equals(b1.getName())){
	    			   car.addBook(b1);
	    			   System.out.println("��ӳɹ�����");
	    			   break;
	    		   }else if(x.equals(b2.getName())){
	    			   car.addBook(b2);
	    			   System.out.println("��ӳɹ�����");
	    			   break; 
	    		   }else if(x.equals(b3.getName())){
	    			   car.addBook(b3);
	    			   System.out.println("��ӳɹ�����");
	    			   break;
	    			}else if(x.equals(b4.getName())){
	     			   car.addBook(b4);
	     			   System.out.println("��ӳɹ�����");
	     			   break;
	     			}else if(x.equals(b5.getName())){
	     			   car.addBook(b5);
	     			   System.out.println("��ӳɹ�����");
	     			   break;
	     			}else if(x.equals(b6.getName())){
	     			   car.addBook(b6);
	     			   System.out.println("��ӳɹ�����");
	     			   break;
	     			}else{
	    				System.out.println("�������");
	    				break;
	    			}

	    	   }case "3":{
	    		   System.out.println("������Ҫɾ��������:");
	    		   x=s.nextLine();
	    		   if(x.equals(b1.getName())){
	    			   car.deleteBook(b1);
	    			   System.out.println("ɾ���ɹ�����");
	    			   break;
	    		   }else if(x.equals(b2.getName())){
	    			   car.deleteBook(b2);
	    			   System.out.println("ɾ���ɹ�����");
	    			   break; 
	    		   }else if(x.equals(b3.getName())){
	    			   car.deleteBook(b3);
	    			   System.out.println("ɾ���ɹ�����");
	    			   break;
	    			}else if(x.equals(b4.getName())){
	     			   car.deleteBook(b4);
	     			   System.out.println("ɾ���ɹ�����");
	     			   break;
	     			}else if(x.equals(b5.getName())){
	     			   car.deleteBook(b5);
	     			   System.out.println("ɾ���ɹ�����");
	     			   break;
	     			}else if(x.equals(b6.getName())){
	     			   car.deleteBook(b6);
	     			   System.out.println("ɾ���ɹ�����");
	     			   break;
	     			}else{
	    				System.out.println("�������");
	    				break;
	    			}
	    		   
	    	   }case "4":{
	    		  car.clearCart();
	    		   break;
	    	   }case "5":{
	    		   System.out.println(car.getTotalPrice());
	    		   break;
	    		   
	    	   }case "0":{
	    		   return;
	    	   }
	    	   default:{
	    		   break;
	    	   }
	    	   }
	       }
		}
       
	
}
    		   
    	   
   
    
