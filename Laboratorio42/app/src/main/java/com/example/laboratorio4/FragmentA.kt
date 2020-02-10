package com.example.laboratorio4


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_a.*


class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bttTikal.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
        }

        bttAntigua.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_to_fragmentC)
        }

        bttFlores.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_to_fragmentD)
        }
        bttBIO.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_to_biografia)
        }
        bttImg.setOnClickListener {
            if(textView2.getVisibility() == View.VISIBLE){
                editText.visibility = View.INVISIBLE
                textView2.visibility = View.INVISIBLE
            }else{
                if(textView2.getVisibility() == View.INVISIBLE) {
                    editText.visibility = View.VISIBLE
                    textView2.visibility = View.VISIBLE
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }


}
