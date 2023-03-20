var btnToggle = document.querySelector('.navbar-toggler');
var nabBar = document.querySelector('.navbar-collapse');
var dropdownToggle = document.querySelector('.dropdown-toggle');
var dropdownMenu = document.querySelector('.dropdown-menu');

// 상단 반응형 이벤트
btnToggle.addEventListener('click', function (){
    if(btnToggle.classList.contains('collapsed')){
        btnToggle.classList.remove('collapsed');
        btnToggle.setAttribute('aria-expanded', 'false');
        nabBar.classList.add('show');
    }else{
        btnToggle.classList.add('collapsed');
        btnToggle.setAttribute('aria-expanded', 'true');
        nabBar.classList.remove('show');
    }
})

// 상단 드롭다운 이벤트
dropdownToggle.addEventListener('click', function (){
    if(dropdownToggle.classList.contains('show')){
        dropdownToggle.classList.remove('show');
        dropdownToggle.setAttribute('aria-expanded', 'false');
        dropdownMenu.classList.remove('show');
        dropdownMenu.removeAttribute('data-bs-popper');
    }else{
        dropdownToggle.classList.add('show');
        dropdownToggle.setAttribute('aria-expanded', 'true');
        dropdownMenu.classList.add('show');
        dropdownMenu.setAttribute('data-bs-popper', 'static');
    }
})