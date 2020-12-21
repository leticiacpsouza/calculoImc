#  Classe para Cálculo do IMC
Tarefa prática do curso de Orientação a Objetos com  Java ofericido pelo Instituto Tecnológico da Aeronáutica (ITA).

## Enunciado ##

Implemente uma classe chamada **Paciente** que possui um construtor que recebe o seu peso em quilos e sua altura em metros, ambos utilizando o tipo double. 
Crie um método chamado **calcularIMC()** que calcula o índice de Massa Corporal de acordo com a fórmula IMC = peso (quilos) / (altura * altura (metros)). 
Crie também um método chamado **diagnostico()** que utiliza o método **calcularIMC()** e retorna uma String de acordo com as seguintes faixas de valor:

Baixo peso muito grave = IMC abaixo de 16 kg/m²

Baixo peso grave = IMC entre 16 e 16,99 kg/m²

Baixo peso = IMC entre 17 e 18,49 kg/m²

Peso normal = IMC entre 18,50 e 24,99 kg/m²

Sobrepeso = IMC entre 25 e 29,99 kg/m²

Obesidade grau I = IMC entre 30 e 34,99 kg/m²

Obesidade grau II = IMC entre 35 e 39,99 kg/m²

Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²

Implemente uma classe chamada **Principal (Main)** em que se criam 3 instâncias da classe Paciente com valores diferentes e se imprime no console o resultado dos dois métodos criados.

