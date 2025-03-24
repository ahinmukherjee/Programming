#include <iostream>
using namespace std;

int main() {
    int num;
    
    cout << "Enter number: ";
    cin >> num;

    if (num % 2 == 0) {
        cout << "Input number is even: " << num << endl;
    } else {
        cout << "Input number is odd: " << num << endl;
    }

    return 0;
}
