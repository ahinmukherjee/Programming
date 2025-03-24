#include <stdio.h>

int main() {
    int price;
    float r = 0, price1 = 0;

    printf("Enter price: ");
    scanf("%d", &price);

    if (price >= 1500) {
        r = price * (20.0 / 100);
        price1 = price - r;
        printf("Original Price: %d\n", price);
        printf("Discounted Price: %.2f\n", price1);
    } else if (price >= 1000) {
        r = price * (15.0 / 100);
        price1 = price - r;
        printf("Original Price: %d\n", price);
        printf("Discounted Price: %.2f\n", price1);
    } else if (price >= 500) {
        r = price * (5.0 / 100);
        price1 = price - r;
        printf("Original Price: %d\n", price);
        printf("Discounted Price: %.2f\n", price1);
    } else {
        printf("Not available for discount offer\n");
    }

    return 0;
}