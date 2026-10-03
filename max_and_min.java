import java.util.Scanner;
public class maxandmin{
    static Scanner Sc= new Scanner(System.in);
static int N;
static int maximum=0;
static int minimum=0;
 static int arr[]; 
   public static void main(String[] args) {
    System.out.println("Enter the number :");
       N= Sc.nextInt();
       arr=new int[N];
       for (int i = 0; i < arr.length; i++){
        System.out.println("Enter the number at "+(i+1)+":");
arr[i]=Sc.nextInt();
    maximum = arr[0];
        minimum = arr[0];
        for (int j= 1;j < arr.length;j++) {
            if (arr[j ] > maximum){
                maximum = arr[j];
            }
            if (arr[j]< minimum) {
                minimum = arr[j];
            }
        }
  }    
  
  System.out.println("MAXIMUM:"+ maximum);
   System.out.println("MINIMUM:"+minimum);
}
}
