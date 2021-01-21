package com.openuniquesolution.ResumeBuilder.model

import java.time.LocalDate
import java.util.*

data class Skill(val type: String, val skillName: String, val ratting: Float)

data class AreaOfInterests(val areaOfInterests: MutableList<String>){
    fun addInterest(interest: String){
        this.areaOfInterests.add(interest)
    }

    fun deleteInterest(interest: String){
        this.areaOfInterests.remove(interest)
    }
}

data class ExtrasAndAwards(val extrasAndAwards: MutableList<String>){
    fun addExtraAndAward(text: String){
        this.extrasAndAwards.add(text)
    }

    fun deleteExtraAndAward(text: String){
        this.extrasAndAwards.remove(text)
    }
}

data class Education(val degree: String,
                     val schoolName: String,
                     val specification: String,
                     val location: String,
                     val from: LocalDate,
                     val to: LocalDate,
                     val per_ctc: Float
                     )


data class Experience(val company: String,
                        val designation: String,
                        val toDate: LocalDate,
                        val fromDate: LocalDate,
                        val description: String,
                        val technologies: MutableList<String>){
    fun addTechnology(text: String){
        this.technologies.add(text)
    }

    fun deleteTechnology(text: String){
        this.technologies.remove(text)
    }
}

data class ContactDetails(val name: String, val email: String, val mobileNumber: String, val location: String)

data class Project(val title: String, val company: String, val teamSize: Int, val technologies: MutableList<String>, val notes: MutableList<String>, val duration: Int)



