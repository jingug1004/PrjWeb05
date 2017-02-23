package org.zerock.service;

import org.springframework.stereotype.Service;
import org.zerock.domain.LoginTVO;
import org.zerock.persistence.LoginTDAO;

import javax.inject.Inject;

/**
 * Created by wtime on 2017-02-20.
 * org.zerock.service / Web Ex02
 * Better late than never!
 */

@Service
public class LoginTServiceImpl implements LoginTService{

    @Inject
    private LoginTDAO dao;

    @Override
    public void registLogin(LoginTVO loginT) throws Exception {
        dao.create(loginT);
    }

    @Override
    public LoginTVO readLogin(String userid) throws Exception {
        return dao.read(userid);
    }

    @Override
    public void modifyLogin(LoginTVO loginT) throws Exception {
        dao.update(loginT);
    }

    @Override
    public void removeLogin(String userid) throws Exception {
        dao.delete(userid);
    }
}
