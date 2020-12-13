package app.zollet.leetcode.dsalgo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieDrawable
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val solution = LeetCodeSolution()
//        val solution = CodeForcesSolution()
        solution.execute()
        val anim = "${Random.nextInt(6)}.json"
        animation.setAnimation(anim)
        animation.repeatCount = LottieDrawable.INFINITE
        animation.playAnimation();
    }
}