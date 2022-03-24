package gp;
import java.util.*;

class Login{
	Scanner sc= new Scanner(System.in);
	String UserName="group3";
	String PassWord="Prince";
	public String customUser;
	public String pass;
	
	
	public void PromptForLoginDetails() {
		System.out.println("Enter the UserName");
		customUser=sc.nextLine();
		System.out.println("Enter the passWord");
		pass=sc.nextLine();
		
		
	}
	
	public boolean Validate(String user,String pass) {
		if(user.equals(customUser) && pass.equals(PassWord)) {
			return true;
		}
		return false;
	}
}

class Items{
	
	Scanner sc= new Scanner(System.in);
	public String [] List= {"Toys","Foods","Clothes","Medicine","Games","Software"};
	public int []Price= {100,200,300,400,500,600};
	public void showList() {
		int count=1;
		System.out.println("S.No. "+"	  "+"Items	 "+"Price");
		for(int i=0;i<List.length;i++) {
			System.out.println(i+1 + "		  " +List[i]+"	  "+Price[i]);
		}
	}
	
	
	
	public int calculateBill(int ch) {
		int res=0;
		switch(ch) {
		case 1:
			res+=100;
			break;
		case 2:
			res+=200;
			break;
		case 3:
			res+=300;
			break;
		case 4:
			res+=400;
			break;
		case 5:
			res+=500;
			break;
		case 6:
			res+=600;
			break;
		default:
			res+=0;
		
		
		}
		
		return res;
	}
	
	
}
public class ShoppingClass {

	public static void main(String[] args) {
		Scanner sce =new Scanner(System.in);
		// TODO Auto-generated method stub
		Login login=new Login();
		Items item= new Items();
		boolean ch=true;
		int billamount=0;
		int choice;
		
		login.PromptForLoginDetails();
		if(login.Validate(login.customUser, login.pass)) {
			while(ch){
				item.showList();
				System.out.println("Choose from the option given above ");
				choice=sce.nextInt();
				billamount+=item.calculateBill(choice);
				
				
				
				System.out.println("Do you want anything else if yes press Y else press N" );
				char chs=sce.next().charAt(0);
				if(chs=='N' || chs=='n') {
					ch=false;
				}
			}
			
			System.out.println("You have spent : "+billamount);
			
		}else {
			System.out.println("You Have Entered Wrong Credentials");
		}

	}

}
