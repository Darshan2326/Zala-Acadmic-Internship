// Define an object with some properties
var person = {
    firstName: "Darshan",
    lastName: "Ramani",
    age: 20,
    occupation: "Application Developer"
};

// Get the output div
var output = document.getElementById('output');

for (var key in person) {
    if (person.hasOwnProperty(key)) {
        output.innerHTML += key + ": " + person[key] + "<br>";
    }
}
