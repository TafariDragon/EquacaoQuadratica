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
       if(delta<0.0)
       {
           binding.lblConta.setText("Sem Raizes Delta menor que 0.0")
           binding.lblResultado.setText(delta.toString())
       }else{

           calcularRaizes(a,b,c,delta);
       }

    }

    fun calcularRaizes(a:Double,b: Double,c: Double,delta:Double)
    {
        
    }
}