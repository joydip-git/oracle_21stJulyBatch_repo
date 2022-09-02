const divide = (a, b) => {
    const p = new Promise(
        //excutor function as an argument
        (resolveFn, rejectFn) => {
            const res = a / b
            if (res === Infinity) {
                //throw new Error('can not divide by zero')
                rejectFn(new Error('can not divide by zero'))
            } else {
                //return res
                resolveFn(res)
            }
        }
    )
    return p
}

const promiseObj = divide(12, 0)
promiseObj
    .then(
        (data) => {
            console.log(data)
        },
        (err) => {
            console.log(err.message)
        }
    )

console.log('continue')
console.log('continue')
console.log('continue')
console.log('continue')
console.log('continue')
console.log('continue')
