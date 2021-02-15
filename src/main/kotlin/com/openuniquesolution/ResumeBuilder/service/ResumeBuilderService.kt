package com.openuniquesolution.ResumeBuilder.service

import com.openuniquesolution.ResumeBuilder.model.ResumeRequest
import com.openuniquesolution.ResumeBuilder.model.ResumeResponse
import com.openuniquesolution.ResumeBuilder.model.UpdateRequest
import org.springframework.stereotype.Service

@Service
interface ResumeBuilderService {
    fun createResume(resumeRequest: ResumeRequest): ResumeResponse
    fun updateResume(updateRequest: UpdateRequest): ResumeResponse
    fun confirmResume(resumeRequest: ResumeRequest)
    fun getResume(email: String)
}
