package methods;

public class GradeMarks {
	public static String getGrade(int percentage ) {       
        if(percentage>=80){  
            System.out.println("A grade"); 
            return "A grade"; 
        }else if(percentage<=80){  
            System.out.println("B grade"); 
            return "B grade";
        }else {  
            System.out.println("Not Eligible");  
            return "Not Eligible"; 
        }
   }


	public static void main (String[] args){
 
	String grade = GradeMarks.getGrade(70);
	System.out.println("good");
}
}
