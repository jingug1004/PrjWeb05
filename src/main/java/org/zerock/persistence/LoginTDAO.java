package org.zerock.persistence;

import org.zerock.domain.LoginTVO;

/**
 * Created by wtime on 2017-02-20. ${time}
 * org.zerock.persistence / Web Ex02
 * Better late than never!
 */


public interface LoginTDAO {

    public void create(LoginTVO vo) throws Exception;

    public LoginTVO read(String userid) throws Exception;

    public void update(LoginTVO vo) throws Exception;

    public void delete(String userid) throws Exception;



}
