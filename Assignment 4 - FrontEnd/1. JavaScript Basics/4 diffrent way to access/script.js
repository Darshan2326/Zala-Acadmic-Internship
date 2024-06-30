// Create an object with properties firstname and lastname
var person = {
    firstname: "John",
    lastname: "Doe"
};

// Get the output div
var output = document.getElementById('output');

// Display properties using dot notation
output.innerHTML += "Using dot notation: <br>";
output.innerHTML += ">>>>>> For Ex :- person.firstname <<<<<<<br>"
output.innerHTML +="<br>"
output.innerHTML += "Firstname: " + person.firstname + "<br>";
output.innerHTML += "Lastname: " + person.lastname + "<br>";
output.innerHTML +="--------------------------------------------------"
// Display properties using bracket notation
output.innerHTML += "<br>Using bracket notation: <br>";
output.innerHTML += ">>>>>> For Ex :- person['firstname'] <<<<<<<br>"
output.innerHTML +="<br>"
output.innerHTML += "Firstname: " + person['firstname'] + "<br>";
output.innerHTML += "Lastname: " + person['lastname'] + "<br>";
