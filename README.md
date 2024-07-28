# Abstraindo um bootcamp com Java
<p align="Justify"> Este desafio de projeto tem como objetivo principal cria um sistema simples de gerenciamento de Bootcamps, onde os alunos podem se inscrever em cursos e mentoria, progredir atráves deles e acumular experiência. Tudo isso utilizando conceito basico de orientação a objetos (POO) em Java.</p>


## Pré-Requisitos

- Conhecer a sintaxe de Java<br>
- Java JDK 11 ou superior - (utilizei a JDK 17)<br>
- IDE para desenvolvimento Java (utilizei o Eclipse)<br>
- Git<br>
- Conta no GitHub<br>

## Estrutura do projeto

<p align="Justify"> O projeto está organizado em vários pacotes e classes, cada um com uma responsabilidade específica:</p>

1. Pacote Principal:

- (Classe Main)[https://github.com/FredericoSander/Abstraindo_um_Bootcamp_com_Java/blob/main/src/Principal/Main.java]: Este é o ponto de entrada da aplicação. Ele contém o método main onde o programa é executado.

2. Pacote br.com.dio.desafio.dominio:

- Classe Curso: Representa um curso com título, descrição e carga horária.
- Classe Mentoria: Representa uma mentoria com título, descrição e data.
- Classe ): Representa um bootcamp contendo uma lista de cursos e mentorias.
- (Classe Aluno)[https://github.com/FredericoSander/Abstraindo_um_Bootcamp_com_Java/blob/main/src/br/com/dio/desafio/dominio/Alunos.java]: Representa um aluno com nome, conteúdos inscritos e concluídos, além de métodos para progredir nos cursos e calcular o total de XP acumulado.

## Funcionalidades

1. Criação de Cursos e Mentorias:

- Os cursos são criados e configurados com as informações de título do curso e a descrição do curso.
- As mentorias são criadas inserindo as informações Titulo, descrição e data das mentorias.

2. Criação do Bootcamp:

- Os Bootcamp são criados com com as informações de nome e a descrição do Bootcamp. OS Bootcamp ainda recebm os cursos e mentorias que faram parte do programa

3. Inscrição dos alunos:

- Os alunos são criado e configurados apenas com a informação do nome do mesmo.

4. Progressão dos alunos:

- A progressão dos alunos ocorre através da conclusão dos conteúdos nos quais estão inscritos, possibilitando o acumulo da pontuação XP de cada curso e mentoria.

5. Exibição dos status dos alunos:

- O status de inscrição, conteúdos concluídos e total de XP dos alunos é exibido no console.


## Conclusão

<p align="Justify"> Este projeto serve como uma introdução prática à Programação Orientada a Objetos em Java. Ele cobre conceitos fundamentais como classes, objetos, herança, encapsulamento e manipulação de listas. É um ótimo ponto de partida para desenvolvedores iniciantes que desejam entender como estruturar um projeto Java e aplicar princípios de POO.
</p>



