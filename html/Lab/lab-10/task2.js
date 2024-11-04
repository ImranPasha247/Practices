/*Lab Task - 2: Write a JavaScript program that takes a sentence from the user. Then, display:  
a) The length of the sentence. 
b) The position of the first occurrence of a specific word in the sentence using indexOf. 
c) The sentence is in lowercase format. */ 
// Prompt user to enter a sentence
let sentence = prompt("Please enter a sentence:");
console.log("Sentence: " + sentence);
let sentenceLength = sentence.length;
console.log("Length of the sentence: " + sentenceLength);
let wordToFind = prompt("Please enter a word to find its first occurrence in the sentence:");
let position = sentence.indexOf(wordToFind);
console.log("Position of the first occurrence of the word in the sentence: " + position);
let sentenceLowerCase = sentence.toLowerCase();
console.log("Sentence in lowercase: " + sentenceLowerCase);
