package javahomework3;

public class DoWhileLoop1 {
    public static void main(String[] args) {
        int i=1;
        int j=1;

        System.out.println("Even numbers");
        do{
            if (i%2 == 0){
                System.out.println(i);
            }
            i++;
        }while(i<=20);

        System.out.println("Odd numbers");
        do{
            if (j%2 != 0){
                System.out.println(j);
            }
            j++;
        }while(j<=20);
    }
}
