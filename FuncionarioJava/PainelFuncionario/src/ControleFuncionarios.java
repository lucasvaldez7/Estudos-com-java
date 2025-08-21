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

            JOptionPane.showMessageDialog(null,"Matricula: " + funcionario.getMatricula());
            JOptionPane.showMessageDialog(null,"Nome: " + funcionario.getNome());
            JOptionPane.showMessageDialog(null,"Cargo: " + funcionario.getCargo());
            JOptionPane.showMessageDialog(null,"Salario: " + funcionario.getSalario());
    }
}
