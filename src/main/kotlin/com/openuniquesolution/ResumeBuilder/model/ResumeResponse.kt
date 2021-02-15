package com.openuniquesolution.ResumeBuilder.model

data class ResumeResponse(
    val resumeModel: ResumeModel
)


data class ResumeRequest(
    val email: String
)

data class UpdateRequest(
    val email: String,
    val resumeModel: ResumeModel
)