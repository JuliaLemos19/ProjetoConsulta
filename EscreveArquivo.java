import java.io.FileWriter;
import java.io.IOException;

public class EscreveArquivo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("resultado.txt");

            
            ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 12, 8, 2024, "João Silva", "Dr. Maria");

            
            ConsultaAgendada p2 = new ConsultaAgendada();

           
            writer.write("Propriedades de p1:\n");
            writer.write("Data: " + p1.getData() + "\n");
            writer.write("Hora: " + p1.getHora() + "\n");
            writer.write("Nome do Paciente: " + p1.getNomePaciente() + "\n");
            writer.write("Nome do Médico: " + p1.getNomeMedico() + "\n");

            
            writer.write("\nPropriedades de p2:\n");
            writer.write("Data: " + p2.getData() + "\n");
            writer.write("Hora: " + p2.getHora() + "\n");
            writer.write("Nome do Paciente: " + p2.getNomePaciente() + "\n");
            writer.write("Nome do Médico: " + p2.getNomeMedico() + "\n");

            
            p1.setData(15, 8, 2024);
            p1.setHora(14, 0, 0);
            p1.setNomePaciente("Maria Souza");
            p1.setNomeMedico("Dr. José");

            
            writer.write("\nPropriedades alteradas de p1:\n");
            writer.write("Data: " + p1.getData() + "\n");
            writer.write("Hora: " + p1.getHora() + "\n");
            writer.write("Nome do Paciente: " + p1.getNomePaciente() + "\n");
            writer.write("Nome do Médico: " + p1.getNomeMedico() + "\n");

          
            writer.write("\nQuantidade final de consultas: " + ConsultaAgendada.getQuantidade() + "\n");

          

            writer.close();
            System.out.println("Resultado gravado com sucesso!");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever o arquivo.");
            e.printStackTrace();
        }
    }
}
