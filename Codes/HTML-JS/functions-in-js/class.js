class Person {
    constructor(name, id, salary) {
        //local variables or functions (will be stored in the VARIABLE-OBJECT)
        var a
        a = 100
        function test() { console.log(a, 'test') }
        test()

        //object data (will be stored in the THIS object)
        this.name = name
        this.id = id
        this.salary = salary
    }
    // printInfo = function () {
    printInfo() {
        return this.name + ' ' + this.id + ' ' + this.salary;
    }
}
//to access the prototype instance for this function, use 'prototype' property
console.log(Person.prototype)
const anilObj = new Person('anil', 1, 100)
const info = anilObj.printInfo()
console.log(info)
//window.alert('hello')