import java.util.*;

public class DataApp {


    public static void main(String[] args) {
        Person person1 = new Person("John J Jingleheimer-Schmidt", "jjjschmidt@gmail.com");

        Education education1 = new Education("BC", "Psychology", "University of Maryland", "2002");

        WorkExperience workExperience1 = new WorkExperience("Business Analyst", "DCPS", "August 2005", "May 2014", "- Duty 1, Lorm ipsum  \n - Duty 2, Gaudeamos Igitur Invenes Dum Somos");


        //Data pp1 =new Data(person1,education1,workExperience1);
     //   Data body=new Data();
       // System.out.println(body.toString());
        //   Skill skill1=new Skill()
        
        System.out.println(person1);
        System.out.println(education1);
        System.out.println(workExperience1);
    }

   // private static void print(String s) {
   //     System.out.println(s.dataToString());
 //   }


}
