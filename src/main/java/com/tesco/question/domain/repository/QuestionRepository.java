package com.tesco.question.domain.repository;

import com.tesco.question.domain.model.Question;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Question, UUID> {

  List<Question> findAll();

  List<Question> findByStatus(String status);

  List<Question> findByUserId(String userId);
}
