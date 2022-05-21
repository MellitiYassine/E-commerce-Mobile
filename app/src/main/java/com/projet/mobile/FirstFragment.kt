package com.projet.mobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FirstFragment() : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_first, container, false)

        var prixContainer = view.findViewById<TextView>(R.id.totale_sum)

        //creation of virtual list
        val listProduct = arrayListOf<Product>()
        listProduct.add(Product("ASUS E510MA", "E510MA-BR633W", "ASUS", 45.0, 50))
        listProduct.add(Product("HP 15-DW1001NK", "27Z73EA", "HP", 12.0 , 30))
        listProduct.add(Product("SAC À DOS HP POUR PC PORTABLE ", "5EE91AA", "HP", 75.0, 50))
        listProduct.add(Product("DELL VOSTRO 3500", "N6501VN3500EMEA03", "DELL", 110.000, 400))
        listProduct.add(Product("DELL VOSTRO 3500", "N6502VN3500EMEA01-8G", "DELL", 1389.000, 50))
        listProduct.add(Product("ASUS E510MA", "E510MA-BR633W", "ASUS", 124.0, 50))
        listProduct.add(Product("ASUS E510MA", "E510MA-BR633W", "ASUS", 554.0, 50))
        listProduct.add(Product("HP 15-DW1001NK", "27Z73EA", "HP", 231.0 , 30))
        listProduct.add(Product("SAC À DOS HP POUR PC PORTABLE ", "5EE91AA", "HP", 2112.0, 50))
        listProduct.add(Product("DELL VOSTRO 3500", "N6501VN3500EMEA03", "DELL", 1329.000, 400))
        listProduct.add(Product("DELL VOSTRO 3500", "N6502VN3500EMEA01-8G", "DELL", 1389.000, 50))
        listProduct.add(Product("ASUS E510MA", "E510MA-BR633W", "ASUS", 44.0, 50))
        listProduct.add(Product("ASUS E510MA", "E510MA-BR633W", "ASUS", 68.0, 50))
        listProduct.add(Product("HP 15-DW1001NK", "27Z73EA", "HP", 45.0 , 30))
        listProduct.add(Product("SAC À DOS HP POUR PC PORTABLE ", "5EE91AA", "HP", 123.0, 50))
        listProduct.add(Product("DELL VOSTRO 3500", "N6501VN3500EMEA03", "DELL", 23.000, 400))
        listProduct.add(Product("DELL VOSTRO 3500", "N6502VN3500EMEA01-8G", "DELL", 134589.000, 50))
        listProduct.add(Product("ASUS E510MA", "E510MA-BR633W", "ASUS", 1.0, 50))
        listProduct.add(Product("ASUS E510MA", "E510MA-BR633W", "ASUS", 23.0, 50))
        listProduct.add(Product("HP 15-DW1001NK", "27Z73EA", "HP", 12.0 , 30))
        listProduct.add(Product("SAC À DOS HP POUR PC PORTABLE ", "5EE91AA", "HP", 2.0, 50))
        listProduct.add(Product("DELL VOSTRO 3500", "N6501VN3500EMEA03", "DELL", 12.000, 400))
        listProduct.add(Product("DELL VOSTRO 3500", "N6502VN3500EMEA01-8G", "DELL", 32.000, 50))
        listProduct.add(Product("ASUS E510MA", "E510MA-BR633W", "ASUS", 12.0, 50))




        val toselectRecyclerView = view.findViewById<RecyclerView>(R.id.recyclerView_toSelect)

        toselectRecyclerView.adapter = MyAdapter(R.layout.item_to_select, listProduct, prixContainer)
        toselectRecyclerView.addItemDecoration(ItemDecoration())

        return view

    }

    }




