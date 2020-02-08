package project1.Raviteja;

public class Gift {
	
	private Sweet[] s1=new Sweet[4];
	Gift(Sweet s[]){
		for(int i=0;i<4;i++) {
			this.s1[i]=s[i];
		}
	}
	void sort() {
		
		Sweet temp;
		for(int i =0;i<4;i++) {
			for(int j=i;j<4;j++) {
				if (s1[i].getCalories()>s1[j].getCalories()){
					temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
					
				}
			}
		}
	}
	void getDisplay() {
		
		System.out.println("----------------------------------------------------------");
		System.out.println("          The Gifts are sorted based on Calories          ");
		System.out.println("----------------------------------------------------------");
		System.out.println("S.No"+"\t"+"Name"+"\t\t"+"Ingredients"+"\t\t"+"Calories");
		System.out.println("----------------------------------------------------------");
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+"\t"+s1[i].nameOfSweet+"\t\t"+s1[i].ingredients+"\t\t"+s1[i].getCalories()+" Joules");
		}
		System.out.println("----------------------------------------------------------");
	
}
    public void getIngredients() {
		
		System.out.println("----------------------------------------------------------");
		System.out.println("     The Main Ingredients of the Chocolate are :          ");
		System.out.println("                  1. Sugar                                ");
		System.out.println("                  2. Cocoa Butter                         ");
		System.out.println("                  3. Full Cream Milk Powder               ");
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		System.out.println("       The Main Ingredients of the Cookies are :          ");
		System.out.println("                    1. Sugar                              ");
		System.out.println("                    2. Wheat Flour                         ");
		System.out.println("----------------------------------------------------------");
	}
	
}