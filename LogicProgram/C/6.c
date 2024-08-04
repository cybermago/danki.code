char nome[256];
char sobrenome[256];
int asno_nascimento;
int idade;

printf("Qual o seu nome:");
scanf("%s",nome);

printf("\n %s", nome);
scanf("%d", &idade);

printf("%s %d",nome,idade);


char nome[256];
int idade;
printf("seu nome:");
scanf("%s",nome);

printf("sua idade:");
scanf("%d",&idade);

printf("%s \n %d", nome,idade);

printf(" \nvalidando...\n");

printf("primeira letra: %c\n", nome[0]);

if(idade >= 18){
 printf("\n adulto");
}else if(idade >= 12){
printf("\nadolescente");
}else{
printf("\ncriança");
}
