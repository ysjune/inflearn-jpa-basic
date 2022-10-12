package jpabasic.inflearnjpabasic.hello;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

@SpringBootTest
public class HelloMemberTest {

    @Autowired
    private EntityManager em;

    @Test
    @Transactional
    void name() {

//        Member member = new Member();
//        member.setId(1L);
//        member.setUsername("kiki");
//
//        em.persist(member);
    }

    @AfterEach
    void tearDown() {
        em.close();
    }
}
