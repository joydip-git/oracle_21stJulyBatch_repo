//2. constructor function
function person(pName, pId, pSalary) {
    this.name = pName
    this.id = pId
    this.salary = pSalary
    this.printInfo = function () {
        return this.name + '' + this.id + '' + this.salary
    }
    //return this;
}

const anilObj = new person('anil', 1, 1000)
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