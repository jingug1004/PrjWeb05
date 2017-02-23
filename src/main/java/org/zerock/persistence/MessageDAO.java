package org.zerock.persistence;

import org.zerock.domain.MessageVO;

/**
 * Created by macbookpro on 2017. 2. 19. PM 2:11
 * sp4chap11-Project / org.zerock.persistence
 * No pain, No gain!
 */


public interface MessageDAO {

    public void create(MessageVO vo) throws Exception;

    public MessageVO readMessage(Integer mno) throws Exception;

    public void updateState(Integer mno) throws Exception;

}
