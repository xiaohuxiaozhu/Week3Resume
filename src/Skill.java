
import java.util.ArrayList;

public class Skill {
    private String skillName;
    private String ratingList;
    private ArrayList<Skill>skillsList;



    public Skill(String skillName, String ratingList,ArrayList<Skill>skillsList){
        this.skillName=skillName;
        this.ratingList=ratingList;
        this.skillsList=skillsList;


    }

    public Skill(){
        skillName="";
        ratingList="";

    }

    public String getSkillName() {
        return skillName;

    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getRatingList() {
        return ratingList;
    }

    public void setRatingList(String ratingList) {
        this.ratingList = ratingList;
    }
    public ArrayList<Skill>getSkillsList(){
        return skillsList;
    }
    public void setSkillsList(ArrayList<Skill>skillsList){
        this.skillsList=skillsList;
    }

    @Override
    public String toString(){




    return "\nSkills"+"\n"+getSkillName() + " , " + getRatingList() ;


    }
}