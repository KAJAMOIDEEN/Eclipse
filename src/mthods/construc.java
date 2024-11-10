package mthods;

public class construc {
    
		  int modelYear;
		  String modelName;

		  public construc(int year, String name) {
		    modelYear = year;
		    modelName = name;
		  }

		  public static void main(String[] args) {
		    construc myCar = new construc(1969, "Mustang");
		    System.out.println(myCar.modelYear + " " + myCar.modelName);
		  }
		}

