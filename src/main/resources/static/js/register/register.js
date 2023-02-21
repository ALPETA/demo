let submitForm = document.getElementById('submitUser');
let submit = document.getElementById('submit');

submit.addEventListener("click", function (){
    submitUser();
})

function submitUser(){
    let userId = document.getElementById('userId').value;
    let passwd = document.getElementById('passwd').value;
    let usrNm = document.getElementById('usrNm').value;
    let email = document.getElementById('email').value;
    let phonNo = document.getElementById('phonNo').value;
    console.log(userId,passwd,usrNm,email,phonNo)

    fetch("/register/submitUser", {
        method: 'POST',
        headers:{
            'Content-Type': 'application/json',
            "X-Requested-With": "XMLHttpRequest"
        },
        body: JSON.stringify({
            userId:userId,
            passwd:passwd,
            usrNm:usrNm,
            email:email,
            phonNo:phonNo,
        }),
    })
    .then(function (response){
        let responseClone = response.clone();
        console.log(responseClone);
        return response.json();
    })
        .then((data) => {
            console.log(data);
        })
        .catch((error) => {
            console.error(error);
        })
}
