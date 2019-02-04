#include <iostream>
using namespace std;

// counting sort for positive integers 
void CountingSort(int *A, int n){

    // Find max
    int max = 0;
    for (int *p=A; p<(A+n); p++){
        if (*p > max) max = *p;
    }

    // set an array of size max with 0's
    int *counter = new int[max+1]();

    // fill the counter array
    for (int *p=A; p<(A+n); p++){
        counter[(*p)]++; 
    }

    // retreve sorted list
    int i = 0;
    int *pA = A;
    while (i < max){
        if (counter[i]){    // counter > 0
            counter[i]--;
            *pA++ = i;
        }else{              // counter == 0
            i++;
        } 
    }

}

bool EqualIntArray(int* A, int* B, int n){
    for (int i = 0; i < n; i++) 
        if (A[i] != B[i]) return false;
    return true;
}

bool test_CountingSort(){
    int A[5] = {2,5,7,3,8};
    int B[5] = {2,3,5,7,8};
    CountingSort(A, 5);
    return ( EqualIntArray(A,B,5) );
}

int main(){

    cout << test_CountingSort() << endl;

    return 0;
}

