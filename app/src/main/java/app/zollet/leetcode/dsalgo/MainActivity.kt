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

/*package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {

    }

    int depth = Integer.MIN_VALUE;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        depth = Integer.MIN_VALUE;
        Map<Integer, List<TreeNode>> map = new HashMap();
        process(root, 0, map);

        Set<TreeNode> set = new HashSet<>(map.get(depth));

        depth--;
        while (set.size() != 0) {
            List<TreeNode> l = map.get(depth);

            for (int i = 0; i < l.size(); i++) {


            }


        }

    }


    private void process(TreeNode node, int i, Map<Integer, List<TreeNode>> map) {
        if (node == null) return;
        depth = Math.max(depth, i);
        List<TreeNode> l = map.getOrDefault(i, new ArrayList<>());
        l.add(node);
        map.put(i, l);
        process(node.left, i + 1, map);
        process(node.right, i + 1, map);
    }


}*/