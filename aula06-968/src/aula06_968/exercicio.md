
1 - Escreva uma função chamada calcularMedia, que recebe uma lista de números e retorna a média aritmética dos elementos da lista. Certifique-se de que a função seja pura, ou seja, não tenha efeitos colaterais.


2 - Escreva uma função chamada lerEntradaUsuario, que solicita ao usuário um valor de entrada através do console e retorna o valor digitado. Essa função interage com o ambiente externo e, portanto, é considerada impura.


3 - Escreva uma função chamada calcularDobroDaSoma, que recebe dois números inteiros, calcula a soma deles e retorna o dobro da soma. Use apenas funções puras para implementar essa lógica, evitando efeitos colaterais.


4 - Escreva uma função chamada obterDataHoraAtual, que retorna a data e a hora atuais. No entanto, para garantir o isolamento, a função deve receber uma instância de relógio como parâmetro. Dessa forma, você pode injetar um relógio específico nos seus testes e manter a função principal como impura.


5 - Escreva uma função chamada adicionarElemento, que recebe uma lista e um elemento e retorna uma nova lista com o elemento adicionado ao final. Certifique-se de que a função não modifique a lista original, mas sim crie uma nova lista com o elemento adicionado.


6 - Escreva uma função chamada escreverArquivo, que recebe um nome de arquivo e uma mensagem como parâmetros e escreve a mensagem em um arquivo com o nome fornecido. Essa função tem efeitos colaterais de I/O e, portanto, é considerada impura.