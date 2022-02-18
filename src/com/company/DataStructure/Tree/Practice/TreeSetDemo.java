package DataStructure.Tree.Practice;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("dahei",80,80,80);
        Student s2 = new Student("erhei", 90, 90, 90);
        Student s3 = new Student("xiaohei", 100, 100, 100);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);


        for (Student t : ts) {
            System.out.println(t);
        }

    }
}
