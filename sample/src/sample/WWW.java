/**
 *
 */
package sample;

public class WWW {

	    public static void main(String[] args) {
	    	int i=1;
	      while(i<=100){

	    	for( i=1;i<=100;i++){

	        	 if(i%15==0){
	        		 System.out.println("FizzBuzz");
	        	 }else if(i%5==0){
	        		 System.out.println("Buzz");
	        	 }else if(i%3==0){
	        		 System.out.println("Fizz");
	        	 }else{
	        		 System.out.println(i);
	        	 }
	        	switch(i){
	        		 case 100:
	        		 System.out.println("上限値になりました");
	        		 break;
	       }
	    }
	  }
  }
}