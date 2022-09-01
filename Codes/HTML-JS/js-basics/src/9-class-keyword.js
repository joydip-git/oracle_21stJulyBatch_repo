class Person {
    constructor(pName, pId, pSalary) {
        this.name = pName
        this.id = pId
        this.salary = pSalary
    }
    printInfo() {
        return this.name + '' + this.id + '' + this.salary
    }
}
const anilObj = new Person('anil', 1, 1000)
console.log(anilObj.name)
console.log(anilObj['salary'])
console.log(anilObj.printInfo())

anilObj.location = 'Bangalore'
anilObj.reprintInfo = function () {
    return this.printInfo() + ' location'
}

for (const propName in anilObj) {
    const propValue = anilObj[propName]
    console.log(propName + ':' + propValue)
}
console.log(Person.prototype)