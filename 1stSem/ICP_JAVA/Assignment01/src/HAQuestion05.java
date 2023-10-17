public class HAQuestion05{
    public static void main(String[] args) {
    System.out.println("\t"+"\t"+"\t"+"With using third variable ");
        System.out.println("Before swapping values..........");
        int A = 56;
        int K = 20;
        int G = 21;
        int W = 67;
        System.out.println("The value of A is "+A);
        System.out.println("The value of K is "+K);
        System.out.println("The value of G is "+G);
        System.out.println("The value of W is "+W);
        int Z ;
        Z=A;A=K;K=G;G=W;W=Z;
        System.out.println();
        System.out.println("After Swapping values...........");
        System.out.println("The value of A is "+A);
        System.out.println("The value of K is "+K);
        System.out.println("The value of G is "+G);
        System.out.println("The value of W is "+W);



    }
}