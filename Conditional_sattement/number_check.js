class NumberCheck {
    numberCalculate(n) {
        if (n > 0) {
            console.log("Number is Positive");
        } else if (n < 0) {
            console.log("Number is Negative");
        } else {
            console.log("Number is Equal");
        }
    }
}

const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question("Enter value: ", input => {
    const a = parseInt(input);
    const nb = new NumberCheck();
    nb.numberCalculate(a);
    readline.close();
});
