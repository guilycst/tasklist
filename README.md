# tasklist

## Requerimentos:

1) Maven 3.5.3 ou versão maior
2) Adicionar o maven no path do SO
3) MySQL 5.7.21 ou versão maior
4) No MySQL, criar schema com o nome **tasklist**.
5) No arquivo application.properties, estão definidas a propriedades:
  - spring.datasource.url=jdbc:mysql://localhost:3306/tasklist
  - spring.datasource.username=root
  - spring.datasource.password=admin
  
  Caso o **endereço do banco**, **nome do usuario** ou **senha** estejam diferentes no seu ambiente, se faz necessário atualizar as propriedades acima de acordo.
  
## Executando

1) A aplicação vai usar a porta **8080**, tenha certeza que ela esteja livre.
2) Na raiz do projeto, executar o comando **mvn spring-boot:run** com seu CLI preferido.
3) Se tudo for bem sucedido, deve ser possível acessar a tasklist no endereço http://localhost:8080/

## Usando a aplicação:
De acordo com os requisitos definidos no desafio:

1) Adicionar novas tarefas;
> Utilizar o input **'TAREFA'** e acionar o botão **'+'**

2) Marcar e desmarcar o status de concluído;
> Após adicionar pelo menos uma tarefa, na lista de **'SUAS TAREFAS'**, acionar o checkbox.

3) Editar o conteúdo da task;
> Na lista **'SUAS TAREFAS'**, o conteúdo se torna editável ao realizar um click no texto da tarefa. Salva ao sair do campo.

4) Deletar uma task;
> Na lista **'SUAS TAREFAS'**, do lado de cada um dos itens há um botão **'-'**. Acionar o botão remove a tarefa correspondente.



