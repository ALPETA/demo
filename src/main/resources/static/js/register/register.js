const submit = document.getElementById('submit');
const overlap = document.getElementById('overlap');


submit.addEventListener("click", function (){
    submitUser();
})

overlap.addEventListener("click", function (){
    overlapId();
})

//아이디 중복확인
function overlapId(){
    const userId = document.getElementById('userId').value;

    fetch("/register/getOverlapId", {
        method: 'POST',
        headers:{
            'Content-Type': 'application/json',
            "X-Requested-With": "XMLHttpRequest"
        },
        body: JSON.stringify({
            userId:userId,
        }),
    })
        .then(function (response){
            return response.json();
        })
        .then((data) => {
            console.log(data);
            if(data.overlap) {
                alert("사용할 수 없는 아이디입니다.");
                document.getElementById('userId').classList.add("is-invalid")
            }else{
                alert("사용 가능한 아이디입니다.");
                document.getElementById('userId').classList.remove("is-invalid")
            }
        })
        .catch((error) => {
            console.error(error);
        })
}

//비밀번호 확인
function checkPassword(){

}

//이름 확인
function checkName(){

}

//회원가입
function submitUser(){
    const userId = document.getElementById('userId').value;
    const passwd = document.getElementById('passwd').value;
    const usrNm = document.getElementById('usrNm').value;
    const email = document.getElementById('email').value;
    const phonNo = document.getElementById('phonNo').value;
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
        const responseClone = response.clone();
        console.log(responseClone);
        return response.json();
    })
        .then((data) => {
            console.log(data);
            if(alert("가입에 성공했습니다.")) location.href="/login";
        })
        .catch((error) => {
            console.error(error);
            if(alert("가입에 실패했습니다 관리자에게 문의 바랍니다.")) location.href="/main";
        })
}
