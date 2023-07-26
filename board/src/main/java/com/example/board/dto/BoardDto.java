package com.example.board.dto;

public class BoardDto {
    private int bbsID;
    private String bbsTitle;
    private String userID;
    private String bbsDate;
    private String bbsContent;
    private int bbsAvailable;
    private String fileName;
    private String fileRealName;

    public int getBbsID() {
        return bbsID;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "bbsID=" + bbsID +
                ", bbsTitle='" + bbsTitle + '\'' +
                ", userID='" + userID + '\'' +
                ", bbsDate='" + bbsDate + '\'' +
                ", bbsContent='" + bbsContent + '\'' +
                ", bbsAvailable=" + bbsAvailable +
                ", fileName='" + fileName + '\'' +
                ", fileRealName='" + fileRealName + '\'' +
                '}';
    }

    public void setBbsID(int bbsID) {
        this.bbsID = bbsID;
    }

    public String getBbsTitle() {
        return bbsTitle;
    }

    public void setBbsTitle(String bbsTitle) {
        this.bbsTitle = bbsTitle;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getBbsDate() {
        return bbsDate;
    }

    public void setBbsDate(String bbsDate) {
        this.bbsDate = bbsDate;
    }

    public String getBbsContent() {
        return bbsContent;
    }

    public void setBbsContent(String bbsContent) {
        this.bbsContent = bbsContent;
    }

    public int getBbsAvailable() {
        return bbsAvailable;
    }

    public void setBbsAvailable(int bbsAvailable) {
        this.bbsAvailable = bbsAvailable;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileRealName() {
        return fileRealName;
    }

    public void setFileRealName(String fileRealName) {
        this.fileRealName = fileRealName;
    }
}
