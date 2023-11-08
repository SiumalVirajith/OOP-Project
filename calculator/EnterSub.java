package calculator;
import java.util.Scanner;

public class EnterSub {

    Scanner sc = new Scanner(System.in);

    public String sub1,sub2,sub3,sub4,sub5,sub6,sub7;
    public String regNum,res1,res2,res3,res4,res5,res6,res7;
    public int crd1, crd2, crd3, crd4, crd5, crd6,crd7;
    
    public EnterSub(String regNum,String sub1,int crd1,String res1,String sub2,int crd2,String res2,String sub3,int crd3,String res3,String sub4,int crd4,String res4,String sub5,int crd5,String res5,String sub6,int crd6,String res6,String sub7,int crd7,String res7)
    {
        this.regNum=regNum;
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
        this.sub5=sub5;
        this.sub6=sub6;
        this.sub7=sub7;

        this.res1=res1;
        this.res2=res2;
        this.res3=res3;
        this.res4=res4;
        this.res5=res5;
        this.res6=res6;
        this.res7=res7;

        this.crd1=crd1;
        this.crd2=crd2;
        this.crd3=crd3;
        this.crd4=crd4;
        this.crd5=crd5;
        this.crd6=crd6;
        this.crd7=crd7;
    }
    
    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public void getSubCode()
    {
        System.out.print("Enter Registration Number: ");
        regNum = sc.nextLine();

        System.out.print("Enter Subject code: ");
        sub1 = sc.next();
        System.out.print("Enter Results: ");
        res1 = sc.next();
        System.out.print("Enter Credit Value: ");
        crd1 = sc.nextInt();

        System.out.print("Enter Subject code: ");
        sub2 = sc.next();
        System.out.print("Enter Results: ");
        res2 = sc.next();
        System.out.print("Enter Credit Value: ");
        crd2 = sc.nextInt();

        System.out.print("Enter Subject code: ");
        sub3 = sc.next();
        System.out.print("Enter Results: ");
        res3 = sc.next();
        System.out.print("Enter Credit Value: ");
        crd3 = sc.nextInt();

        System.out.print("Enter Subject code: ");
        sub4 = sc.next();
        System.out.print("Enter Results: ");
        res4 = sc.next();
        System.out.print("Enter Credit Value: ");
        crd4 = sc.nextInt();

        System.out.print("Enter Subject code: ");
        sub5= sc.next();
        System.out.print("Enter Results: ");
        res5 = sc.next();
        System.out.print("Enter Credit Value: ");
        crd5 = sc.nextInt();

        System.out.print("Enter Subject code: ");
        sub6= sc.next();
        System.out.print("Enter Results: ");
        res6 = sc.next();
        System.out.print("Enter Credit Value: ");
        crd6 = sc.nextInt();

        System.out.print("Enter Subject code: ");
        sub7= sc.next();
        System.out.print("Enter Results: ");
        res7 = sc.next();
        System.out.print("Enter Credit Value: ");
        crd7 = sc.nextInt();

        int crd[]={crd1,crd2,crd3,crd4,crd5,crd6,crd7};
        String res[]={res1,res2,res3,res4,res5,res6,res7};
        double gradePoint, credit, totGradePoint = 0, fGpa = 0,totCredit=0;
        int len = crd.length;
        for (int i = 0; i < len; i++) {
            String m = res[i];
            int s = crd[i];
            totCredit = totCredit+crd[i];
            if (m.equals("A+") || m.equals("a+") || m.equals("A") || m.equals("a")) {
                gradePoint = 4.0;
            } else if (m.equals("A-") || m.equals("a-")) {
                gradePoint = 3.7;
            } else if (m.equals("B+") || m.equals("b+")) {
                gradePoint = 3.3;
            } else if (m.equals("B") || m.equals("b")) {
                gradePoint = 3;
            } else if (m.equals("B-") || m.equals("b-")) {
                gradePoint = 2.7;
            } else if (m.equals("C+") || m.equals("c+")) {
                gradePoint = 2.3;
            } else if (m.equals("C") || m.equals("c")) {
                gradePoint = 2;
            } else if (m.equals("C-") || m.equals("c-")) {
                gradePoint = 1.7;
            } else if (m.equals("D+") || m.equals("d+")) {
                gradePoint = 1.3;
            } else if (m.equals("D") || m.equals("d")) {
                gradePoint = 1;
            } else if (m.equals("D-") || m.equals("d-")) {
                gradePoint = 0.7;
            } else {
                gradePoint = 0.0;
            }

            totGradePoint = totGradePoint + (s * gradePoint);
        }

        fGpa = totGradePoint / totCredit;
        System.out.println("This semester GPA: " + fGpa);
    }


}