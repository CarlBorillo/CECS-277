package Lab3;

public class Education{

    private String Degree;
    private String Major;
    private int Research;

    public Education(){
        Degree = "";
        Major = "";
        Research = 0;
    }

    public Education(String Degree, String Major, int Research) {
        setDegree(Degree);
        setMajor(Major);
        setResearch(Research);
    }

    public String getDegree() {

        return Degree;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public String getMajor() {

        return Major;
    }

    public void setMajor(String Major) {

        this.Major = Major;
    }

    public int getResearch() {

        return Research;
    }

    public void setResearch(int Research) {

        this.Research = Research;
    }
}
