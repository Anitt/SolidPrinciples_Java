# SolidPrinciples_Java
This covers Coding of all Solid principles done in Java

# Each and Every Question violates some solid principles , This excersise covers the list of solid priciple violated and provides a fix.

Question 1.
Principle Violated – Dependency inversion.
Why?
High-level Class employer depends on hourly worker and Salary worker because of which we can’t swap between other objects and can’t add other types of workers.
Solution:
Employer, Hourly worker and Salary Interface all should depend on an interface and employer class should have one array of objects that implement interface. By adding Interface, we change what high level modules depend on.

Question 2.
Principle Violated – Interface Segregation.
Why?
Interface Segregation says no class should be forced to use methods which it doesn’t use.
In the Example, Book class uses method Getcastlist () which is not really needed for Book class , likewise DVD class uses method getauthor which again is not needed , so it violates interface segregation principle.
Solution:
Implemented separate interfaces for all the methods and segregated, please see the code.

Question 3:
Principle Violated – Single Responsibility principle.
Why?
Single Responsibility principle says A class should have only one responsibility. Here profit report has Send to printer and send to email responsibilities which is more than one responsibility.
Solution:
Have Created new class for Send to report and send to email and have passed print report profit report parameters as function.

Question 4:
Principle Violated – Liskov Substitution:
Liskov substitution says base class should be able to use object of derived class without knowing it and output is the same. In our example, the child class inheriting from parent class was missing get balance method, so added that and override the functionality to make it work as base class whenever used.
Solution:
Added get balance method to the subclass and did override to behave in the same way as superclass.

Question 5:
Principle Violated – open closed principle.
Open closed principle says the class is open for extension but closed for modification. So whenever a new country needs to be added it should be added without any change to the class.
Solution:
Created an Interface for country which has PrintGDPmethod and other classes Canada and Mexico would implement PrintGDPmethod and an array list of interface type has been created to add countries which would resolve the violation.

Question 6:
Principle Violated – Single Responsibility.
Single Responsibility principle says A class should have only one responsibility. Here piggybank class has many methods like save and load and add which violates.
Solution:
Created separate class for load and save and resolved the responsibility problem.

Question 7:
Principle Violated – Interface Segregation.
Why?
Interface Segregation says no class should be forced to use methods which it doesn’t use. Here in our example Aquatic Insect is forced to use Fly method but actually it doesn’t fly, so here interface segregation principle is violated, likewise flying insect is forced to swim but actually it doesn’t swim it only flies, so interface segregation is violated.

Solution:
Created individual interfaces as Ifly, Iswim and made classes to implement as per functionality which resolves the issue.

