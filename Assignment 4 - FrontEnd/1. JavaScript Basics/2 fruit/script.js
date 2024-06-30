document.getElementById('sort-button').addEventListener('click', function() {
    // Get the list element
    var list = document.getElementById('fruit-list');

    // Get the items from the list and convert them to an array
    var items = Array.from(list.getElementsByTagName('li'));

    // Sort the items in descending order
    items.sort(function(a, b) {
        return b.innerHTML.localeCompare(a.innerHTML);
    });

    // Remove existing items from the list
    while (list.firstChild) {
        list.removeChild(list.firstChild);
    }

    // Append the sorted items back to the list
    items.forEach(function(item) {
        list.appendChild(item);
    });
});

document.getElementById('sort-button-Asc').addEventListener('click', function() {
    // Get the list element
    var list = document.getElementById('fruit-list');

    // Get the items from the list and convert them to an array
    var items = Array.from(list.getElementsByTagName('li'));

    // Sort the items in descending order
    items.sort(function(b,a) {
        return b.innerHTML.localeCompare(a.innerHTML);
    });

    // Remove existing items from the list
    while (list.firstChild) {
        list.removeChild(list.firstChild);
    }

    // Append the sorted items back to the list
    items.forEach(function(item) {
        list.appendChild(item);
    });
});
