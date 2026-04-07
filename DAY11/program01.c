#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int sum_of_digits(int n) {
    int sum = 0;
    while (n != 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}

int main() {
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    pid_t pidB, pidC;

    pidB = fork();

    if (pidB == 0) {
        
        printf("Process B (PID: %d): Sum of digits = %d\n",
               getpid(), sum_of_digits(num));
        exit(0);
    }

    
    pidC = fork();

    if (pidC == 0) {
        
        if (num % 2 == 0)
            printf("Process C (PID: %d): Number is EVEN\n", getpid());
        else
            printf("Process C (PID: %d): Number is ODD\n", getpid());

        
        pid_t pidD = fork();

        if (pidD == 0) {
            
            printf("Process D (PID: %d): Created by C\n", getpid());
            exit(0);
        } else {
            wait(NULL); 
        }

        exit(0);
    }

    
    wait(NULL);
    wait(NULL);

    printf("Process A (PID: %d): All child processes finished\n", getpid());

    return 0;
}