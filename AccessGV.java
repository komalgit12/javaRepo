package globalVar;

public class AccessGV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of GVstudy class
		GVstudy Sachin=new GVstudy();
		Sachin.name=" Sachin T";
		Sachin.emp_sal= 12453.54f;
		Sachin.gender='M';
		GVstudy.team="India";
		
		GVstudy Virat=new GVstudy();
		Virat.name=" Virat K";
		Virat.emp_sal= 124646.4f;
		Virat.gender='M';
	    GVstudy.team="India";
		
				//calling method
	    Sachin.info();
	    System.out.println("We are from "+GVstudy.team);
	    Virat.info();
		

	}

}
