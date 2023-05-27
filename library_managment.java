package javaprojects;

import java.util.Scanner;

class Library{
    Scanner s =new Scanner(System.in);
    int borrow;
    int r;
    int[] available={1,2,3,4,5};
    int[]issued=new int[5];

    public void availablebooks(){
      for (int i=0; i<5; i++){
          System.out.println("availablebooks"+available[i]);
      }
    }
    public void borrowbook(){
        borrow= s.nextInt();
        available[borrow-1]=0;
        issued[borrow-1]=borrow;
    }
    public void reurnbook(){
        r= s.nextInt();
        available[r-1]=r;
        issued[r-1]=r;
    }
   public void issuedbooks(){
        for (int i=0; i<5; i++){
            System.out.print("issuedbooks"+issued[i]);
        }
    }
    Library(){
        System.out.println("to see issued books press 1,");
        System.out.println("for borrowing a book press 2,");
        System.out.println("to see available boook press 3,");
        System.out.println("to return a books press 4,");
        System.out.println("to exit library press 5");

    }
}
public class library_managment {
    public static void main(String[] args) {
        Library ali = new Library();
        Scanner sc = new Scanner(System.in);


    }
}
