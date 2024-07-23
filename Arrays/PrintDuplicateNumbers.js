
//identify duplicate nums and display
let nums = [20,3,4,5,1,3,9,7,1,8,5,3,7,7,5,6,1,2,2,4];

let freqMap = {};
for(let i=0; i<nums.length; i++){
    if(freqMap[nums[i]]){
        freqMap[nums[i]] += 1;
    }else{
        freqMap[nums[i]] = 1;
    }
}

let duplicateElement = [];
for(let key in freqMap){
    if(freqMap[key]>1){
        duplicateElement.push(key);
    }
}
console.log(`Duplicate Elements: ${duplicateElement}`);