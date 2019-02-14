package brasil.airton.areafunc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnHpCont.setOnClickListener(){
            startActivity (Intent(this, HpCounter :: class.java))
        }

        btnWpCre.setOnClickListener(){
            startActivity (Intent(this, WeaponCreator :: class.java))
        }
    }


}
