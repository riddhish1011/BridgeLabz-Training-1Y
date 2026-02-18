import java.util.*;
class sum_array{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int[] arr = new int[5];
int sum = 0;
/*for( int i = 0; i< arr.length; i++){
System.out.println("enter the 1st no.:");
int n1 = sc.nextInt();
System.out.println("enter the 2nd no.:");
int n2 = sc.nextInt();
System.out.println("enter the 3rd no.:");
int n3 = sc.nextInt();
System.out.println("enter the 4th no.:");
int n4 = sc.nextInt();
System.out.println("enter the 5th no.:");
int n5 = sc.nextInt();*/
for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
}        
System.out.println("sum of array:" + sum);
}
}