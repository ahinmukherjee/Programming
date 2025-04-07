#include <iostream>
using namespace std;

void main() {
    int a;
    cout << "Enter value: ";
    cin >> a;

    if (a > 0)
        cout << "Number is Positive" << endl;
    else if (a < 0)
        cout << "Number is Negative" << endl;
    else
        cout << "Number is Equal" << endl;
}