const numbers = [10, 20, 30]

//adding new values
numbers.push(40)
numbers.push(50, 60, 70)
console.log(numbers)

//slicing certian values
const result = numbers.slice(0, 4)
console.log(result)
console.log(numbers)

//deletion
var deleted = numbers.splice(0, 2)
console.log(deleted)
console.log(numbers)

//update
var deletedValues = numbers.splice(0, 1, 3)
console.log(deletedValues)
console.log(numbers)


