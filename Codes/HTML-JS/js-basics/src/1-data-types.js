var x = 10
var res = x.toExponential(2);
console.log(res)
console.log(typeof x)
var name = 'joydip'
console.log(typeof name)
var bool = true
console.log(typeof bool)
var arr = [1, 2, 3, 4]
console.log(typeof arr)
var obj = {
    //value properties
    name: 'joydip',
    id: 1,
    //functional properties
    print: function () {
        return this.name + ' ' + this.id
    }
}
console.log(typeof obj)
console.log(obj.print())