import java.util.*;
public class HAQuestion01 {
    public static void main(String[] args) {
        for(;;){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number\n 0 for 'Rock'\n1 for 'Paper'\n2 for 'Scissor' ");
        int a = sc.nextInt();
        if(a<3){
        if(a==1){
            System.out.println("You choose 'Paper' ");
        }
        else if (a==2){
            System.out.println("You choose 'Scissor' ");
        }
        else{
            System.out.println("You choose 'Rock' ");
        }
    int c = (int)(Math.random()*3)+0;
    if (c==1){
        System.out.println("Computer choice is 'Paper' ");
    }
    else if(c==2){
        System.out.println("Computer choice is 'Scissor' ");
    }
    else{
        System.out.println("Computer choice is 'Rock' ");
    }
    if(a==c){
        System.out.println("This match is draw ");
    }
    else if (a==0 && c==2 || a==1 && c==0 || a==2 && c==1) {
        System.out.println("Congratulation !! You won :) ");
    }
    else {
        System.out.println("Computer wins \nTry again ");
    }
    }
    else{
        System.out.println("You enterd out range number ");
    }
  }
}
}