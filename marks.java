import java.util.Scanner;
public class marks {
    static Scanner Sc= new Scanner(System.in);
static int N;
static int total=0;
static double average=0;
 static int arr[];
    
   public static void main(String[] args) {
    System.out.println("Enter the number of subject:");
       N= Sc.nextInt();
       arr=new int[N];
       for (int i = 0; i < arr.length; i++){
        System.out.println("Enter the number at :"+(i+1));
    arr[i]=Sc.nextInt();
        total=total+arr[i];
       }
       average=(total)/N;
       System.out.println("Your total marks are:"+ total);
       System.out.println("your average score is:"+ average); 
}
}
