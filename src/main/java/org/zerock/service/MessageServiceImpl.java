package org.zerock.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.MessageVO;
import org.zerock.persistence.MessageDAO;
import org.zerock.persistence.PointDAO;

import javax.inject.Inject;

/**
 * Created by macbookpro on 2017. 2. 19. PM 2:19
 * sp4chap11-Project / org.zerock.service
 * No pain, No gain!
 */

@Service
public class MessageServiceImpl implements MessageService {

    @Inject
    private MessageDAO messageDAO;

    @Inject
    private PointDAO pointDAO;


    @Transactional
    @Override
    public void addMessage(MessageVO vo) throws Exception {

        messageDAO.create(vo);
        pointDAO.updatePoint(vo.getSender(), 10);
    }

    @Override
    public MessageVO readMessage(String uid, Integer mno) throws Exception {

        messageDAO.updateState(mno);

        pointDAO.updatePoint(uid, 5);

        return messageDAO.readMessage(mno);
    }
}
