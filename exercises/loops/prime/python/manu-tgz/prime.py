import math
from collections import deque


def is_prime(n):
    # If a number is even it is not prime
    if n < 2 or n % 2 == 0: return False

    # A number is prime when it is not divisible by any prime number between 2
    # and the square root of the number itself.
    # Example 10, sqr(10)=3, 5 is the next prime number, but 5*5=25>10,
    # so if 5 or another major prime divides 10 it must be multiplied by a minor prime of 3,
    # in this case 2.

    for i in range(3, int(math.sqrt(n)), 2):
        if n % i == 0: return False
    return True


def closest_prime(n):
    count = 1
    while True:
        if is_prime(n - count): return n - count
        if is_prime(n + count): return n + count
        count += 1


def nth_prime(n):
    primes = deque()
    primes.append(2)
    count = 3
    while len(primes) < n:
        for x in primes:
            if x > int(math.sqrt(count)):
                primes.append(count)
                break
            if count % x == 0: break
        else:
            primes.append(count)
        count += 2
    return primes[n - 1]


def prime_factorization(n):
    result = deque()
    if is_prime(n):
        print(n)
        return
    while n % 2 == 0:
        result.append(2)
        n /= 2
    for i in range(3, int(n/2), 2):
        if n % i == 0 and is_prime(i):
            while n % i == 0:
                result.append(i)
                n /= i
        if n == 1: break
    return result