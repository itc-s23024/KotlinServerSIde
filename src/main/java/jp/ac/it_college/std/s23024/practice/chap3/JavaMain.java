package jp.ac.it_college.std.s23024.practice.chap3;

public class JavaMain {
    public static void main(String[] args) {
        HelloByKotlin helloByKotlin = new HelloByKotlin();
        helloByKotlin.printHello();

        System.out.println("----3.4.7----");
        System.out.println(CompanyConstants.Companion.getMaxEmployeesCount());

        System.out.println("----3.4.8----");
        System.out.println(CompanyConstants.getMinEmployeeCount());
    }
}
