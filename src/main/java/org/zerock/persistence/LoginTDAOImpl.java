package org.zerock.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.LoginTVO;

import javax.inject.Inject;

/**
 * Created by wtime on 2017-02-20. ${time}
 * org.zerock.persistence / Web Ex02
 * Better late than never!
 */

@Repository
public class LoginTDAOImpl implements LoginTDAO{

    @Inject
    private SqlSession session;

    private static String namespace = "org.zerock.mapper.LoginTMapper";

    @Override
    public void create(LoginTVO vo) throws Exception {
        session.insert(namespace + ".create", vo);
    }

    @Override
    public LoginTVO read(String userid) throws Exception {
        return session.selectOne(namespace + ".read", userid);
    }

    @Override
    public void update(LoginTVO vo) throws Exception {
        session.update(namespace + ".update", vo);
    }

    @Override
    public void delete(String userid) throws Exception {
        session.delete(namespace + ".delete", userid);
    }
}
