fun main (args: Array<String>) {  /** comecei criando a função principal. a Main*/
    println(Forca (10, 5))  /** aqui chamo a função com o nome que dei de forca, com os parametros dela e coloquei o printlin para que ele me exiba na tela*/

}  /** fechamento da função*/

fun Forca(massa: Int, altura: Int = 10): Int { /** criei uma função com o nome de forca e atribui 2 numeros á ela, com massa e altura que já estavam com um valor atribuido e defini eles como Int */
    return massa * altura /** aqui falei a logica da função, que é de multiplicar a massa vezes a altura. E dei o return para me retornar o resultado */
}   /** encerro a função aqui  */
