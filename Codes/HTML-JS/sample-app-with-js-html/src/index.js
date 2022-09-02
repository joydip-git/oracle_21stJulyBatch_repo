const loadHome = async () => {
    const homeComponent = home()
    document.getElementById('root').innerHTML = homeComponent.view
    await homeComponent.controller()
}
window.addEventListener('load', () => {
    loadHome()
})

const addNewReocrd = async () => {
    const createComponent = create()
    document.getElementById('root').innerHTML = createComponent.view
    await createComponent.controller()
}

const gotoHome = () => {
    loadHome()
}
