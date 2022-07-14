public class RodarAplicacao {

    public static void main(String[] args)
    {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //  Downcast devem ser sempre evitados na OO
        //Vendedor vendedor1 = (Vendedor) new Funcionario();


    }// Fim do metodo main
}
