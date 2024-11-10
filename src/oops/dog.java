package oops;

public class dog {
   String name;    //attributes
   String breed;
   String color;
  
   
    void dogInfo(String name,String breed,String color) { //behaviour
	   System.out.println(name+" is Barking..");
	   System.out.println(name+ " is " + breed);
	   System.out.println(name+" is "+color);
   }
		   
   public static void main(String args[]) {
	   dog obj = new dog(); 
	   obj.dogInfo( "kitty","labreed","white&Brown\n");
	
	   
	   
	   //Encapsulation
	   Encapsulation encapsObj = new Encapsulation();
	   encapsObj.username = "Mike";
	   encapsObj.setPassword("mike987");
       System.out.println("Your username:\t"+encapsObj.username);
       System.out.println("Your password:\t"+encapsObj.getPassword());
	   
   }
}
