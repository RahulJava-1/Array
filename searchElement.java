import java.util.*;
class searchElement{
 public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
   System.out.print("Enter the number of Rows: ");
   int rows = sc.nextInt();
   System.out.print("Enter the number of Columns: ");
   int cols = sc.nextInt();
   //Declaration of 2D array
   int[][] numbers = new int[rows][cols];
  //input rows
   System.out.println("Enter the elements of rows: ");
    for(int i=0;i<rows;i++){
    //columns
    System.out.println("Enter the elemets of columns: ");
    for(int j=0;j<cols;j++){
    numbers[i][j]=sc.nextInt();
  }
  }
   System.out.print("Enter the number which you're to find: ");
     int x = sc.nextInt(); 
   //for searching  
  for(int i=0;i<rows;i++){
  for(int j=0;j<cols;j++){
    if(numbers[i][j] == x){
     System.out.println("x found at location ("+ i +", "+ j +")"); 
    }
    }
    }
 }
}
