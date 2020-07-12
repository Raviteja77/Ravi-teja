package Com.MavenAndOOP;


public class Cookies extends Sweet {
	
	Cookies(String nameOfCookies,int c,int ingredients){
		
		this.nameOfSweet=nameOfCookies;
		this.calories=c;
		this.ingredients=ingredients;
	}
	
	public int getCalories() {
		
		return calories;
		
	}
	
}