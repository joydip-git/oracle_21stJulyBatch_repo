const homeDesign = `
        <div class="row" style="margin-top:10px;">
            <h2>Person Records</h2>
        </div>
        <br>
        <table class="table table-responsive" id="tblPeople">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Location</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
            <tbody id="tblBodyPeople">

            </tbody>
            </thead>
        </table>
    `

function home() {
    return {
        view: homeDesign,
        controller: async () => {
            const seedStorage = () => {
                saveDataInStorage([
                    new Person('anil', 'Bangalore', 1),
                    new Person('sunil', 'Chennai', 2)
                ])
            }
            const createRow = (p) => {

                const newRow = document.createElement('tr')

                const nameColumn = document.createElement('td')
                nameColumn.innerText = p.name
                const locationColumn = document.createElement('td')
                locationColumn.innerText = p.location

                const editColumn = document.createElement('td')
                const editButton = document.createElement('button')
                editButton.innerText = 'Edit'
                editButton.type = 'button'
                editButton.classList.add('btn', 'btn-primary')
                editColumn.appendChild(editButton)

                const deleteColumn = document.createElement('td')
                const deleteButton = document.createElement('button')
                deleteButton.innerText = 'Delete'
                deleteButton.type = 'button'
                deleteButton.classList.add('btn', 'btn-danger')
                deleteColumn.appendChild(deleteButton)


                newRow.appendChild(nameColumn)
                newRow.appendChild(locationColumn)
                newRow.append(editColumn)
                newRow.appendChild(deleteColumn)

                return newRow
            }
            try {
                const people = await fetchRecords()
                const tblBody = document.getElementById('tblBodyPeople')
                people.forEach(p => {
                    const row = createRow(p)
                    tblBody.appendChild(row)
                });


            } catch (error) {
                seedStorage()
                window.alert(error.message)
            }
        }
    }
}



//window.onload = showRecords
