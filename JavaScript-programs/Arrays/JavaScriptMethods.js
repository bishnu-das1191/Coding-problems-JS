const nums = [-8, -3, 1, 3, 7]; 

const filterOut = nums.filter(i => i>0);
console.log(filterOut); // o/p : [ 1, 3, 7 ]

let squ = nums.map(a => a*a); 
console.log(squ);  // o/p :  [ 64, 9, 1, 9, 49 ]

let res = squ.sort((a,b) => {
    return b-a;
})
console.log(res);// o/p :[ 64, 49, 9, 9, 1 ]

//--------------------------------------------------------
//given input , print only the failed testcases status. 
const testCases = [
    { id: 1, status: "passed" },
    { id: 2, status: "failed" },
    { id: 3, status: "failed" },
    { id: 4, status: "passed" },
    { id: 5, status: "failed" }
  ];
  
  const failedTestCases = testCases.filter(testCase => testCase.status === "failed");
  
  console.log(failedTestCases); // Output: [{ id: 2, status: "failed" }, { id: 3, status: "failed" }, { id: 5, status: "failed" }]
  
