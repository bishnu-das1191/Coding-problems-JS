function rotateArray(arr, k) {
    // Get the effective rotation count
    k = k % arr.length; 
  
    // Create a temporary array to store the rotated elements
    let temp = arr.slice(arr.length - k); 
  
    // Remove the last 'k' elements from the original array
    arr.length -= k; 
  
    // Concatenate the removed elements to the beginning of the array
    arr = temp.concat(arr); 
  
    return arr;
  }
  
  // Example usage:
  let arr = [2, 3, 4, 5, 7];
  let k = 3; 
  let rotatedArr = rotateArray(arr, k); 
  console.log(rotatedArr); // Output: [4, 5, 7, 2, 3]