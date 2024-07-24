//Remove Duplicates from String without usign Set

let str = 'management';

let strArr = [...str];
//console.log(Array.from(new Set(strArr)).join(''));

let freqMap = {};
let result = '';
for(let i=0; i<strArr.length; i++){
    if(freqMap[strArr[i]]){
        freqMap[strArr[i]] += 1;
    }else{
        freqMap[strArr[i]] = 1;
    }
}

console.log(freqMap);
console.log(Object.keys(freqMap).join(''));

//another approach  to access keys
// for(let ch in freqMap){
//   // console.log(ch);
//     if(freqMap[ch] >= 1){
//         result += ch;
//     }
// }

//console.log(result);