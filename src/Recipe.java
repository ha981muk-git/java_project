import java.security.PublicKey;
import java.util.ArrayList;

public class Recipe {
	
	 public String name;
	 public int flag;
	 public int calories;
	 public String ingredients[];
	 
	 public int getCalories(){
		 return this.calories;
		 
	 }
	 public String getName() {
		 return this.name;
		
	}
	 public String[] getIngredients() {
		 return this.ingredients;
     
    	 
     }
      
}


/*
 * FocacciaBrot.name = "Italienisches Focaccia Brot";
		FocacciaBrot.flag = 1;
		FocacciaBrot.calories = 0;
		FocacciaBrot.ingredients = ingredients2;*/
 