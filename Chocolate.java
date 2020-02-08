package project1.Raviteja;

public class Chocolate extends Sweet{
	
	Chocolate(String nameOfChocolate,int c,int ingredients){
		
		this.nameOfSweet=nameOfChocolate;
		this.calories=c;
		this.ingredients=ingredients;
	}
	public int getCalories() {
		
		return calories;
		
	}
	
}
