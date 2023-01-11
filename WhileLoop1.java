package javahomework3;

public class WhileLoop1 {
    public static void main(String[] args) {
        int i=1;
        int j=1;

        System.out.println("Even numbers");
        while (i<=20){
          if(i%2 == 0){
              System.out.println(i);
          }
            i++;
        }

        System.out.println("Odd numbers");
        while (j<=20){
            if (j%2 != 0) {
                System.out.println(j);
            }
            j++;
        }


    }
}
