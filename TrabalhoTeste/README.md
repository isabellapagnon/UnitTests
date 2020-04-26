
Casos de Teste:

Em nosso projeto, realizamos doze casos de teste para teste de programa. Nove testes foram utilizando particionamento do espaço de entrada com valor limite em que testamos o valor limite máximo e valor limite mínimo da entrada, que eram o status e o saldo da conta, para testar se o nosso programa está tendo o comportamento esperado e está transformando as contas em Silver, Gold e Platinum do jeito certo. Os três testes restantes são testes de exceção em que testamos entradas inválidas em nossos métodos para verificar se o programa está jogando a exceção corretamente.

Relatório de Defeitos:

Durante a realização do nosso programa tivemos alguns defeitos e dificuldades que conseguimos superar e outros não. O que não conseguimos fazer funcionar foi o INVALID_OPER_EXCEPTION e para contornar esse problema utilizamos a IllegalArgumentException que tem um comportamento similar ao anterior, outra parte do programa que não conseguimos realizar é o acréscimo a cada depósito feito dependendo do status da conta por não conseguimos achar um jeito de programar esta parte sem comprometer as outras partes do nosso programa. Já um problema que conseguimos superar foi o teste de ocorrência de uma exceção que tivemos dificuldade na hora de seguir o exemplo mas depois descobrimos aonde estávamos errando.

Análise de Cobertura de Código:

Class (1/1): 100%
Method (3/4): 75%
Line (24/25): 96%

O CodeCoverge não está 100% pois o único método não testado diretamente é o getSaldo, pelo fato deste já estar sendo testado indiretamente por outros casos de teste existentes. Não adicionamos mais casos de teste pois achamos satisfatório o resultado que obtivemos com os que temos já que o CodeCoverage da Classe estar em 100%.


