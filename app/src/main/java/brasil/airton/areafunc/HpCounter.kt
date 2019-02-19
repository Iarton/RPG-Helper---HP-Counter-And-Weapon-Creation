package brasil.airton.areafunc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hp_counter.*

class HpCounter : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hp_counter)
        var cont = 1
        btnAdd.setOnClickListener(){
            var hp = edtHP.text.toString()
            var rs = edtRS.text.toString()
            var nm = edtNm.text.toString()

            txtHp1.setText(hp)
            txtRs1.setText(rs)
            txtNome1.setText(nm)

            cont++
        }

        btnAtq.setOnClickListener(){
            var dn = edtDn.text.toString().toInt()
            var rs = txtRs1.text.toString().toInt()
            var hp = txtHp1.text.toString().toInt()
            if(dn - rs>0){
                hp = hp - (dn - rs)
                txtHp1.setText(hp.toString())
            }

        }

        btnVolt.setOnClickListener(){
            finish()
        }
    }
}
