import java.util.Scanner;
public class evenandodd{
    static Scanner Sc= new Scanner(System.in);
static int N;
static int even=0;
static int odd=0;
 static int arr[];
    
   public static void main(String[] args) {
    System.out.println("Enter the number :");
       N= Sc.nextInt();
       arr=new int[N];
       for (int i = 0; i < arr.length; i++){
        System.out.println("Enter the number at "+(i+1)+":");
    arr[i]=Sc.nextInt();
        if(arr[i]%2==0){
            even++;
        }
        else{
            odd++;
        }
       }
       System.out.println("Even:"+even);
       System.out.println("Odd:"+odd);
}
}
