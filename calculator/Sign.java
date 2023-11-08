package calculator;

import java.util.Scanner;

public class Sign 
{
    private String Name;
    private String uniName; 
    private String FacName; 
    private String regNum; 
    private String psw; 
 
    Scanner sc =new Scanner(System.in);

    public Sign()
    {
        this.FacName=null;
        this.Name=null;
        this.uniName=null;
        this.psw=null;
        this.regNum=null;
    }

    //getters and setters
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
    //End of getters and setters

    public void signDetails()
    {
        System.out.print("Enter your name: ");
        Name = sc.nextLine();
        //setName(Name);

        System.out.print("Enter Password: ");
        psw = sc.nextLine();
        // setName(psw);
    
        System.out.print("Enter your Registration Number: ");
        regNum = sc.nextLine();
        // setName(regNum);
    
        System.out.print("Enter your University Name: ");
        uniName = sc.nextLine();
        // setName(uniName);
    
        System.out.print("Enter your Faculty name: ");
        FacName = sc.nextLine();
        // setName(FacName);

//        String arr[]={Name,psw,regNum,uniName,FacName};
//        for (int i = 0; i < 5; i++){
//            if (arr[i]!=" "){
//                System.out.println("Successfully Sign Up");
//            }
//            else {
//                System.out.println("Unsuccessfully Sign Up");
//                break;
//            }
//        }
    }
}
