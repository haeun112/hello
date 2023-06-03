package com.exam.examproject.repository;

import com.exam.examproject.Dto.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
