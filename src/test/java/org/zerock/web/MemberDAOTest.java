package org.zerock.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVO;
import org.zerock.persistence.MemberDAO;

import javax.inject.Inject;

//RunWith 테스트 실행하기 위해서는 스프링도 같이 실행해야 하기 때문에
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {

    @Inject
    private MemberDAO dao;

    @Test
    public void testTime() throws Exception {

        System.out.println(dao.getTime());

    }

    @Test
    public void testInsertMember() throws Exception {

        MemberVO vo = new MemberVO();
        vo.setUserid("user01");
        vo.setUserpw("user01");
        vo.setUsername("USER01");
        vo.setEmail("user01@aaa.com");

        dao.insertMember(vo);

    }

}


