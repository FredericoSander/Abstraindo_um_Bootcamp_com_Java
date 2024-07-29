# Abstraindo um bootcamp com Java
<p align="Justify"> Este desafio de projeto tem como objetivo principal criar um sistema simples de gerenciamento de Bootcamps, onde os alunos podem se inscrever em cursos e mentorias, progredir através deles e acumular experiência. Tudo isso utilizando conceitos básicos de orientação a objetos (POO) em Java.</p>


## Pré-Requisitos

- Conhecer a sintaxe de Java<br>
- Java JDK 11 ou superior - (utilizei a JDK 17)<br>
- IDE para desenvolvimento Java (utilizei o Eclipse)<br>
- Git<br>
- Conta no GitHub<br>

## Estrutura do projeto

<p align="Justify"> O projeto está organizado em vários pacotes e classes, cada um com uma responsabilidade específica:</p>

1. Pacote Principal:

- [Classe Main](https://github.com/FredericoSander/Abstraindo_um_Bootcamp_com_Java/blob/main/src/Principal/Main.java): Este é o ponto de entrada da aplicação. Ele contém o método main onde o programa é executado.

2. Pacote br.com.dio.desafio.dominio:

- [Classe Curso](https://github.com/FredericoSander/Abstraindo_um_Bootcamp_com_Java/blob/main/src/br/com/dio/desafio/dominio/Curso.java): Representa um curso com título, descrição e carga horária.
- [Classe Mentoria](https://github.com/FredericoSander/Abstraindo_um_Bootcamp_com_Java/blob/main/src/br/com/dio/desafio/dominio/Curso.): Representa uma mentoria com título, descrição e data.
- [Classe Bootcamp](https://github.com/FredericoSander/Abstraindo_um_Bootcamp_com_Java/blob/main/src/br/com/dio/desafio/dominio/Bootcamp.java): Representa um bootcamp contendo uma lista de cursos e mentorias.
- [Classe Aluno](https://github.com/FredericoSander/Abstraindo_um_Bootcamp_com_Java/blob/main/src/br/com/dio/desafio/dominio/Alunos.java): Representa um aluno com nome, conteúdos inscritos e concluídos, além de métodos para progredir nos cursos e calcular o total de XP acumulado.

## Funcionalidades

1. Criação de Cursos e Mentorias:

- Os cursos são criados e configurados com as informações de título e descrição do curso.
- As mentorias são criadas inserindo as informações de título, descrição e data das mentorias.

2. Criação do Bootcamp:

- Os Bootcamps são criados com as informações de nome e descrição do Bootcamp. Cada Bootcamp ainda recebe os cursos e mentorias que farão parte do programa.

3. Inscrição dos alunos:

- Os alunos são criados e configurados apenas com a informação do nome.

4. Progressão dos alunos:

- A progressão dos alunos ocorre através da conclusão dos conteúdos nos quais estão inscritos, possibilitando o acúmulo da pontuação XP de cada curso e mentoria.

5. Exibição dos status dos alunos:

- O status de inscrição, conteúdos concluídos e total de XP dos alunos é exibido no console.


## Conclusão

<p align="Justify"> Este projeto serve como uma introdução prática à Programação Orientada a Objetos em Java. Ele cobre conceitos fundamentais como classes, objetos, herança, encapsulamento e manipulação de listas. É um ótimo ponto de partida para desenvolvedores iniciantes que desejam entender como estruturar um projeto Java e aplicar princípios de POO.
</p>



