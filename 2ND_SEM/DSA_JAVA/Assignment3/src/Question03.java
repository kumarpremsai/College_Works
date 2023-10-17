// import java.util.*;
// class Student{
//     String name ; 
//     int marks;
//     String Name(){
//         Scanner in = new Scanner (System.in);
//         System.out.println("Enter the name the student : ");
//         return name = in.next();
//     }
//     int marks(){
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter the mark of "+name+" : ");
//         return marks = in.nextInt();
//     }
// }
// class MarksOutOfBoundException extends Exception{
//     public MarksOutOfBoundException(String s){
//         super(s);
//     }
// }
// public class Question03{
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.Name();
//         s1.marks();
//         try{
//              if(s1.marks>100){
//                 throw new MarksOutOfBoundException("Marks greater than 100");
//             }
//             else{
//                 System.out.println("The mark of "+s1.name+" is "+s1.marks);
//             }
//         } catch(MarksOutOfBoundException s){
//             System.out.println(s);
//         }
//     }
// }

import java.util.*;
class Student{
    String name ;
    int mark;
    public Student(String n,int m){
        name = n;
        mark = m;
    }
}
class MarksOutOfBoundException extends Exception{
    public MarksOutOfBoundException(String s){
        super(s);
    }
}
public class Question03{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the name of the Student & Mark");
        Student s1 = new Student(in.next(),in.nextInt());
        try{
            if(s1.mark>100){
                throw new MarksOutOfBoundException("Marks greater than 100");
            }
            else{
                System.out.println("Mark of "+s1.name+" is "+s1.mark);
            }
        }
        catch(MarksOutOfBoundException s){
            System.out.println(s);
        }
    }
}