package com.example.myquizapp

object Constants {
    fun getQuestion(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(1,"What country does this flag belong to?",R.drawable.ic_flag_of_argentina,"Argentina","Englang","Pakistan","India",1)
        val que2 = Question(2,"What country does this flag belong to?",R.drawable.ic_flag_of_belgium,"Kenya","Belgium","Japan","USA",2)
        val que3 = Question(3,"What country does this flag belong to?",R.drawable.ic_flag_of_brazil,"Portugal","Spain","Argentina","Brazil",4)
        val que4 = Question(4,"What country does this flag belong to?",R.drawable.ic_flag_of_denmark,"")



        return questionList
    }



}