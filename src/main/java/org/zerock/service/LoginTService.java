package org.zerock.service;

import org.zerock.domain.LoginTVO;

/**
 * Created by wtime on 2017-02-20. ${time}
 * org.zerock.service / Web Ex02
 * Better late than never!
 */


public interface LoginTService {

    public void registLogin(LoginTVO loginT) throws Exception;

    public LoginTVO readLogin(String userid) throws Exception;

    public void modifyLogin(LoginTVO loginT) throws Exception;

    public void removeLogin(String userid) throws Exception;
    
    
}
