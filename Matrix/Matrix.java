
package Matrix;

import java.util.Scanner;

public class Matrix{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimension of matrix a:");
        int rowA = input.nextInt();
        int colA = input.nextInt();
        
        System.out.println("Enter the dimension of matrix b:");
        int rowB = input.nextInt();
        int colB = input.nextInt();
        
        int a[][] = new int[rowA][colA];
        System.out.println("Enter the elements of matrix a:");
        for (int i = 0; i < rowA; i++) {
            for(int j = 0; j < colA; j++)
                a[i][j] = input.nextInt();
        }
        int b[][] = new int[rowB][colB];
        System.out.println("Enter the elements of matrix b:");
        for (int i = 0; i < rowB; i++) {
            for(int j = 0; j < colB; j++)
                b[i][j] = input.nextInt();
        }
        int c[][] = new int[rowA][colB];
        if(colA==rowB)
        {
             
             
             for(int i=0;i<rowA;i++){
                 for(int j=0;j<colB;j++){
                     int m = 0;
                     for(int k=0;k<colA;k++){
                         m+=a[i][k]*b[k][j];
                     }
                     c[i][j] = m;
                 }
             }
             
        }
        
        System.out.println("Matrix a:");
        for (int i = 0; i < rowA; i++){ 
            for(int j = 0; j < colA; j++)
                 System.out.print(a[i][j]+"  ");
            System.out.println("");
        }
        System.out.println("Matrix b:");
        for (int i = 0; i < rowB; i++){ 
            for(int j = 0; j < colB; j++)
                 System.out.print(b[i][j]+"  ");
            System.out.println("");
        }
        
        System.out.println("Result Matrix:");
        for (int i = 0; i < rowA; i++){ 
            for(int j = 0; j < colB; j++)
                 System.out.print(c[i][j]+"  ");
            System.out.println("");
        }
    }
    
}

