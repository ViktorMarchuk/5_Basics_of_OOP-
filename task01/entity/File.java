package by.epam.task01.entity;

public class File extends Directory{
    public File(){

    }

    public File(String name){
        super(name);
    }

    @Override
    public String toString(){
        return "File{" +
                "name='" + name + '\'' +
                '}';
    }
}

