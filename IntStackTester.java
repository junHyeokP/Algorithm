package stack;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		IntStack intStack = new IntStack(64);    // 최대 64 개를 푸시할 수 있는 스택

		while (true) {
				System.out.println("=================================================");
		    System.out.printf("현재 데이터 개수: %d / %d\n", intStack.size(), intStack.capacity());
		    System.out.print("(1)푸시　(2)팝　(3)피크　(4)덤프　(0)종료: ");

		    int menu = input.nextInt();
		    if (menu == 0) {
		    	System.out.println("종료합니다.");
		    	break;
		    }
		    
		    int data;

		    switch (menu) {
		       case 1:  //push                       
		          System.out.print("데이터: ");
		          data = input.nextInt();
		          if (!intStack.push(data))
		        	  System.out.println("스택이 가득 찼습니다. ");
		          	          
		          break;

		       case 2: //pop
		    	   		data = intStack.pop();
		    	   		if (data != -1) 
		              System.out.println("팝한 데이터는 " + data + "입니다.");
		    	   else
		              System.out.println("스택이 비어있습니다.");

		          break;

		       case 3: //peek = top()
		    	   if (!intStack.empty()) {
		    		   data = intStack.top();
		              System.out.println("피크한 데이터는 " + data + "입니다.");
		    	   }
		    	   else {	
		              System.out.println("스택이 비어있습니다.");
		    	   	}
		          break;

		       case 4: //dump
		    	  intStack.dump();
		          break;
		      }
		
		}
	}
}