#include <iostream>
#include <vector>
using namespace std;

void bubbleSort(vector<int>& arr) {
    int n = arr.size();
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] > arr[j]) {
                swap(arr[i], arr[j]);
            }
        }
    }
    cout << "Sorted Array: ";
    for (int num : arr) {
        cout << num << " ";
    }
}

int main() {
    int n;
    cout << "How many numbers do you want? ";
    cin >> n;
    
    vector<int> arr(n);
    cout << "Enter numbers:" << endl;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    
    bubbleSort(arr);
    return 0;
}
