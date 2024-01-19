package com.example.equacaoquadratica

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.equacaoquadratica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnCalcular.setOnClickListener{
           var valorA= binding.txtA.text.toString().toDouble()
           var valorB= binding.txtB.text.toString().toDouble()
           var valorC= binding.txtC.text.toString().toDouble()

           if(valorA==0.0 )
           {
               binding.lblConta.setText("Não é uma equação Quadratica")
           }else{

               calcularDelta(valorA,valorB,valorC);
           }

       }
    }


    fun calcularDelta(a:Double,b:Double,c:Double)
    {
       var delta=Math.pow(b,2.0)-4*a*c
        binding.lblResultado.setText("")
       if(delta<0.0)
       {
           binding.lblConta.setText("Sem Raizes Delta menor que 0.0")
           binding.lblResultado.setText("Delta = "+delta.toString())
       }else{

           calcularRaizes(a,b,c,delta);
       }

    }

    fun calcularRaizes(a:Double,b: Double,c: Double,delta:Double)
    {
        var conta="     "+a+"x² "+b +"x "+c;

        binding.lblConta.setText(conta)

        var x1=String.format("%.2f",(-b+Math.sqrt(delta))/2*a)
        var x2=String.format("%.2f",(-b-Math.sqrt(delta))/2*a)

        binding.lblResultado.setText("x1=${x1},x2=${x2}")

    }
}