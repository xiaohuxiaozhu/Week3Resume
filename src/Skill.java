
import java.util.ArrayList;

public class Skill {
    private String skillName;
    private String ratingList;



    public Skill(String skillName){
        this.skillName=skillName;
    }

    public Skill(){

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

    @Override
    public String toString(){

    return "\nSkills"+"\n"+getSkillName() + " , " + getRatingList();

    }
}