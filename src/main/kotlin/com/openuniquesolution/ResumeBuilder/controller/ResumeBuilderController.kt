package com.openuniquesolution.ResumeBuilder.controller

import com.openuniquesolution.ResumeBuilder.model.ResumeModel
import com.openuniquesolution.ResumeBuilder.model.ResumeRequest
import com.openuniquesolution.ResumeBuilder.model.ResumeResponse
import com.openuniquesolution.ResumeBuilder.model.UpdateRequest
import com.openuniquesolution.ResumeBuilder.service.ResumeBuilderService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/api")
class ResumeBuilderController(
    val resumeBuilderService: ResumeBuilderService
) {
    /**
     * Create a Resume Object with minimum Details:
     *
     *
     */
    @PostMapping("/")
    fun createResume(@RequestBody resumeRequest: ResumeRequest): ResumeResponse {
        return resumeBuilderService.createResume(resumeRequest)
    }

    @PatchMapping("/")
    fun updateResume(@RequestBody updateRequest: UpdateRequest): ResumeResponse{
        return resumeBuilderService.updateResume(updateRequest)
    }

    @PostMapping("/confirm")
    @ResponseStatus(HttpStatus.CREATED)
    fun confirmResume(@RequestBody resumeRequest: ResumeRequest){
        return resumeBuilderService.confirmResume(resumeRequest)
    }

    @GetMapping("/{email}")
    fun getResume(@PathVariable email: String){
        return resumeBuilderService.getResume(email)
    }
}