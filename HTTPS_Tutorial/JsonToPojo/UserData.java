package apiTutorial;

import java.util.List;

public class UserData {

    UserData() {
    }

    private int page;
    private int total_pages;
    private int total;
    private int per_page;
    private List<User> data;
    private String text;
    private Support support;

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
