function formatDate() {
    const inputDate = document.getElementById('dateInput').value;
    if (inputDate) {
        const dateObj = new Date(inputDate);
        const formattedDate = `${dateObj.getDate()}-${dateObj.getMonth() + 1}-${dateObj.getFullYear()}`;
        displayResult(formattedDate);
    } else {
        displayResult("Please enter a valid date (YYYY-MM-DD format).");
    }
}

function applyFilters() {
    const inputText = document.getElementById('textInput').value;
    if (inputText) {
        let outputText = '';

        // Uppercase
        outputText += `<p>Uppercase: ${inputText.toUpperCase()}</p>`;

        // Lowercase
        outputText += `<p>Lowercase: ${inputText.toLowerCase()}</p>`;

        // Number filter (check if input is numeric)
        if (!isNaN(inputText)) {
            outputText += `<p>Number: ${Number(inputText)}</p>`;
        } else {
            outputText += `<p>Not a valid number: ${inputText}</p>`;
        }

        // Custom filter (e.g., adding "Filtered: " prefix)
        outputText += `<p>Custom Filter: Filtered: ${inputText}</p>`;

        displayResult(outputText);
    } else {
        displayResult("Please enter some text to apply filters.");
    }
}

function displayResult(result) {
    document.getElementById('outputContainer').innerHTML = result;
}
