package com.company;

public class Stage {

    private State state;

    Stage(State state){
        this.state = state;
    }

    public String getPassword(){
        return this.state.password;
    }

}
