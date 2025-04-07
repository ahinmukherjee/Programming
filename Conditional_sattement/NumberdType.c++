#include <iostream>
using namespace std;

class Number {
public:
    void numberCalculate(int n) {
        if(n > 0)
            cout << "Number is Positive" << endl;
        else if(n < 0)
            cout << "Number is Negative" << endl;
        else
            cout << "Number is Equal" << endl;
    }
};

int main() {
    int a;
    cout << "Enter value: ";
    cin >> a;
    Number nb;
    nb.numberCalculate(a);
    return 0;
}
