const exists = (id) => {
    const people = getStorage()
    return people.findIndex(p.id === id)
}