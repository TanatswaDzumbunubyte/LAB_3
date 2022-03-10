import java.util.Random;

public class bigandsmallnumbers

      {  public static void main(String[] args){

          int collectionSize=10,i=1;
          int number,min=101, max=100;

          System.out.println("The program draws "+ collectionSize + "integer numbers 1 to 100");
          System.out.println("and finds the smallest and greatest of them");

          Random t = new Random();
          System.out.println("DRAWN: ");

          while (i<=collectionSize){
              number = Math.round((t.nextInt(100)+1));
              System.out.print(number+ ", ");

              if(number<min) min=number;
              if(number>max) max=number;

              i++;
          }
          System.out.println();
          System.out.println();
          System.out.println("The biggest number in the collection is: "+max);
          System.out.println("The smallest number in the set is " +min);
      }


}
