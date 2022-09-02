const divide = (a, b, callback) => {
    setTimeout(
        () => {
            const res = a / b
            if (res === Infinity) {
                callback(new Error('can not divide by zero'), undefined)
            } else
                callback(undefined, res)
        },
        500
    )
}
divide(12, 0, (err, data) => {
    if (err)
        console.log(err.message)

    if (data)
        console.log(data)
})

console.log('continue further operation')
console.log('continue further operation')
console.log('continue further operation')
console.log('continue further operation')
console.log('continue further operation')
console.log('continue further operation')