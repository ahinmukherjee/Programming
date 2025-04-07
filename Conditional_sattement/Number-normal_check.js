const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question("Enter value: ", input => {
    const n = parseInt(input);

    if (n > 0) {
        console.log("Number is Positive");
    } else if (n < 0) {
        console.log("Number is Negative");
    } else {
        console.log("Number is Equal");
    }

    readline.close();
});