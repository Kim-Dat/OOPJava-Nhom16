import java.util.Scanner;

public class Arr2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int dong, cot;
          do{
               System.out.print("nhap so dong : ");
               dong = sc.nextInt();
               System.out.print("nhap so cot : ");
               cot = sc.nextInt();
          }while(dong <= 0 || cot <= 0);
          int a[][] = new int[dong][cot];
          //input array data
          for(int i = 0; i < dong; i++){
               for(int j = 0; j < cot; j++){
                    System.out.printf("A[%d][%d] =", i, j);
                    a[i][j] = sc.nextInt();
               }
          }
          //output array data
          for(int i = 0; i < dong; i++){
               for(int j = 0; j < cot; j++){
                    System.out.printf("%d\t", a[i][j]);
               }
               System.out.println("");
          }
          //handle_sort
          for(int k = 0; k < dong; k++){
               for(int i = 0; i < cot - 1; i++){
                    for(int j = i + 1; j < cot; j++){
                         if(a[k][i] > a[k][j]){
                              int tmp = a[k][i];
                              a[k][i] = a[k][j];
                              a[k][j] = tmp;
                         }
                    }
               }
          }
          //success_sort
          System.out.println("array da sap xep tang dan theo hang :");
          for(int i = 0; i < dong; i++){
               for(int j = 0; j < cot; j++){
                    System.out.printf("%d\t", a[i][j]);
               }
               System.out.println("");
          }

     }
}
