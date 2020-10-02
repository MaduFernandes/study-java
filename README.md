# Repositório de Estudo

![alt text](https://s2.glbimg.com/2VjTff0ctPGHDSr2IUUAmtiIG0s=/850x446/s2.glbimg.com/vME2Bq4OSpm6f6IE16BhcVLR98U=/695x0/s.glbimg.com/po/tt2/f/original/2014/11/14/java-logo.jpg)

## Conteúdo estudado

- [x] Herança
- [x] Overload
- [ ] Interface
- [x] Getters e Setters.
- [x] Encapsulamento.
- [ ] Polimorfismo.

### Atividade 01

- Crie uma classe **Pessoa** que tenha como atributos **nome** e **idade**.
- Crie um método chamado getSalarioFerias() que tenha como parâmetro um **Double** e retorne um **Double**.
- Crie duas subclasses chamadas **Estagiario** e **Gerente**.
- Estagiário tem que ter como atributo **instituicao**.
- Gerente tem que ter como atributo **endereco**.
- Crie uma instância de **Estagiario** e **Gerente** na classe **Pessoa**.
- No método getSalarioFerias(), faça o calculo do sálario férias que o **Estagiario** vai receber sabendo-se que o salário base dele é **800,00 reais** e do **Gerente** que é **12.000,00 reais**, usando:
```
salario_base * 1.33
```
- Na classe **Main** imprima os dados **Nome**, **Idade** e **Salario Ferias**

### Atividade 02

- Crie uma classe chamada **Pessoa**, com os atributos **nome**, **data de
nascimento** e **altura**. 
- Crie um método para imprimir todos dados de uma pessoa. 
- Crie um método para calcular a idade da pessoa.

#### Bibliotecas Usadas:

- java.util.Calendar

### Atividade 03

- Crie um método chamado **initVetor**, que vai solicitar ao usuário digitar o tamanho de um vetor a ser criado.
- Se o usuário digitar um tamanho menor ou igual a **0**, deverá solicitar de novo um tamanho válido para o vetor, se o tamanho for válido, então deve solicitar dados ao usuário para preencher o vetor com valores inteiros em todas as posições.
- Criar um método chamado **invVetor** que inverte o valor do vetor criado. **OBS: a inversão do vetor deve ser feita SEM usar outro vetor intermediário**.
- Criar um método chamado **evenVetor** que determina quais são os números pares do vetor.
- Criar um novo vetor com todos os números pares encontrados.
- Crie um método chamado **printVetor**, o qual vai imprimir um vetor passado como parâmetro.
- Crie um método **MAIN** onde será usado todos os outros métodos anteriores.