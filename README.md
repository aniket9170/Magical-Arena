# Magical-Arena

Description- 
******************************************************************************************************************

MagicalArena is a simple Java program that simulates a turn-based combat game between two players. 
Each player has health, strength, and attack attributes. 
Players take turns attacking each other, and the game ends when one player's health reaches zero.


******************************************************************************************************************
Features- 
******************************************************************************************************************

Players have attributes: [health, strength, and attack].

- Players attack each other in turns.
- The player with lower health attacks first.
- The game ends when one player's health reaches zero.



******************************************************************************************************************
Requirements- Java Development Kit (JDK) 8 or higher






******************************************************************************************************************
How to Run-
******************************************************************************************************************

Step 1: Clone or Download the Repository
Clone the repository from GitHub or download the ZIP file and extract it to your local machine.

Step 2: Compile the Java Files
Open a terminal or command prompt and navigate to the directory containing the Java files (Player.java and MagicalArena.java).

Code - {javac Player.java MagicalArena.java}



Step 3: Run the Program

After compiling, run the main class MagicalArena:

Copy - {java MagicalArena}




Step 4: 

Enter Player Attributes
When prompted, enter the health, strength, and attack values for both players. 
The program will simulate the game and display the results of each turn.


******************************************************************************************************************
Example Usage - 
******************************************************************************************************************

Run the program:

Copy - {java MagicalArena}

Enter the attributes for Player A: yaml

Enter attributes for Player A:

Health: 50
Strength: 5
Attack: 10


Enter the attributes for Player B: yaml

Enter attributes for Player B:
Health: 100
Strength: 10
Attack: 5


The game will simulate and display the results: less


Copy code- 

Player [health=50, strength=5, attack=10] attacks Player [health=100, strength=10, attack=5]
Current status - Player A: 50, Player B: 70

Player [health=70, strength=10, attack=5] attacks Player [health=50, strength=5, attack=10]
Current status - Player A: 45, Player B: 70

...................................

         Player B wins!

....................................


******************************************************************************************************************
Code Structure - 
******************************************************************************************************************

Player.java: 

Contains the Player class, which defines the attributes and methods for a player.

MagicalArena.java: 

Contains the MagicalArena class, which manages the game logic and user input.

******************************************************************************************************************
Author- 
Aniket Soni
