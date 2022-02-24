     //Class of Recipes
public class Recipe {
	
	 public  String   name;
	 public  String   image;
	 public  boolean  labellike; 
	 public  int      flag;
	 public  int      calories;
	 public  String   ingredients[];
	 
	 
	 // Methods 
	 public  int getCalories(){
		     return this.calories;	 
	 }
	 
	 public String getName() {
		     return this.name;	
	 }
	 
	 public String[] getIngredients() {
		 return this.ingredients; 	 
     }
}
