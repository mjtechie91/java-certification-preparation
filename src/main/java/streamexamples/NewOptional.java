package streamexamples;

public class NewOptional<T> {
    T t;


    T ifPresent(){
        if(t != null){
            return t;
        }
        return null;
    }

}
