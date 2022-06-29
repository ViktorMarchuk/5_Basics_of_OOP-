package by.epam.task01.entity;

public class Directory{
    String name = "";

    public Directory(){

    }

    public Directory(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Directory)) return false;
        Directory directory = (Directory)o;
        return getName() != null ? getName().equals(directory.getName()) : directory.getName() == null;
    }

    @Override
    public int hashCode(){
        return getName() != null ? getName().hashCode() : 0;
    }

    @Override
    public String toString(){
        return "Directory{" +
                "name='" + name + '\'' +
                '}';
    }
}
