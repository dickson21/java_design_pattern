Subject : Flyweight pattern
Created : 20210304
Author : dickson.cheng

/* Detail */
Flyweight pattern is primarily used to reduce the number of objects created and 
to decrease memory footprint and increase performance. 
This type of design pattern comes under structural pattern as this pattern provides ways 
to decrease object count thus improving the object structure of application.

Flyweight pattern tries to reuse already existing similar kind objects by storing them and 
creates new object when no matching object is found. 
We will demonstrate this pattern by drawing 20 circles of different locations but we will create only 5 objects. 
Only 5 colors are available so color property is used to check already existing Circle objects.

Implementation
We are going to create a Shape interface and concrete class Circle implementing the Shape interface. 
A factory class ShapeFactory is defined as a next step.

ShapeFactory has a HashMap of Circle having key as color of the Circle object. 
Whenever a request comes to create a circle of particular color to ShapeFactory, 
it checks the circle object in its HashMap, 
if object of Circle found, that object is returned 
otherwise a new object is created, stored in hashmap for future use, and returned to client.

FlyWeightPatternDemo, our demo class, will use ShapeFactory to get a Shape object. 
It will pass information (red / green / blue/ black / white) to ShapeFactory to get the circle of desired color it needs.


/* Ref */
flyweight pattern
https://www.tutorialspoint.com/design_pattern/flyweight_pattern.htm

/* Run */
C:\myprogram\java\design-pattern\23-gof\20-flyweight\Sample2

./>javac -cp ./ Main.java
./>java -cp ./ Main
Creating circle of color : Black
Circle: Draw() [Color : Black, x : 36, y :71, radius :100
Creating circle of color : Green
Circle: Draw() [Color : Green, x : 27, y :27, radius :100
Creating circle of color : White
Circle: Draw() [Color : White, x : 64, y :10, radius :100
Creating circle of color : Red
Circle: Draw() [Color : Red, x : 15, y :44, radius :100
Circle: Draw() [Color : Green, x : 19, y :10, radius :100
Circle: Draw() [Color : Green, x : 94, y :32, radius :100
Circle: Draw() [Color : White, x : 69, y :98, radius :100
Creating circle of color : Blue
Circle: Draw() [Color : Blue, x : 13, y :4, radius :100
Circle: Draw() [Color : Green, x : 21, y :21, radius :100
Circle: Draw() [Color : Blue, x : 55, y :86, radius :100
Circle: Draw() [Color : White, x : 90, y :70, radius :100
Circle: Draw() [Color : Green, x : 78, y :3, radius :100
Circle: Draw() [Color : Green, x : 64, y :89, radius :100
Circle: Draw() [Color : Blue, x : 3, y :91, radius :100
Circle: Draw() [Color : Blue, x : 62, y :82, radius :100
Circle: Draw() [Color : Green, x : 97, y :61, radius :100
Circle: Draw() [Color : Green, x : 86, y :12, radius :100
Circle: Draw() [Color : Green, x : 38, y :93, radius :100
Circle: Draw() [Color : Red, x : 76, y :82, radius :100
Circle: Draw() [Color : Blue, x : 95, y :82, radius :100
