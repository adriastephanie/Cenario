# language: pt
Funcionalidade: Realizar compra no site
	Como um usuário
	Eu quero selecionar um produto 
	Para adicionar no carrinho

Cenário: Adicionar produto no carrinho com sucesso
	Dado que estou acessando a aplicação
	Quando informar o produto "fone de ouvido" no campo buscar
	E seleciono buscar
	E retorna a busca 
	E seleciono o produto "fone de ouvido"
	E clicar no botão adicionar na sacola
	Então deve adicionar produto no carrinho com sucesso
	
Cenário: Tentativa de pesquisa inválida/produto não encontrado
	Dado que estou acessando a aplicação
	Quando informar o produto "fonnne de ouvido" no campo buscar
	E seleciono buscar
	Então o sistema irá mostrar que a busca não foi encontrada

Cenário: Tentativa de compra sem estoque
	Dado que estou acessando a aplicação
	Quando informar o produto "fone de ouvido" no campo buscar
	E seleciono buscar
	E retorna a busca 
	E seleciono o produto "fone de ouvido"
	E clicar no botão adicionar na sacola
	E o estoque estiver com valor 0
	Então o sistema deve alertar que o produto não tem em estoque
	
Cenário: Tentativa de compra quantidade superior ao do estoque
	Dado que estou acessando a aplicação
	Quando informar o produto "fone de ouvido" no campo buscar
	E seleciono buscar
	E retorna a busca 
	E seleciono o produto "fone de ouvido"
	E o estoque for menor que o valor quantidade  
	Então o sistema deve informar que a quantidade é superior a quantidade no estoque atual
	
Cenário: Tentativa de compra quantidade do produto não informada 
	Dado que estou acessando a aplicação
	Quando informar o produto "fone de ouvido" no campo buscar
	E seleciono buscar
	E retorna a busca 
	E seleciono o produto "fone de ouvido"
	E a quantidade estiver com valor 0 
	Então o sistema deve informar que a quantidade deve ser maior que 0
	