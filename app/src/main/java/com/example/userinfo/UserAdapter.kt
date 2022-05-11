package com.example.userinfo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(private val userList: ArrayList<User>): RecyclerView.Adapter<UserAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.singluser_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = userList[position]

        holder.name.text = currentitem.name
        holder.username.text = currentitem.username
        holder.email.text = currentitem.email
        holder.phone.text = currentitem.phone

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val name = itemView.findViewById<TextView>(R.id.EditText_name)
        val username = itemView.findViewById<TextView>(R.id.EditText_username)
        val email = itemView.findViewById<TextView>(R.id.EditText_email)
        val phone = itemView.findViewById<TextView>(R.id.EditText_phone_no)
        val password = itemView.findViewById<TextView>(R.id.EditText_password)

    }
}