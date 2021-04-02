package ua.kpi.comsys.io8207;

public class Lab3_Book {
    Integer imageBook;
    String text1;
    String text2;
    String text3;

    public Lab3_Book(String text1, String text2, String text3, Integer imageBook){
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.imageBook = imageBook;
    }

    public Integer getImageBook() {
        return imageBook;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }

    public void setImageBook(Integer imageBook) {
        this.imageBook = imageBook;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }


}
