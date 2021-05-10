# BGUPT

No âmbito da unidade curricular de Engenharia de Software foi-nos proposto reproduzir o atual sistema de gestão da biblioteca da universidade portucalense (BGUPT). E por isso, 
primeiramente foi desenvolvido os diagramas de pacotes, híbrido e de classes para que fosse mais fácil perceber os intervenientes do mesmo. A partir do diagrama de classes alteramos
a estrutura do mesmo de modo a ser utilizado design patterns como foi o Factory na criação de Livros e Utilizadores, que mostrou ser uma mais valia no desenvolvimento do projeto pois
facilitou isso a inserção de novos tipos de livros/utilizadores sem mexer muito na estrutura ja feita. Outra grande vantagem do uso dos padrões é que a criação dos objetos fica fora de
qualquer alcançe do utilizador usando a interface como meio para a criação de todos os objetos.

Nas classes apresentadas, apenas estão a funcionar 3 requisitos funcionais nomeadamente: Registar Utilizador, Registar Publicação e por fim, Pesquisar por Titulo, Autor e Editora.
