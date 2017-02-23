package org.zerock.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MessageVO;

import javax.inject.Inject;

/**
 * Created by macbookpro on 2017. 2. 19. PM 2:13
 * sp4chap11-Project / org.zerock.persistence
 * No pain, No gain!
 */

@Repository
public class MessageDAOImpl implements MessageDAO{

    @Inject
    private SqlSession session;

    private static String namespace ="org.zerock.mapper.MessageMapper";

    @Override
    public void create(MessageVO vo) throws Exception {

        session.insert(namespace+".create", vo);
    }

    @Override
    public MessageVO readMessage(Integer mno) throws Exception {

        return session.selectOne(namespace+".readMessage", mno);
    }

    @Override
    public void updateState(Integer mno) throws Exception {

        session.update(namespace+".upldateState", mno);

    }


}
