class Cachorro (
    nome: String, idade: Int, cor: String ) :Animal(nome, idade){

     override fun som (){
         super.som()
         println("Au Au")
     }
    fun correr (){
        println("O cachorro esta correndo.")
    }
}
