•	Why does LinkedStack not require an explicit constructor?

Ans: Because linkedStack does not require us to have one because java has a default constructor and when we make the first node it can be implemented through the methods in the class
•	What is the time and (extra) space complexity of each of the LinkedStack methods, as well as ReverseLines.main?
Ans:  asList has complexitiy O(n), the space complexity is O(1). All the methods in linkedStack class have time complexity of O(1) and space complexity O(1). 
In the reverse class complexity is O(n) and space complexity is O(n) in all methods in there
•	How else (not using Node) could we have implemented LinkedStack in such a way that it is still based on a linked list but the asList method uses constant time and space?
Ans: if we use LinkedStack  instead of type node the asList will be in constant time and space
•	Is it better for push and pop to return the item or the stack itself? Briefly discuss the pros and cons of each design.
	Ans:  it is better for push and pop to return the item instead of stack when we do that we will know exactly what item was removed or added because in stack we only care about the last item which is top. Pros: we can see the whole stack when it is updated. Cons: when we have large stack, it will be inefficient

