class battleship {
    public static void main(String[] args) {
        /*
        // Test the Player class
        Player user = new Player();
        Player computer = new Player();

        // USER
        // First ship (with length 2), row 4, col 9, vertical
        user.chooseShipLocation(user.getShip(0), 4, 9, 1);
        // Second ship (with length 3), row 9, col 2, horizontal
        user.chooseShipLocation(user.getShip(1), 9, 2, 0);
        // Third ship (with length 3), row 5, col 3, horizontal
        user.chooseShipLocation(user.getShip(2), 5, 3, 0);
        // Fourth ship (with length 4), row 1, col 3, horizontal
        user.chooseShipLocation(user.getShip(3), 1, 3, 0);
        // Fifth ship (with length 5), row 4, col 9, vertical
        user.chooseShipLocation(user.getShip(4), 1, 1, 1);

        // COMPUTER
        // First ship (with length 2), row 8, col 8, horizontal
        computer.chooseShipLocation(user.getShip(0), 8, 8, 0);
        // Second ship (with length 3), row 6, col 1, vertical
        computer.chooseShipLocation(user.getShip(1), 6, 1, 1);
        // Third ship (with length 3), row 4, col 3, vertical
        computer.chooseShipLocation(user.getShip(2), 4, 3, 1);
        // Fourth ship (with length 4), row 0, col 5, horizontal
        computer.chooseShipLocation(user.getShip(3), 0, 5, 0);
        // Fifth ship (with length 5), row 2, col 5, horizontal
        computer.chooseShipLocation(user.getShip(4), 2, 5, 0);

        System.out.println("Player 1's Ships");
        user.printMyShips();
        System.out.println();
        System.out.println("Player 2's Ships");
        computer.printMyShips();
        System.out.println();

        // System.out.println("Player 1's Guesses");
        // user.printMyGuesses();
        // System.out.println();
        // System.out.println("Player 2's Guesses");
        // computer.printMyGuesses();
        // System.out.println();

        computer.recordMyGuess(1, 1);
        user.recordOpponentGuess(1, 1); // Computer Hits User

        user.recordMyGuess(5, 5);
        computer.recordOpponentGuess(5, 5); // User Misses Computer

        computer.recordMyGuess(2, 5);
        user.recordOpponentGuess(2, 5); // Computer Misses User

        user.recordMyGuess(5, 3);
        computer.recordOpponentGuess(5, 3); // User Hits Computer


        System.out.println("Player 1's Opponent Guesses");
        user.printOpponentGuesses();
        System.out.println();
        System.out.println("Player 2's Opponent Guesses");
        computer.printOpponentGuesses();
        System.out.println();
        /*






        // // Test the Grid class
        // Grid b = new Grid();
        // b.printStatus();

        // Ship aircraftCarrier = new Ship(5);
        // Ship battleship = new Ship(4);
        // Ship submarine = new Ship(3);
        // Ship cruiser = new Ship(3);
        // Ship destroyer = new Ship(2);

        // aircraftCarrier.setLocation(1,1);
        // aircraftCarrier.setDirection(1); //vertical
        // battleship.setLocation(1, 3);
        // battleship.setDirection(0); //horizontal
        // submarine.setLocation(5,3);
        // submarine.setDirection(0); //horizontal
        // cruiser.setLocation(9,2);
        // cruiser.setDirection(0); //horizontal
        // destroyer.setLocation(4,9);
        // destroyer.setDirection(1); //vertical

        // b.addShip(aircraftCarrier);
        // b.addShip(battleship);
        // b.addShip(submarine);
        // b.addShip(cruiser);
        // b.addShip(destroyer);

        // b.markHit(5,2);
        // b.markHit(15,12);
        // b.markMiss(3,8);
        // b.markHit(-5,0);
        // b.setStatus(0,0,1);
        // b.setStatus(0,1,2);

        // System.out.println();
        // b.printStatus();
        // System.out.println();
        // b.printShips();







        // //Test the Location class
        // Location l = new Location();
        // System.out.println(l.checkHit()); //false
        // System.out.println(l.checkMiss()); //false
        // System.out.println(l.isUnguessed()); //true
        // System.out.println(l.hasShip()); //false

        // l.setShip(true);
        // System.out.println(l.hasShip()); //true

        // l.markMiss();
        // System.out.println(l.isUnguessed()); //false
        // System.out.println(l.checkHit()); //false
        // System.out.println(l.checkMiss()); //true

        // l.markHit();
        // System.out.println(l.isUnguessed()); //false
        // System.out.println(l.checkHit()); //true
        // System.out.println(l.checkMiss()); //false

        // l.setStatus(0);
        // System.out.println(l.isUnguessed()); //true
        // System.out.println(l.checkHit()); //false
        // System.out.println(l.checkMiss()); //false







        // //Test the Ship class
        // Ship aircraftCarrier = new Ship(5);
        // Ship battleship = new Ship(4);
        // Ship submarine = new Ship(3);
        // Ship cruiser = new Ship(3);
        // Ship destroyer = new Ship(2);

        // System.out.println(aircraftCarrier);
        // System.out.println(battleship);
        // System.out.println(submarine);
        // System.out.println(cruiser);
        // System.out.println(destroyer);
    }
}