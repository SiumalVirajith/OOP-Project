package calculator;

import java.util.Scanner;

public class EnterRes {

    Scanner sc =new Scanner(System.in);

    private char res1;
    private char res2;
    private char res3;
    private char res4;
    private char res5;
    private String regNum; 
    
    public EnterRes(String regNum, char res1, char res2, char res3, char res4, char res5)
    {
        this.regNum=regNum;
        this.res1=res1;
        this.res2=res2;
        this.res3=res3;
        this.res4=res4;
        this.res5=res5;
    }

    

    /**
     * @return char return the res1
     */
    public char getRes1() {
        return res1;
    }

    /**
     * @param res1 the res1 to set
     */
    public void setRes1(char res1) {
        this.res1 = res1;
    }

    /**
     * @return char return the res2
     */
    public char getRes2() {
        return res2;
    }

    /**
     * @param res2 the res2 to set
     */
    public void setRes2(char res2) {
        this.res2 = res2;
    }

    /**
     * @return char return the res3
     */
    public char getRes3() {
        return res3;
    }

    /**
     * @param res3 the res3 to set
     */
    public void setRes3(char res3) {
        this.res3 = res3;
    }

    /**
     * @return char return the res4
     */
    public char getRes4() {
        return res4;
    }

    /**
     * @param res4 the res4 to set
     */
    public void setRes4(char res4) {
        this.res4 = res4;
    }

    /**
     * @return char return the res5
     */
    public char getRes5() {
        return res5;
    }

    /**
     * @param res5 the res5 to set
     */
    public void setRes5(char res5) {
        this.res5 = res5;
    }

    /**
     * @return String return the regNum
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * @param regNum the regNum to set
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public void getRes()
    {
        System.out.print("Enter Regidtration Number: ");
        regNum = sc.nextLine();
        setRegNum(regNum);
        
        System.out.print("Enter Results: ");
        res1 = sc.next().charAt(0);
        setRes1(res1);

        System.out.print("Enter Results: ");
        res2 = sc.next().charAt(0);
        setRes2(res2);

        System.out.print("Enter Results: ");
        res3 = sc.next().charAt(0);
        setRes3(res3);

        System.out.print("Enter Results: ");
        res4 = sc.next().charAt(0);
        setRes4(res4);

        System.out.print("Enter Results: ");
        res5 = sc.next().charAt(0);
        setRes5(res5);
    }



    public void getSubCode() {
    }

}
