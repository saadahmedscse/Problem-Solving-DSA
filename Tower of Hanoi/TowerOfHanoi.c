#include <stdio.h>

/*
    Created by Saad Ahmed on 25 March, 2022
    Time Complexity of this program is "O(2^n)"
*/

void towerOfHanoi(int n, char a, char b, char c);

int main()
{
    int n = 2;
    towerOfHanoi(n, 'A', 'B', 'C');
    return 0;
}

void towerOfHanoi(int n, char a, char b, char c)
{
    if (n == 1)
    {
        printf("Transfered disk %d from %c to %c\n", n, a, c);
        return;
    }

    towerOfHanoi(n - 1, a, c, b);
    printf("Transfered disk %d from %c to %c\n", n, a, c);
    towerOfHanoi(n - 1, b, a, c);
}