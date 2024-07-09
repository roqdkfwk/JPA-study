package jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

// DAO와 비슷하다고 볼 수 있다.
@Repository
public class MemberRepository {

    // 스프링 부트가 해당 어노테이션을 보고 주입을 해준다.
    @PersistenceContext
    private EntityManager em;

    // 저장
    public Long save(Member member) {
        em.persist(member);
        return member.getId();
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
