package AnnotationImp;
@Author(value = "Ayman")
public class Book {
    public String getAuthorName (){
        return "Mr. "+this.getClass().getAnnotation(Author.class).value();
    }
}
