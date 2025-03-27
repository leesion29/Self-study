package com.mysite.sbb;

import com.mysite.sbb.Entity.Answer;
import com.mysite.sbb.Entity.Question;
import com.mysite.sbb.Repository.AnswerRepository;
import com.mysite.sbb.Repository.QuestionRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MsgTestApplicationTests {

	@Autowired
	private QuestionRepository repository;
	@Autowired
	private AnswerRepository ansRepository;

	@Transactional //메서드가 종료될 때까지 DB 세션이 유지
	@Test
	void testJpa() {
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.repository.save(q1); // 첫 번째 질문 저장
//
//		Question q2 = new Question();
//		q2.setSubject("스프링부트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.repository.save(q2); // 두 번째 질문 저장

		//find All
//		List<Question> all = this.repository.findAll();
//		assertEquals(2, all.size());
//
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());

		// findById
//		Optional<Question> oq = this.repository.findById(1);
//		// 값이 존재하지 않을 수 있기 때문에 return type을 Optional로 처리한다.
//		if(oq.isPresent()) {
//			Question q = oq.get();
//			assertEquals("sbb가 무엇인가요?", q.getSubject());
//		}
//	}

		// findBySubject
//		Question q = this.repository.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1, q.getId());

		//findBySubjectAndContent
//		Question q = this.repository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
//		assertEquals(1, q.getId());

//		//findBySubjectLike 메서드
//		List<Question> qList = this.repository.findBySubjectLike("sbb%");
//		Question q = qList.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());

		// 질문 데이터 수정하기
//		Optional<Question> oq = this.repository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.repository.save(q);

		// 질문 데이터 삭제하기
//		assertEquals(2, this.repository.count());
//		Optional<Question> oq = this.repository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.repository.delete(q);
//		assertEquals(1, this.repository.count());
		// 답변 데이터 저장하기
Optional<Question> oq = this.repository.findById(2);
assertTrue(oq.isPresent());
Question q = oq.get();
		Answer a = new Answer();
		a.setContent("네 자동으로 생성됩니다");
		a.setQuestion(q); //어떤 질문의 답변인지 객체가 필요하다
		a.setCreateDate(LocalDateTime.now());
		this.ansRepository.save(a);
	}
}
