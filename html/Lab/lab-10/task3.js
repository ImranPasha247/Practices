/*Lab Task - 3: Write a JavaScript program that takes your current age as input and calculates the time left until you reach 90 years old in the following format → You have X days, weeks, and Z months left.  (where X, Y, and Z are replaced with the actual calculated number). */ 
let currentAge = prompt("Please enter your current age:");
console.log("Your age is : " + currentAge);
const age = 90;
let yearsLeft = age - currentAge;
let daysLeft = yearsLeft * 365;
let weeksLeft = yearsLeft * 52;
let monthsLeft = yearsLeft * 12;

console.log(`You have ${daysLeft} days, ${weeksLeft} weeks, and ${monthsLeft} months left.`);
