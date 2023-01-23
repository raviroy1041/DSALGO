package Singleton;

import java.io.Serializable;

public class Singloton implements Serializable,Cloneable {

    private static final long serialVersionUID = -5664124213376258176L;

    private static Singloton instance;

    private Singloton(){}

    public Singloton getInstance(){

        if(instance==null){
            synchronized (Singloton.class){
                if(instance==null){
                    instance=new Singloton();
                }
            }
        }

        return instance;
    }

    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }

    protected Object readResolve(){
        return instance;
    }

}
