//js function to check same word of string can be formed
//thing //night

function isPatternMatched(str1, str2){
    
    if(str1.length != str2.length){
        return false;
    }
    
    let str1Sorted = [...str1].sort();
    let str2Sorted = [...str2].sort();
    if(str1Sorted.join('') === str2Sorted.join('')){
        return true;
    }
    
    return false;
}

console.log(isPatternMatched('thing', 'night' ));