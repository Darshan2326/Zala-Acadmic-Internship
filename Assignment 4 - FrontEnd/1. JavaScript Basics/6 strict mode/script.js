'use strict'; // Enable strict mode

var output = document.getElementById('output');

try {
    // This will cause a ReferenceError because 'hoistedVariable' is not declared
    output.innerHTML = "Before declaration: " + hoistedVariable + "<br>";
} catch (error) {
    output.innerHTML = "Error: " + error.message + "<br>";
}

// Variable initialization (this will be hoisted)
hoistedVariable = 10;

// Variable declaration
var hoistedVariable;

output.innerHTML += "After declaration and initialization: " + hoistedVariable + "<br>";
