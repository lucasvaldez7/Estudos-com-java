public class Funcionario {
    // atributos: nome cargo salario, matricula
    private String nome;
    private String cargo;
    private double salario;
    private String matricula;

        //Construtor da Classe
    public Funcionario() {
    }   
        //metodo setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
        //metodo getter
    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }
    public String getMatricula() {
        return matricula;
    }
        public void reajustarSalario(){
                if(this.cargo.equalsIgnoreCase("Assistente Administrativo")){
                        this.salario = this.salario * 1.100;
                    
                }else if (this.cargo.equalsIgnoreCase("Vendedor")){
                    this.salario = this.salario * 1.350;

            }  else{
                this.salario = this.salario * 1;


            }

        }
    
        
    
  }
        


