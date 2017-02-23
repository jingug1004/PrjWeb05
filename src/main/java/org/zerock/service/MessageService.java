package org.zerock.service;

import org.zerock.domain.MessageVO;

/**
 * Created by macbookpro on 2017. 2. 19. PM 2:18
 * sp4chap11-Project / org.zerock.service
 * No pain, No gain!
 */


public interface MessageService {

    public void addMessage(MessageVO vo) throws Exception;

    public MessageVO readMessage(String uid, Integer mno) throws Exception;

}
