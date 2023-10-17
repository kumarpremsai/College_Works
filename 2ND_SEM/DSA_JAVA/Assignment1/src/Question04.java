import java.util.*;
public class Question04{
    public static void main(String[] args) {
        char [] a = {'c','a','r','b','o','n'};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                for(int k=0;k<a.length;k++){
                    if(i!=j && i!=k && j!=k && j!=i && k!=i && k!=j){
                        System.out.println(a[i]+""+a[j]+""+a[k]);
                    }
                }
            }
        }
    }
}
