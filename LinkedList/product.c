#include <stdio.h>

int main() {
    int row1, col1, row2, col2;

    // Input the dimensions of the first array
    printf("Enter the number of rows for the first array: ");
    scanf("%d", &row1);
    printf("Enter the number of columns for the first array: ");
    scanf("%d", &col1);

    // Input the dimensions of the second array
    printf("Enter the number of rows for the second array: ");
    scanf("%d", &row2);
    printf("Enter the number of columns for the second array: ");
    scanf("%d", &col2);

    // Check if multiplication is possible
    if (col1 != row2) {
        printf("Matrix multiplication is not possible. Number of columns in the first matrix must be equal to the number of rows in the second matrix.\n");
        return 1;
    }

    // Declare the two 2D arrays
    int array1[row1][col1];
    int array2[row2][col2];
    int product[row1][col2];

    // Input elements of the first array
    printf("Enter elements of the first array:\n");
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col1; j++) {
            scanf("%d", &array1[i][j]);
        }
    }

    // Input elements of the second array
    printf("Enter elements of the second array:\n");
    for (int i = 0; i < row2; i++) {
        for (int j = 0; j < col2; j++) {
            scanf("%d", &array2[i][j]);
        }
    }

    // Perform multiplication
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col2; j++) {
            product[i][j] = 0;
            for (int k = 0; k < col1; k++) {
                product[i][j] += array1[i][k] * array2[k][j];
            }
        }
    }

    // Display the result
    printf("Resultant array after multiplication:\n");
    for (int i = 0; i < row1; i++) {
        for (int j = 0; j < col2; j++) {
            printf("%d ", product[i][j]);
        }
        printf("\n");
    }

    return 0;
}
