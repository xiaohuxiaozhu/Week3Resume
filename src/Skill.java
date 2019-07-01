import java.util.ArrayList;

public class Skill {
    private String skillName;
    private ArrayList<Skill> ratingList;



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

    public ArrayList<Skill> getRatingList() {
        return ratingList;
    }

    public void setRatingList(ArrayList<Skill> ratingList) {
        this.ratingList = ratingList;
    }

    @Override
    public String toString(){
    return getSkillName() + " , " + getRatingList();

    }
}