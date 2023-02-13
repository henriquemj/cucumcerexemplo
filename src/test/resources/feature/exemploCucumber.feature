#language:pt
Funcionalidade: Testes exemplo Cucumber
Cenário: Teste cucumber Amazon

Dado que esteja na pagina: "http://www.amazon.com.br"
Quando  fizer a busca pelo produto: "Iphone 14 pro max"
Então vou verificar se o valor está acima de "R$10.706,40"