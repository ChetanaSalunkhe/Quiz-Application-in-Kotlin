package com.chetana.quizeapplication

object setData {

    const val name:String = "name"
    const val score:String = "score"

    var queList:ArrayList<QuestionData> = arrayListOf()

    fun getQuestion():ArrayList<QuestionData>{

        var q1 = QuestionData(1, "The Central Rice Research Station is situated in?",
            "Chennai","Cuttak","Banglore","Quilon",2)

        var q2 = QuestionData(2, "Who among the following wrote Sanskrit grammar?",
            "Kalidasa","Panini","Charak","Aryabhatta",2)

        var q3 = QuestionData(3, "Which among the following headstreams meets the Ganges in last?",
            "Alaknanda","Pindar","Mandakini","Bhagirathi",4)

        var q4 = QuestionData(4, "Patanjali is well known for the compilation of –",
            "Yoga Sutra","Panch Sutra","Brahma Sutra","Ayurveda",1)

        var q5 = QuestionData(5, "Which one of the following rivers originates in Brahmagiri range of Western Ghats?",
            "Pennar","Kavery","Krishna","Tapi",2)

        queList.add(q1)
        queList.add(q2)
        queList.add(q3)
        queList.add(q4)
        queList.add(q5)

        return queList
    }
}