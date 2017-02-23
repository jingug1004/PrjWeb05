package org.zerock.service;

import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import java.util.List;

/**
 * Created by wtime on 2017-02-13. ${time}
 * org.zerock.service / Web Ex02
 * Better late than never!
 */


public interface ReplyService {

    public void addReply(ReplyVO vo) throws Exception;

    public List<ReplyVO> listReply(Integer bno) throws Exception;

    public void modifyReply(ReplyVO vo) throws Exception;

    public void removeReply(Integer rno) throws Exception;

    public List<ReplyVO> listReplyPage(Integer bno, Criteria cri) throws Exception;

    public int count(Integer bno) throws Exception;

}
