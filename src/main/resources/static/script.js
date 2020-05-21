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


var checkAnswer = document.getElementById("check-answer-button");
var addendOne = document.getElementById("addend-one").textContent;
var addendTwo = document.getElementById("addend-two").textContent;
var total = Number(addendOne) + Number(addendTwo);



checkAnswer.addEventListener("click", function() {

var input = Number(document.getElementById("answer").value);
//              console.log(typeof(total));
             console.log("type of total: " + typeof(total));
             console.log(total);
              console.log("type of input: " + typeof(input));
              console.log(input);
              console.log(total + input);

              if (total == input) {
                console.log("CORRECT!");
              } else {
                console.log("silly button types");
              }


          })


