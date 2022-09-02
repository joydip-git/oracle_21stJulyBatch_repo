
var actual = {
    name: 'anil',
    id: 1,
    salary: 100
}
var updated = {
    name: 'sunil',
    id: 1,
    salary: 200
}

// var copy = {}
// for (const propName in obj) {
//     const propValue = obj[propName]
//     copy[propName] = propValue
// }
//spread operator (...)
var updatableObj = {
    ...actual,
    ...updated
}

console.log(updatableObj)

const numbers = [1, 2, 3, 4]
const copyNumbers = [...numbers]
console.log(numbers)
console.log(copyNumbers)