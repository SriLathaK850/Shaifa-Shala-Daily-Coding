/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// Java program to Find the Largest and Smallest Word.
 
import java.io.*;
import java.util.*;
 
 
public class Main{
    // Method to split the string and find the largest and smallest word
    static void printLargestAndSmallestWord(String str){
        String[] arr=str.split(" ");
        int i=0;
        int maxlength,minlength;
        maxlength=Integer.MIN_VALUE;
        minlength=Integer.MAX_VALUE;
        String largest,smallest;
        largest = smallest = "";
        for(i=0;i<arr.length;i++){
            if(arr[i].length() < minlength){
                smallest=arr[i];
                minlength=arr[i].length();
            }
            if(arr[i].length() > maxlength) {
                largest=arr[i];
                maxlength=arr[i].length();
            }
        }
        System.out.println("The largest and smallest word is \"" + largest +
                                               "\" and \"" + smallest + "\"");
    }
    // Main function to read the string
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the text string");
        String str;
        str=sc.nextLine();
        printLargestAndSmallestWord(str);
    }
}