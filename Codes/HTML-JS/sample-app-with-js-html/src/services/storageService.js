const getStorage = async () => {
    var records = sessionStorage.getItem('records')
    if (records) {
        return []
    }
    return JSON.parse(records)
}

const saveDataInStorage = async (recordsToSave) => {
    sessionStorage.setItem(JSON.stringify(recordsToSave))
}

const removeStorage = async () => {
    if (sessionStorage.getItem('records')) {
        sessionStorage.removeItem('records')
    }
}