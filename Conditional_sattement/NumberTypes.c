#include<stdio.h>

void numberCalculate(int n) {
    if(n > 0)
        printf("Number is Positive\n");
    else if(n < 0)
        printf("Number is Negative\n");
    else
        printf("Number is Equal\n");
}

int main() {
    int a;
    printf("Enter value: ");
    scanf("%d", &a);
    numberCalculate(a);
    return 0;
}
