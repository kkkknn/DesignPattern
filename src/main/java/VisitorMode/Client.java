package VisitorMode;

public class Client {
    public static void main(String[] args) {
        BusinessReport businessReport=new BusinessReport();
        System.out.println("=========CEO报表===============");
        businessReport.showReport(new CEOVisitor());
        System.out.println("=========CTO报表===============");
        businessReport.showReport(new CTOVisitor());
    }
}
