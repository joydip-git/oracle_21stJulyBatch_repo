//function main(){
var a
console.log(a)
a = 100
console.log(a)
check() //possible
//function declaration
function check() {
    console.log(a) //undefined
    var a //declaration
    a = 12 //assignment
    console.log(a) //12
    for (var i = 0; i < 1; i++) {
        var a
        a = 20
        console.log(a)//20
    }
    console.log(a)//20
}
check()

//test() //not possible
//function expression
var test
test = function () {
    console.log(test)
}
test()
//}
//main()