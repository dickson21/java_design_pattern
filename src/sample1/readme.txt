Subject : Decorator Design Pattern
Created : 2021-02-03
Author : dickson.cheng
Status : OK
Desc :
Decorator pattern allows a user to add new functionality to an existing object without altering its structure. 
This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
This pattern creates a decorator class which wraps the original class 
and provides additional functionality keeping class methods signature intact.


base_dir = PS C:\myprogram\java\design-pattern\12-decorator\Sample 
.>javac -cp ./ Main.java
.>java -cp ./ Main
Hello, world.

#Hello, world.#

+---------------+
|#Hello, world.#|
+---------------+

/+-----------------------+/
/|+---------------------+|/
/||*+-----------------+*||/
/||*|Shape with border|*||/
/||*+-----------------+*||/
/|+---------------------+|/
/+-----------------------+/