/*
1. Understanding variable declaration and case sensitivity in JavaScript is crucial for programming. Proper naming conventions like camelCase help avoid errors and enhance code readability.
2.Strings in JavaScript can be defined using single quotes, double quotes, or backticks. Each method allows for different uses of characters within the string, enhancing flexibility.
3.Strings in JavaScript can be defined using single quotes, double quotes, or backticks. Each method allows for different uses of characters within the string, enhancing flexibility.
4.
*/
var name = "This a \"Double quotes \"string in a \"double quotes text\n";
var name2= 'This a "Double quotes "string in a "double quotes text\n';
var name3= `This a "Double quotes "string in a "double quotes text`;
console.log(name, name2, name3);
/*
Code output
\'  single quote
\"  double quote
\\  backslash
\n  new line
\r  carriage return
\t  tab
\b  backspace
\f  form feed
\0  null character
\${} dollar sign and curly braces
\T  horizontal tab (U+0009 CHARACTER TABULATION)
\v  vertical tab (U+000B LINE TABULATION)
*/

/*
push() - Adds new items to the end of an array, and returns the new length.
pop() - Removes the last element from an array and returns that element.
shift() - Removes the first element from an array and returns that element.
unshift() - Adds new items to the beginning of an array, and returns the new length.
splice() - Adds or removes elements from an array.
slice() - Extracts a section of an array and returns a new array.
concat() - Merges two or more arrays, and returns a new array.
join() - Joins all elements of an array into a string.
indexOf() - Returns the first index at which a given element can be found in the array, or -1 if it is not present.
lastIndexOf() - Returns the last index at which a given element can be found in the array, or -1 if it is not present.
includes() - Determines whether an array includes a certain value among its entries, returning true or false as appropriate.
find() - Returns the first element in the array that satisfies the provided testing function.
findIndex() - Returns the index of the first element in the array that satisfies the provided testing function.
map() - Creates a new array populated with the results of calling a provided function on every element in the calling array.
forEach() - Executes a provided function once for each array element.
sort() - Sorts the elements of an array in place and returns the sorted array.
reverse() - Reverses the elements of an array in place.
fill() - Fills all the elements of an array from a start index to an end index with a static value.
every() - Tests whether all elements in the array pass the test implemented by the provided function.
some() - Tests whether at least one element in the array passes the test implemented by the provided function.
*/ 
var arr = [1, 2, 3, 4, 5];
arr.push(6);
console.log(arr);
arr.pop();
console.log(arr);
arr.shift();
console.log(arr);
arr.unshift(1);
console.log(arr);
arr.splice(1, 2);
console.log(arr);
console.log(arr.slice(1, 3));
console.log(arr.concat([1, 2]));
console.log(arr.join());
console.log(arr.indexOf(1));
console.log(arr.lastIndexOf(1));
console.log(arr.includes(1));
console.log(arr.find((element) => element === 1));
console.log(arr.findIndex((element) => element === 1));
console.log(arr.map((element) => element * 2));
arr.forEach((element) => console.log(element));
console.log(arr.sort());
console.log(arr.reverse());
console.log(arr.fill(1, 1, 3));
console.log(arr.every((element) => element === 1));
console.log(arr.some((element) => element === 1));
/*
If any variable decalare without var, let, const keyword then it will be a global variable.  
*/ 
function test(){
    name5 = "Hello";
    console.log(name5);
}
/*
Golf Code
strokes  return
1        "Hole-in-one!"
<= par - 2  "Eagle"
par - 1   "Birdie"
par       "Par"
par + 1   "Bogey"
par + 2   "Double Bogey"
>= par + 3  "Go Home!"
*/ 
function golfScore(par, strokes){
    if(strokes == 1){
        return "Hole-in-one!";
    }else if(strokes <= par - 2){
        return "Eagle";
    }else if(strokes == par - 1){
        return "Birdie";
    }else if(strokes == par){
        return "Par";
    }else if(strokes == par + 1){
        return "Bogey";
    }else if(strokes == par + 2){
        return "Double Bogey";
    }else if(strokes >= par + 3){
        return "Go Home!";
    }
}
console.log(golfScore(5, 4));
/*
Difference between var, let, and const
var - function-scoped, can be redeclared and updated, hoisted to the top of the function.
let - block-scoped, cannot be redeclared but can be updated, not hoisted.
const - block-scoped, cannot be redeclared or updated, not hoisted.
*/ 
var name4 = "Hello";
let name5 = "Hello";
const name6 = "Hello";
