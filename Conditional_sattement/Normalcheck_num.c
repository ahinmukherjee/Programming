#include <stdio.h>

void main() {
    int a;
    printf("Enter value: ");
    scanf("%d", &a);

    if (a > 0)
        printf("Number is Positive\n");
    else if (a < 0)
        printf("Number is Negative\n");
    else
        printf("Number is Equal\n");
}



