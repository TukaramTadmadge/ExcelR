function playGame(playMove) {
    console.log('playMove: ${playerMove}');
    console.log();
    const computerMove = generateComputerMove()
    console.log('generateComputerMove: ${computerMove}');

    let result;
    let win=0;
    let lose=0;
    let tie=0;
    switch (playerMove) {
        case "Rock":
            switch (computerMove) {
                case "Rock": result = "Tie"; break;
                case "Paper": result = "Lose"; break;
                case "Scissors": result = "win"; break;
            }
            break;

        case "Scissors":
            switch (computerMove) {
                case "Rock": result = "Lose"; break;
                case "Paper": result = "win"; break;
                case "Scissors": result = "Tie"; break;

            }
            break;

        case "Paper":
            switch (computerMove) {
                case "Rock": result = "win"; break;
                case "Paper": result = "Tie"; break;
                case "Scissors": result = "Lose"; break;

            }
            break;
    }

    console.log('result ${result}')
    switch (result) {
        case "win": win++; break;
        case "Lose": lose++; break;
        case "Tie": tie++; break;

    }
}

function generateComputerMove() {
 const random = Math.random();

    if (random < 0.33) return "Rock";
    else if (random < 0.66) return "Paper";
    else return "Scissors";
}