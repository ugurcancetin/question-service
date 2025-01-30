package com.tesco.question.domain.service;

import com.tesco.question.domain.model.Question;
import com.tesco.question.domain.repository.QuestionRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

  private final QuestionRepository questionRepository;

  public QuestionService(QuestionRepository questionRepository) {
    this.questionRepository = questionRepository;
  }

  public Question createQuestion(Question question) {
    return questionRepository.save(question);
  }

  public List<Question> getAllQuestions() throws InterruptedException {
    this.multiplyMatrices(200);
    return questionRepository.findAll();
  }

  public List<Question> getQuestionsByStatus(String status) {
    return questionRepository.findByStatus(status);
  }

  private double[][] multiplyMatrices(int size) {
    double[][] matrixA = new double[size][size];
    double[][] matrixB = new double[size][size];
    double[][] result = new double[size][size];

    // Initialize matrices with random values
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        matrixA[i][j] = Math.random();
        matrixB[i][j] = Math.random();
      }
    }

    // Perform matrix multiplication
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        for (int k = 0; k < size; k++) {
          result[i][j] += matrixA[i][k] * matrixB[k][j];
        }
      }
    }

    return result;
  }
}
