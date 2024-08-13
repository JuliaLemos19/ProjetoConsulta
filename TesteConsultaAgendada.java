public class TesteConsultaAgendada {
    public static void main(String[] args) {

        
        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 12, 8, 2024, "João Silva", "Dr. Almeida");

        
        System.out.println("Propriedades de p1:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());

        
        ConsultaAgendada p2 = new ConsultaAgendada();

        
        System.out.println("\nPropriedades de p2:");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("Nome do Médico: " + p2.getNomeMedico());

       
        p1.setData(15, 8, 2024);
        p1.setHora(14, 0, 0);
        p1.setNomePaciente("Maria Souza");
        p1.setNomeMedico("Dr. José");

        System.out.println("\nPropriedades alteradas de p1:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());

    

        System.out.println("\nQuantidade final de consultas: " + ConsultaAgendada.getQuantidade());
    }
}