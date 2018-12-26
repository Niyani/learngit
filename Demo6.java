package test1;

import java.util.*;



public class Demo6 {
	public HashMap<String,ShoppingCar> items = new HashMap<String,ShoppingCar>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(1,"《论一只泰迪的自我修养》","作者：泰迪",36.50,100);
        Book b2 = new Book(2,"《二哈日记》","作者：哈士奇",25.5,67);
        Book b3 = new Book(3,"《丁丁历险记》","作者：冯丁",45.8,28);
        Book b4 = new Book(4,"《一只文艺的废炳》","作者：饼子",10.01,24);
        Book b5 = new Book(5,"《这个字念--喆》","作者：吉吉",9.9,77);
        Book b6 = new Book(6,"《但一定要》","作者：小骚",8.5,1);
        
       ShoppingCar car=new ShoppingCar();
       car.addBook(b1);
       car.addBook(b2);
       car.addBook(b3);
       car.addBook(b4);
       car.addBook(b5);
       car.addBook(b6);

		 while(true){
	    	   System.out.println("\t1 展示购物车");
	    	   System.out.println("\t2 加入书本");
	    	   System.out.println("\t3 删除书籍");
	    	   System.out.println("\t4 清空购物车");
	    	   System.out.println("\t5 获取购物车总价钱 ");
	    	   System.out.println("\t0 退出");
	    	   System.out.println("请选择：");
	    	   
	    	  
	    	   Scanner s=new Scanner(System.in);
	    	   String x=s.nextLine();
	    	   switch(x){
	    	   case "1":{
	    		   ArrayList<Book> a=car.printCart();
	    		   for(int i=0;i<a.size();i++){
	    				System.out.print(a.get(i).toString()+"、"+"\n");
	    			}
	    		   break;
	    	   }case "2":{
	    		   System.out.println("请输入要添加的书名:");
	    		    x=s.nextLine();
	    		   if(x.equals(b1.getName())){
	    			   car.addBook(b1);
	    			   System.out.println("添加成功！！");
	    			   break;
	    		   }else if(x.equals(b2.getName())){
	    			   car.addBook(b2);
	    			   System.out.println("添加成功！！");
	    			   break; 
	    		   }else if(x.equals(b3.getName())){
	    			   car.addBook(b3);
	    			   System.out.println("添加成功！！");
	    			   break;
	    			}else if(x.equals(b4.getName())){
	     			   car.addBook(b4);
	     			   System.out.println("添加成功！！");
	     			   break;
	     			}else if(x.equals(b5.getName())){
	     			   car.addBook(b5);
	     			   System.out.println("添加成功！！");
	     			   break;
	     			}else if(x.equals(b6.getName())){
	     			   car.addBook(b6);
	     			   System.out.println("添加成功！！");
	     			   break;
	     			}else{
	    				System.out.println("输入错误");
	    				break;
	    			}

	    	   }case "3":{
	    		   System.out.println("请输入要删除的书名:");
	    		   x=s.nextLine();
	    		   if(x.equals(b1.getName())){
	    			   car.deleteBook(b1);
	    			   System.out.println("删除成功！！");
	    			   break;
	    		   }else if(x.equals(b2.getName())){
	    			   car.deleteBook(b2);
	    			   System.out.println("删除成功！！");
	    			   break; 
	    		   }else if(x.equals(b3.getName())){
	    			   car.deleteBook(b3);
	    			   System.out.println("删除成功！！");
	    			   break;
	    			}else if(x.equals(b4.getName())){
	     			   car.deleteBook(b4);
	     			   System.out.println("删除成功！！");
	     			   break;
	     			}else if(x.equals(b5.getName())){
	     			   car.deleteBook(b5);
	     			   System.out.println("删除成功！！");
	     			   break;
	     			}else if(x.equals(b6.getName())){
	     			   car.deleteBook(b6);
	     			   System.out.println("删除成功！！");
	     			   break;
	     			}else{
	    				System.out.println("输入错误");
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
    		   
    	   
   
    
