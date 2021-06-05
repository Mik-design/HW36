//package kg.tutorial.hw36fragments
//
//import android.os.Bundle
//import android.util.Log
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Button
//import androidx.fragment.app.Fragment
//
//class Fragment1 : Fragment() {
//    val LOG_TAG = "myLogs"
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
//                              savedInstanceState: Bundle?): View? {
//        val v = inflater.inflate(R.layout.fragment_1, null)
//        val button = v.findViewById<View>(R.id.but1) as Button
//        button.setOnClickListener { V: View? -> Log.d(LOG_TAG, "Button click in Fragment1") }
//        return v
//    }
//}