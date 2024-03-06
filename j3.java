//You go trick or treating with a friend and all but three of the houses that you visit are giving out candy. One house that you visit is giving out toothbrushes and two houses are giving out dollar bills. 

//Task
//Given the input of the total number of houses that you visited, what is the percentage chance that one random item pulled from your bag is a dollar bill? 

//Input Format 
//An integer (>=3) representing the total number of houses that you visited. 

//Output Format
//A percentage value rounded up to the nearest whole number.

import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int houses = input.nextInt();
         if(200%houses==0){
          System.out.print(200/houses);
        }
        else {System.out.print(200/
        houses+1);}
    }
}
