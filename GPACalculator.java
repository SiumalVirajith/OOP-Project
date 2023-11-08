import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import calculator.*;

public class GPACalculator {
    public static void main(String[] args) {

        int Log_sign;
        String regNum, psw, enter_res;
        char again;
        
        Scanner sc = new Scanner(System.in);

        Sign sign_up = new Sign();
        EnterSub entres = new EnterSub(" "," ",0," "," ",0," "," ",0," "," ",0," "," ",0," "," ",0," "," ",0," ");

        //create a list from class Data & asign values for a one account named as acc1
        List<Data> accounList = new ArrayList<>();
        Data acc1 = new Data("Roneth Hemsara", "University Of Jaffna", "Faculty of technologycal studies", "2020ICTS126", "Abc@123");
        accounList.add(acc1);

        //create a list from EnterSub calss & assing sample values maned ass acc1Sub1
        List<EnterSub> subjecList = new ArrayList<>();
        EnterSub acc1Sub1 = new EnterSub("2020ICTS126","1111",1,"A","1142",2,"A","1113",3,"A","1144",4,"A","1122",2,"A","1123",3,"A","1134",4,"A");
        subjecList.add(acc1Sub1);

        //Header
        System.out.println("* * * * * * * * * * * * * * * * * * * *");
        System.out.println("---------------------------------------");
        System.out.println(".....WELCOME PROFESSIONAL GPA CAL......");
        System.out.println("---------------------------------------");

        do {

            System.out.println("1-If you hava an account press number 1 to Logging. ");
            System.out.println("2-If you havan't an account press number 2 to sign up. ");
            Log_sign = sc.nextInt();
            System.out.println("---------------------------------------");

            switch (Log_sign) {
                case 1:
                    System.out.print("Enter your Registration Number? ");
                    regNum = sc.next();
                    for (Data account : accounList) {
                        if (account.getRegNum().equals(regNum)) {
                            System.out.print("Enter Password: ");
                            psw = sc.next();
                            System.out.println("---------------------------------------");
                            if (account.getPsw().equals(psw)) {
                                System.out.println("* Logging Succesfull *");
                                System.out.println("--Student Dtails-- ");
                                System.out.println("Name: " + account.getName());
                                System.out.println("Reistration Number: " + account.getRegNum());
                                System.out.println("Faculty: " + account.getFacName());
                                System.out.println("University: " + account.getUniName());
                            }
                        }
                    }

                    for (EnterSub subres : subjecList) {
                        if (subres.getRegNum().equals(regNum)) {

                            System.out.println("......................................");
//                            if(sem==3){sem=1;}
//                            System.out.println(year+" Year "+sem+" Semester Results: ");
//                            year+=1;
//                            sem+=1;
                            System.out.println(subres.sub1 + " : " + subres.res1);
                            System.out.println(subres.sub2 + " : " + subres.res2);
                            System.out.println(subres.sub3 + " : " + subres.res3);
                            System.out.println(subres.sub4 + " : " + subres.res4);
                            System.out.println(subres.sub5 + " : " + subres.res5);
                            System.out.println(subres.sub6 + " : " + subres.res6);
                            System.out.println(subres.sub7 + " : " + subres.res7);

                            String marks[] = {subres.res1, subres.res2, subres.res3, subres.res4, subres.res5, subres.res6, subres.res7,};
                            int crd[] = {subres.crd1,subres.crd2,subres.crd3,subres.crd4,subres.crd5,subres.crd6,subres.crd7,};
                            double gradePoint, credit, totGradePoint = 0, fGpa = 0,totCredit=0;
                            int len = marks.length;
                            for (int i = 0; i < len; i++) {
                                String m = marks[i];
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
                    System.out.println("Do you want to enter more results(YES/NO): ");
                    enter_res = sc.next();

                    if (enter_res.equals("YES") || enter_res.equals("yes")) {
                        entres.getSubCode();
                        subjecList.add(new EnterSub(entres.regNum,entres.sub1,entres.crd1,entres.res1,entres.sub2,entres.crd2,entres.res2,entres.sub3,entres.crd3,entres.res3,entres.sub4,entres.crd4,entres.res4,entres.sub5,entres.crd5,entres.res5,entres.sub6,entres.crd6,entres.res6,entres.sub7,entres.crd7,entres.res7));

                    }
                    break;

                case 2:
                    sign_up.signDetails();
                    accounList.add(new Data(sign_up.getName(), sign_up.getUniName(), sign_up.getFacName(), sign_up.getRegNum(), sign_up.getPsw()));

                    System.out.println("Do you want to enter more results(YES/NO): ");
                    enter_res = sc.next();

                    if (enter_res.equals("YES") || enter_res.equals("yes")) {
                        entres.getSubCode();
                        subjecList.add(new EnterSub(entres.regNum,entres.sub1,entres.crd1,entres.res1,entres.sub2,entres.crd2,entres.res2,entres.sub3,entres.crd3,entres.res3,entres.sub4,entres.crd4,entres.res4,entres.sub5,entres.crd5,entres.res5,entres.sub6,entres.crd6,entres.res6,entres.sub7,entres.crd7,entres.res7));

                    }
                    break;

                default:
                    break;
            }
            System.out.print("Do you want to logging again: (Y/N): ");
            again = sc.next().charAt(0);
        } while (again == 'Y' || again == 'y');
    }
}





        





    

