import javax.swing.JOptionPane;

public class ControleFuncionarios {
    public static void main(String[] args) {
        Funcionario funcionario;
        funcionario = new Funcionario();

        funcionario.setNome("Lucas Valdez");
        funcionario.setMatricula("232500");
        funcionario.setCargo("Jovem Aprendiz");
        funcionario.setSalario(994.50);
       
        funcionario.reajustarSalario();
        funcionario.exibirInfos();        
            
    }
}
