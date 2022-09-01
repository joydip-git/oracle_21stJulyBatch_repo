function filterValues(arr, callbackFn) {
    const result = []
    for (let index = 0; index < arr.length; index++) {
        const element = arr[index];
        if (callbackFn(element)) {
            result.push(element)
        }
    }
    return result
}
const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0];
// const evenLogic = function (num) {
//     return num % 2 === 0
// }
// const evenLogic = (num) => {
//     return num % 2 === 0
// }
const evenLogic = (num) => num % 2 === 0

const evenNumbers = filterValues(numbers, evenLogic)
console.log(evenNumbers)

function person(name, id, salary) {
    this.name = name
    this.id = id
    this.salary = salary
}
const people = [
    new person('anil', 1, 1000),
    new person('sunil', 2, 2000),
    new person('joydip', 3, 3000)
]
const salaryFilterLogic = function (p) {
    return p.salary > 2500
}
const filteredPeople = filterValues(people, salaryFilterLogic)
console.log(filteredPeople)

function divide(first, second, fnRef) {
    setTimeout(
        function () {
            const result = first / second
            if (result === Infinity) {
                const err = new Error("can't divide by zero")
                fnRef(err)
            }
            fnRef(undefined, result)
        },
        2000
    )
}
function add(a, b) {
    return a + b
}

function onCompletion(err, data = undefined) {
    if (err !== undefined) {
        console.log(err.message)
    }
    if (data) {
        console.log(data)
    }
}

divide(12, 3, onCompletion)
const addRes = add(12, 3)
console.log(addRes)