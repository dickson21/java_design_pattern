Subject : State pattern
Created : 20210304
Author : dickson.cheng

/* Detail */
In State pattern a class behavior changes based on its state. 
This type of design pattern comes under behavior pattern.

In State pattern, 
we create objects which represent various states and
** a context object whose behavior varies as its state object changes. **

Implementation
We are going to create a State interface defining an action and 
concrete state classes implementing the State interface. 
Context is a class which carries a State.

StatePatternDemo, our demo class, 
will use Context and state objects to demonstrate 
change in Context behavior based on type of state it is in.

/* Ref */
state pattern
https://www.tutorialspoint.com/design_pattern/state_pattern.htm

/* Run */
C:\myprogram\java\design-pattern\23-gof\18-state\Sample2

./>javac -cp ./ Main.java
./>java -cp ./ Main
Player is in start state
Start State
Player is in stop state
Stop State
