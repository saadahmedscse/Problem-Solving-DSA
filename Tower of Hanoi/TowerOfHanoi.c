#include <stdio.h>

void towerOfHanoi(int n, char a, char b, char c);

int main(){
    int n=2;
    towerOfHanoi(n, 'A', 'B', 'C');
    return 0;
}

void towerOfHanoi(int n, char a, char b, char c){
    if (n == 1){
        printf("Transfered disk %d from %c to %c\n", n, a, c);
        return;
    }

    towerOfHanoi(n-1, a, c, b);
    printf("Transfered disk %d from %c to %c\n", n, a, c);
    towerOfHanoi(n-1, b, a, c);
}