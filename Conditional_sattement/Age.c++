#include <iostream>
using namespace std;

int main() {
    int age;
    cout << "Enter age: ";
    cin >> age;

    if (age >= 18) {
        cout << "You are already available for a voter card" << endl;
    } else {
        cout << "You are below the required age to apply for a voter card" << endl;
    }

    return 0;
}