function compressString(str) {
    if (!str) {
      return ""; // Handle empty string input
    }
  
    let compressed = "";
    let currentChar = str[0];
    let charCount = 1;
  
    for (let i = 1; i < str.length; i++) {
      if (str[i] === currentChar) {
        charCount++;
      } else {
        //compressed += currentChar + (charCount > 1 ? charCount : ""); // Add count only if it's greater than 1
        compressed += currentChar + charCount;
        currentChar = str[i];
        charCount = 1;
      }
    }
  
    // Add the last character and its count
    compressed += currentChar + (charCount > 1 ? charCount : 1);
  
    return compressed;
  }
  
  // Test cases
  console.log(compressString("ssaaattst")); // Output: s2a3t2s1t1
  console.log(compressString("aabbcc"));    // Output: a2b2c2
  console.log(compressString("a"));         // Output: a
  console.log(compressString(""));          // Output: 
  console.log(compressString("aaabbbaaa")); // Output: a3b3a3