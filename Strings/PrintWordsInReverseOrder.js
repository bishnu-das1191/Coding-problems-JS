
//print words from last
let str = 'bishnu das jamshedpur jharkhand';
function printPersonDetails(str){
   
  let strArr = str.split(" ");
  let i = 0;
  let j = strArr.length-1;
   
  while(i<j){
      const temp = strArr[i];
      strArr[i] = strArr[j];
      strArr[j] = temp;
      i++;
      j--;
  }
   
  return strArr;
}

console.log(`Print Words from last: ${printPersonDetails(str).join(' ')}`);