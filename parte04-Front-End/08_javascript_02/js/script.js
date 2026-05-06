const form = document.querySelector('form');

form.addEventListener('submit', function(event) {
    //anula submit
    event.preventDefault();

    //declaraçao de variaveis
    let nome = document.querySelector('#nome').value;

    //exibe a caixa de dialogp
    alert(nome);

    //reseta o formulario
    form.reset();

});