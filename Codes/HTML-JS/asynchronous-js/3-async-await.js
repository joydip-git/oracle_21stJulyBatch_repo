// async function divide(a, b) {
// const divide = async function (a, b) {
const divide = async (a, b) => {
    const res = a / b
    if (res === Infinity) {
        throw new Error('can not divide by zero')
    } else {
        return res
    }
}

//IIFE: Immediately invocable function expression
(async function () {
    try {
        const result = await divide(12, 3)
        console.log(result)
    } catch (error) {
        console.log(error.message)
    }
})()

console.log('continue')

