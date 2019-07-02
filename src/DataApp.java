import java.util.*;

public class DataApp {


    public static void main(String[] args) {

      /* tested output
        Person person1 = new Person("John J Jingleheimer-Schmidt", "jjjschmidt@gmail.com");

        Education education1 = new Education("BC", "Psychology", "University of Maryland", "2002");

        WorkExperience workExperience1 = new WorkExperience("Business Analyst", "DCPS", "August 2005", "May 2014", "- Duty 1, Lorm ipsum \n - Duty 2, Gaudeamos Igitur Invenes Dum Somos");



        
        System.out.println(person1);
        System.out.println(education1);
        System.out.println(workExperience1); */


        //   ArrayList<Person> person = new ArrayList<>();
        ArrayList<Education> eduction = new ArrayList<>();
        ArrayList<WorkExperience> workExperiences = new ArrayList<>();
        ArrayList<Skill> skill = new ArrayList<>();


        String addPerson = "";
        String addEduction = "";
        String addWorkExperience = "";
        String addSkill = "";

        Person theperson = new Person();
        Education theeducation = new Education();
        WorkExperience theworkExperience = new WorkExperience();
        Skill theskill = new Skill();

        do {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your full name");
            String personName = sc.nextLine();
            theperson.setName(personName);

            System.out.println("Enter your email");
            String personEmail = sc.nextLine();
            theperson.setEmail(personEmail);

            //    person.add(theperson);
            do {

                System.out.println("Enter your Degree: Associate's, Bachelor's, Master's, PHD, etc.");
                String personEducation = sc.nextLine();
                theeducation.setDegree(personEducation);

                System.out.println("Enter your major");
                String personMajor = sc.nextLine();
                theeducation.setMajor(personMajor);

                System.out.println("Enter your University name");
                String personSchoolName = sc.nextLine();
                theeducation.setSchoolName(personSchoolName);

                System.out.println("Enter graduation year");
                String personGraYear = sc.nextLine();
                theeducation.setGraYear(personGraYear);


                System.out.println("\nDo you want to add another edcation information?" + "" + "yes/no");
                addEduction = sc.nextLine();
                for (int counter = 0; counter <= eduction.size(); counter++) ;
                eduction.add(theeducation);
            } while (addEduction.equalsIgnoreCase("yes"));

    /*        do {

                System.out.println("Enter the last company you worked for");
                String personWoCo = sc.nextLine();
                theworkExperience.setCompanyName(personWoCo);

                System.out.println("Enter the title of the last position you worked  ");
                String personJob = sc.nextLine();
                theworkExperience.setJobTitle(personJob);

                System.out.println("Enter the start date of your last job");
                String personStartDay = sc.nextLine();
                theworkExperience.setStartDate(personStartDay);

                System.out.println("Enter the end date of your last job");
                String personEndDay = sc.nextLine();
                theworkExperience.setEndDate(personEndDay);

                System.out.println("Enter the job description for your last job");
                String personDes = sc.nextLine();
                theworkExperience.setDescription(personDes);



                System.out.println("\nDo you want to add another work experience information?" + "" + "yes/no");
                addWorkExperience = sc.nextLine();
                workExperiences.add(theworkExperience);
            } while (addWorkExperience.equalsIgnoreCase("yes"));

            do{
                System.out.println("Enter your skill");
                String personSkill = sc.nextLine();
                theskill.setSkillName(personSkill);

                System.out.println("Skill rating:Fundamental, Novice, Intermediate, Advanced, Expert" );
                String personRating=sc.nextLine();
                theskill.setRatingList(personRating);



                System.out.println("\n Do you want to add another skill and rating?" + " "+"yes/no");
                addSkill=sc.nextLine();
                skill.add(theskill);


            }while (addSkill.equalsIgnoreCase("yes"));



*/


          //  System.out.println("Would you like to enter another resumer? (Yes|No)");
        } while (addPerson.equalsIgnoreCase("yes"));


            System.out.println(theperson);
            System.out.println(theeducation);
      /*  System.out.println(theworkExperience);
        System.out.println(theskill);*/
        }
    }








