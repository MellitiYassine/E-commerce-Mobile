package com.projet.mobile

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(
    private val layoutId: Int,
    private val listProduct: List<Product>,
    private var prixContainer: TextView,
    private var sum : Double = 0.0
): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){


        //get attributes
        val productName: TextView? = view.findViewById<TextView>(R.id.product_name)
        val productManufacturer: TextView? = view.findViewById<TextView>(R.id.product_manufacturer)
        val productReference:   TextView? = view.findViewById<TextView>(R.id.product_reference)
        val productPrice: TextView? = view.findViewById<TextView>(R.id.product_price)

        var myButton : Button = view.findViewById<Button>(R.id.add_button)
        var prixProduct : TextView = view.findViewById<TextView>(R.id.product_price)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //get data
        val currentProduct = listProduct[position]
        holder.myButton.setOnClickListener{
            //p = prixContainer.toString().toDouble()
            sum += currentProduct.price
            prixContainer.setText(sum.toString())
        }
        //update
        holder.productName?.text = currentProduct.name
        holder.productManufacturer?.text = currentProduct.manufacturer
        holder.productReference?.text = currentProduct.reference
        holder.productPrice?.text = currentProduct.price.toString()


    }

    override fun getItemCount(): Int {
      return listProduct.size
    }


}
