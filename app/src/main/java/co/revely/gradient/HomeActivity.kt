package co.revely.gradient

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Created at 9/11/17
 *
 * @author rbenjami
 */
class HomeActivity : AppCompatActivity()
{
	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_home)
	}

	fun backgroundGradientClicked(view: View)
	{
		startActivity(Intent(this, BackgroundGradientActivity::class.java))
	}

	fun textGradientClicked(view: View)
	{
		startActivity(Intent(this, TextGradientActivity::class.java))
	}

	fun animatedGradientClicked(view: View)
	{
		startActivity(Intent(this, AnimatedGradientActivity::class.java))
	}

	fun otherGradientClicked(view: View)
	{
		startActivity(Intent(this, OtherGradientActivity::class.java))
	}

	fun javaGradientClicked(view: View)
	{
		startActivity(Intent(this, JavaGradientActivity::class.java))
	}

	fun layerGradientClicked(view: View)
	{
		startActivity(Intent(this, LayerGradientActivity::class.java))
	}
}