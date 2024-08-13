public class ConsultaAgendada {
   
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    private static int quantidade = 0; 
	
 
    public ConsultaAgendada() {
        this.data = new Data(1, 1, 2000); 
        this.hora = new Hora(0, 0, 0);    
        this.nomePaciente = "Paciente";
        this.nomeMedico = "Médico";
        quantidade++; 
		
		
    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = p;
        this.nomeMedico = med;
	    quantidade++; 
	}
	
	
    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
        quantidade++; 
    }

   
    public void setData(int dia, int mes, int ano) {
        this.data.setDia(dia);
        this.data.setMes(mes);
        this.data.setAno(ano);
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setHora(int horas, int minutos, int segundos) {
        this.hora.setHoras(horas);
        this.hora.setMinutos(minutos);
        this.hora.setSegundos(segundos);
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    
    public String getData() {
        return String.format("%02d/%02d/%02d", data.getDia(), data.getMes(), data.getAno());
    }

    public String getHora() {
        return String.format("%02d:%02d:%02d", hora.getHoras(), hora.getMinutos(), hora.getSegundos());
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public static int getQuantidade() {
        return quantidade;
    }
}
