#include <stdio.h>
#include <stdlib.h>

int main(){

 //

 char player[256];
 char player2[256];

 printf("Player1 sua vez...: ");
 scanf("%s", &player);

 printf("\nPlayer 2 sua vez...: ");
 scanf("%s", &player2);

 printf("\nCalculando Resultado...\n");



 if(strcmp(player,"papel") == 0){

     if(strcmp(player2, "papel")==0){
      printf("\nEmpate");
     }else if(strcmp(player2,"tesoura")==0){
        printf("\nPlayer 2 ganhou tesoura corta papel");
        printf("\nPlayer 1 perdeu!!!*_*");
     }else if(strcmp(player2,"pedra")==0){
        printf("\nPlayer2 perdeu papel embrulha pedra");
        printf("\nPlayer 1 ganhou!!!");
     }else{
      printf("\ninvalido");
     }

 }else if(strcmp(player, "tesoura") ==0){

     if(strcmp(player2, "papel")==0){
      printf("\nPlayer2 perdeu tesoura corta papel");
      printf("\nPlayer 1 ganhou!!!");
     }else if(strcmp(player2,"tesoura")==0){
        printf("\nEmpate");
     }else if(strcmp(player2,"pedra")==0){
        printf("\nPlayer2 perdeu pedra quebra tesoura");
        printf("\nPlayer 1 ganhou!!!");
     }else{
      printf("\nInvalido");
     }

 }else if(strcmp(player, "pedra") ==0){

     if(strcmp(player2, "papel")==0){
      printf("\nPlayer2 ganhou papel embrulha pedra");
      printf("\nPlayer1 perdeu!!!*_*");
     }else if(strcmp(player2,"tesoura")==0){
        printf("\nPlayer 2 perdeu pedra esmaga tesoura");
        printf("\nPlayer 1 ganhou!!!");
     }else if(strcmp(player2,"pedra")==0){
        printf("\nPlayer2 perdeu papel embrulha pedra");
        printf("\nPlayer1 ganhou!!!");
     }else{
      printf("Invalido");
     }

 }else{
  printf("Invalido");
 }

return 0;

}
