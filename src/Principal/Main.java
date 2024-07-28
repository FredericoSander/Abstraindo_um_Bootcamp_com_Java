package Principal;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Alunos;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Orientação a Objetos em Java");
        curso1.setDescricao("Descrição do curso de Orientação a Objetos em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Collections Java");
        curso2.setDescricao("Descrição do curso e Collections Java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Carreira em java");
        mentoria.setDescricao("Descrição da mentoria de Carreira em java");
        mentoria.setData(LocalDate.now());

        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        
        
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);
        
        
        Alunos aluno1 = new Alunos();
        aluno1.setNome("Camila Alvarenga");
        aluno1.inscreverBootcamp( bootcampJava);
        System.out.println("Conteúdos inscritos para Camila Alvarenga" + aluno1.getConteudosInscritos());
        
        aluno1.progredir();
        aluno1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos para Camila Alvarenga: " + aluno1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos para Camila Alvarenga: " + aluno1.getConteudoConcluido());
        System.out.println("Total de XP de Camila Alvarenga: " + aluno1.calcularTotalXP());
       
        System.out.println("");
        System.out.println("----------");
        System.out.println("");
        
        Alunos aluno2 = new Alunos();
        aluno2.setNome("João Antunes");
        aluno2.inscreverBootcamp( bootcampJava);
        System.out.println("Conteúdos inscritos para João Antunes" + aluno2.getConteudosInscritos());
        
        aluno2.progredir();
        aluno2.progredir();
        aluno2.progredir();
        
        System.out.println("-");
        System.out.println("Conteúdos inscritos para João Antunes" + aluno2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos para João Antunes" + aluno2.getConteudoConcluido());
        System.out.println("Total de XP de João Antunes: " + aluno2.calcularTotalXP());
        
        System.out.println("");
        System.out.println("----------");
        System.out.println("");
        
        Alunos aluno3 = new Alunos();
        aluno3.setNome("Carolina Ferreira");    
        aluno3.inscreverBootcamp( bootcampJava);
        System.out.println("Conteúdos inscritos para Carolina Ferreira" + aluno3.getConteudosInscritos());
        
        aluno3.progredir();
        
        System.out.println("-");
        System.out.println("Conteúdos inscritos para Carolina Ferreira" + aluno3.getConteudosInscritos());
        System.out.println("Conteúdos concluídos para Carolina Ferreira" + aluno3.getConteudoConcluido());
        System.out.println("Total de XP de Carolina Ferreira: " + aluno3.calcularTotalXP());

	}

}
