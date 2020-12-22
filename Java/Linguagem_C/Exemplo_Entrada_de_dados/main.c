#include <stdio.h>
#include <stdlib.h>

int main() {

    char nome[31], sobrenome[31], nascimento[11];
    int idade;

    printf("Digite o primeiro nome: ");
    //Aqui, poderiamos colocar um gets(nome); mas para impedir que
    //esta string receba outras coisas alem do primeiro nome. Neste
    //caso, usaremos  scanf("%s", nome); Este comando por padrao para
    //a recepcao de dados assi que encontra o primeiro caractere de espaco
    scanf("%s", &nome);

    //Precisamos sempre limpar o buffer para evitar problemas, como por exemplo,
    //A proxima entrada ser ignorada.
    fflush(stdin);

    printf("Agora o sobrenome: ");
    //O operador [^\n] diz faz a scanf() parar de pegar a string
    //somente quando uma NEW_LINE eh encontrada, alterando assim
    //o comportamento padrao (parar quando encontrar um caractere
    //de espaço);
    scanf("%[^\n]", sobrenome);
    //O que tambem poderia ser feito nalinha anterior, eh modificar
    //o numero de caracteres adicionando um numero entre os simbolos
    //%[ assim: scanf("%100[^\n]", sobrenome);
    //neste caso, a nossa entrada estaria limitada a 100 caracteres.

    printf("E agora a idade: ");
    scanf("%d", &idade);

    fflush(stdin);

    printf("Qual a data de nascimento: ");
    gets(nascimento);

    printf("\n\nNome completo: %s %s", nome, sobrenome);
    printf("\nIdade: %d", idade);
    printf("\nData de nascimento: "); puts(nascimento);

    return 0;
}
