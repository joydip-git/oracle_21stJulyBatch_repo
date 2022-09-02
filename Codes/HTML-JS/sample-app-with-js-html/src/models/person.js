class Person {
    constructor(name, location, id = 0) {
        this.name = name
        this.id = id
        this.location = location
    }
    print() {
        return `Name: ${this.name}, Id:${this.id}, Location:${this.location}`
    }
}