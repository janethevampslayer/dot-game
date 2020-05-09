var gridItem = document.getElementsByClassName("grid-item");

for (var i = 0; i < gridItem.length; i++) {
    gridItem[i].addEventListener("click", function() {
        if (this.style.backgroundColor != "black") {
            this.style.backgroundColor = "black";
        } else if (this.style.backgroundColor = "black") {
            this.style.backgroundColor = "";
        }
    })
}

document.getElementById("reset-button").addEventListener("click", function() {
    for (var i = 0; i < gridItem.length; i++) {
        if (gridItem[i].style.backgroundColor = "black") {
        gridItem[i].style.backgroundColor = "";
        }
    }
})