package com.tesco.question.application;

import com.tesco.question.domain.model.Question;
import com.tesco.question.domain.service.QuestionService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/questions")
public class QuestionController {

  private final QuestionService questionService;

  public QuestionController(QuestionService questionService) {
    this.questionService = questionService;
  }

  @PostMapping
  public Question createQuestion(@RequestBody Question request) {
    return questionService.createQuestion(request);
  }

  @GetMapping
  public List<Question> getAllQuestions() throws InterruptedException {
    return questionService.getAllQuestions();
  }

  @GetMapping("/status/{status}")
  public List<Question> getQuestionsByStatus(@PathVariable String status) {
    return questionService.getQuestionsByStatus(status);
  }
}
