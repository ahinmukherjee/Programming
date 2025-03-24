#include <stdio.h>

int main() {
    int num;
    
    printf("Enter number: ");
    scanf("%d", &num);

    if (num % 2 == 0) {
        printf("Input number is even: %d\n", num);
    } else {
        printf("Input number is odd: %d\n", num);
    }

    return 0;
}
