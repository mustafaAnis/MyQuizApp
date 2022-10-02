package com.example.myquizapp

object Constants {
    fun getQuestion(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(1,"What country does this flag belong to?",R.drawable.ic_flag_of_argentina,"Argentina","Englang","Pakistan","India",1)
        questionList.add(que1)
        val que2 = Question(2,"What country does this flag belong to?",R.drawable.ic_flag_of_belgium,"Kenya","Belgium","Japan","USA",2)
        questionList.add(que2)
        val que3 = Question(3,"What country does this flag belong to?",R.drawable.ic_flag_of_brazil,"Portugal","Spain","Argentina","Brazil",4)
        questionList.add(que3)
        val que4 = Question(4,"What country does this flag belong to?",R.drawable.ic_flag_of_denmark,"UK","Zimbabwe","Denamrk","Germany",3)
        questionList.add(que4)
        val que5 = Question(5,"What country does this flag belong to?",R.drawable.ic_flag_of_australia,"Australia","India","Kenya","Bhutan",1)
        questionList.add(que5)
        val que6 = Question(6,"What country does this flag belong to?",R.drawable.ic_flag_of_fiji,"Italy","Fiji","Denamrk","Australia",2)
        questionList.add(que6)
        val que7 = Question(7,"What country does this flag belong to?",R.drawable.ic_flag_of_germany,"Germany","Brazil","Portugal","Coulambia",1)
        questionList.add(que7)
        val que8 = Question(8,"What country does this flag belong to?",R.drawable.ic_flag_of_india,"Pakistan","India","Sri lanka","Qatar",2)
        questionList.add(que8)
        val que9 = Question(9,"What country does this flag belong to?",R.drawable.ic_flag_of_belgium,"Belgium","Italy","France","Vietnam",1)
        questionList.add(que9)
        val que10 = Question(10,"What country does this flag belong to?",R.drawable.ic_flag_of_new_zealand,"Australia","New zealand","England","Austria",2)
        questionList.add(que10)
        return questionList
    }



}