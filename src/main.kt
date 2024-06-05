//val -> declaração de variavel somente leitura
//var -> declaração de variavel mutavel
//listOf -> criar uma lista somente leitura

val readNames = listOf("Lucas","Lailson","Romeo")

class Pessoa(val id:Int,val name:String,var telefone:String){
    override fun toString(){
        return "Pessoa(id=$id,name='$name',telefone='$telefone')"
    }
}

fun main(args:Array<String>){
    val pessoa = Pessoa(1,"Lucas de paula","85888842")
    println("Hello, $readNames")
}