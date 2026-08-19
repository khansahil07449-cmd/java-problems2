import java.io.*;
class Student{
    int rollno; 
    String name ; 
    double  marks1 ;
    double  marks2 ; 
    double  marks3; 

    public  void Adetails( BufferedReader  br ) throws IOException{
        System.out.println( " Enter the roll no of the student " );
         rollno = Integer.parseInt(br.readLine());
        
         System.out.println( " Enter the name of the student " );
         name = br.readLine(); 

         System.out.println( " Enter the  marks 1 of the student : " ) ; 
         marks1 = Double.parseDouble(br.readLine()); 
          
         System.out.println( " Enter the  marks 2 of the student : " ) ; 
         marks2 = Double.parseDouble(br.readLine()); 
          
         System.out.println(" Enter the mark 3 of the student : " ) ; 
         marks3 = Double.parseDouble(br.readLine()); 
    } 
      
    public  double  Total () { 
        return marks1 + marks2 + marks3 ; 
      }
      public float Percentage () { 
        return (float) ( Total() / 300)*100;
      }
     public String determineGrade() {
        double percentage = Percentage();
        
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }
    public void display() {
    System.out.println("---------------------------");    
    System.out.println("Name: " + name);
     System.out.println ("Roll No: " + rollno);
     System.out.println ( "Total marks : " + Total());
     System.out.println ( " Percentage :" + Percentage());
     System.out.println ( " Grade : " + determineGrade());
 
} 

    }

    public  class  Problem1{
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println(" Enter the details for Student 1 : " );
      Student s1 = new Student();
      s1.Adetails(br ) ;
       System.out.println(" Enter the details for Student 2 : " );
      Student s2 = new Student();
     s2.Adetails(br ) ;
       
     System.out.println("         Final Results       " );
     System.out.println(" The result of the student 1 is  " ) ;
     s1.display();
       System.out.println("The result of the student 2 is   " ) ;
       s2.display();

    }
}


