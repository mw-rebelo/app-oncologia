import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apponcologia.CardContent
import com.example.apponcologia.R

class CardAdapter(private val items: List<String>) :
    RecyclerView.Adapter<CardAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textViewNome: TextView = itemView.findViewById(R.id.textViewNome)

        fun bindItem(item: String) {
            textViewNome.text = item
            val doença = "O câncer é uma doença não-contagiosa que provoca o crescimento descontrolado de algumas células, e pode acontecer em qualquer parte do corpo. Não é resultado de remédios, quedas ou algum alimento que pode ter feito mal. O câncer é uma doença não-contagiosa que provoca o crescimento descontrolado de algumas células, e pode acontecer em qualquer parte do corpo. Não é resultado de remédios, quedas ou algum alimento que pode ter feito mal. O câncer é uma doença não-contagiosa que provoca o crescimento descontrolado de algumas células, e pode acontecer em qualquer parte do corpo. Não é resultado de remédios, quedas ou algum alimento que pode ter feito mal."


            val lista = mutableListOf(
                "A Doença",
                "Tratamento",
                "Quimioterapia",
                "Radioterapia",
                "Cirurgia",
                "Transplante de Medula Óssea",
                "Efeitos Colaterais do Tratamento",
                "Cuidados com a Higiene",
                "Alimentação",
            )

            val items = listOf(
                lista[0] to doença,
                lista[1] to "texto sobre tratamento",
                lista[2] to "Texto sobre quimioterapia")

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, CardContent::class.java)
                val selectedItem = items[adapterPosition]
                intent.putExtra("item_text", selectedItem.second)
                itemView.context.startActivity(intent)
            }
        }
    }
}
