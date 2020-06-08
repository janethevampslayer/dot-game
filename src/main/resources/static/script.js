var gridItem = document.getElementsByClassName("grid-item");

for (var i = 0; i < gridItem.length; i++) {
    gridItem[i].addEventListener("click", function() {
        if (this.style.color != "black") {
            this.style.color = "black";
        } else if (this.style.color === "black") {
            this.style.color = "";
        }
    })
}

var itemTen = document.getElementsByClassName("item-ten");

for (var i = 0; i < itemTen.length; i++) {
    itemTen[i].addEventListener("click", function() {
        if (this.style.color != "black") {
            this.style.color = "black";
        } else if (this.style.color === "black") {
            this.style.color = "";
        }
    })
}


document.getElementById("reset-button").addEventListener("click", function() {
    for (var i = 0; i < gridItem.length; i++) {
        if (gridItem[i].style.color === "black") {
        gridItem[i].style.color = "white";
        }
    }

    for (var i = 0; i < itemTen.length; i++) {
            if (itemTen[i].style.color === "black") {
            itemTen[i].style.color = "white";
            }
        }
})

var close = document.getElementsByClassName("close")[0];
var modal = document.getElementById("modal");
var save = document.getElementById("save-button");
var checkAnswer = document.getElementById("check-answer-button");
var addendOne = document.getElementById("addend-one").textContent;
var addendTwo = document.getElementById("addend-two").textContent;
var total = Number(addendOne) + Number(addendTwo);

checkAnswer.addEventListener("click", function() {
    var input = Number(document.getElementById("answer").value);
              console.log(total);
              console.log(input);
              if (isNaN(input)) {
                document.querySelector(".modal-content p").textContent = "That is not a number. Please enter a number.";
                modal.style.display = "block";
              } else if (input == 0) {
                document.querySelector(".modal-content p").textContent = "Please enter a number.";
                modal.style.display = "block";
              } else if (total == input) {
                document.querySelector(".modal-content p").textContent = "Correct! Would you like to save this game?";
                save.style.display = "inline-block";
                modal.style.display = "block";

              } else if (total != input) {
                document.querySelector(".modal-content p").textContent = "Incorrect. Try again.";
                modal.style.display = "block";
              }
})

close.onclick = function() {
  modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}










