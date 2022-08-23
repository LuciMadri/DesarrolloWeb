let intro = document.querySelector('.intro');
let logo = document.querySelector('.logo-header');
let logoSpan = document.querySelectorAll('.logo');

window.addEventListener('DOMContentLoaded', () => {

    setTimeout(() => {

        logoSpan.forEach((span, idx) => {
            setTimeout(() => {
                span.classList.add('active');
            }, (idx + 1) * 400)
        });

        setTimeout(() => {
            logoSpan.forEach((span, idx) => {


                setTimeout(() => {
                    span.classList.remove('active');
                    span.classList.add('fade');
                }, (idx + 1) * 50)
            })
        }, 2000);

        setTimeout(() => {
            intro.style.top = '-100vh';
        }, 2300)

    })

})












//const text = document.querySelector(".fancy");
//const strText = text.textContent;
//const splitText = strText.split("");
//
//text.textContent = "";
//
//for (let i = 0; i < splitText.length; i++) {
//    text.innerHTML += "<span>" + splitText[i] + "</span>";
//}
//
//let char = 0;
//let timer = setInterval(onTick, 50);
//
//function onTick() {
//    const span = text.querySelectorAll('span')[char];
//    span.classList.add('fade');
//    char++
//    if (char === splitText.length) {
//        complete();
//    }
//}
//
//function complete(){
//    clearInterval(timer);
//    timer = null;
//    
//}