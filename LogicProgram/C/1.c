#include <stdio.h>
#include <stdlib.h>

int main(){

int entrada = 20;
int hora_atual = 20;
int hora_cinema = 30;
int hora_validada = hora_cinema + 30;

if(hora_atual > hora_validada){
 printf("Passou o tempo limite");
}else if(hora_atual < hora_cinema - 30){
 printf("Nem abriu a porta")
}else{
    printf("O horario está certo! Pode entrar!");
}

 return 0;

}
