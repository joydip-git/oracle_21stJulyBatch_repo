function check() {
    //Cannot access 'a' before initialization
    // console.log(a)
    let a
    a = 10
    console.log(a)
    for (let i = 0; i < 1; i++) {
        let a //_a
        a = 20 //_a=20
        console.log(a)//_a
    }
    console.log(a)
}
check()