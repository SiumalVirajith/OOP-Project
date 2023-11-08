package calculator;

public class Data
{
    private String Name;
    private String uniName; 
    private String FacName; 
    private String regNum; 
    private String psw;
    
    //constructor for signing details
    public Data(String Name, String uniName, String facName, String regNum, String psw)
    {
        this.Name=Name;
        this.uniName=uniName;
        this.FacName=facName;
        this.regNum=regNum;
        this.psw=psw;
    
    }

    //Get And Set 
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getFacName() {
        return FacName;
    }

    public void setFacName(String FacName) {
        this.FacName = FacName;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
}