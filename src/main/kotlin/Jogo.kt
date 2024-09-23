import com.google.gson.annotations.SerializedName

class Jogo(@SerializedName("title") private val titulo:String, @SerializedName("thumb") private val capa:String ) {
    private val descricao = ""
    override fun toString(): String {
        return "Jogo\n titulo='$titulo',\n capa='$capa',\n descricao='$descricao'"
    }


}