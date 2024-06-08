package com.saio.spring_ai_ollama.controller;

import com.saio.spring_ai_ollama.service.AnswerService;
import org.apache.coyote.Request;
import org.springframework.ai.chat.model.Generation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @RequestMapping(value = "answer", method = RequestMethod.GET)
    public List<Generation> getAnswer(@RequestParam ("query") String query){
        return answerService.answer(query);
    }
}
