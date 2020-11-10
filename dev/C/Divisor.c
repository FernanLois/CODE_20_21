#include <stdio.h>
#include <stdlib.h>

int main() {


  int numero1;
  int numero2;
  
  printf("Introduce un numero: ");
  scanf("%d", &numero1);
  printf("Introduce otro numero: ");
  scanf("%d", &numero2);
  
  printf("La division de %d/%d = %d", numero1, numero2, (numero1/numero2)); 
  system("PAUSE");
  return 0;

}