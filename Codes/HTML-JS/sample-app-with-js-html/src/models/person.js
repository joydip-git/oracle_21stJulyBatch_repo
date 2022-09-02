class Person {
    constructor(name, id, location) {
        this.name = name
        this.id = id
        this.location = location
    }
    print() {
        return `Name: ${this.name}, Id:${this.id}, Location:${this.location}`
    }
}