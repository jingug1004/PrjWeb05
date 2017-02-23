package org.zerock.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by macbookpro on 2017. 2. 6.. PM 8:28
 */

@ControllerAdvice
public class CommonExceptionAdvice {

    public static final Logger logger =
            LoggerFactory.getLogger(CommonExceptionAdvice.class);

    @ExceptionHandler(Exception.class)
//    public String common(Exception e) {
//
//        logger.info(e.toString());
//
//        return "error_common";

    public ModelAndView errorModelAndView(Exception ex) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/error_common");
        modelAndView.addObject("exception", ex);

        return modelAndView;
    }

}
