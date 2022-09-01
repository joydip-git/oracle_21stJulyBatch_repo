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

//find(callback){
// let found
// for (let index = 0; index < people.length; index++) {
//     const element = people[index];
//     if (callback(element)) {
//         found = element
//         break;
//     }
// }
//return found
//}
const findById = function (p) {
    return p.id === 1
}
const filterBySalary = function (p) {
    return p.salary > 1500
}
let found = people.find(findById)
let founIndex = people.findIndex(findById)

//filter(callback){
// let found=[]
// for (let index = 0; index < people.length; index++) {
//     const element = people[index];
//     if (callback(element)) {
//        found.push(element)
//     }
// }
//return found
//}
let filtered = people.filter(filterBySalary)
console.log(found)

const numbers = [1, 2, 3, 4]
//[5,10,15,20]

const transformedArray = numbers.map(
    function (num) {
        return num * 5
    }
)
console.log(transformedArray)

const sortedPeople = people.sort(
    function (p1, p2) {
        return p2.salary - p1.salary
    }
)
console.log(sortedPeople)

