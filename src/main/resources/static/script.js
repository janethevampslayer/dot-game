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

var correctClose = document.getElementsByClassName("correct-close")[0];
var incorrectClose = document.getElementsByClassName("incorrect-close")[0];
var correctModal = document.getElementById("correct-modal");
var incorrectModal = document.getElementById("incorrect-modal");
var checkAnswer = document.getElementById("check-answer-button");
var addendOne = document.getElementById("addend-one").textContent;
var addendTwo = document.getElementById("addend-two").textContent;
var total = Number(addendOne) + Number(addendTwo);

checkAnswer.addEventListener("click", function() {
    var input = Number(document.getElementById("answer").value);
              console.log(total);
              console.log(input);
              if (isNaN(input)) {
                incorrectModal.style.display = "block";
              } else if (input == 0) {
                incorrectModal.style.display = "block";
              } else if (total == input) {
                correctModal.style.display = "block";
              } else if (total != input) {
                incorrectModal.style.display = "block";
              }
})

correctClose.onclick = function() {
  correctModal.style.display = "none";
}

incorrectClose.onclick = function() {
  incorrectModal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == correctModal) {
    correctModal.style.display = "none";
  }
}

window.onclick = function(event) {
  if (event.target == incorrectModal) {
    incorrectModal.style.display = "none";
  }
}









