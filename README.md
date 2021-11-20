# VendingMachineOOP
Designing and Coding a Vending Machine using Object Oriented Programming with the help of Hello Code's article on [Designing a Vending Machine in Java](https://www.hellocodeclub.com/vending-machine-java-how-to-design/)

## General Steps
1. Vending Machine displays a welcome message (products and prices)
2. It asks the User to select a product
3. Machine asks the user to enter coins (5, 10, 20, 50, or 100 cents)
4. Machine calculates and totals up the amount enter by user
5. It calculates the change based off the total and price of selected product
6. It calculates minimum number of coins to return
7. It displays a message with the change amount and coins

## Diagram (classes, interfaces, and enums)  
![Diagram](https://github.com/juliuscecilia33/VendingMachineOOP/blob/main/images/UMLDiagram.png)

## Flow Chart based off of article's flow chart
![FlowChart](https://github.com/juliuscecilia33/VendingMachineOOP/blob/main/images/Flowchart.png)

## Classes
- Main
- Vending Machine
- Coin
    -  Accepting 5 different coins: 5 cents, 10 cents, twenty cents, fifty cents, hundred cents
- Product
    - Representing the different products in our vending machine
- Calculator
- CoinBundle
    - Help us return the change; if we need to return 2 10 cents, then we can have [0, 2, 0, 0, 0]; 5 fields for every different coin 

# Resources
1. [Designing a Vending Machine in Java](https://www.hellocodeclub.com/vending-machine-java-how-to-design/)
2. [Resource on creating diagrams](https://java-programming.mooc.fi/part-11/1-class-diagrams)
