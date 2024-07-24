
//identify odd and even nums an display

let nums = [20,3,4,5,1,3,9,7,1,8,5,3,7,7,5,6,1,2,2,4];

let oddNums = [];
let evenNums = [];
for(let i=0; i<nums.length; i++){
    if(nums[i] % 2 == 0){
        evenNums.push(nums[i]);
    }else{
        oddNums.push(nums[i]);
    }
}
console.log(`Odd Nums: ${oddNums}`);
console.log(`Even Nums: ${evenNums}`);
