var output = document.getElementById('output');

output.innerHTML = "Before declaration: " + hoistedVariable + "<br>"; // Will print "undefined"

hoistedVariable = 10;

var hoistedVariable;

output.innerHTML += "After declaration and initialization: " + hoistedVariable + "<br>"; // Will print "10"
