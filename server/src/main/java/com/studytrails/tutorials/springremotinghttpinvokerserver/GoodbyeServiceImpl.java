package com.studytrails.tutorials.springremotinghttpinvokerserver;

/**
 * Created by Nikita on 15.03.2016.
 */
public class GoodbyeServiceImpl implements GoodbyeService {

    @Override
    public String getGoodBye(String name) {
        return "Goodbye " + name;
    }
}
