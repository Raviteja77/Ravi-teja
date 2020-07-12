package Com.MavenAndOOP;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Chocolate s1=new Chocolate("Dairy Milk",400,3);
		Chocolate s2=new Chocolate("Milky Bar",432,3);
		Cookies c1=new Cookies("Dark Fantasy",233,2);
		Cookies c2=new Cookies("Choco Pie",203,2);
		Sweet []s=new Sweet[4];
		s[0]=s1;
		s[1]=s2;
		s[2]=c1;
		s[3]=c2;
		Gift g=new Gift(s);
		g.sort();
		g.getDisplay();
		g.getIngredients();

	}

}
