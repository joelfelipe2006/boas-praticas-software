## Questão final

**1. Qual era o principal problema do código original?**
Os nomes de variáveis não eram descritivos (n, a, b, c), o que dificultava entender o que
cada valor representava. Além disso, toda a lógica ficava concentrada no método main, sem
nenhuma separação de responsabilidades, e não havia padronização nem qualquer forma de
documentação do código.

**2. Quais melhorias você realizou?**
Renomeei as variáveis para nomes que expressam seu significado (nomeAluno,
notaPrimeiroBimestre, notaSegundoBimestre, media, situacaoAluno); dividi o código em
métodos com responsabilidades específicas (calcularMedia, verificarSituacaoAluno,
apresentarResultado); extraí a nota mínima de aprovação para uma constante
(MEDIA_MINIMA_APROVACAO), eliminando o "número mágico" 6; renomeei a classe de Sistema para
AvaliacaoAluno, deixando claro o seu propósito; e padronizei a nomenclatura (PascalCase para a
classe, camelCase para métodos e variáveis) e a indentação em todo o arquivo.

**3. Como a modularização facilitou a organização do código?**
Cada método passou a ter uma única responsabilidade — calcular, verificar a situação e exibir o
resultado —, o que deixou o fluxo do main muito mais curto e claro. Isso também facilita testar,
reutilizar e alterar cada parte isoladamente, sem risco de afetar as demais, e faz o código se
auto-explicar pelos nomes dos métodos, reduzindo a necessidade de comentários.

**4. Como o Git ajudou a controlar as alterações realizadas no sistema?**
O Git permitiu registrar o código original em um commit próprio antes de qualquer alteração,
preservando um ponto de retorno seguro. A criação da branch melhoria-boas-praticas isolou as
mudanças do código estável na main, permitindo experimentar sem risco. O histórico de commits
documenta, passo a passo, o que foi alterado e por quê, e o Pull Request permitiu revisar todas as
diferenças antes do merge, deixando claro exatamente o que mudou entre a versão original e a
versão refatorada.