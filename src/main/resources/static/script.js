var dotItem = document.getElementsByClassName("dot");

for (var i = 0; i < dotItem.length; i++) {
    dotItem[i].addEventListener("click", function() {
        if (this.style.backgroundColor != "black") {
            this.style.backgroundColor = "black";
        } else if (this.style.backgroundColor = "black"){
            this.style.backgroundColor = "white";
        }
    })
}

document.getElementById("reset-button").addEventListener("click", function() {
    for (var i = 0; i < dotItem.length; i++) {
        if (dotItem[i].style.backgroundColor = "black") {
        dotItem[i].style.backgroundColor = "white";
        }
    }
//    for (var i = 0; i < itemTen.length; i++) {
//            if (itemTen[i].style.backgroundColor = "black") {
//            itemTen[i].style.backgroundColor = "";
//            }
//        }
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


//var gridItem = document.getElementsByClassName("grid-item");
//var itemTen = document.getElementsByClassName("item-ten");
//
//for (var i = 0; i < gridItem.length; i++) {
//    gridItem[i].addEventListener("click", function() {
//        if (this.style.backgroundColor != "black") {
//            this.style.backgroundColor = "black";
//        } else if (this.style.backgroundColor = "black") {
//            this.style.backgroundColor = "";
//        }
//    })
//}
//
//for (var i = 0; i < itemTen.length; i++) {
//    itemTen[i].addEventListener("click", function() {
//        if (this.style.backgroundColor != "black") {
//            this.style.backgroundColor = "black";
//        } else if (this.style.backgroundColor = "black") {
//            this.style.backgroundColor = "";
//        }
//    })
//}











