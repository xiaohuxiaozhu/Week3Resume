public class Education {
    private String degree;
    private String major;
    private String schoolName;
    private String GraYear;

    public Education(){

    }

    public Education(String degree, String major, String schoolName, String graYear) {
        this.degree = degree;
        this.major = major;
        this.schoolName = schoolName;
        GraYear = graYear;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getGraYear() {
        return GraYear;
    }

    public void setGraYear(String graYear) {
        GraYear = graYear;
    }

    @Override
    public String toString(){
        return "\nEducation"+"\n"+getDegree() + " in" +"  " +getMajor() + "\n"+getSchoolName()+","+","+getGraYear();
    }
}




