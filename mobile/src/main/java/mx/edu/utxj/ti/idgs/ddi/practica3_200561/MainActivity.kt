package mx.edu.utxj.ti.idgs.ddi.practica3_200561

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.TexViewexView)
        textView.setOnClickListener {
            // Crear la animación de brillo
            val scaleX = ObjectAnimator.ofFloat(textView, "scaleX", 1.0f, 1.2f, 1.0f)
            val scaleY = ObjectAnimator.ofFloat(textView, "scaleY", 1.0f, 1.2f, 1.0f)
            val animatorSet = AnimatorSet()
            animatorSet.playTogether(scaleX, scaleY)
            animatorSet.duration = 300
            animatorSet.start()}
    }
}