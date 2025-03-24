let price = parseInt(prompt("Enter price:"));
let r = 0, price1 = 0;

if (price >= 1500) {
    r = price * (20 / 100);
    price1 = price - r;
    console.log("Original Price:", price);
    console.log("Discounted Price:", price1);
} else if (price >= 1000) {
    r = price * (15 / 100);
    price1 = price - r;
    console.log("Original Price:", price);
    console.log("Discounted Price:", price1);
} else if (price >= 500) {
    r = price * (5 / 100);
    price1 = price - r;
    console.log("Original Price:", price);
    console.log("Discounted Price:", price1);
} else {
    console.log("Not available for discount offer");
}
