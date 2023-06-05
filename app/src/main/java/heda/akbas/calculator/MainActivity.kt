package heda.akbas.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1: EditText=findViewById(R.id.number1)
        val number2: EditText=findViewById(R.id.number2)

        val equalTxetView:TextView=findViewById(R.id.EqualTexView)

        val plusButton: Button =findViewById(R.id.PlusButton)
        plusButton.setOnClickListener{

            val number1:Int=Integer.parseInt(number1.text.toString())
            val number2:Int=Integer.parseInt(number2.text.toString())
            val IEqual=number1+number2
            equalTxetView.text=IEqual.toString()

        }



        val minusButton: Button =findViewById(R.id.MinusButton)
        minusButton.setOnClickListener{

            val number1:Int=Integer.parseInt(number1.text.toString())
            val number2:Int=Integer.parseInt(number2.text.toString())
            val IEqual=number1-number2
            equalTxetView.text=IEqual.toString()

        }



         val multipliedByButton: Button =findViewById(R.id.MultipliedByButton)
         multipliedByButton.setOnClickListener{

             val number1:Int=Integer.parseInt(number1.text.toString())
             val number2:Int=Integer.parseInt(number2.text.toString())
             val IEqual=number1*number2
             equalTxetView.text=IEqual.toString()

         }


        val dividedByButton: Button =findViewById(R.id.DividedByButton)
        dividedByButton.setOnClickListener{

            val number1: Float = number1.text.toString().toFloat()
            val number2: Float = number2.text.toString().toFloat()
            val IEqual=number1/number2
            equalTxetView.text=IEqual.toString()

        }

    }
}