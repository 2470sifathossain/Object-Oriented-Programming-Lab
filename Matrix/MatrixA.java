package Matrix;

import java.util.Scanner;

public class MatrixA {
    public static void main(String[] args) {
        int numOfRow, numOfColumn, sum=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        numOfRow = scanner.nextInt();
        System.out.println("Enter the number of column");
        numOfColumn = scanner.nextInt();

        if (numOfColumn!=numOfRow)
            System.out.println("number of row and number of column must be equal.");
        else if (numOfRow<2)
            System.out.println("enter a number which is bigger than 1");
        else {
            System.out.println("Enter the value of the " + numOfRow + " X " + numOfColumn + " matrix : ");
            int matrix[][] = new int[numOfRow][numOfColumn];
            int squreMatrix[][] = new int[numOfRow][numOfColumn];
            int cubeMatrix[][] = new int[numOfRow][numOfColumn];
            int identityMatix[][] = new int[numOfRow][numOfColumn];
            int secondPositionMatrix[][] = new int[numOfRow][numOfColumn];
            int thirdPositionMatrix[][] = new int[numOfRow][numOfColumn];
            int fourthPositionMatrix[][] = new int[numOfRow][numOfColumn];
            int resultMatrix[][] = new int[numOfRow][numOfColumn];

            for(int i=0; i<numOfRow; i++){
                for (int j=0; j<numOfColumn; j++){
                    matrix[i][j] = scanner.nextInt();
                }
            }

            System.out.println("the matrix is : ");
            for(int i=0; i<numOfRow; i++){
                for (int j=0; j<numOfColumn; j++){
                    System.out.print(matrix[i][j] + "\t\t\t");
                }
                System.out.println();
            }

            // square of the matrix
            for(int i=0; i<numOfRow; i++){
                for (int j=0; j<numOfColumn; j++){
                    for(int k=0; k<numOfRow; k++){
                        sum += matrix[i][k] * matrix[k][j];
                    }
                    squreMatrix[i][j] = sum;
                    sum=0;
                }
            }

            // cube of the matrix
            for(int i=0; i<numOfRow; i++){
                for (int j=0; j<numOfColumn; j++){
                    for(int k=0; k<numOfRow; k++){
                        sum += squreMatrix[i][k] * matrix[k][j];
                    }
                    cubeMatrix[i][j] = sum;
                    sum=0;
                }
            }

            // identity matrix
            for (int i=0; i<numOfRow; i++){
                for (int j=0; j<numOfColumn; j++){
                    if (i==j)
                        identityMatix[i][j] = 1;
                    else
                        identityMatix[i][j] = 0;
                }
            }

            // multiply 4 with the square of A matrix
            for(int i=0; i<numOfRow; i++){
                for (int j=0; j<numOfColumn; j++){
                    // multiply square matrix by 4
                    secondPositionMatrix[i][j] = squreMatrix[i][j]*4;

                    // multiply matrix by 12
                    thirdPositionMatrix[i][j] = matrix[i][j]*12;

                    // multiply identity matrix by 31
                    fourthPositionMatrix[i][j] = identityMatix[i][j]*31;

                    // calculation the equation
                    resultMatrix[i][j] = cubeMatrix[i][j] + secondPositionMatrix[i][j] - thirdPositionMatrix[i][j] + fourthPositionMatrix[i][j];
                }
            }

            System.out.println("\nresult matrix");
            for(int i=0; i<numOfRow; i++){
                for (int j=0; j<numOfColumn; j++){
                    System.out.print(resultMatrix[i][j] + "\t\t\t");
                }
                System.out.println();
            }
        }
    }
}
