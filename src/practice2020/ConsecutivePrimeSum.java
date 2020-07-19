package practice2020;

import java.util.Scanner;

public class ConsecutivePrimeSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=20;
        boolean prime[] = new boolean[n+1];
          sieveOfEratosthenes(n,prime);




    }
   static void sieveOfEratosthenes(int n,boolean[]prime)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.

        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p])
            {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        int count=0;

        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i]) {

                System.out.print(i + " ");
            }
        }
    }
}
