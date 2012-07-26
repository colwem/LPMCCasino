#Best Practices for Writing Good Java

##Overview
The purpose of this document is to codify a set of rules and best practices designed to
help work on this project be both consistant and efficient. Exceptions can be made, but 
only in a circumstance where it is technically prudent to do so.

This is a living document, and will be updated regularly with general practices as well as 
specific conventions to our project. If you have any recommendations, simply modify the document
and submit a pull request.

##Formatting
- Java code will have a single tab per functional block {} 
- Java functional blocks including but not limited to ifs, elses, fors, whiles, functions and classes,
will always start with a curly brace { and end with a curly brace }. The opening brace will go on the same
line as the boolean statement, while the closing brace occupies its own line.
- As a general rule, subclassing within the same file is frowned upon.
- Comments should always be in the form /* */, never //.  
- Excessive whitespace is to be avoided.

##Naming
- Use a distinctive naming scheme in order to easily articulate what that piece of code is doing
    - Exceptions to this are things such as loop counters, which have no naming convention
- Use camel case (thisIsCamelCase) for all variable and function names
- Use Pascal case (ThisIsPascalCase) for all class and file names

##General Guidelines
- Do not use Exceptions to handle expected input. Exceptions are reserved for unforseeable problems, eg: Disk or network errors
- A method should do one thing. Exactly one thing, no more, no less. 
- Any method that does more than one thing should be split into multiple methods that do each of the things.
- If writing an API for consumption somewhere else in the program, include /** */ Javadoc comments so that documentation can be easily generated.
- Follow general OOP practices. Inheritance and polymoprhism are going to be especially important when dealing with Swing.
- Use lazy initialization where prudent
- Only expose variables via getter and setter methods
