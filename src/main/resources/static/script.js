var gridItem = document.getElementsByClassName("grid-item")

for (var i = 0; i < gridItem.length; i++) {
    gridItem[i].addEventListener("click", function() {
        if (this.style.color != "black") {
            this.style.color = "black";
        } else if (this.style.color === "black") {
            this.style.color = "";
        }
    })
}

var itemTen = document.getElementsByClassName("item-ten")

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



var checkAnswer = document.getElementById("check-answer-button");
var addendOne = document.getElementById("addend-one").textContent;
var addendTwo = document.getElementById("addend-two").textContent;
var total = Number(addendOne) + Number(addendTwo);

checkAnswer.addEventListener("click", function() {
    var input = Number(document.getElementById("answer").value);
              console.log(total + input);

              if (total == input) {
                confirm("correct!");
              } else {
                console.log("silly button types");
              }
})













