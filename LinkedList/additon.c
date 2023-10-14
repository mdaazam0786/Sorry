#include <stdio.h>

int main() {
    int row, col;

    // Input the dimensions of the arrays
    printf("Enter the number of rows: ");
    scanf("%d", &row);
    printf("Enter the number of columns: ");
    scanf("%d", &col);

    // Declare the two 2D arrays
    int array1[row][col];
    int array2[row][col];
    int sum[row][col];

    // Input elements of the first array
    printf("Enter elements of the first array:\n");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            scanf("%d", &array1[i][j]);
        }
    }

    // Input elements of the second array
    printf("Enter elements of the second array:\n");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            scanf("%d", &array2[i][j]);
        }
    }

    // Perform addition
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            sum[i][j] = array1[i][j] + array2[i][j];
        }
    }

    // Display the result
    printf("Resultant array after addition:\n");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            printf("%d ", sum[i][j]);
        }
        printf("\n");
    }

    return 0;
}
 