const form = document.querySelector('from');

        //arrow function (lambda)
const maioridade = () => {

        //declaraçao de variaveis
        let nome = document.querySelector('#nome').value;
        let idade = document.querySelector('#idade').value;

        //saida de dados
        if (idade >=18)  {
            document.querySelector('#result').innerHTML = nome + ' é maior de idade. ';

        }
        else {
            document.querySelector('#result').innerHTMl = nome + ' é menor de idade. ';
        }

        form.reset();
    }
        //evento

        form.addEventListener('submit', function(event){

            //anular submit
            event.preventDefault();

            //chama arrow function
            maioridade();
        });