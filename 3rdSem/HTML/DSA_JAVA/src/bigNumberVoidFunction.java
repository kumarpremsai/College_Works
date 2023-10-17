import java.util.*;
class bigNumberVoidFunction {
    private int a,b,c;
    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number : ");
        a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        b = sc.nextInt();
        System.out.print("enter 3rd number : ");
        c = sc.nextInt();
        System.out.println();
    }
    void display (){
        System.out.print("The bigger number between "+a+","+b+","+" & "+c+" is ");
    }
    void findBiggerNumber(){
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
    public static void main(String...args){
        for(;;){
        bigNumberVoidFunction obj = new bigNumberVoidFunction();
        obj.input();
        obj.display();
        obj.findBiggerNumber();
        }
    }
}
