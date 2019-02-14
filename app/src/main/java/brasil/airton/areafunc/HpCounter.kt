package brasil.airton.areafunc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hp_counter.*

class HpCounter : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hp_counter)


        btnVolt.setOnClickListener(){
            finish()
        }
    }
}
