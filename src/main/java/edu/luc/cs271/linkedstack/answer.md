What is the purpose of the various auxiliary methods populateList, populateFifoList, and ReverseLines.printReverse?
ans: They both work recursively. Both methods keep on adding items to a list until there is nothing to add. and the printReverse prints items in a stack instead of using a loop. recursively it will just continue doing so until everything is met.
Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?
ans: They have arguments so we can call them and specify where in the stack for example we want them to start. 
What are the time and space complexity of each of the populateList populateFifoList methods, as well as ReverseLines.printReverse?
ans: They are all O(n)
which of these methods can be implemented using while loops?
ans: All of them