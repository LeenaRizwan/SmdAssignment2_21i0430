package com.example.myfirstapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class mAdapter(private val list:ArrayList<User>) : RecyclerView.Adapter<mAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType : Int): mAdapter.MyViewHolder{
        val itemView =LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return  MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: mAdapter.MyViewHolder, position: Int){
        val User:User=list[position]
        holder.name1.text=User.Name
        holder.cnum1.text=User.Cnum
        holder.email1.text=User.Email
    }

    override fun getItemCount(): Int {
        return list.size
    }

    public class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val name1:TextView =itemView.findViewById(R.id.Name)
        val cnum1:TextView=itemView.findViewById(R.id.Cnum)
        val email1:TextView=itemView.findViewById(R.id.email)
    }
}