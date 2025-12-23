package OperatorsAssesment;

public class Ques9 {

    public static void main(String[] args) {

        int unit = 200;
        boolean user = true;

        int comr = 8;
        int nrml = 5;
        int tax = 30;
        boolean bill = (unit > 300 || user) ? true : false;
        int rate = bill ? comr : nrml;
        int total = unit * rate;
        total += tax;
        System.out.println(total);
    }
}
