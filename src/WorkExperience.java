public class WorkExperience {
    private String companyName;
    private String jobTitle;
    private String description;
    private String startDate;
    private String endDate;

    public WorkExperience(String jobTitle, String companyName,   String startDate, String endDate,String description) {


        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;


    }

    public WorkExperience(){

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString(){
        return "\nExperience"+"\n"+getJobTitle()+ "\n"+getCompanyName()
                +","+" "+getStartDate()+"-" + getEndDate()
                +"\n"+getDescription();
    }
}
