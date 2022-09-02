const addRecord = async (newObj) => {
    try {
        const people = await getStorage()
        let newPersonId = 100
        if (people.length > 0) {
            const lastPerson = people[people.length - 1]
            newPersonId = lastPerson.id + 1
        }
        const newPersonObj = {
            ...newObj,
            id: newPersonId
        }
        people.push(newPersonObj)
        await saveDataInStorage(people)
        return true
    } catch (error) {
        throw error
    }
}

const deleteRecord = async (id) => {
    const people = await getStorage()
    if (people.length > 0) {
        const foundIndex = exists(id)
        if (foundIndex === -1) {
            throw new Error(`person with id ${updateObj.id} is not found`)
        } else {
            people.splice(foundIndex, 1)
            await saveDataInStorage(people)
            return true
        }
    } else {
        throw new Error(`no records present`)
    }
}

const updateRecord = async (updateObj) => {
    const people = await getStorage()
    if (people.length > 0) {
        const foundIndex = exists(updateObj.id)
        if (foundIndex === -1) {
            throw new Error(`person with id ${updateObj.id} is not found`)
        } else {
            // const found = people.find(p => p.id === personObj.id)
            // const updatatableObj = {
            //     ...found,
            //     ...personObj
            // }
            // people.splice(foundIndex, 1, updatatableObj)
            people.splice(foundIndex, 1, updateObj)
            await saveDataInStorage(people)
            return true
        }
    } else {
        throw new Error(`no records present`)
    }
}

const fetchRecordById = async (id) => {
    const people = await getStorage()
    if (people.length > 0) {
        const foundIndex = exists(id)
        if (foundIndex === -1) {
            throw new Error(`person with id ${updateObj.id} is not found`)
        } else {
            return people.find(p => p.id === id)
        }
    } else {
        throw new Error(`no records present`)
    }
}

const fetchRecords = async () => {
    const people = await getStorage()
    if (people.length > 0)
        return [...people]
    else
        throw new Error('no records present')
}
