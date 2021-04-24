# bank-simulator

> Status: Developing ⚠️

> WARNING: My code is in portuguese, soon I will change to english

### A bank account simulator built in Java to understand OOP

## Why

I built this project in my OOP classes in college as my final project
I'm developing yet so... some functionalities will be added soon
First, let's start with the classes:

+ Conta (account)
+ Cliente (client)
+ Endereço (address)
+ Gerente (manneger)
+ Funcionário (employee) 

Every class have at least 2 constructors defined, and their setters and getters for every
method. 

## Usage:

Well, in the main class is where the magic happens.
The user will choose how many accounts he/she want create, and we store all accounts in
an <i>ArrayList<i>. After the user choose the number of accounts it's time to
 insert some information like:
  + name
  + Where this person lives (Street)
  + Who is the Mennager (but this is optional, the program asks if you want say that or not)

After that, we call a function to print everything that users write on the screen
and we ask in wich account wants do some operation, like deposit, withdraw, transfer, show infomations again and is in a loop
until the user say that wants exit. To prevente errors like user set 3 accounts and say wants deposit some money in the 3rd
account, of course this number doesn't exist, arrays goes from 0 to some number, in this case is 2. So to prevent that
when is asked in which account deposit, is subtracted 1 for the number inserted.. a very simple verification.
By default the <i>limit<i> is defined as $ 1,000 and <i>amount<i> is defined as $ 0,00.

I know, is too, but i feel proud of my work and I hope soon I can improve it!! 😁
