class Cavalo (
    nome: String, idade: Int, cor: String ) :Animal(nome, idade) {

    override fun som() {
        super.som()
        println("Riiiiih")
    }
    fun correr2 (){
        println("O cavalo esta correndo.")
    }
}
