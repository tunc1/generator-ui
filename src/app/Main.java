package app;

import app.generator.GeneratorFacade;

public class Main
{
    public static void main(String[] args)
    {
        new GeneratorPresenter(new GeneratorView(),new GeneratorFacade()).start();
    }
}