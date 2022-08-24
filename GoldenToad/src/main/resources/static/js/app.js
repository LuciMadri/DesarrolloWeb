// Nuestro selector                 es nuestra splash screen
let intro = document.querySelector('.intro');

//Otro selector                   para el contenedor de la frase
let logo = document.querySelector('.logo-header');

//Otro selectro                   para la frase del logo
let logoSpan = document.querySelectorAll('.logo');


//El trigger de la funcion cuando la pagina haya sido totalmente cargada
window.addEventListener('DOMContentLoaded', () => {

//Aqui hacemos algunos metodos para ejecutar las animaciones 
    setTimeout(() => {

    //Aplicamos la animacion por cada span 
    //Tenemos dos parametros, uno para la propiedad span
    //Otro para el index, ya que tenemos dos: Span 0, Span1
        logoSpan.forEach((span, idx) => {
            
            //Aqui basicamente estamos animando la mitad de la palabra 
            // Y la otra mitad, por eso multiplicamos por 400m, el primer 
            //Span 0 = 400m , Span 1 = 800mm. He aqui el cambio de movimiento
            setTimeout(() => {
                //Aqui añadimos la clase actice
                span.classList.add('active');
                
                //Aqui sumamos uno porque sino daria 0 por el idx 0
            }, (idx + 1) * 400)
        });

        setTimeout(() => {
            logoSpan.forEach((span, idx) => {


                setTimeout(() => {
                    
                    //Aqui removemos la clase active que habiamos añadido.
                    span.classList.remove('active');
                    
                    // Aqui añadimos la clase fade off para "desaparecer" el 
                    // Splash screen 
                    span.classList.add('fade');
                    
                    //Aqui hacemos lo mismo, multiplicamos la animacion del span
                    //Por 50mm
                    
                }, (idx + 1) * 50)
            })
            //Aqui establecemos el tiempo que dura la animacion.
        }, 2000);

        setTimeout(() => {
            
            //con este metodo subimos el splash screen -100vh hacia arriba
            intro.style.top = '-100vh';
            
            //este es el tiempo de duracion de desaparicion
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