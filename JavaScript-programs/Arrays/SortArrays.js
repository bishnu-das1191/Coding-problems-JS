//sort nums in asc
let nums = [20,3,4,5,1,3,9,7,1,8,5,3,7,7,5,6,1,2,2,4];

for(let i=0; i<nums.length; i++){
    for(let j=i+1; j<nums.length; j++){
        
        if(nums[i] > nums[j]){
            const temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
console.log(`Sorted Array: ${nums}`);