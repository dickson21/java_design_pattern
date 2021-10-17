Subject : 14-chain of responsibility
Created : 2020-09-02
Author : dickson.cheng
Status : OK
Detail :
As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request. 
This pattern decouples sender and receiver of a request based on type of request. 
This pattern comes under behavioral patterns.

In this pattern, normally each receiver contains reference to another receiver. 
If one object cannot handle the request then it passes the same to the next receiver and so on.

Ref :
https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm


-- output --
base_dir = C:\myprogram\java\design-pattern\23-gof\14-ChainOfResponsibility\Sample
.>javac -cp ./ Main.java
.> java -cp ./ Main

[Trouble 0] is resolved by [Bob].
[Trouble 33] is resolved by [Bob].
[Trouble 66] is resolved by [Bob].
[Trouble 99] is resolved by [Bob].
[Trouble 132] is resolved by [Diana].
[Trouble 165] is resolved by [Diana].
[Trouble 198] is resolved by [Diana].
[Trouble 231] is resolved by [Elmo].
[Trouble 264] is resolved by [Fred].
[Trouble 297] is resolved by [Elmo].
[Trouble 330] cannot be resolved.
[Trouble 363] is resolved by [Elmo].
[Trouble 396] cannot be resolved.
[Trouble 429] is resolved by [Charlie].
[Trouble 462] cannot be resolved.
[Trouble 495] is resolved by [Elmo].

