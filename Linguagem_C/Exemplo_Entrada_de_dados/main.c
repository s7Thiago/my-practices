#include <stdio.h>
#include <stdlib.h>

int main() {

    char nome[31], sobrenome[31], nascimento[11];
    int idade;

    printf("Digite o primeiro nome: ");
    gets(nome);

    printf("Agora o sobrenome: ");
    gets(sobrenome);

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
