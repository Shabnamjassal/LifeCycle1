package shabnam.lifecycle1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    //variable declaration
    var etName : EditText?= null
    var etHeight : EditText?= null
    var etRollNo : EditText?= null
    var btnValidate : Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //initialization
        etName = findViewById(R.id.etName)
        etHeight = findViewById(R.id.etHeight)
        etRollNo = findViewById(R.id.etRollNo)
        btnValidate = findViewById(R.id.btnValidate)

        //operation perform

        // btnValidate?.setOnClikListener(View.OnClickListener {  })
        btnValidate?.setOnClickListener {
            if (etName?.text.toString().isNullOrEmpty()) {
                etName?.error = "Enter your name"
            } else if (etHeight?.text?.toString().isNullOrEmpty()) {
                etHeight?.error = "Enter your height"
            } else if (etRollNo?.text?.toString().isNullOrEmpty()) {
                etRollNo?.error = "Enter your rollno"
            } else {
                Toast.makeText(
                    this,
                    "Validate completed",
                    Toast.LENGTH_SHORT
                ).show()

                //toast short length - 2 seconds and long = 3.5 seconds
                //Intent - source class, destination class
                var intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT)
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT)
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT)
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT)
    }
    //function
}
