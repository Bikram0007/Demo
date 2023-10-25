package Project;

public class test
{
	public static void main(String[] args) 
	{
		String s ="swa#stik?ku#mar?moha#patra?" ;//We have to print
												//Firstname -swastik
												//second name :-kumar
												//last name :- mohapatra
		String firstname= s.split("?")[0].replace("#", "");
		String secondname= s.split("?")[1].replace("#", "");
		String thirdname= s.split("?")[2].replace("#", "");
		System.out.println(firstname);
		System.out.println(secondname);
		System.out.println(thirdname);
		
	}

}
