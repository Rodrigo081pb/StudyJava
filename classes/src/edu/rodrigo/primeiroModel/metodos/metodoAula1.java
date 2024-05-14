package edu.rodrigo.primeiroModel.metodos;

public class metodoAula1 {

    /*
     * public double somar(int num1, int num2){
     * // Lógica - finalidade do método
     * return System.out.println("Resultado");
     * }
     */

    public void imprimir(String texto) {
        // Lógica - finalidade do método
        // Aqui não precisa de return pois não sera retornado nemhum resultado
    }

    /*
     * throws exception : indica que o método ao ser utilizado poderá gerar uma
     * exceção
     * 
     * public double dividir(int dividendo, int divisor) throws Exception
     */

    // Metodo privado

    @SuppressWarnings("unused")
    private void metodoPrivado() {
    }

    // Alguns equivocos estruturais

    public void validar() {
        // Esse método deveria retornar algum valor no caso boolean (true ou false)
    }

    public void calcularEnviar() {
        // Esse método deve representar uma unica responsabilidade ou ele vai calcular
        // ou ele vai enviar
    }

    /*
     * 
     * public void gravaCliente(String nome, String cpf)
     * 
     * Esse método tem a finalidade de gravar as informações de um cliente, porque
     * não criar um objeto cliente e passar como parâmetro ? veja abaixo
     * 
     * public void gravarClienteC(Cliente cliente){
     * 
     * }
     * 
     * public void gravar(Cliente cliente){}
     * 
     */

}
