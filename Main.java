

import java.util.*;
class Main {
  public static void main(String[] args) {

    double rupee, dollar, euro, pound;
    System.out.println("\n______________________________Currency Convertor______________________________");

    System.out.println("\nFollowing are some currencies world wide:");
    System.out.println("\n1. Rupee");
    System.out.println("\n2. Dollar");
    System.out.println("\n3. Euro");
    System.out.println("\n4. Pound");
    System.out.println("\nChoose from above which you want to convert:\n");

    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();

    while(choice>4){
      System.out.println("Invalid Input! \nEnter your choice again:\n");
      choice = sc.nextInt();
    }
    
    if(choice==1){
      System.out.println("\nEnter the amount in Rupee:\n");
      rupee = sc.nextDouble();
      dollar = rupee / 82.68;
      System.out.println("\n"+rupee+" Rupee "+" = "+dollar+" Dollar");
      euro = rupee / 91.17;
      System.out.println("\n"+rupee+" Rupee "+" = "+euro+" Euro");
      pound = rupee / 105.41;
      System.out.println("\n"+rupee+" Rupee "+" = "+pound+" Pound");
    }

    if(choice==2){
      System.out.println("\nEnter the amount in Dollar:\n");
      dollar = sc.nextDouble();
      rupee = dollar * 82.68;
      System.out.println("\n"+dollar+" Dollar "+" = "+rupee+" Rupee");
      euro = dollar * 0.91;
      System.out.println("\n"+dollar+" Dollar "+" = "+euro+" Euro");
      pound = dollar * 0.78;
      System.out.println("\n"+dollar+" Dollar "+" = "+pound+" Pound");
    }

    if(choice==3){
      System.out.println("\nEnter the amount in Euro:\n");
      euro = sc.nextDouble();
      rupee = euro * 91.17;
      System.out.println("\n"+euro+" Euro "+" = "+rupee+" Rupee");
      dollar = euro / 0.91;
      System.out.println("\n"+euro+" Euro "+" = "+dollar+" Dollar");
      pound = euro / 1.16;
      System.out.println("\n"+euro+" Euro "+" = "+pound+" Pound");
    }

    if(choice==4){
      System.out.println("\nEnter the amount in Pound:\n");
      pound = sc.nextDouble();
      rupee = pound * 105.41;
      System.out.println("\n"+pound+" Pound "+" = "+rupee+" Rupee");
      dollar = pound / 0.78;
      System.out.println("\n"+pound+" Pound "+" = "+dollar+" Dollar");
      euro = pound * 1.16;
      System.out.println("\n"+pound+" Pound "+" = "+euro+" Euro");
    }
    sc.close();
  }
}