var btnToggle = document.querySelector('.navbar-toggler');
var nabBar = document.querySelector('.navbar-collapse');

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