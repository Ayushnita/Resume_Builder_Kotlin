package com.openuniquesolution.ResumeBuilder.model

data class ResumeModel(
    val email: String,
    val educations: MutableList<Education>?,
    val skills: MutableList<Skill>?,
    val experiences: List<Experience>?,
    val contactDetails: ContactDetails?,
    val extrasAndAwards: ExtrasAndAwards?,
    val areaOfInterests: AreaOfInterests?,
    val project: MutableList<Project>?
)
