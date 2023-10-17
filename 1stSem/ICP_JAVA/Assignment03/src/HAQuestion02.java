import java.util.*;
public class HAQuestion02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int toDay,skipDay,futureDay;
        System.out.println("Enter current day number : ");
        int [] day = new int[toDay = sc.nextInt(7)];
        System.out.println("Enter day you want to skip ");
         skipDay = sc.nextInt();
    if(toDay==0){
        System.out.println("Today is Sunday ");
    }
    else if (toDay==1){
        System.out.println("Today is Monday");
    }
    else if(toDay==2){
        System.out.println("Today is Tuesday ");
    }
    else if(toDay==3){  
        System.out.println("Today is Wednesday ");
    }
    else if(toDay==4){
        System.out.println("Today is Thursday ");
    }
    else if(toDay==5){
        System.out.println("Today is Friday");
    }
    else if(toDay==6){
        System.out.println("Today is Saturday ");
    }
    futureDay=toDay+skipDay;
    if(futureDay%7==0){ //futureDay==7
        System.out.println("Future day is Sunday ");
    }
    else if (futureDay%7==1){   // futureDay==8
        System.out.println("Future day is Monday");
    }
    else if(futureDay%7==2){ //futureDay==9
        System.out.println("Future day is Tuesday ");
    }
    else if(futureDay%7==3){   // futureDay==10
        System.out.println("Future day is Wednesday");
    }
    else if(futureDay%7==4){   //futureDay==11
        System.out.println("Future day is Thursday ");
    }
    else if(futureDay%7==5){   //futureDay==12
        System.out.println("Future day is Friday");
    }
    else if(futureDay%7==6){   //futureDay==13
        System.out.println("Future day is Saturday ");
    }
    }
}