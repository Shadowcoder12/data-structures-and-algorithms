isPrime = (number) => {
    //     I: Number 
    //     O: All Prime Numbers
    //  =======================================================
    //    INTIAL THOUGHTS
    //  =======================================================
    //      1. init hash
    //      2. loop through given number from 2 to N
    //      3. set all values for N to be true
    //      4 loop through square of N and check if value is set to true , if so check multiples of N and set value to false
    //      5. final loop print all values == true 
    
         let hash = {};
         let result = [];
    
         // storing all given numbers in params to true 
         for(let i = 2; i<=number; i++) {
             let prime = i;
             hash[prime] = true;
             console.log(hash);
         }
    
         // checking if divisor is marked prime , then go through multiples starting at 2 * divisor and mark multiples as false 
         for(let divisor = 2; (divisor * divisor)<= number; divisor++){
             if(hash[divisor]) {
                 for(let i = divisor * 2; i<= number; i = i + divisor) {
                     hash[i] = false;
                 }
             }
         }
        // go through hash and print all numbers that are prime
         for(let i = 2; i<=number; i++) {
             if(hash[i]== true) {
                 result.push(i);
                 console.log(`${i} is a prime nunber`);
             }
         }
         return result;
     }
    
     isPrime(10);

     // MEMORY EFFICIENT SOLUTION
    
     sieveOfEratosthenes = (number) => {
         let i;
         // init new array called prime with length = number variable and setting all values in array to true
         let prime = Array(number + 1).fill(true);
    
         // 0 and 1 are not prime , setting to false
         prime[0] = prime[1] = false;
         
         // marking multiples starting from 2 divisor as false
         for(let divisor = 2;divisor * divisor<= number; divisor++){
                if(prime[divisor]) {
                    for(i = 2 * divisor; i<=number; i = i + divisor) {
                        prime[i] = false;
                    }
                }
         }
         // print primes to the console. 
         for(i = 2; i<=number;i++) {
             if(prime[i]) {
                 console.log(`${i} is a prime number`);
             }
         }
     }


         