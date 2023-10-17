import java.util.*;
public class Question08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x-coordinate ");
        int x = sc.nextInt();
        System.out.println("Enter y-coordinate");
        int y = sc.nextInt();
        if(x==0 && y==0){
            System.out.println("The coordinate is at origin");
        }
        else if(x>0 & y>0){
            System.out.println("This coordinate is at 1st quadrant ");
        }
        else if(x<0 && y>0){
            System.out.println("This coordinate is at 2nd quadrant ");
        }
        else if(x<0 && y<0){
            System.out.println("This coordinate is at 3rd quadrant ");
        }
        else if(x>0 && y<0){
            System.out.println("This coordinate is at 4th quadrant ");
        }
        else if (x==0 && y<0){
            System.out.println("This coordinate is lies on -ve y axis ");
        }
        else if(x==0 && y>0){
          System.out.println("This coordinate is lies on +ve y axis ");
        }
        else if(x<0 && y==0){
            System.out.println("This coordinate is lies on -ve x axis ");
        }
        else if (x>0 && y==0){
            System.out.println("This coordinate is lies on +ve x axis ");
        }
        else {
            System.out.println();
        }
    }
}
