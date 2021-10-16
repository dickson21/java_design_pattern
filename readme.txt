Subject : 01-Iterator
Created : 2020-09-02
Author : dickson.cheng
Status : OK
Uses :
get a way to access the elements of a collection object in sequential manner 
without any need to know its underlying representation.

Main 
BookShelf <<concrete aggregator>>
BookShelfIterator <<concrete iterator>>
Aggregate <<interface>>
Iterator <<interface>>

Main -> BookShelf -> Iterator -> BookShelfIterator

C:\myprogram\java\design-pattern\01-Iterator\Sample>java -cp ./ Main
Around the World in 80 Days
Bible
Cinderella
Daddy-Long-Legs