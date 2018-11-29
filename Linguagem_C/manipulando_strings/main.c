#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>

int main() {
    //Teste 1: Imprimindo cadeia de caracteres atribuida a uma variavel:
    char *stringA = "Thiago Sousa da Silva";
    printf("\n\nValor de stringA: %s\n\n", stringA);

    //Teste 2: imprimindo caracteres no formato ASCII:
    char charA = 78;
    printf("\nValor de charA: %c\n\n", charA);

    //Teste 3: Percorrendo a string (que eh um vetor de char):
    printf("\n----------------------------------------------------------\n");
    char palavra[10] = "Linguagem";
    for(int i = 0; i < strlen(palavra); i++) {
        printf("Valor do elemento %d da string: %c\n", i, palavra[i]);
    }
    //getch();
    printf("\n----------------------------------------------------------\n");

    //Teste 4: Imprimindo cadeia de caracteres recebida do teclado:
    //A funcao gets() pega tudo até aparecer uma new line \n, inclusive
    // nada. Ou seja, se você der um ENTER, a gets() vai armazenar esse
    //enter na string.
    char stringB[100];
    printf("Digite um valor para stringB: ");
    gets(stringB);
    printf("\nValor de stringB: %s\n\n", stringB);

    //Teste 5: exemplo de operacao com string (contando as vogais):
    int qtdeVogais = 0;
    for(int i = 0; i < strlen(stringB); i++) {
        if(
           (stringB[i] == 'a') || (stringB[i] == 'A') ||
           (stringB[i] == 'e') || (stringB[i] == 'E') ||
           (stringB[i] == 'i') || (stringB[i] == 'I') ||
           (stringB[i] == 'o') || (stringB[i] == 'O') ||
           (stringB[i] == 'u') || (stringB[i] == 'U')
           ) {
            qtdeVogais++;
        }
    }
    printf("\nA string \"%s\" tem %d vogais\n", stringB, qtdeVogais);

    //

    return 0;
}
