class Preguica (nome: String, idade: Int, cor: String ) :Animal(nome, idade){

    override fun som (){
        super.som()
        println("AAaAaaaAAAa")
    }
    fun subir (){
        println("A preguiça esta subindo na árvore.")
    }
}
