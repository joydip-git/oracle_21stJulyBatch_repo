//1. object literal syntax
// var anilObj = {
//     //value properties
//     name: 'anil',
//     id: 1,
//     salary: 1000,
//     //functional properties
//     printInfo: function () {
//         return this.name + ' ' + this.id + ' ' + this.salary
//     }
// }

//2. constructor function
function person(pName, pId, pSalary) {
    var a = 100
    function test() { }
    var info
    this.a = 200
    this.name = pName
    this.id = pId
    this.salary = pSalary
    //return this;
}
//console.log(person.prototype)
person.prototype.printInfo = function () {
    info = this.name + '' + this.id + '' + this.salary
    return info
}
// Object.prototype.printInfo = function () {
//     info = this.name + '' + this.id + '' + this.salary
//     return info
// }

const anilObj = new person('anil', 1, 1000)
console.log(anilObj)
console.log(anilObj.__proto__)
console.log(anilObj.hasOwnProperty('printInfo'))
console.log(person.prototype.hasOwnProperty('printInfo'))
console.log(Object.prototype.hasOwnProperty('printInfo'))
console.log(anilObj.printInfo())
/*
//accessing value property of an object through . (dot) operator
//<obj-variable>.<prop-name>
console.log(anilObj.name)

//accessing value property of an object through indexer ([])
//<obj-variable>[prop-name]
console.log(anilObj['salary'])

//accessing functional property of an object through . (dot) operator
//<obj-variable>.<prop-name>()
console.log(anilObj.printInfo())

//anilObj is not iterable
// for (var val of anilObj) {
//     console.log(val)
// }

anilObj.location = 'Bangalore'
anilObj.reprintInfo = function () {
    return this.printInfo() + ' location'
}

//objects are enumerable
for (let propName in anilObj) {
    //console.log(propName)
    const propValue = anilObj[propName]
    console.log(propName + ':' + propValue)
}
*/
