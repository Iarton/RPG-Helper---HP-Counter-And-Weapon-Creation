package brasil.airton.areafunc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_weapon_creator.*

class WeaponCreator : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weapon_creator)


        btnGerar.setOnClickListener() {
            var nv = edtNv.text.toString()
            var str = ""
            var tam=false
            var long=false
            var form=false
            var str1 = AtrTag("Lamina", "Pesada", str)
            var cont = 0
            while (cont < nv.toInt()) {
                var r = (0..2).random()
                if(r==0 && tam==false){
                    str = AtrTag("GR", "PQ", str)
                    tam=true
                }else if(r==1 && long==false){
                    str = AtrTag("LO", "CT", str)
                    long=true
                }else if(r==2 && form==false){
                    str = AtrTag("CV", "RT", str)
                    form=true
                }else{
                    str = AtrTag("CA", "PR", str)
                }
                cont++
            }

            edtRes.setText("${str1} +${nv} ${str}")
        }

        btnVolt.setOnClickListener() {
            finish()
        }


    }

    fun AtrTag(tag1: String, tag2: String, res: String): String {
        val r = (0..1).random()
        var text = ""
        if (r == 0) {
            text = res +" "+ tag1
        } else {
            text = res +" "+ tag2
        }
        return text
    }
}
