//1. object literal syntax
var anilObj = {
    //value properties
    name: 'anil',
    id: 1,
    salary: 1000,
    //functional properties
    printInfo: function () {
        return this.name + ' ' + this.id + ' ' + this.salary
    }
}

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