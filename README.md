# Library

## A1-N1 
### INSTRUÇÕES PARA ENTREGA: 
- Atividade individual. 
- Os exercícios a seguir devem ser implementados, apresentados, executados, explicados. - A tela deve ser gravada com o áudio da explicação. 
- Utilize programas sem tarjas e propagandas, existem diversos softwares gratuitos para isso, como por  exemplo o OBS Studio, quicktime, etc. 
- O vídeo deve ser de no máximo 20 minutos para os 3 exercícios. 
- Grave os 3 exercícios na ordem ou faça unificação do vídeo na ordem de numeração. - O vídeo deve ser colocado o Youtube, seu link testado e enviado no ambiente em A1. - Não é permitido acelerar a gravação, logo deve ser em tempo normal. 
- A decisão de como e quais informações devem ser apresentadas será do aluno, isso faz parte da  avaliação. 
### EXERCÍCIO 1: 

#### Biblioteca App 

Você foi contratado para desenvolver um sistema de biblioteca no seu bairro.  
Sempre que o sistema for inicializado deve ser apresentado um menu que permitira que sejam  cadastrados livros. 
Seus vizinhos gostariam de retirar, devolver e doar novos livros. Para isso, você̂ deverá desenvolver  as seguintes funcionalidades, que devem ser apresentadas para o usuário através de um menu: 
- Retirar um livro: Dado a lista de livros que estão cadastrados no sistema, o usuário pode retirar  qualquer livro desde que não esteja emprestado (ou seja, esteja disponível), e em caso de sucesso,  ele fica indisponível. 
- Devolver um livro: Dado a lista de livros que o usuário retirou, ele pode devolver e em caso de  sucesso, o livro se torna disponível novamente. 
- Doar um livro: O usuário entra com as informações (Título, Autor, Ano) e o livro deve aparecer  como disponível para retirada. 
Não esqueça de registrar o nome de qual vizinho está com o livro. 

#### EXEMPLO E CONTEXTUALIZACAO DA SOLUÇÃO: 
- Funcionalidade - Retirar um livro 
- Livro selecionado: 
- Número: 00002 
- Título: Admiravel Mundo Novo 
- Autor: Adous Huxley 
- Ano: 1940 
- Status: Disponível 
- Emprestado para: 
- Após a retirada: 
- Número: 00001 
- Título: Revolução dos Bichos 
- Autor: George Orwell 
- Ano: 1945 
- Status: Indisponível 
- Emprestado para: Antônia dos Santos 

#### Funcionalidade - Devolver um livro  - Selecionar livro emprestado:  
- Número: 00003  
- Título: The Doors of Perception 
- Autor: Aldous Huxley 
- Ano: 1954 
- Status: Indisponível  
- Emprestado para: João Pedro  
- Após a devolução:  
- Número: 00003  
- Título: The Doors of Perception 
- Autor: Aldous Huxley 
- Ano: 1954 
- Status: Disponível  
- Emprestado para:  
#### Funcionalidade - Doar um livro  
- Campos para preenchimento de um novo livro:  
- Número:  
- Título:  
- Autor:  
- Ano:  
- Status:  
- Emprestado para:  
- Após o cadastro:  
- Número: 00004  
- Título: Novo livro  
- Autor: Clube dos Cinco 
- Ano: 1986 
- Status: Disponível 
- Emprestado para: 

### EXERCÍCIO 2: 
Implemente 3 projetos básicos distintos de cada tipo de relacionamento, de sua escolha: 
- Associação. 
- Agregação. 
- Composição. 
Com os códigos e execução, explique na pratica a diferença entre as três formas de relacionamento. 
### EXERCÍCIO 3: 
Faça os diagramas de classes dos 3 exemplos apresentados em aula: Treino, Locação e Lista de compras. 


-- http://thiagoccampos.blogspot.com/2012/11/projeto-biblioteca-codigo-java.html --
-- https://github.com/steppat/livraria/tree/master/src/br/com/caelum/livraria --
-- https://github.com/FelipeUmpierre/Livraria --