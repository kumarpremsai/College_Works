public class Question08 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println("Value of 'x' before swapping "+x);
        System.out.println("Value of 'y' before swapping "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println();
        System.out.println("Value of 'x' after swapping "+x);
        System.out.println("Value of 'y' after swapping "+y);
    }
}
