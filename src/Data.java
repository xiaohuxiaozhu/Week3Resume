import java.util.*;

public class Data {

   private Person person;
    private Education education;
    private WorkExperience workExperience;
  //  private Skill skill;


    public Data(){

    }

    public Data(Person person, Education education, WorkExperience workExperience, Skill sill) {
        this.person = person;
        this.education = education;
        this.workExperience = workExperience;
      //  this.skill = sill;
       // person = new Person();
    }

   public Person getPerson() {
       return person;
   }

   public void setPerson(Person person) {
        this.person = person;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }
/*
    public Skill getSill() {
        return skill;
    }

    public void setSill(Skill sill) {
        this.skill = sill;
    }
*/
    @Override
    public String toString(){
        return  "\n Education \n" + education.toString()+"\n"+workExperience.toString();
                //+"\n"+ skill.toString();
    }
}
