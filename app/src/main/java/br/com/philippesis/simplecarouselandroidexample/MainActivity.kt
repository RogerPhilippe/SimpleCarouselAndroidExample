package br.com.philippesis.simplecarouselandroidexample

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class MainActivity : AppCompatActivity() {

    var sampleImages = intArrayOf(
        R.drawable.image_1,
        R.drawable.image_2,
        R.drawable.image_3,
        R.drawable.image_4,
        R.drawable.image_5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carouselView = findViewById<CarouselView>(R.id.carouselView)
        carouselView.pageCount = sampleImages.size
        carouselView.setImageListener(imageListener)
        carouselView.slideInterval = 0
    }

    var imageListener: ImageListener = ImageListener {
            position, imageView -> imageView?.setImageResource(sampleImages[position])
    }

    // Without lambda example
    /**
     * var imageListener: ImageListener = object : ImageListener {
     *  override fun setImageForPosition(position: Int, imageView: ImageView?) {
     *      imageView?.setImageResource(sampleImages[position])
     *  }
     * }
     */

}
