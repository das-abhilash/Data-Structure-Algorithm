package app.zollet.leetcode.dsalgo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle = Bundle()
        val df = 5

        val solution = LeetCodeSolution()
        solution.execute()


//        val solution = CodeForcesSolution()
//        solution.execute()
        val anim = "${Random.nextInt(6)}.json"
        val animation = findViewById<LottieAnimationView>(R.id.animation)
        animation.setAnimation(anim)
        animation.repeatCount = LottieDrawable.INFINITE
        animation.playAnimation();
//            .blockingGet()
//        val f = sdf()
//        f.score = 10
//        Log.d("meg", "${g} :result")
    }

    class sdf {
        var score: Int? = null
            get() {
                return if (isNotNull() && score!! < 0) {
                    0
                } else score
            }

        fun isNotNull(): Boolean {
            return score != null
        }
    }
}