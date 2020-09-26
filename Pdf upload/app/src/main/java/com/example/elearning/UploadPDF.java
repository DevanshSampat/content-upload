package com.example.elearning;

public class UploadPDF {
    String name;
    String url;

    public UploadPDF(){}
    public UploadPDF(String name, String url)
    {
        this.name = name;
        this.url = url;
    }
    public String getName()
    {
        return name;
    }
    public String getUrl()
    {
        return url;
    }
}
