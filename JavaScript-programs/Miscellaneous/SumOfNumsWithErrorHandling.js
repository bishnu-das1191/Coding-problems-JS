function sum(input1, input2){
    
    if(typeof input1 === 'number' && typeof input2 === 'number'){
        return input1 + input2;
    }else{
        return new Error('Enter Valid Number');
    }
}

console.log(sum(10,10));