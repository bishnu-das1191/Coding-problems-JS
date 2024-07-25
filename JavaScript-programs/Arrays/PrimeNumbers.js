
//identify prime numbers and display
let nums = [20,3,4,5,1,3,9,7,1,8,5,3,7,7,5,6,1,2,2,4];

let primeNums = [];
for(let i=0; i<nums.length; i++){
    
   if(isPrimeNum(nums[i]) === true){
        primeNums.push(nums[i]);
   }
}

function isPrimeNum(num){
    
    let isPrime = true;
    if(num <= 1){
        return false;
    }
    
    for(let i=2; i<num/2; i++){
        if(num % i == 0){
            isPrime = false;
            break;
        }
    }
    
    return isPrime;
}

console.log(`Prime Numbers are: ${primeNums}`);


