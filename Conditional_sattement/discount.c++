#include <iostream>
using namespace std;

int main() {
    int price;
    float r = 0, price1 = 0;

    cout << "Enter price: ";
    cin >> price;

    if (price >= 1500) {
        r = price * (20.0 / 100);
        price1 = price - r;
        cout << "Original Price: " << price << endl;
        cout << "Discounted Price: " << price1 << endl;
    } else if (price >= 1000) {
        r = price * (15.0 / 100);
        price1 = price - r;
        cout << "Original Price: " << price << endl;
        cout << "Discounted Price: " << price1 << endl;
    } else if (price >= 500) {
        r = price * (5.0 / 100);
        price1 = price - r;
        cout << "Original Price: " << price << endl;
        cout << "Discounted Price: " << price1 << endl;
    } else {
        cout << "Not available for discount offer" << endl;
    }

    return 0;
}