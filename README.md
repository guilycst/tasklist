# tasklist

## Requerimentos:

1) Maven 3.5.3 ou versão maior
2) MySQL 5.7.21 ou versão maior
2) No MySQL, criar schema com o nome **tasklist**.
3) No arquivo application.properties, estão definidas a propriedades:
  - spring.datasource.url=jdbc:mysql://localhost:3306/tasklist
  - spring.datasource.username=root
  - spring.datasource.password=admin
  
  Caso o **endereço do banco**, **nome do usuario** ou **senha do banco** estejam diferentes no seu ambiente, se faz necessário atualizar as propriedades da acima de acordo.
  
## Executando

executar o comando **mvn spring-boot:run**
