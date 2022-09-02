const createDesign = `
    <h2>Create New Record</h2>
    <br/><br/>
    <form>
            <div class="form-group">
                <label for="txtName">Name:&nbsp;</label>
                <input class="form-control" type="text" name="txtName" id="txtName" placeholder="enter name" />
            </div>
            <div class="form-group">
                <label for="txtLocation">Location:&nbsp;</label>
                <input class="form-control" type="text" name="txtLocation" id="txtLocation"
                    placeholder="enter location" />
            </div>
            <div style='text-align:center;margin:5px;'>
                <input type="button" value="Add" class="btn btn-primary" id='btnAdd'/>
            </div>
    </form>
`

function create() {
    return {
        view: createDesign,
        controller: () => {
            const onAddBtnClicked = async () => {
                console.log('called')
                const nameTxt = document.getElementById('txtName')
                const locationTxt = document.getElementById('txtLocation')

                try {
                    const res = await addRecord(new Person(nameTxt.value, locationTxt.value))
                    if (res) {
                        window.alert('record addded successfully')
                    } else {
                        window.alert('could not add the record')
                    }
                } catch (error) {
                    window.alert(error.message)
                }
            }
            document.getElementById('btnAdd').addEventListener('click', async () => {
                await onAddBtnClicked()
            })

        }
    }
}