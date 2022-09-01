//function main(){
var x = 100
function outer() {
    var a = 10
    function inner() {
        var b = 20
        var res = x + a + b
        console.log(res)
    }
    return inner
}
var innerFn = outer();
innerFn()
//}
//main()

function resize(choice, length, width) {
    switch (choice) {
        case 1:
            function resizeText() {
                var txt = document.getElementById('txtValue')
                // txt.style.length = length
                // txt.style.width = width
                txt.setAttribute('style', `height:${length}px;width:${width}px`)
            }
            return resizeText;
            break;

        case 2:
            function resizeBtn() {
                var btn = document.getElementById('btnClick')
                // txt.style.length = length
                // txt.style.width = width
                btn.setAttribute('style', `height:${length}px;width:${width}px`)
            }
            return resizeBtn;
            break;
        default:
            function resizeCommon() {
                var txt = document.getElementById('txtValue')
                var btn = document.getElementById('btnClick')
                btn.setAttribute('style', `height:${length}px;width:${width}px`)
                btn.setAttribute('style', `height:${length}px;width:${width}px`)
            }
            return resizeCommon
            break;
    }
}

// document.getElementById('radioText').addEventListener(
//     'change',
//     function () {

//     })
// document.getElementById('radioBtn')

function onChangeOfRadio() {
    var radioText = document.getElementById('radioText')
    var radioBtn = document.getElementById('radioBtn')
    if (radioText.checked) {
        var resizeTxt = resize(1, 50, 200)
        resizeTxt()
    }
    if (radioBtn.checked) {
        var resizeBtn = resize(2, 60, 150)
        resizeBtn()
    }
}