package by.epam.task01.entity;

import java.util.ArrayList;

public class TextFile extends Directory{
    private String text;
    private ArrayList <TextFile> files;

    public TextFile(String name, String text){
        super(name);
        this.text = text;
    }

    public TextFile( ArrayList <TextFile> files,String text){
        this.files=files;
        this.text=text;
    }

    public TextFile(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public ArrayList <TextFile> getFiles(){
        return files;
    }

    public void setFiles(ArrayList <TextFile> files){
        this.files = files;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof TextFile)) return false;
        if(!super.equals(o)) return false;

        TextFile textFile = (TextFile)o;

        if(getText() != null ? !getText().equals(textFile.getText()) : textFile.getText() != null) return false;
        return getFiles() != null ? getFiles().equals(textFile.getFiles()) : textFile.getFiles() == null;
    }

    @Override
    public int hashCode(){
        int result = super.hashCode();
        result = 31 * result + (getText() != null ? getText().hashCode() : 0);
        result = 31 * result + (getFiles() != null ? getFiles().hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return text;
    }
}
